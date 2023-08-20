package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion1 {

    public static boolean debug = false;

    @Test
    public void Conversion0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0501");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 13, (long) 5, (int) 'd', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0502");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) ' ', (byte) 10, 2, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0503");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0504");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0505");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0506");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) '2', (int) (byte) -1, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0507");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (byte) 100, (byte) 10, (int) '#', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0508");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0509");
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
    public void Conversion0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0510");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 1, (int) (byte) 1, byteArray2, 11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0511");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0512");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0513");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) -1, (byte) 0, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0514");
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
    public void Conversion0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0515");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0516");
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
    public void Conversion0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0517");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0518");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0519");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 1, (byte) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0520");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0521");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 2, "0", 2, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0522");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) (short) 1, (byte) -1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0523");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi!", (int) (byte) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0524");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0525");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) -1, 13, (-1));
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0526");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 0, "hi00000", 11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0527");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0528");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void Conversion0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0529");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0530");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 4, (short) (byte) -1, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0531");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0532");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0533");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0534");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0535");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) -1, (short) 100, 11, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0536");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 10, (int) '#', (int) (short) 10, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0537");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 1, (int) (byte) 1, booleanArray2, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0538");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', 1, "f", 49, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0539");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) -1, (-1), booleanArray2, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0540");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 49, (short) (byte) 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0541");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0542");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (int) '4', (short) (byte) 0, (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0543");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 0, 2, (int) '5', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0544");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '5', "hi!", (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0545");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0546");
        boolean[] booleanArray0 = new boolean[] {};
        long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, 0, 0L, 0, (int) '4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0547");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0548");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) 100, "hi00000", (int) (short) -1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0549");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) ' ', (long) ' ', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0550");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0551");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0552");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0553");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 10, (short) 1, (int) '1', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0554");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) 100, (int) (short) 100, (int) (byte) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0555");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '#', (long) 'd', (int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0556");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) 'b', "hi00000", 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0557");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) -1, (byte) 100, 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0558");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 0, "f", (int) '2', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0559");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0560");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) 0, "0", (int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0561");
        short[] shortArray6 = new short[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0562");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0563");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0564");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0565");
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
    public void Conversion0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0566");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '1', (short) (byte) -1, 4, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0567");
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
    public void Conversion0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0568");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) (short) 0, booleanArray2, (int) '#', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0569");
        int[] intArray3 = new int[] { '0' };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0570");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (-1), (short) 100, 13, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0571");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0572");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0573");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0574");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi!", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0575");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '8', (byte) 100, (int) '#', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0576");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0577");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 13, (byte) 1, (-1), (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0578");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) 'a', (byte) 100, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0579");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 13, (long) (short) -1, 49, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0580");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0581");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0582");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) -1, 0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0583");
        boolean[] booleanArray2 = new boolean[] { true, true };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0584");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 0, (short) 10, 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0585");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) -1, 8, (int) '#', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0586");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) '1', (short) 100, (int) 'd', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0587");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) '0', (long) (byte) 0, (int) 'b', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0588");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), (int) 'a', "0", 4, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0589");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'b', 8, "", 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0590");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray((int) ' ', (int) ' ', byteArray2, (int) '1', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0591");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '4', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0592");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'b', 0, "", (int) ' ', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0593");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) ' ', (short) 0, (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0594");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0595");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 48");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0596");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 0, (short) (byte) 1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0597");
        java.util.UUID uUID0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0598");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, (int) (short) 0, (long) (short) -1, 13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0599");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0600");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '5', 0, 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0601");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0602");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 0, 8, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void Conversion0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0603");
        int[] intArray1 = new int[] { (short) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0604");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void Conversion0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0605");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) (short) 1, (long) (short) 100, (-1), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'i' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0606");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray0, (int) ' ', (long) 'd', 5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0607");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0608");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, (int) (short) 100, "0000000000", (int) '2', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0609");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0610");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 2, (byte) -1, (int) '4', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0611");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '4', (int) (short) 0, "f", 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0612");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, (int) ' ', (byte) 0, 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0613");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0614");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0615");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) '1', "0000000000", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0616");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) (byte) 1, (int) (short) 0, byteArray2, (int) 'a', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0617");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0618");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0619");
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
    public void Conversion0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0620");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0621");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (-1), "0000000000", (int) 'b', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0622");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0623");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 0, (int) 'b', "0", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0624");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0625");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 0, "hi00000", (int) (byte) 0, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0626");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '2', "0000000000", (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0627");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (-1), "f", (int) '0', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0628");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0629");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0630");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0631");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0632");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '5', (int) (byte) 0, (int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Conversion0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0633");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, 10, "f", 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0634");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0635");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0636");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '0', (short) 0, 5, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0637");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0638");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0639");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 8, booleanArray3, 11, (int) (byte) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0640");
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
    public void Conversion0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0641");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) ' ', (int) '0', "hi!", (int) (byte) 0, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0642");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0643");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) ' ', (short) 100, 13, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0644");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 100, (short) (byte) 10, 4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0645");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 100, (int) '4', (int) 'd', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0646");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0647");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", 100, (int) (byte) 10, (int) '1', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0648");
        int[] intArray1 = new int[] { '1' };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0649");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0650");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0651");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0652");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0653");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) 10, 49, (int) (short) 100, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0654");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) ' ', "f", 49, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0655");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0656");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0657");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 0, (byte) 0, 8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0658");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0659");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", (int) 'a', (int) '#', 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void Conversion0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0660");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(11L, 4, "hi!", 8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0661");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) (short) 10, "hi!", (int) (short) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0662");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0663");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0664");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0665");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0666");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) (short) 1, (byte) 10, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0667");
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
    public void Conversion0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0668");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '1', "hi00000", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0669");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray((-1), 2, byteArray2, 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0670");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0671");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 49, (short) -1, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0672");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0673");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0674");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0675");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '4' + "'", char1 == '4');
    }

    @Test
    public void Conversion0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0676");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", 8, (byte) 10, (int) '2', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0677");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0678");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0679");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) 'd', (long) 13, (int) '0', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0680");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0681");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 100, 49, booleanArray2, 35, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0682");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0683");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0684");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0685");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0686");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0687");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0688");
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
    public void Conversion0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0689");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (-1), (int) (byte) 1, "0000000000", (int) '1', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0690");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0691");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0692");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0693");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0694");
        int[] intArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) 'a', (long) 0, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0695");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 4, booleanArray3, (int) (byte) 0, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0696");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0697");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 8, "hi00000", 5, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0698");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 49, 0L, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0699");
        short[] shortArray4 = new short[] { (short) 10, (byte) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0700");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0701");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) 'a', "0000000000", (int) '1', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0702");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0703");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 0, (int) '1', 0, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0704");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", 49, (int) '4', (int) 'b', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0705");
        java.util.UUID uUID0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0706");
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
    public void Conversion0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0707");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) '4', (byte) 10, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0708");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0709");
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
    public void Conversion0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0710");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0711");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 8, 2, "hi!", 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0712");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0713");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 4, (int) (short) 100, "0000000000", (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0714");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0715");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0716");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0717");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) ' ', "f", (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0718");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0719");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '5', "0000000000", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0720");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 10, "hi!", 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0721");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) (byte) 100, (long) (short) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0722");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0723");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0724");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0725");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (byte) 100, (long) 35, (int) (byte) 0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0726");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) (byte) -1, 10L, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0727");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) -1, (byte) 1, 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0728");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0729");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0730");
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
    public void Conversion0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0731");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", (int) '1', 35, (int) (byte) 100, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0732");
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
    public void Conversion0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0733");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'b', (int) (short) 1, "0000000000", (int) '2', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0734");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 11, "f", (int) (short) 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0735");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '2', 0, "f", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0736");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0737");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'b', (int) (short) 0, "f", 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0738");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(1, 1, "hi!", (int) (byte) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0739");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) (short) 0, booleanArray2, (int) ' ', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0740");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '5', "", (int) '2', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0741");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0742");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) '2', (int) (short) 100, shortArray2, (int) '5', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0743");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 100, (int) (short) -1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0744");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 10, 100, shortArray2, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0745");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0746");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0747");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0748");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) '#', (int) 'b', shortArray2, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0749");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 100, "hi00000", (int) (byte) 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0750");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) '2', (-1L), (int) '1', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0751");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) 11, (int) '8', booleanArray2, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0752");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) (short) -1, "", (int) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0753");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) (short) 1, (short) -1, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0754");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0755");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(0L, 2, "", 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0756");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) 'b', "0", (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0757");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 2, "", (int) (byte) 100, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0758");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0759");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0760");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 1, (long) 'b', (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0761");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0762");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (byte) 1, (short) (byte) 10, (int) '2', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0763");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 0, 1, "", (int) 'd', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0764");
        int[] intArray5 = new int[] { (byte) 10, 'd', (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0765");
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
    public void Conversion0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0766");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 8, "", 13, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0767");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Conversion0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0768");
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
    public void Conversion0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0769");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0770");
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
    public void Conversion0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0771");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 2, (byte) 100, (int) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void Conversion0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0772");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) '#', "hi!", (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0773");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 0, 100, (int) (byte) 0, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0774");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0775");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0776");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, (int) (byte) 10, (byte) 1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0777");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 5, (short) 10, 8, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0778");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0779");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0780");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) (byte) 0, (long) 35, (int) '1', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void Conversion0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0781");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray(11L, (int) '8', intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0782");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '#', "", (int) ' ', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0783");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0784");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '5', (byte) -1, 8, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0785");
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
    public void Conversion0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0786");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 0, (int) (byte) 0, byteArray2, 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0787");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, 8, "", 49, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0788");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 1, (byte) 10, (int) (short) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void Conversion0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0789");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0790");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'a', 2, "hi00000", (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0791");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, (int) (short) 1, "hi!", (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0792");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0793");
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
    public void Conversion0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0794");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 11, "", (int) '5', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0795");
        short[] shortArray2 = null;
        short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray(4L, (int) (short) 10, shortArray2, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(shortArray5);
    }

    @Test
    public void Conversion0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0796");
        int[] intArray2 = new int[] { '1', 'a' };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0797");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, (int) (short) 1, (int) (byte) 10, 2, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0798");
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
    public void Conversion0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0799");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray0, 4, (int) (short) 1, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0800");
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
    public void Conversion0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0801");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0802");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 10, (short) (byte) 100, 13, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0803");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 11, "0000000000", (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0804");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 1, (short) 10, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Conversion0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0805");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) '0', (long) (short) 10, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0806");
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
    public void Conversion0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0807");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'b' + "'", char2 == 'b');
    }

    @Test
    public void Conversion0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0808");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) (short) -1, (int) '8', 35, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 56 + "'", int5 == 56);
    }

    @Test
    public void Conversion0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0809");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) (byte) -1, "0000000000", (-1), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0810");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 2);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0811");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) '5', (int) ' ', (int) (byte) 1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0812");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 1, "f", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0813");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '5', 1, "", 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0814");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '0', booleanArray3, (int) '2', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0815");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 100, (short) 100, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0816");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((-1L), 0, "0000000000", (int) (byte) -1, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0817");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(4, 0, "f", (int) '8', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0818");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 49, (int) (short) 0, "", (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0819");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '5', (int) 'd', "0", (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0820");
        int[] intArray5 = new int[] { (byte) -1, 8, 0 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0821");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (byte) 1, (long) 11, 56, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
    }

    @Test
    public void Conversion0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0822");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0823");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 10, (long) 0, (int) '5', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0824");
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
    public void Conversion0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0825");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0826");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0827");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0828");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0829");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 8, 56, "0000000000", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0830");
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
    public void Conversion0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0831");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0832");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 11, booleanArray2, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0833");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 1, (short) (byte) 0, (int) (byte) 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0834");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 100, (byte) 0, 2, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0835");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) '#', (byte) 0, (int) 'a', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0836");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (-1), (byte) 1, 56, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0837");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 0, (long) (short) 100, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0838");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0839");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 49, (short) 1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0840");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0841");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (byte) 100, "", 5, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0842");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 1, (short) (byte) 100, (int) 'd', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0843");
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
    public void Conversion0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0844");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0845");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 2, (short) 10, (int) '2', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Conversion0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0846");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 35, (byte) 0, (int) (byte) 10, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0847");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 11, "", (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0848");
        int[] intArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) 'd', 1L, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0849");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, 49, booleanArray2, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0850");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '2', (int) '0', "hi!", (int) '8', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0851");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 100, (byte) -1, (int) '0', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0852");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0853");
        short[] shortArray4 = new short[] { (short) 1, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0854");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0855");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) '1', 53L, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0856");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) (byte) 1, 13, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void Conversion0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0857");
        short[] shortArray5 = new short[] { (short) 100, (byte) 100, (short) 100 };
        short[] shortArray8 = org.apache.commons.lang3.Conversion.longToShortArray(11L, 13, shortArray5, (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
    }

    @Test
    public void Conversion0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0858");
        short[] shortArray2 = new short[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0859");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '0', "f", 5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0860");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (-1), "f", (int) (short) 0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0861");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 1, (byte) -1, (int) (byte) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0862");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, 4, "f", 1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0863");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) (byte) 1, "f", 56, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0864");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 13, (byte) 100, (int) (byte) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0865");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 0, "hi00000", (int) (byte) 1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0866");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (byte) 10, 35, (int) (short) 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0867");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) '2', (short) 10, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0868");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (short) 0, (short) 0, 11, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0869");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0870");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 0, "0000000000", 0, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ff00000000" + "'", str5.equals("ff00000000"));
    }

    @Test
    public void Conversion0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0871");
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
    public void Conversion0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0872");
        short[] shortArray4 = new short[] { (short) 1, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0873");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) 'b', "", (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0874");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0875");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 11, 0, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Conversion0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0876");
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
    public void Conversion0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0877");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", 100, (long) (short) 0, (int) (byte) 10, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0878");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0879");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0880");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) (short) 10, 11, booleanArray2, (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0881");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) (byte) 10, 4, shortArray2, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0882");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0883");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '#', (int) 'd', "f", (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0884");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (short) 0, "f", 0, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0885");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, 49, "0000000000", 2, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0886");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) (short) 100, "hi!", (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0887");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) 35, (int) 'd', byteArray2, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0888");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 13, (long) 56, 13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0889");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 35, 50L, (int) (byte) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 50L + "'", long5 == 50L);
    }

    @Test
    public void Conversion0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0890");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0891");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 13, (long) (byte) -1, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void Conversion0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0892");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 0, (byte) 100, 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0893");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 11, 100L, (int) (short) 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0894");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 5, (byte) 10, (int) '1', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0895");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 13, (byte) 0, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0896");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 100, (byte) 0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0897");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", (-1), (short) (byte) 10, 13, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0898");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("ff00000000", (int) 'a', (int) '0', (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    }

    @Test
    public void Conversion0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0899");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", 0, (int) 'd', (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0900");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) (short) 1, "f", (int) (short) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0901");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000", (int) 'a', (short) (byte) 1, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0902");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0903");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0904");
        int[] intArray0 = new int[] {};
        long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, 13, (long) 8, (int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 8L + "'", long5 == 8L);
    }

    @Test
    public void Conversion0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0905");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0906");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0907");
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
    public void Conversion0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0908");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 100, (short) (byte) 1, (int) '8', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0909");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0910");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0911");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 48, (byte) 1, (int) (byte) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0912");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 48, "0000000000", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0913");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) -1, 5, booleanArray2, 11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0914");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '8', "", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0915");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 1, (byte) 1, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0916");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0917");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '#', (-1), "", (int) 'd', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0918");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 0, 11, booleanArray2, 8, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0919");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (byte) 100, (short) (byte) 100, 11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0920");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 0, (long) 5, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0921");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0922");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0923");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0924");
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
    public void Conversion0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0925");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 0, "", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0926");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 100, 4, "f", (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0927");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", 48, (byte) 32, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 32 + "'", byte5 == (byte) 32);
    }

    @Test
    public void Conversion0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0928");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0929");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0930");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0931");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) (byte) 10, "", (-1), (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0932");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) (byte) 10, "0000", 11, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0933");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 13, (int) 'b', (int) '2', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0934");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0935");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0936");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0937");
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
    public void Conversion0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0938");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 35, 35, "f", 2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0939");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0940");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0941");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0942");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 49, (long) 0, 35, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0943");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) '1', (byte) -1, (int) '8', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0944");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '2', (int) (byte) 10, "hi00000", (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0945");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) -1, (int) 'b', (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0946");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 32 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0947");
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
    public void Conversion0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0948");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '8', (int) (short) 10, "ff00000000", (int) '#', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0949");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0950");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 11, "0", (int) 'b', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0951");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) ' ', 10L, 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0952");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) (short) 1, (byte) -1, (int) (byte) 1, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0953");
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
    public void Conversion0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0954");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) 'b', "ff00000000", (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0955");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0956");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 0, (short) (byte) 32, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0957");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'd', 35, "hi00000", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0958");
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
    public void Conversion0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0959");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0960");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 4, (byte) 100, (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0961");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void Conversion0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0962");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 0, (int) (short) 0, 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'h' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0963");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '1', "0", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0964");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0965");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 10, (int) 'b', (int) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void Conversion0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0966");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, 48, "0", (int) (byte) 10, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0967");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) ' ', 5, "", (int) (byte) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0968");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '4', (int) ' ', "hi00000", (int) '0', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0969");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '4', "hi00000", 98, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0970");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, (-1), "0000000000", (int) '2', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0971");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", 100, (int) 'a', (int) (byte) 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0972");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0973");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 98, (long) (byte) 0, 13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0974");
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
    public void Conversion0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0975");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '1', 8, "0000", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0976");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", 11, (long) '5', (int) (short) 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0977");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0978");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0979");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0980");
        int[] intArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, 4, (long) 'd', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0981");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 13, "hi00000", (int) (short) 100, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0982");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 5, (short) (byte) 100, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0983");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '8', (int) 'd', "0000000000", 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0984");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0985");
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
    public void Conversion0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0986");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 32, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0987");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0988");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0989");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) ' ', (int) 'b', "f", 11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0990");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0991");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0992");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) (short) 0, (byte) 0, (int) '8', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0993");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) -1, (int) '0', "hi!", 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0994");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0995");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0996");
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
    public void Conversion0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0997");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) (byte) 1, "0", (int) (byte) 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0998");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) (byte) 1, (long) '8', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion0999");
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
    public void Conversion1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion1.Conversion1000");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

