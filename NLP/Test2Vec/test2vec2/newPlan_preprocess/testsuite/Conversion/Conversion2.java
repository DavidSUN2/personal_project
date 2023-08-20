package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion2 {

    public static boolean debug = false;

    @Test
    public void Conversion1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1001");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) '4', (short) (byte) 100, 8, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1002");
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
    public void Conversion1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1003");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1004");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1005");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '5', 56, "hi!", (int) (byte) 32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1006");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) (byte) 10, "0000", (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1007");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(48, 56, "0000", (int) '0', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1008");
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
    public void Conversion1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1009");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1010");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (int) (byte) 100, (short) (byte) -1, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1011");
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
    public void Conversion1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1012");
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
    public void Conversion1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1013");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1014");
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
    public void Conversion1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1015");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1016");
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
    public void Conversion1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1017");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (byte) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1018");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, (int) (byte) 1, "hi00000", (int) '1', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1019");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, 100, "f", 1, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1020");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 98, (byte) 0, (int) (byte) 10, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1021");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, 11, "ff00000000", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1022");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 10, (long) 56, 35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1023");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) (short) 100, (short) 100, (int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1024");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '5', (short) 0, (int) (byte) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1025");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '4', 11, "f", 56, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1026");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) (byte) -1, (long) 8, 2, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1027");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 0, (byte) -1, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1028");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 100, "ff00000000", 49, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1029");
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
    public void Conversion1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1030");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 48, (short) 1, (int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Conversion1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1031");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1032");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1033");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(4L, (int) (short) 0, "0000", (int) '0', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1034");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", (int) (short) -1, (short) 0, 35, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1035");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1036");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(13, (int) '2', "", (int) '2', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1037");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1038");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 48, (byte) -1, 13, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1039");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1040");
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
    public void Conversion1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1041");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray(11, (int) (byte) 100, shortArray2, (int) (byte) 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1042");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", 2, (long) (short) 10, (int) '2', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1043");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 0, (short) 0, 4, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1044");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) -1, (int) '#', byteArray2, (int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1045");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1046");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 0, 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'h' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1047");
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
    public void Conversion1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1048");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1049");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) -1, "0000", (int) '2', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1050");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 13, (byte) 0, (int) '1', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1051");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 1, (byte) -1, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1052");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (-1), (short) 10, 4, (int) (byte) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1053");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, 0, "ff00000000", (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ff00000000" + "'", str5.equals("ff00000000"));
    }

    @Test
    public void Conversion1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1054");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) '0', (byte) 0, 5, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1055");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1056");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) '4', (long) 35, (int) (byte) 1, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1057");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 48, "ff00000000", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1058");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(8, (int) (short) 1, "f", (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1059");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1060");
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
    public void Conversion1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1061");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '1', (long) '8', 35, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1062");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1063");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 100, (short) (byte) -1, 5, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1064");
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
    public void Conversion1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1065");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", 10, (short) (byte) 10, 98, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1066");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) '4', (byte) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1067");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1068");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 49, 1, "ff00000000", (int) (short) 100, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1069");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", 13, (long) 100, (int) '2', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1070");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 32, 1, "0000", 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1071");
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
    public void Conversion1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1072");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'b' + "'", char1 == 'b');
    }

    @Test
    public void Conversion1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1073");
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
    public void Conversion1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1074");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (short) -1, (long) 11, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1075");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 100, (int) (byte) 1, "0000000000", (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1076");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray(8, (int) (byte) 32, byteArray2, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1077");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) (byte) 0, 56, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1078");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", (int) (byte) 10, (long) (short) 100, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1079");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) '2', "f", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1080");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1081");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1082");
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
    public void Conversion1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1083");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 32, (-1L), 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1084");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 32, (int) ' ', "f", (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1085");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1086");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 2, "", (int) 'a', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1087");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 10, 8L, (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8L + "'", long6 == 8L);
    }

    @Test
    public void Conversion1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1088");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), 8, booleanArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1089");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1090");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) '0', "0000000000", 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1091");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '5', "0", (int) '1', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1092");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 32, 49, booleanArray3, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1093");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'a', (int) (short) 100, "f", (int) (short) -1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1094");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000000000", (int) (short) 0, (long) 13, (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 13L + "'", long5 == 13L);
    }

    @Test
    public void Conversion1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1095");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", 1, (byte) 0, (int) (short) 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1096");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1097");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) 'a', "hi00000", (int) '0', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1098");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 11, 35, "0000000000", 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1099");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1100");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1101");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1102");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1103");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) -1, "hi00000", 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1104");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1105");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 98, (int) (byte) 0, "0000000000", (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1106");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(13L, (int) (byte) 100, "ff00000000", 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1107");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 0, (short) 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1108");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '#', (byte) 100, 48, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1109");
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
    public void Conversion1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1110");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (-1), 8, "0", 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1111");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", 35, 11, 98, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1112");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1113");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '0', (int) (short) 10, "hi00000", 100, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1114");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, (int) '1', "hi00000", (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1115");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 48, "hi00000", (int) '8', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1116");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 11, 100, "0", (int) '0', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1117");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1118");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', 2, (int) (byte) 10, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1119");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (byte) 100, "f", 98, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1120");
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
    public void Conversion1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1121");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1122");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 0, (byte) 0, 0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1123");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 0, (int) '0', "", (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1124");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 0, (byte) 0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1125");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 13, "0000", 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1126");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1127");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1128");
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
    public void Conversion1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1129");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 32, (int) (short) 100, "0000000000", (int) '8', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1130");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, (int) '5', "0", 98, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1131");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", (int) 'b', 0L, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1132");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) '2', (short) -1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1133");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 98, "0000000000", (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1134");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 2, (short) -1, (int) '#', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1135");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1136");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(10, 11, "ff00000000", (int) (short) 0, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1137");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", 35, (byte) 100, (int) (short) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1138");
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
    public void Conversion1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1139");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", (int) 'b', 11, 0, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1140");
        int[] intArray3 = new int[] { '2' };
        int[] intArray6 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) -1, (int) (byte) 10, intArray3, 98, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void Conversion1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1141");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1142");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1143");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 100, 100, "ff00000000", (int) (short) 32, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1144");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 8, (byte) 10, 98, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1145");
        boolean[] booleanArray3 = new boolean[] { true, false, true };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1146");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) 10, 100, booleanArray3, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1147");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1148");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) ' ', "ff00000000", 56, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1149");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", 11, (byte) 0, (int) 'a', (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1150");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '0' + "'", char3 == '0');
    }

    @Test
    public void Conversion1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1151");
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
    public void Conversion1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1152");
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
    public void Conversion1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1153");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 0, (long) (short) 10, 4, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void Conversion1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1154");
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
    public void Conversion1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1155");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        int int7 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray2, (int) (short) 1, (int) '1', 0, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1156");
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
    public void Conversion1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1157");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1158");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, 48, "", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1159");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 100, 49, "ff00000000", (int) '4', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ff00000000" + "'", str5.equals("ff00000000"));
    }

    @Test
    public void Conversion1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1160");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) ' ', (byte) -1, (int) (byte) 32, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1161");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) 10, 8, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void Conversion1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1162");
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
    public void Conversion1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1163");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 1, (byte) 0, (int) (byte) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1164");
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
    public void Conversion1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1165");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", 100, (byte) -1, (int) '1', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1166");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1167");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, (int) (short) 10, "", 49, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1168");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("ff00000000", (int) (byte) 0, (int) '2', (int) (byte) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
    }

    @Test
    public void Conversion1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1169");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("ff00000000", 56, 49, 56, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1170");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 48");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1171");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 2, (short) (byte) -1, (int) (short) 1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1172");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", 11, (byte) 100, 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1173");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1174");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1175");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        int int7 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray2, (int) (short) 1, (int) '1', 0, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1176");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, (int) (byte) 100, "hi00000", (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1177");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1178");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'a', (int) '5', "", (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1179");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1180");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "f", (int) '1', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1181");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 35, (int) (short) 32, shortArray2, (int) 'd', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1182");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 32, (int) 'd', "0", 98, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1183");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) (short) 10, (short) (byte) 1, 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Conversion1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1184");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '5', (int) (byte) 100, 50, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1185");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1186");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1187");
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
    public void Conversion1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1188");
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
    public void Conversion1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1189");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) '#', (short) (byte) -1, (int) 'd', 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1190");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 5, (short) 100, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1191");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (byte) 10, (byte) 100, (int) (byte) 32, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1192");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1193");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '4', (byte) 100, 50, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1194");
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
    public void Conversion1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1195");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 2, "hi00000", (int) (short) 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1196");
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
    public void Conversion1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1197");
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
    public void Conversion1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1198");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1199");
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
    public void Conversion1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1200");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) 'a', (long) '#', 5, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1201");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 100, (int) '2', intArray2, 48, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1202");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, 5, (long) (short) -1, (int) '1', (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1203");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1204");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 32, 0, booleanArray2, (int) (byte) -1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1205");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 0, (int) (short) 32, "hi!", (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1206");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", 8, (short) 32, 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1207");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1208");
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
    public void Conversion1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1209");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) (byte) 1, 100, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret 'i' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1210");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1211");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1212");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1213");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1214");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'a', 56, "0000", (int) '0', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1215");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(48, 35, "0", (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1216");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1217");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) 'a', (short) (byte) 32, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1218");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000000000", (int) (short) -1, (byte) 0, 4, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Conversion1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1219");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1220");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, (int) (short) 32, 50L, 13, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1221");
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
    public void Conversion1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1222");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi00000", 50, (short) (byte) -1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1223");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", (int) (short) 32, (short) (byte) 1, (int) 'a', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1224");
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
    public void Conversion1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1225");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1226");
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
    public void Conversion1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1227");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray0, (int) 'b', (long) '0', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1228");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(1, 13, "f", 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1229");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) (byte) -1, (int) (byte) 10, 8, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void Conversion1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1230");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1231");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '#', (int) 'd', "0000000000", (-1), (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000000000" + "'", str5.equals("0000000000"));
    }

    @Test
    public void Conversion1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1232");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) 0, (byte) -1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1233");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) (byte) 100, (byte) -1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1234");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 'a', (int) (short) 0, "ff00000000", (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1235");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1236");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, 2, "", (int) '2', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1237");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '8', "0", (-1), (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1238");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 48, 10, "0", (int) (short) 32, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1239");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 32, (short) (byte) 0, (int) (short) 32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1240");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 98, (long) 'd', (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 98");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1241");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000", 2, 0, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1242");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1243");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) '2', (int) (short) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1244");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 35, (short) 10, (int) '8', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1245");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1246");
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
    public void Conversion1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1247");
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
    public void Conversion1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1248");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray2, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1249");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (byte) 0, "hi00000", (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1250");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) (short) 32, (int) (short) 32, (int) '5', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1251");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1252");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '5' + "'", char2 == '5');
    }

    @Test
    public void Conversion1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1253");
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
    public void Conversion1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1254");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1255");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 0, "0000", (int) (byte) 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1256");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 10, (int) (byte) 1, "hi00000", (int) '0', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1257");
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
    public void Conversion1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1258");
        byte[] byteArray3 = new byte[] { (byte) 32 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1259");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1260");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(100L, (int) '5', "hi00000", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1261");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1262");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1263");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 50, (short) 32, 13, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 32 + "'", short5 == (short) 32);
    }

    @Test
    public void Conversion1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1264");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(100L, (int) (byte) 0, "", 49, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1265");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1266");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 1, "0000", 56, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1267");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1268");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (short) 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1269");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('5');
        byte byte6 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) 'a', (byte) -1, (int) (short) 1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1270");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1271");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1272");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1273");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 5, "", (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1274");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) 'a', (byte) 1, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1275");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '8', (byte) 32, 48, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1276");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (short) -1, (short) 10, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1277");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) 'd', 8, booleanArray2, (-1), (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1278");
        int[] intArray3 = new int[] { (short) 0, 11, '8' };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1279");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1280");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1281");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) -1, (int) (byte) 10, "0", 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1282");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) (short) 100, (long) (short) 100, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1283");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1284");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("ff00000000", (int) (short) 0, (byte) -1, 8, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1285");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) 'd', 4, booleanArray2, 56, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1286");
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
    public void Conversion1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1287");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1288");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 4, (short) (byte) -1, (int) (byte) 32, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1289");
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
    public void Conversion1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1290");
        int[] intArray2 = new int[] { 'd', 13 };
        long long7 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray2, (-1), 13L, (int) '0', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 13L + "'", long7 == 13L);
    }

    @Test
    public void Conversion1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1291");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1292");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 0, (int) '#', "hi00000", (int) (short) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1293");
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
    public void Conversion1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1294");
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
    public void Conversion1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1295");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '8', (int) (short) 100, (-1), (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1296");
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
    public void Conversion1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1297");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, (int) (short) 100, booleanArray2, 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1298");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1299");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", (int) (short) 0, (long) (short) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1300");
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
    public void Conversion1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1301");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) 'a', "hi!", 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1302");
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
    public void Conversion1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1303");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 0, (byte) 10, 49, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1304");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) (short) 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1305");
        short[] shortArray3 = new short[] { (byte) 1 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1306");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 0, 8, booleanArray2, 13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1307");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1308");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (short) 10, (long) 0, (int) (short) 100, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1309");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1310");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", 50, (byte) 32, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1311");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.lang3.Conversion.intToByteArray(48, (int) (short) 100, byteArray5, (int) '8', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void Conversion1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1312");
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
    public void Conversion1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1313");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray0, (int) '0', (int) '5', 2, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1314");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '1', (int) (short) 10, 50, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1315");
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
    public void Conversion1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1316");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1317");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1318");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1319");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (short) 100, (long) 50, (int) (byte) -1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1320");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1321");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1322");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1323");
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
    public void Conversion1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1324");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) '5', (byte) 100, 98, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void Conversion1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1325");
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
    public void Conversion1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1326");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (short) 10, "0000", (int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1327");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) '2', (byte) 10, (int) (short) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1328");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000", (int) 'a', (short) (byte) 1, 8, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Conversion1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1329");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) -1, (short) (byte) 100, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1330");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", 98, (short) -1, 49, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1331");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1332");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, (int) 'a', "hi00000", 100, (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1333");
        short[] shortArray2 = new short[] {};
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1334");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(98, 48, "hi!", (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1335");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void Conversion1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1336");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1337");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '2', 100, (int) (byte) 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1338");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1339");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000000000", (int) (byte) 0, (short) 10, (int) '8', (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1340");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 13, (short) (byte) 1, (int) (byte) 10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1341");
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
    public void Conversion1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1342");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) 0, 49, booleanArray2, 35, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1343");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 98, 35, "", 11, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1344");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 1, (int) '4', "0", (int) (byte) 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1345");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (byte) 100, 0, (int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1346");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 56, "hi!", (int) (byte) 32, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1347");
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
    public void Conversion1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1348");
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
    public void Conversion1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1349");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) 'a', "0000", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1350");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 11, 0, "0", 48, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1351");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 4, "0000", 49, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1352");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (byte) -1, "0000000000", (int) 'd', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1353");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 100, (-1), "hi00000", (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1354");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 49, (byte) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1355");
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
    public void Conversion1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1356");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 50, (byte) -1, (int) (short) -1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1357");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 49, "f", (int) '1', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1358");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", 5, (long) (short) 1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1359");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1360");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1361");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) 0, (int) '#', 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1362");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 11, (short) 100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1363");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('b');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) -1, (int) (short) 0, booleanArray3, 1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1364");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1365");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (-1), "0000", (int) '8', (int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1366");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'b', (int) (short) 10, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1367");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) 32, (byte) 0, (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1368");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1369");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) '1', (-1L), (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1370");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1371");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) '0', (int) '0', booleanArray2, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1372");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '1', 5, "f", (int) (short) 0, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1000" + "'", str5.equals("1000"));
    }

    @Test
    public void Conversion1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1373");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi00000", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1374");
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
    public void Conversion1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1375");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) -1, (byte) 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1376");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1377");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1378");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, 48, "0000000000", 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1379");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1380");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1381");
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
    public void Conversion1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1382");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(0, 1, "", (int) (short) -1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1383");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1384");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, (int) '1', 4, (int) '5', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1385");
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
    public void Conversion1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1386");
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
    public void Conversion1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1387");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 100, (long) (byte) -1, (int) ' ', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1388");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("ff00000000", (int) (short) 100, (short) 0, 49, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1389");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(0L, 13, "1000", (int) (short) 32, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1390");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", 50, (long) 48, (int) 'b', 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1391");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 1, "1000", 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1392");
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
    public void Conversion1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1393");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', 56, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1394");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1395");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 4, "", (int) '1', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1396");
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
    public void Conversion1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1397");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 13, "0000", (int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000" + "'", str5.equals("0000"));
    }

    @Test
    public void Conversion1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1398");
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
    public void Conversion1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1399");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1400");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0000", (int) '8', 100L, 35, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1401");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 35, (byte) 100, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1402");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 0, "1000", (int) '1', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1000" + "'", str5.equals("1000"));
    }

    @Test
    public void Conversion1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1403");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) (byte) 100, "", 48, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1404");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        short short6 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray1, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1405");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 32, 35, "hi00000", (int) 'd', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1406");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1407");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, 0, (int) '5', 49, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1408");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1409");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 49, (long) '4', (int) (short) 10, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1410");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("1000", 8, (byte) 100, (int) 'b', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1411");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, 48, "", 35, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1412");
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
    public void Conversion1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1413");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, 0, "hi!", (int) (short) 32, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1414");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) '#', (byte) 100, 48, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1415");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1416");
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
    public void Conversion1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1417");
        short[] shortArray3 = new short[] { (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1418");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '2', (byte) 100, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1419");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, (int) '1', "0", (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1420");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) -1, 56, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1421");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', (int) '1', (int) (short) 1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1422");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) 32, 10, "f", (int) '1', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1423");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1424");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 1, (int) ' ', "hi00000", (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1425");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, 0, "0", (int) 'b', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1426");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '8', "0000000000", (int) '0', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1427");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0000000000", (int) '1', (int) (byte) 10, (int) '5', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1428");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 1, (int) '0', booleanArray2, 56, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1429");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 10, (byte) -1, (int) '8', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1430");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 10, 11, booleanArray2, (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1431");
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
    public void Conversion1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1432");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(35L, (int) '8', "ff00000000", (int) (byte) 32, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1433");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0000", (int) (short) 1, (short) 1, 48, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1434");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 10, (int) '4', "0", 49, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1435");
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
    public void Conversion1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1436");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1437");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1438");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, 0, "", (int) 'b', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1439");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) 'b', (int) '4', (int) '5', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1440");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1441");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) (byte) 100, (int) (short) -1, (int) '0', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1442");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) '0', (byte) 32, 98, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1443");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) -1, (short) (byte) 10, (int) '0', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1444");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(0L, (int) (short) 32, "", (-1), (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1445");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (byte) 32, (short) (byte) -1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1446");
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
    public void Conversion1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1447");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1448");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '1' + "'", char3 == '1');
    }

    @Test
    public void Conversion1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1449");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(13, 10, "f", 4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1450");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("ff00000000", 48, (long) 1, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1451");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1452");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray(562949953421412L, 4, intArray2, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1453");
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
    public void Conversion1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1454");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, 1);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1455");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, 1, booleanArray2, (int) (byte) 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1456");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('d');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1457");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.intToBinary((int) '1', 8, booleanArray2, 11, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1458");
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
    public void Conversion1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1459");
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
    public void Conversion1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1460");
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
    public void Conversion1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1461");
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
    public void Conversion1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1462");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("1000", 48, 53L, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1463");
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
    public void Conversion1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1464");
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
    public void Conversion1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1465");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void Conversion1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1466");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 5, "hi!", (int) 'b', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1467");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 1, (byte) 10, 4, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1468");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1469");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) (byte) 100, (byte) -1, 50, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1470");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1471");
        short[] shortArray0 = new short[] {};
        int int5 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray0, 0, 2, (int) (short) 32, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void Conversion1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1472");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(13L, (int) 'd', "1000", 98, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1473");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", 4, (byte) 1, 8, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1474");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0000", (int) '4', (byte) 10, (int) (byte) -1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1475");
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
    public void Conversion1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1476");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '#', 13L, 48, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1477");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1478");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'b', (int) (short) -1, (int) 'b', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1479");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "hi!", (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1480");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((-1L), (int) (short) -1, intArray2, (int) (short) 1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1481");
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
    public void Conversion1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1482");
        java.util.UUID uUID2 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID2, byteArray3, (int) '5', (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1483");
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
    public void Conversion1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1484");
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
    public void Conversion1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1485");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 0, 11, booleanArray3, 5, (-1));
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1486");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, false };
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '3' + "'", char8 == '3');
    }

    @Test
    public void Conversion1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1487");
        byte[] byteArray0 = new byte[] {};
        short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, (int) (short) 0, (short) (byte) 100, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1488");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '5', "hi!", 50, (int) (byte) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1489");
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
    public void Conversion1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1490");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long6 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray1, (int) (byte) 10, (long) '4', 11, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void Conversion1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1491");
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
    public void Conversion1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1492");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'b', 48, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    }

    @Test
    public void Conversion1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1493");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1494");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 50, (byte) 10, 5, (int) '3');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1495");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 32, 11, "0", (int) 'a', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1496");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        short short7 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 11, (short) (byte) 10, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1497");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1498");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '0', (int) ' ', "hi00000", (int) '5', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1499");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 32 };
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion2.Conversion1500");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
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

