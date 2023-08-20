
package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion2 {

    public static boolean debug = false;

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1001");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) '4', (short) (byte) 100, 8, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1002");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1004");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
            System.out.format("%n%s%n", "Conversion2.test1005");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '5', 56, "hi!", (int) (byte) 32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1006");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) (byte) 10, "0000", (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1007");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(48, 56, "0000", (int) '0', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1008");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '0', booleanArray3, (int) '2', (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1009");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 32, 100, byteArray6, 5, (int) (short) -1);
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
            System.out.format("%n%s%n", "Conversion2.test1010");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (int) (byte) 100, (short) (byte) -1, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1011");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, 1);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.longToBinary(1L, (int) '1', booleanArray3, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '0' + "'", char5 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1012");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) (byte) 1);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '2' + "'", char8 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1013");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary(0, (int) '4', booleanArray3, 98, (int) 'b');
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
            System.out.format("%n%s%n", "Conversion2.test1014");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '0' + "'", char7 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1015");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
            System.out.format("%n%s%n", "Conversion2.test1016");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1017");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (byte) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) (byte) 0, booleanArray3, 4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, (int) (byte) 1, "hi00000", (int) '1', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, 100, "f", 1, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 98, (byte) 0, (int) (byte) 10, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, 11, "ff00000000", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1022");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 10, (long) 56, 35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) (short) 100, (short) 100, (int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1024");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '5', (short) 0, (int) (byte) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1025");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '4', 11, "f", 56, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) (byte) -1, (long) 8, 2, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1027");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 0, (byte) -1, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 100, "ff00000000", 49, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1029");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1030");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 48, (short) 1, (int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1031");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1032");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (-1));
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
            System.out.format("%n%s%n", "Conversion2.test1033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(4L, (int) (short) 0, "0000", (int) '0', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (int) (short) -1, (short) 0, 35, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1035");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=3, srcPos=11");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(13, (int) '2', "", (int) '2', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1037");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.intToByteArray((int) (byte) -1, (int) '1', byteArray6, (int) '5', (int) '0');
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
            System.out.format("%n%s%n", "Conversion2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 48, (byte) -1, 13, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1039");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.longToByteArray((long) (short) 1, (int) 'd', byteArray3, 0, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1040");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) '0', booleanArray3, (int) '2', (int) (byte) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray7);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1041");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray(11, (int) (byte) 100, shortArray2, (int) (byte) 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1042");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", 2, (long) (short) 10, (int) '2', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 0, (short) 0, 4, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1044");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) -1, (int) '#', byteArray2, (int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1045");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=32");
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
            System.out.format("%n%s%n", "Conversion2.test1046");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 0, 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'h' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1047");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        long long8 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 10, (long) 35, (int) '8', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1048");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 10, 49, booleanArray3, 13, (int) 'b');
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
            System.out.format("%n%s%n", "Conversion2.test1049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) -1, "0000", (int) '2', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1050");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 13, (byte) 0, (int) '1', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1051");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 1, (byte) -1, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1052");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (-1), (short) 10, 4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1053");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, 0, "ff00000000", (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ff00000000" + "'", str5.equals("ff00000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1054");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) '0', (byte) 0, 5, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1055");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=3, srcPos=0");
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
            System.out.format("%n%s%n", "Conversion2.test1056");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) '4', (long) 35, (int) (byte) 1, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 48, "ff00000000", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(8, (int) (short) 1, "f", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1059");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
            System.out.format("%n%s%n", "Conversion2.test1060");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        short short9 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray4, (int) (short) 10, (short) (byte) 32, (-1), (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 32 + "'", short9 == (short) 32);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '1', (long) '8', 35, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1062");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1063");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 100, (short) (byte) -1, 5, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1064");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
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
            System.out.format("%n%s%n", "Conversion2.test1065");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", 10, (short) (byte) 10, 98, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1066");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) '4', (byte) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1067");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 49, 1, "ff00000000", (int) (short) 100, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1069");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 13, (long) 100, (int) '2', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 32, 1, "0000", 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1071");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 2, (byte) 10, (int) (byte) -1, 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1072");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'b' + "'", char1 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1073");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) -1, 13, (-1));
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '0' + "'", char7 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (short) -1, (long) 11, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 100, (int) (byte) 1, "0000000000", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1076");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray(8, (int) (byte) 32, byteArray2, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1077");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) (byte) 0, 56, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1078");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", (int) (byte) 10, (long) (short) 100, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '2', "f", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1080");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 2, (byte) -1, (int) '1', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'd' + "'", char2 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'd' + "'", char3 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1081");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 13);
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
            System.out.format("%n%s%n", "Conversion2.test1082");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1083");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 32, (-1L), 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 32, (int) ' ', "f", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1085");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.intToByteArray((int) (byte) 10, (int) (byte) 10, byteArray6, 2, (int) 'b');
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
            System.out.format("%n%s%n", "Conversion2.test1086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 2, "", (int) 'a', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1087");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 10, 8L, (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1088");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
            System.out.format("%n%s%n", "Conversion2.test1089");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) -1, (int) (short) 100, booleanArray3, (int) (byte) 1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) '0', "0000000000", 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '5', "0", (int) '1', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1092");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 32, 49, booleanArray3, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray7, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'd' + "'", char4 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'a', (int) (short) 100, "f", (int) (short) -1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1094");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) (short) 0, (long) 13, (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 13L + "'", long5 == 13L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1095");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", 1, (byte) 0, (int) (short) 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1096");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) (short) 10, (byte) 32, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) 'a', "hi00000", (int) '0', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 11, 35, "0000000000", 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1099");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1100");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID3 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1101");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1102");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=97");
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
            System.out.format("%n%s%n", "Conversion2.test1103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) -1, "hi00000", 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1104");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
            System.out.format("%n%s%n", "Conversion2.test1105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 98, (int) (byte) 0, "0000000000", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(13L, (int) (byte) 100, "ff00000000", 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 0, (short) 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1108");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '#', (byte) 100, 48, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1109");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        byte byte6 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) 'a', (byte) -1, (int) (short) 1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (-1), 8, "0", 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1111");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", 35, 11, 98, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1112");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, 10, (int) 'a');
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
            System.out.format("%n%s%n", "Conversion2.test1113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '0', (int) (short) 10, "hi00000", 100, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, (int) '1', "hi00000", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 48, "hi00000", (int) '8', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 11, 100, "0", (int) '0', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1117");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1118");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', 2, (int) (byte) 10, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (byte) 100, "f", 98, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1120");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) (byte) 100, (byte) 32, 4, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 32 + "'", byte9 == (byte) 32);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1121");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1122");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 0, (byte) 0, 0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 0, (int) '0', "", (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 0, (byte) 0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 13, "0000", 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1126");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1127");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.longToByteArray((long) 13, 98, byteArray3, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1128");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.byteToBinary((byte) -1, (int) (byte) 100, booleanArray3, (int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1129");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 32, (int) (short) 100, "0000000000", (int) '8', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, (int) '5', "0", 98, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", (int) 'b', 0L, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) '2', (short) -1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 98, "0000000000", (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1134");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 2, (short) -1, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1135");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 13);
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
            System.out.format("%n%s%n", "Conversion2.test1136");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(10, 11, "ff00000000", (int) (short) 0, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 35, (byte) 100, (int) (short) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1138");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) '2', (int) (byte) -1, booleanArray3, (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1139");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", (int) 'b', 11, 0, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1140");
        int[] intArray3 = new int[] { '2' };
        int[] intArray6 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) -1, (int) (byte) 10, intArray3, 98, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1141");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=1");
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
            System.out.format("%n%s%n", "Conversion2.test1142");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 100, 100, "ff00000000", (int) (short) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1144");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 8, (byte) 10, 98, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1145");
        boolean[] booleanArray3 = new boolean[] { true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=3, srcPos=5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1146");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, 100, booleanArray3, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1147");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray4, 100, (long) (byte) 10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) ' ', "ff00000000", 56, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", 11, (byte) 0, (int) 'a', (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1150");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1151");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '#', (int) ' ', booleanArray3, (int) 'd', (int) (byte) -1);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '2' + "'", char9 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1152");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray7);
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
            System.out.format("%n%s%n", "Conversion2.test1153");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 0, (long) (short) 10, 4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1154");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 10, 100, 11, (int) (byte) -1);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1155");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        int int7 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray2, (int) (short) 1, (int) '1', 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1156");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
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
            System.out.format("%n%s%n", "Conversion2.test1157");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 100, booleanArray3, 49, (int) '0');
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
            System.out.format("%n%s%n", "Conversion2.test1158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, 48, "", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1159");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 100, 49, "ff00000000", (int) '4', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ff00000000" + "'", str5.equals("ff00000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1160");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) ' ', (byte) -1, (int) (byte) 32, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1161");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) 10, 8, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1162");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1163");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 1, (byte) 0, (int) (byte) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1164");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 0, (long) 8, (int) '#', 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8L + "'", long7 == 8L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1165");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", 100, (byte) -1, (int) '1', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1166");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) (short) 10, "", 49, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1168");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("ff00000000", (int) (byte) 0, (int) '2', (int) (byte) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("ff00000000", 56, 49, 56, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1170");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 48");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1171");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 2, (short) (byte) -1, (int) (short) 1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", 11, (byte) 100, 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1173");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) 'd', booleanArray3, 10, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1174");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 32, (int) ' ', booleanArray3, (int) '0', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1175");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        int int7 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray2, (int) (short) 1, (int) '1', 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 49 + "'", int7 == 49);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1176");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, (int) (byte) 100, "hi00000", (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1177");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) 'a');
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
            System.out.format("%n%s%n", "Conversion2.test1178");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'a', (int) '5', "", (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1179");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "f", (int) '1', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1181");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 35, (int) (short) 32, shortArray2, (int) 'd', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, (int) 'd', "0", 98, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1183");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 10, (short) (byte) 1, 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1184");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '5', (int) (byte) 100, 50, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1185");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (short) 32);
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
            System.out.format("%n%s%n", "Conversion2.test1186");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1187");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        short short9 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) (short) 0, (short) 1, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1188");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass7 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1189");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) '#', (short) (byte) -1, (int) 'd', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1190");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 5, (short) 100, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) 10, (byte) 100, (int) (byte) 32, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1192");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1193");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '4', (byte) 100, 50, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1194");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) '2', (int) (byte) -1, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 2, "hi00000", (int) (short) 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1196");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '2' + "'", char4 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '4' + "'", char6 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1197");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '2' + "'", char9 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1198");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1199");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) 'a', (long) '#', 5, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1201");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 100, (int) '2', intArray2, 48, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1202");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, 5, (long) (short) -1, (int) '1', (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1203");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, 50);
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
            System.out.format("%n%s%n", "Conversion2.test1204");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 32, 0, booleanArray2, (int) (byte) -1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 0, (int) (short) 32, "hi!", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1206");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 8, (short) 32, 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1207");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 100, 0, byteArray6, (int) (byte) 1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1208");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 8, booleanArray3, 11, (int) (byte) -1);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1209");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) (byte) 1, 100, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'i' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1210");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.longToBinary((long) 11, 10, booleanArray3, 48, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1211");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary(49, (int) (byte) 0, booleanArray3, (int) 'a', (int) '5');
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
            System.out.format("%n%s%n", "Conversion2.test1212");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, 48);
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
            System.out.format("%n%s%n", "Conversion2.test1213");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'a', 56, "0000", (int) '0', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(48, 35, "0", (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1216");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte7 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 1, (byte) 0, (int) (byte) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
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
            System.out.format("%n%s%n", "Conversion2.test1217");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) 'a', (short) (byte) 32, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 32 + "'", short6 == (short) 32);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1218");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) (short) -1, (byte) 0, 4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1219");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1220");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, (int) (short) 32, 50L, 13, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1221");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '2' + "'", char9 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1222");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", 50, (short) (byte) -1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1223");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", (int) (short) 32, (short) (byte) 1, (int) 'a', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1224");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '8' + "'", char4 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '8' + "'", char8 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1225");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
            System.out.format("%n%s%n", "Conversion2.test1226");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        int int9 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray4, (int) ' ', 0, 1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1227");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray0, (int) 'b', (long) '0', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1228");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(1, 13, "f", 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1229");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) (byte) -1, (int) (byte) 10, 8, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1230");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) (short) 32, (int) '2', booleanArray3, (int) 'b', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1231");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '#', (int) 'd', "0000000000", (-1), (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) 0, (byte) -1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) (byte) 100, (byte) -1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'a', (int) (short) 0, "ff00000000", (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1235");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 0, (int) (short) 100, booleanArray3, (int) (short) 32, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
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
            System.out.format("%n%s%n", "Conversion2.test1236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 2, "", (int) '2', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '8', "0", (-1), (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 48, 10, "0", (int) (short) 32, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1239");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 32, (short) (byte) 0, (int) (short) 32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 98, (long) 'd', (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1241");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", 2, 0, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1242");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.shortToBinary((short) 0, (-1), booleanArray3, (int) (byte) 1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1243");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) '2', (int) (short) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1244");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 35, (short) 10, (int) '8', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1245");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 32, (int) '5', byteArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1246");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 32, 48, booleanArray3, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1247");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.Conversion.longToByteArray(50L, (int) (byte) 100, byteArray6, (int) '5', (int) (byte) 0);
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
            System.out.format("%n%s%n", "Conversion2.test1248");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray2, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (byte) 0, "hi00000", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1250");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) (short) 32, (int) (short) 32, (int) '5', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1251");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, (int) (byte) 100, booleanArray3, 56, 50);
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
            System.out.format("%n%s%n", "Conversion2.test1252");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '5' + "'", char2 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1253");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        java.lang.Class<?> wildcardClass8 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1254");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 0, "0000", (int) (byte) 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1256");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 10, (int) (byte) 1, "hi00000", (int) '0', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1257");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1258");
        byte[] byteArray3 = new byte[] { (byte) 32 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.Conversion.intToByteArray((int) (short) -1, (int) '8', byteArray3, 13, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1259");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 100, 5, byteArray5, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1260");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(100L, (int) '5', "hi00000", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1261");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray4, (int) '8', (short) (byte) 1, (int) '#', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1262");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) 56, 98, booleanArray3, (-1), (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1263");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 50, (short) 32, 13, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 32 + "'", short5 == (short) 32);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(100L, (int) (byte) 0, "", 49, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1265");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, (int) (byte) 32, booleanArray3, (int) '5', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'd' + "'", char5 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1266");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 1, "0000", 56, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1267");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '2' + "'", char4 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1268");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 49, (byte) 32, 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1269");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        byte byte6 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) 'a', (byte) -1, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1270");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray4, (int) (byte) 100, 50L, 13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1271");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 32, (int) ' ', intArray2, (int) 'd', (int) (byte) 100);
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
            System.out.format("%n%s%n", "Conversion2.test1272");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 32, (int) (short) 1, byteArray3, 48, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 5, "", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1274");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) 'a', (byte) 1, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1275");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '8', (byte) 32, 48, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1276");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (short) -1, (short) 10, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1277");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) 'd', 8, booleanArray2, (-1), (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1278");
        int[] intArray3 = new int[] { (short) 0, 11, '8' };
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray3, 0, (long) 11, (int) '0', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1279");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.longToByteArray((long) (byte) 100, (int) (short) 10, byteArray5, 50, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1280");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 0, 4L, (int) '8', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '5' + "'", char3 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) -1, (int) (byte) 10, "0", 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) (short) 100, (long) (short) 100, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1283");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.longToByteArray(0L, 56, byteArray6, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1284");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", (int) (short) 0, (byte) -1, 8, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1285");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) 'd', 4, booleanArray2, 56, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1286");
        int[] intArray0 = new int[] {};
        long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, 0, (long) 4, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1287");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '2', 5, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1288");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 4, (short) (byte) -1, (int) (byte) 32, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1289");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) 'b', booleanArray3, (int) '2', (int) (short) 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1290");
        int[] intArray2 = new int[] { 'd', 13 };
        long long7 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray2, (-1), 13L, (int) '0', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 13L + "'", long7 == 13L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1291");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=11");
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
            System.out.format("%n%s%n", "Conversion2.test1292");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 0, (int) '#', "hi00000", (int) (short) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1293");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1294");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1295");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '8', (int) (short) 100, (-1), (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1296");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 0, 11, booleanArray3, 5, (-1));
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1297");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) (short) 100, booleanArray2, 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1298");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", (int) (short) 0, (long) (short) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1300");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'b' + "'", char2 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'b' + "'", char3 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) 'a', "hi!", 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1302");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 0);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '5' + "'", char4 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1303");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 0, (byte) 10, 49, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1304");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) (short) 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1305");
        short[] shortArray3 = new short[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.Conversion.longToShortArray((long) 49, 0, shortArray3, 98, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1306");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 0, 8, booleanArray2, 13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1307");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (short) -1);
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
            System.out.format("%n%s%n", "Conversion2.test1308");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (short) 10, (long) 0, (int) (short) 100, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1309");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1310");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", 50, (byte) 32, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1311");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.lang3.Conversion.intToByteArray(48, (int) (short) 100, byteArray5, (int) '8', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1312");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1313");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray0, (int) '0', (int) '5', 2, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1314");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '1', (int) (short) 10, 50, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1315");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        long long9 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray1, 0, (long) '2', (int) '2', (int) 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 50L + "'", long9 == 50L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1316");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID6 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1317");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1318");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray1, 100, (long) (short) 0, (int) ' ', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1319");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (short) 100, (long) 50, (int) (byte) -1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1320");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '1' + "'", char5 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1321");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 10, 98, byteArray3, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1322");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 2, (short) 1, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1323");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 10, 100, 11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1324");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) '5', (byte) 100, 98, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1325");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1326");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (short) 10, "0000", (int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1327");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) '2', (byte) 10, (int) (short) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1328");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000", (int) 'a', (short) (byte) 1, 8, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1329");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) -1, (short) (byte) 100, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1330");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", 98, (short) -1, 49, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1331");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 49, (short) (byte) 1, (int) '1', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "Conversion2.test1332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, (int) 'a', "hi00000", 100, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1333");
        short[] shortArray2 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 5, (int) 'b', shortArray2, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(98, 48, "hi!", (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1335");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1336");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (short) 1, (int) (byte) 32, 50, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
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
            System.out.format("%n%s%n", "Conversion2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '2', 100, (int) (byte) 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1338");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1339");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) (byte) 0, (short) 10, (int) '8', (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1340");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 13, (short) (byte) 1, (int) (byte) 10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1341");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '#', (int) ' ', booleanArray3, (int) 'd', (int) (byte) -1);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1342");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) 0, 49, booleanArray2, 35, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 98, 35, "", 11, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 1, (int) '4', "0", (int) (byte) 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1345");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (byte) 100, 0, (int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 56, "hi!", (int) (byte) 32, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1347");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '2' + "'", char4 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1348");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, 2);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '2' + "'", char8 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) 'a', "0000", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1350");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 11, 0, "0", 48, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 4, "0000", 49, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (byte) -1, "0000000000", (int) 'd', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1353");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 100, (-1), "hi00000", (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1354");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 49, (byte) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1355");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
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
            System.out.format("%n%s%n", "Conversion2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 50, (byte) -1, (int) (short) -1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 49, "f", (int) '1', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", 5, (long) (short) 1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1359");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
            System.out.format("%n%s%n", "Conversion2.test1360");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 49, (int) '0', (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'b' + "'", char2 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'd' + "'", char3 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1361");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) 0, (int) '#', 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 11, (short) 100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1363");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray7, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=53");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1364");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) '8', (long) '8', 35, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (-1), "0000", (int) '8', (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'b', (int) (short) 10, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1367");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) 32, (byte) 0, (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1368");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) '0', booleanArray3, 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '2' + "'", char6 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1369");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) '1', (-1L), (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1370");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) -1, (int) (byte) 100, (int) 'a');
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
            System.out.format("%n%s%n", "Conversion2.test1371");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) '0', (int) '0', booleanArray2, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1372");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '1', 5, "f", (int) (short) 0, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1000" + "'", str5.equals("1000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1373");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi00000", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1374");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '#', (int) ' ', booleanArray3, (int) 'd', (int) (byte) -1);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '2' + "'", char5 == '2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '2' + "'", char9 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1375");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) -1, (byte) 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1376");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=3, srcPos=5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '1' + "'", char6 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '4' + "'", char7 == '4');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1377");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) '2');
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
            System.out.format("%n%s%n", "Conversion2.test1378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 48, "0000000000", 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1379");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1380");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, (int) (short) 1, (int) 'a');
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
            System.out.format("%n%s%n", "Conversion2.test1381");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, 1, "", (int) (short) -1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1383");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 10);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1384");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, (int) '1', 4, (int) '5', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1385");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1386");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) '2', (int) (byte) -1, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'd' + "'", char7 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'd' + "'", char9 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1387");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 100, (long) (byte) -1, (int) ' ', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", (int) (short) 100, (short) 0, 49, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(0L, 13, "1000", (int) (short) 32, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1390");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 50, (long) 48, (int) 'b', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 1, "1000", 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1392");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 0, (long) 8, (int) '#', 0);
        java.lang.Class<?> wildcardClass8 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8L + "'", long7 == 8L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1393");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', 56, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1394");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 100, 49, booleanArray3, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '8' + "'", char5 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 4, "", (int) '1', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1396");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) (byte) 10, 100, 11, (int) (byte) -1);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'd' + "'", char7 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1397");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 13, "0000", (int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1398");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) '#', (int) ' ', booleanArray3, (int) 'd', (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
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
            System.out.format("%n%s%n", "Conversion2.test1399");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=32");
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
            System.out.format("%n%s%n", "Conversion2.test1400");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", (int) '8', 100L, 35, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1401");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 35, (byte) 100, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1402");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 0, "1000", (int) '1', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1000" + "'", str5.equals("1000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) (byte) 100, "", 48, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1404");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) (short) 100, (int) '8');
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
            System.out.format("%n%s%n", "Conversion2.test1405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 32, 35, "hi00000", (int) 'd', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1406");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1407");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, 0, (int) '5', 49, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1408");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary((long) 13, (int) 'd', booleanArray3, 56, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '1' + "'", char5 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1409");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 49, (long) '4', (int) (short) 10, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1410");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("1000", 8, (byte) 100, (int) 'b', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, 48, "", 35, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1412");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        java.lang.Class<?> wildcardClass6 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '1' + "'", char5 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, 0, "hi!", (int) (short) 32, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1414");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '#', (byte) 100, 48, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1415");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) '1');
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1416");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (byte) 0);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.longToBinary(8L, 50, booleanArray3, (int) '2', (int) (byte) 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray8);
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
            System.out.format("%n%s%n", "Conversion2.test1417");
        short[] shortArray3 = new short[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.Conversion.intToShortArray(100, (int) (short) 32, shortArray3, (int) '0', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1418");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '2', (byte) 100, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1419");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, (int) '1', "0", (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1420");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) -1, 56, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1421");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', (int) '1', (int) (short) 1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 32, 10, "f", (int) '1', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1423");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '2', (int) (byte) 0, (int) '2', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
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
            System.out.format("%n%s%n", "Conversion2.test1424");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 1, (int) ' ', "hi00000", (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1425");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 0, "0", (int) 'b', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1426");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '8', "0000000000", (int) '0', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '1', (int) (byte) 10, (int) '5', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1428");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 1, (int) '0', booleanArray2, 56, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1429");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 10, (byte) -1, (int) '8', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1430");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 10, 11, booleanArray2, (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1431");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        byte byte7 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) (short) 10, (byte) 10, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(35L, (int) '8', "ff00000000", (int) (byte) 32, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1433");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000", (int) (short) 1, (short) 1, 48, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 10, (int) '4', "0", 49, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1435");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
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
            System.out.format("%n%s%n", "Conversion2.test1436");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray3, (int) (byte) 1, (short) 10, 48, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1437");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 100, 50, (int) (short) 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, 0, "", (int) 'b', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1439");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) 'b', (int) '4', (int) '5', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1440");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=8");
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
            System.out.format("%n%s%n", "Conversion2.test1441");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) (byte) 100, (int) (short) -1, (int) '0', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1442");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '0', (byte) 32, 98, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) -1, (short) (byte) 10, (int) '0', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(0L, (int) (short) 32, "", (-1), (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1445");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (byte) 32, (short) (byte) -1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1446");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1447");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, 56, (byte) -1, 13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'b' + "'", char3 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1448");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(13, 10, "f", 4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1450");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", 48, (long) 1, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1451");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '5' + "'", char4 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1452");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray(562949953421412L, 4, intArray2, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1453");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) '8', (short) 1, 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1454");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 48, (long) '#', (int) 'd', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1455");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, 1, booleanArray2, (int) (byte) 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1456");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('d');
        // The following exception was thrown during execution in test generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 13);
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
            System.out.format("%n%s%n", "Conversion2.test1457");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) '1', 8, booleanArray2, 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1458");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        int int7 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '4', 50, 13, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 50 + "'", int7 == 50);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1459");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 32, 49, booleanArray3, (int) ' ', (int) (byte) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'd' + "'", char4 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'd' + "'", char8 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1460");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1461");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1462");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("1000", 48, 53L, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1463");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 0, 11, booleanArray3, 5, (-1));
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '0' + "'", char8 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1464");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '8' + "'", char4 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1465");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1466");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 5, "hi!", (int) 'b', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1467");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 1, (byte) 10, 4, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1468");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '1', 0, (int) '8', 13);
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
            System.out.format("%n%s%n", "Conversion2.test1469");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) (byte) 100, (byte) -1, 50, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1470");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (byte) 1, (long) '8', 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1471");
        short[] shortArray0 = new short[] {};
        int int5 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray0, 0, 2, (int) (short) 32, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(13L, (int) 'd', "1000", 98, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1473");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 4, (byte) 1, 8, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) '4', (byte) 10, (int) (byte) -1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1475");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'd' + "'", char2 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'd' + "'", char3 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1476");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '#', 13L, 48, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1477");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) (byte) 0, (short) (byte) 1, 49, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
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
            System.out.format("%n%s%n", "Conversion2.test1478");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'b', (int) (short) -1, (int) 'b', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1479");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "hi!", (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1480");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((-1L), (int) (short) -1, intArray2, (int) (short) 1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1481");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        java.lang.Class<?> wildcardClass7 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1482");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.longToByteArray((long) (short) 10, 4, byteArray3, (int) '8', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
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
            System.out.format("%n%s%n", "Conversion2.test1483");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'b' + "'", char4 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'd' + "'", char9 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1484");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 5, (short) (byte) 100, 8, (int) (byte) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1485");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 0, 11, booleanArray3, 5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray7, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1486");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, false };
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '3' + "'", char8 == '3');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1487");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) '1');
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
            System.out.format("%n%s%n", "Conversion2.test1488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '5', "hi!", 50, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1489");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5);
        java.lang.Class<?> wildcardClass9 = booleanArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'b' + "'", char8 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1490");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long6 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray1, (int) (byte) 10, (long) '4', 11, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1491");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        byte byte6 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) 'a', (byte) -1, (int) (short) 1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '5' + "'", char7 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1492");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'b', 48, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1493");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '2' + "'", char3 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1494");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 50, (byte) 10, 5, (int) '3');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, 11, "0", (int) 'a', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1496");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 11, (short) (byte) 10, (int) '8', 0);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '8' + "'", char2 == '8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1497");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '0', (int) ' ', "hi00000", (int) '5', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1499");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 32 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.lang3.Conversion.longToByteArray((long) '4', 10, byteArray4, 13, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.test1500");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) '2', (byte) 100, 13, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }
}

