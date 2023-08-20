package Conversion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Conversion0 {

    public static boolean debug = false;

    @Test
    public void Conversion0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0001");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
        try {
            short short7 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray2, (int) (byte) 1, (short) (byte) 10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0002");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0003");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0004");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void Conversion0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0005");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void Conversion0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0006");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.intToByteArray(1, (int) (short) -1, byteArray5, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0007");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.shortToByteArray((short) -1, (int) (short) 1, byteArray5, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0008");
        int[] intArray2 = new int[] { 4, (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray2, (int) (byte) 1, (long) 100, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void Conversion0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0009");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) ' ', (short) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0010");
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0011");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) 'a', (byte) -1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0012");
        org.apache.commons.lang3.Conversion conversion0 = new org.apache.commons.lang3.Conversion();
        java.lang.Class<?> wildcardClass1 = conversion0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void Conversion0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0013");
        int[] intArray4 = new int[] { '4', (byte) 0, 1, '#' };
        // The following exception was thrown during execution in Conversion generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray4, 0, (long) (short) -1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void Conversion0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0014");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 0, (int) (byte) 100, "hi!", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0015");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0016");
        java.util.UUID uUID0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray3, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBytes is greather than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0017");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            int int8 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray3, (int) (byte) -1, (int) (short) 0, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0018");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=6, srcPos=10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
    }

    @Test
    public void Conversion0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0019");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray7, (int) (byte) 100);
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
    public void Conversion0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0020");
        int[] intArray1 = new int[] { 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray1, (int) (short) 0, (long) '4', (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void Conversion0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0021");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0022");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) '#');
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
    public void Conversion0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0023");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0024");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '4', "", 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0025");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, 1, "hi!", 4, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0026");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '8', (long) (short) 1, (int) '8', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0027");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Conversion0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0028");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', (int) '5', (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0029");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 0, (int) (byte) 10, "hi!", (int) '#', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0030");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 10, 4, (int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void Conversion0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0031");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 10, (int) '5', "hi!", (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0032");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0033");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (-1), "hi!", (int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0034");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (byte) -1, (int) '5', 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0035");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '4', (int) (short) 1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0036");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0037");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0038");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, 4, (short) 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0039");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0040");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) -1, 100, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0041");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray1, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void Conversion0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0042");
        short[] shortArray2 = new short[] { (short) 100, (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
        try {
            int int7 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray2, 100, (int) '#', (int) 'a', (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void Conversion0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0043");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '#', (int) '5', "hi!", (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0044");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 10, "hi!", 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0045");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '4', (int) (short) 0, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0046");
        boolean[] booleanArray2 = new boolean[] { true, true };
        // The following exception was thrown during execution in Conversion generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
    }

    @Test
    public void Conversion0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0047");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 100, (short) 10, (int) '5', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0048");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (short) -1, "", (int) (byte) -1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0049");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) -1, (int) '5', "hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0050");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void Conversion0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0051");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0052");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 100, (byte) -1, (int) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0053");
        int[] intArray6 = new int[] { ' ', 10, (short) 100, 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray9 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 1, (int) '4', intArray6, 10, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void Conversion0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0054");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0055");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 100, (byte) 0, (-1), (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0056");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert an empty array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void Conversion0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0057");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0058");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        java.lang.Class<?> wildcardClass8 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0059");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('d');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void Conversion0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0060");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
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
    public void Conversion0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0061");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "", (int) '5', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0062");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0063");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 100, "", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0064");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0065");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (byte) 1, 0, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0066");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void Conversion0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0067");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0068");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(4, (int) ' ', "hi!", (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0069");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 0, (long) 11, (int) (short) 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
    }

    @Test
    public void Conversion0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0070");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '8', (short) (byte) -1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0071");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 10, (int) '4', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0072");
        boolean[] booleanArray3 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in Conversion generation
        try {
            int int8 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray3, (int) (byte) 0, (int) '4', 2, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0073");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=3, srcPos=0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0074");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            int int9 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray3, 10, (-1), (int) 'd', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0075");
        short[] shortArray0 = new short[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray0, 10, (long) 4, (int) '8', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
    }

    @Test
    public void Conversion0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0076");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (short) 0, "hi!", (int) '0', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0077");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void Conversion0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0078");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 10, (short) 100, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0079");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) 'b', "hi!", 2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0080");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 0, (long) (short) 10, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0081");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 10, 10, "", 11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0082");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void Conversion0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0083");
        short[] shortArray1 = new short[] { (byte) 1 };
        int int6 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray1, (int) 'a', 0, (int) '8', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Conversion0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0084");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (byte) 10, "", 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0085");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) 'b', booleanArray3, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0086");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) 0, (int) 'd', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0087");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
    }

    @Test
    public void Conversion0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0088");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (short) 10, (long) '5', (int) (short) -1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
    }

    @Test
    public void Conversion0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0089");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, 5);
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
    public void Conversion0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0090");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (short) -1, "", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0091");
        short[] shortArray3 = new short[] { (short) -1 };
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.Conversion.longToShortArray((long) 10, (int) (byte) -1, shortArray3, 11, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
    }

    @Test
    public void Conversion0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0092");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 100, (long) '8', 11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0093");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 10, (-1), "hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0094");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (byte) 0, "hi!", (int) '5', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0095");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void Conversion0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0096");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, 100);
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
    public void Conversion0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0097");
        boolean[] booleanArray5 = new boolean[] { true, false, false };
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 1, 5, booleanArray5, 11, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '4' + "'", char6 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray9);
    }

    @Test
    public void Conversion0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0098");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0099");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0100");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(11, (int) (short) 1, "", (int) '0', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0101");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 10, (long) 10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0102");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) ' ', "", (int) (short) 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0103");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(2, 13, "hi!", (int) (byte) 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0104");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray5);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'd' + "'", char8 == 'd');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'd' + "'", char9 == 'd');
    }

    @Test
    public void Conversion0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0105");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 10, (int) '5', booleanArray3, 5, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0106");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) '8', "hi!", (int) '0', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0107");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) 'd');
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
    public void Conversion0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0108");
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0109");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void Conversion0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0110");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '5', (int) (byte) 1, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0111");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) -1, (short) 0, 0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0112");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0113");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 2, (long) (byte) 100, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0114");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) ' ', "hi!", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0115");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 1, (int) ' ', "hi!", (int) (byte) 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0116");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.Conversion.longToShortArray((long) (byte) 1, (int) (short) 10, shortArray6, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void Conversion0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0117");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void Conversion0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0118");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) 'a', (short) 1, 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0119");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 2, (short) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0120");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 10, (int) '#', "", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0121");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), 10, "", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0122");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) 100, (int) (byte) 100, intArray2, (int) (byte) 10, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void Conversion0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0123");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 10, (int) '5', (int) (byte) 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0124");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 10, (long) '4', (int) (byte) 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0125");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 2, (byte) 1, (int) (byte) 10, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0126");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '0', "", (int) '8', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0127");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0128");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0129");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) -1, (int) (short) -1, "", (int) ' ', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0130");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) '#', "", (int) '8', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0131");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 1, (int) (short) 1, booleanArray2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0132");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, (int) (short) 100, "", (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0133");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0134");
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0135");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 100, (byte) -1, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0136");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void Conversion0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0137");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray3, (int) (byte) 10, (int) '5');
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
    public void Conversion0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0138");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) -1, (short) -1, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0139");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in Conversion generation
        try {
            short short9 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray4, 10, (short) 10, 5, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0140");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0141");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 5, (short) (byte) -1, (int) ' ', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0142");
        boolean[] booleanArray5 = new boolean[] { true, false, false };
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 10, (int) '4', booleanArray5, 2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '4' + "'", char6 == '4');
    }

    @Test
    public void Conversion0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0143");
        short[] shortArray4 = new short[] { (byte) -1, (byte) -1 };
        short[] shortArray7 = org.apache.commons.lang3.Conversion.intToShortArray((int) (short) -1, (int) (byte) 1, shortArray4, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = shortArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0144");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (short) 1, "hi!", (int) (byte) 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0145");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 1, (int) '#', booleanArray3, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
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
    public void Conversion0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0146");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) -1, (byte) 100, (int) '8', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0147");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '1', (int) (byte) 10, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0148");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0149");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 13, (int) '5', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0150");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0151");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0152");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) (short) 100, "hi!", 11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0153");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) 'b', (short) 10, (int) '1', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0154");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Conversion0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0155");
        boolean[] booleanArray0 = new boolean[] {};
        long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, 0, 0L, 0, (int) '4');
        // The following exception was thrown during execution in Conversion generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0);
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
    public void Conversion0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0156");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) 100, 100, booleanArray3, (int) '#', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0157");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 0, "hi!", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0158");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) -1, (int) (short) 1, intArray2, (int) '0', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0159");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void Conversion0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0160");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 100, (byte) 10, 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void Conversion0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0161");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.byteArrayToLong(byteArray3, 10, (long) '0', (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0162");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray3, 5, (int) (byte) -1);
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
    public void Conversion0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0163");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, 100, (int) ' ');
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
    public void Conversion0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0164");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0165");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(11L, (int) (short) 100, "hi!", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0166");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray7, (int) '8');
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
    public void Conversion0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0167");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 1, "hi!", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0168");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) 1, (int) 'd', 11, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0169");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) 'a', "hi!", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0170");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
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
    public void Conversion0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0171");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (byte) 100, "hi!", (int) '0', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0172");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 1, (byte) 100, 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0173");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray3, 4, (long) (byte) -1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0174");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0175");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0176");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void Conversion0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0177");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, (int) (short) 1, booleanArray2, (int) '#', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0178");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 5, (int) (short) 100, 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0179");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void Conversion0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0180");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 0, (long) '#', (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void Conversion0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0181");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0182");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            long long8 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (short) 10, 0L, 1, (int) '0');
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
    public void Conversion0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0183");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (byte) 10, (long) (byte) 0, (int) '4', (int) (short) 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '8' + "'", char8 == '8');
    }

    @Test
    public void Conversion0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0184");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0185");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0186");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        // The following exception was thrown during execution in Conversion generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 5, (int) '1', 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0187");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) -1, 0L, (int) 'd', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void Conversion0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0188");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 10, (byte) 100, 13, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0189");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0190");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 0 };
        short[] shortArray7 = org.apache.commons.lang3.Conversion.intToShortArray(0, 10, shortArray4, 2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void Conversion0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0191");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray7, 11);
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
    public void Conversion0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0192");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) 'b', (int) '1', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0193");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0194");
        int[] intArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) (byte) 1, (long) (byte) -1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0195");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 2, (byte) -1, 11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0196");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 0, "", (int) '8', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0197");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0198");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 1 };
        long long7 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray2, (int) 'd', (long) '2', (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 50L + "'", long7 == 50L);
    }

    @Test
    public void Conversion0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0199");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) '0', "hi!", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0200");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 0, (long) 5, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0201");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 10, (int) (short) 0, (int) '2', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0202");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 10, (-1L), (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0203");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
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
    public void Conversion0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0204");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) (byte) 100, "hi!", (int) 'b', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0205");
        short[] shortArray2 = new short[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 11, (int) 'b', shortArray2, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
    }

    @Test
    public void Conversion0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0206");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Conversion0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0207");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) (byte) 1, 0, byteArray2, (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0208");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Conversion0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0209");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 1, (int) (short) 10, booleanArray3, (int) '4', (int) (byte) 100);
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
    public void Conversion0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0210");
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0211");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (short) 0, (short) 10, (int) (short) 10, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0212");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, (int) '0', (int) (short) 100, (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0213");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Conversion0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0214");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (-1), 10L, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0215");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0216");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) (short) 0, "hi!", 1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0217");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', (int) (byte) 0, 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Conversion0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0218");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) 'a', (int) (short) 0, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0219");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 2, (int) '5', (int) ' ', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0220");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) (byte) 0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0221");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) (short) 10, (int) (byte) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0222");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 10, (short) (byte) 100, 13, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0223");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'a', (int) (short) 100, "hi!", (int) (short) -1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0224");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) 'b', (short) -1, 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0225");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) (byte) 1, (int) (short) 0, shortArray2, (int) '2', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0226");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray6 = org.apache.commons.lang3.Conversion.intToByteArray(100, 1, byteArray3, (int) '5', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void Conversion0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0227");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) 'b', "", (int) ' ', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0228");
        boolean[] booleanArray2 = new boolean[] { false, true };
        // The following exception was thrown during execution in Conversion generation
        try {
            char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=2, srcPos=97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
    }

    @Test
    public void Conversion0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0229");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
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
    public void Conversion0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0230");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) -1, "", (int) (byte) 100, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0231");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(50L, (-1), "hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0232");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 10, (int) '#', "hi!", (int) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0233");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (byte) 100, 10L, (int) 'd', (int) 'a');
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
    public void Conversion0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0234");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 0, (byte) -1, (int) (byte) 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0235");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0236");
        int[] intArray2 = new int[] {};
        int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 1, 1, intArray2, 5, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void Conversion0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0237");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray5, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'b' + "'", char7 == 'b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'd' + "'", char9 == 'd');
    }

    @Test
    public void Conversion0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0238");
        int[] intArray0 = new int[] {};
        long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) (byte) 0, (long) (short) 1, (int) (short) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void Conversion0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0239");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) '2', "hi!", (int) '5', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0240");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '8', (int) 'b', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0241");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary(0L, 13, booleanArray3, 2, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0242");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) (byte) 1, (short) -1, 4, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0243");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) (short) -1);
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
    public void Conversion0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0244");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray6, (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void Conversion0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0245");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void Conversion0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0246");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.intToByteArray((int) (short) 100, (int) '5', byteArray6, 11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0247");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0248");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void Conversion0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0249");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 11, (int) '1', shortArray2, (-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0250");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 10, 13, (int) '1', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0251");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
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
    public void Conversion0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0252");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void Conversion0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0253");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 2, (long) 100, (int) '1', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 562949953421412L + "'", long6 == 562949953421412L);
    }

    @Test
    public void Conversion0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0254");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '4' + "'", char5 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '4' + "'", char6 == '4');
    }

    @Test
    public void Conversion0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0255");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
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
    public void Conversion0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0256");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '1', (short) 0, (int) '0', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0257");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, (int) (byte) -1);
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
    public void Conversion0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0258");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0259");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
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
    public void Conversion0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0260");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) (byte) 10, "", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0261");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 13, (long) '#', 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void Conversion0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0262");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '1', "", (int) '0', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0263");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void Conversion0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0264");
        byte[] byteArray2 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) (short) 100, (int) (byte) 1, byteArray2, 0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
    }

    @Test
    public void Conversion0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0265");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) 'b', "", (int) '0', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0266");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '4', (int) (short) 10, 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0267");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (short) 1, (long) (byte) 100, (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0268");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
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
    public void Conversion0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0269");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), (int) (short) 1, "hi!", (int) (short) 100, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0270");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (short) 0, 8, booleanArray3, 10, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0271");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) (byte) 100, "hi!", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0272");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 1, (short) 0, (int) '4', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0273");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 1, (short) (byte) 0, (int) (short) 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0274");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, (int) ' ');
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
    public void Conversion0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0275");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
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
    public void Conversion0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0276");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, (int) '5', 8, (int) '2', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0277");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 10, (int) (byte) 1, "hi!", (int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0278");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (byte) 10, (long) (byte) 0, (int) '4', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '1' + "'", char7 == '1');
    }

    @Test
    public void Conversion0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0279");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) 'a', (long) (byte) 1, (int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void Conversion0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0280");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.longToByteArray((long) 2, (int) (byte) 10, byteArray5, 2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0281");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) '8', 1L, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0282");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '#', 1, 5, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0283");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, 8, (byte) 1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0284");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '0', "", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0285");
        int[] intArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) '5', (long) (short) 0, (int) 'b', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0286");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (-1), (int) '4', "", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0287");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
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
    public void Conversion0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0288");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 1, (short) 0, (int) (byte) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0289");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(11L, (int) 'a', "", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0290");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in Conversion generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 5, (long) (short) 0, (int) 'd', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0291");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, 2, (short) 1, (int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0292");
        boolean[] booleanArray5 = new boolean[] { false, true, true };
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, 4, booleanArray5, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
    }

    @Test
    public void Conversion0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0293");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, 11);
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
    public void Conversion0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0294");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) 10, (short) -1, 4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0295");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) 'b', (short) 1, 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0296");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (byte) -1, (long) (byte) 1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0297");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (-1), (short) -1, (int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0298");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, 2);
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
    public void Conversion0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0299");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0300");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0301");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0302");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) (short) 100, "", 4, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0303");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 11, (long) (byte) 100, (int) (short) 100, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0304");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 0, (int) (short) 0, "hi!", 2, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0305");
        int[] intArray4 = new int[] { (short) 0, '5' };
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray7 = org.apache.commons.lang3.Conversion.longToIntArray(11L, 5, intArray4, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void Conversion0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0306");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0307");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
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
    public void Conversion0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0308");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) -1, (short) (byte) 1, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0309");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0310");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '4', (int) (short) 1, "hi!", (int) '0', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0311");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 8, (byte) 1, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0312");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) 'b', (short) (byte) 10, 8, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Conversion0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0313");
        int[] intArray3 = new int[] { '0' };
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray6 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) 10, (int) '5', intArray3, 10, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void Conversion0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0314");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 1, (-1L), (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0315");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 10, 4, booleanArray3, 11, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0316");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(10, (int) 'd', "hi!", (int) 'b', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0317");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6, 100);
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
    public void Conversion0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0318");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 100, "", (int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0319");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 1, (byte) 100, (int) '8', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0320");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(5, (int) '2', "hi00000", 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0321");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 0, (int) '2', "hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0322");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 11, (short) 100, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0323");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0324");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) -1, (long) (short) 1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0325");
        int[] intArray6 = new int[] { 13, (byte) -1, (short) 1, '4' };
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray9 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) -1, (int) (byte) 0, intArray6, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void Conversion0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0326");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.longToBinary((long) 8, (int) (short) 0, booleanArray3, 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '0' + "'", char4 == '0');
    }

    @Test
    public void Conversion0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0327");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0328");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            int int8 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 10, (int) (byte) -1, (int) '#', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
    }

    @Test
    public void Conversion0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0329");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) (short) 100, "hi00000", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0330");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 5, (int) (byte) 10, booleanArray3, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0331");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 8, (byte) 0, 11, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0332");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray0, (int) '#', 13, 11, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0333");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0334");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(10, 13, "hi00000", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0335");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 100, 0, "hi!", 5, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0336");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (-1), (short) -1, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0337");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 10, (int) (byte) 1, 11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0338");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 1, (short) 0, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0339");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) (short) 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0340");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) 0, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0341");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0342");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, 100, (short) 100, 1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0343");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0344");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) '8', "hi00000", 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0345");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, 1);
        java.lang.Class<?> wildcardClass9 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '5' + "'", char8 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0346");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), (-1), "", 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0347");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0348");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
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
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0349");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0350");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 48");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0351");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 0, (long) 13, 100, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void Conversion0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0352");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 8, "", (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0353");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, 13);
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
    public void Conversion0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0354");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) '#', (byte) 100, 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void Conversion0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0355");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (byte) 1, (int) 'd', (int) (byte) 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0356");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) 4, (int) '8', booleanArray2, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0357");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) '8', booleanArray2, (int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0358");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '1', 1, "", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0359");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 10, (short) 0, (int) '5', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0360");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) '4', "hi!", 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0361");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '8', (int) (short) 10, "", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0362");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0363");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '8', "hi00000", 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0364");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 10, (byte) 1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0365");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) (short) 10, (byte) 100, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0366");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        // The following exception was thrown during execution in Conversion generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 11, (long) 100, (int) '1', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0367");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            int int6 = org.apache.commons.lang3.Conversion.binaryToInt(booleanArray1, 0, (int) '4', 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0368");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            short short8 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, (int) '5', (short) (byte) 0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0369");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in Conversion generation
        try {
            long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) 'b', 0L, 11, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0370");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, 0, booleanArray3, 100, (int) (short) 10);
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
    public void Conversion0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0371");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void Conversion0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0372");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0373");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in Conversion generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 0, (short) 1, (int) ' ', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0374");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray5, 1);
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
    public void Conversion0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0375");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 1, "", (int) (short) -1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0376");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte8 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray1, (int) (byte) 0, (byte) 1, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0377");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'd' + "'", char1 == 'd');
    }

    @Test
    public void Conversion0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0378");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) '8');
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
    public void Conversion0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0379");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) '5', (byte) -1, (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0380");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'b' + "'", char1 == 'b');
    }

    @Test
    public void Conversion0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0381");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '0', "", (int) '0', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0382");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0383");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) 'b');
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
    public void Conversion0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0384");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, 2, "", (int) '1', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0385");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) 8, 0, intArray2, (int) '2', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0386");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, (int) (byte) -1, booleanArray3, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0387");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 0, 10, byteArray2, (int) (short) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0388");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in Conversion generation
        try {
            short short6 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 11, (short) (byte) 100, 13, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
    }

    @Test
    public void Conversion0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0389");
        short[] shortArray2 = null;
        short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) '1', 1, shortArray2, 11, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(shortArray5);
    }

    @Test
    public void Conversion0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0390");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) -1, (int) (byte) 0, booleanArray3, (int) 'd', (int) '0');
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
    public void Conversion0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0391");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'd', 49, (int) (byte) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0392");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 0, "hi!", (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0393");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) '2', (long) '#', (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0394");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, 11, (int) ' ', 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0395");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            short short9 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray3, (int) (byte) 1, (short) (byte) 1, 13, (int) '2');
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
    public void Conversion0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0396");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 0, (short) (byte) -1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0397");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (short) -1, "", (int) (short) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0398");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        byte byte9 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray3, 0, (byte) 1, (int) (byte) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void Conversion0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0399");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (byte) 0, "hi!", 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0400");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (short) 0, (short) 100, (int) '#', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0401");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", 1, 0L, 13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0402");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) (short) 1, (byte) -1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0403");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0404");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0405");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) -1, (long) '5', 11, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0406");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) 'd');
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
    public void Conversion0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0407");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) 'd', (short) -1, (int) (byte) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0408");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', 49, "hi!", (int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0409");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 2, (short) (byte) 0, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0410");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) -1, (int) (byte) 10, booleanArray3, (int) '4', 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '5' + "'", char9 == '5');
    }

    @Test
    public void Conversion0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0411");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 0, (byte) 0, (int) '1', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0412");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID6 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Need at least 16 bytes for UUID");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
    }

    @Test
    public void Conversion0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0413");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=49");
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
    public void Conversion0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0414");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 49, (int) (byte) 0, 1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0415");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 13, (short) (byte) 0, 49, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0416");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, (int) (short) 10, (byte) 0, 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0417");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0418");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 0, (byte) 0, (int) (short) 100, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0419");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '1', "hi00000", 5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0420");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) -1, (int) (byte) 10, booleanArray3, (int) '4', 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray8);
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
    public void Conversion0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0421");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (short) 100, (short) 10 };
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.Conversion.longToShortArray((long) ' ', (int) '5', shortArray6, (int) '1', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
    }

    @Test
    public void Conversion0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0422");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) (byte) 1, "", (int) '5', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0423");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) 'a', (int) (short) 100, booleanArray2, (int) '5', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0424");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, 10, "hi00000", 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0425");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        char char2 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '4' + "'", char2 == '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Conversion0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0426");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(100, (int) (byte) 10, "hi00000", 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0427");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.shortToBinary((short) 1, (-1), booleanArray3, (int) '5', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '1' + "'", char4 == '1');
    }

    @Test
    public void Conversion0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0428");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '4' + "'", char4 == '4');
    }

    @Test
    public void Conversion0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0429");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) -1, (byte) -1, (int) '5', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0430");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) 'a', (short) -1, (int) '5', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0431");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0432");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) (short) 10, 35L, 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0433");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
        try {
            long long9 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 0, (long) 8, (int) (byte) -1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
    }

    @Test
    public void Conversion0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0434");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(2, (int) '8', "hi!", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0435");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, (int) (short) 100);
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
    public void Conversion0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0436");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) 'a', (byte) 100, 2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0437");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) -1, (int) (byte) 10, booleanArray3, (int) '4', 0);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
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
    public void Conversion0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0438");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 49, (long) 1, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0439");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3, (int) (short) 1);
        char char9 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
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
    public void Conversion0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0440");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) 100, (short) 0, (int) ' ', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0441");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) 'b', "hi00000", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0442");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) (byte) 10, (byte) 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0443");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(1, (int) '2', "hi!", (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0444");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (short) 100, (int) '2', booleanArray3, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void Conversion0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0445");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) -1, (int) (short) 100, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0446");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void Conversion0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0447");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0448");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID9 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray4, (int) (short) 1);
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
    public void Conversion0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0449");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Conversion0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0450");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 11, "hi!", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0451");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0452");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (-1), (byte) 1, (int) 'd', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0453");
        short[] shortArray5 = new short[] { (short) 0, (byte) -1, (byte) 10 };
        short[] shortArray8 = org.apache.commons.lang3.Conversion.intToShortArray((int) 'a', (int) '1', shortArray5, (int) '2', 0);
        java.lang.Class<?> wildcardClass9 = shortArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Conversion0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0454");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0455");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '1', (int) (byte) 10, "hi!", (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0456");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0457");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 10, (long) '2', (int) 'a', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0458");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", (int) (byte) -1, (int) 'b', 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0459");
        // The following exception was thrown during execution in Conversion generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0460");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, (int) (byte) 0);
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
    public void Conversion0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0461");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.Conversion.intToByteArray((int) '4', (int) '0', byteArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void Conversion0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0462");
        // The following exception was thrown during execution in Conversion generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 2, (int) (short) 10, (int) '8', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0463");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void Conversion0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0464");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, 4, "0", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0465");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) (byte) 10, "hi!", (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0466");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, (int) '1', "f", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0467");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 1, "hi!", 5, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0468");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray7 = org.apache.commons.lang3.Conversion.intToBinary(0, 10, booleanArray3, (int) (byte) 1, 49);
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
    public void Conversion0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0469");
        // The following exception was thrown during execution in Conversion generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 10, (byte) 0, (int) (short) 10, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0470");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) 1, 2, intArray2, (int) '1', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0471");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, (int) '5', "f", 2, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0472");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = booleanArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Conversion0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0473");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        short short9 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray1, 5, (short) (byte) 10, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void Conversion0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0474");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) 'a', 4L, (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
    }

    @Test
    public void Conversion0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0475");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 1, 0L, 5, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0476");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray8 = org.apache.commons.lang3.Conversion.shortToByteArray((short) 0, (int) '2', byteArray5, 8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void Conversion0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0477");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray8 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) 100, (int) (short) -1, booleanArray3, 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void Conversion0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0478");
        short[] shortArray6 = new short[] { (short) 1, (byte) 1, (short) 0, (byte) 10 };
        short[] shortArray9 = org.apache.commons.lang3.Conversion.longToShortArray((long) '8', (int) (byte) 1, shortArray6, (int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void Conversion0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0479");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '0', 10, "f", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0480");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (-1), "", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0481");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
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
    public void Conversion0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0482");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in Conversion generation
        try {
            long long7 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, (int) (byte) -1, 50L, (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void Conversion0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0483");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6, 11);
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
    public void Conversion0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0484");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in Conversion generation
        try {
            short[] shortArray8 = org.apache.commons.lang3.Conversion.longToShortArray((long) 'b', 11, shortArray5, (int) '8', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void Conversion0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0485");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 2, (short) (byte) -1, (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0486");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) (short) 1, "hi00000", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0487");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) ' ', (byte) 1, 5, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0488");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 2, 10, "f", (int) '4', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0489");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char9 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + 'a' + "'", char9 == 'a');
    }

    @Test
    public void Conversion0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0490");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            java.util.UUID uUID7 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray2, 100);
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
    public void Conversion0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0491");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in Conversion generation
        try {
            char char8 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: src.length-srcPos<4: src.length=4, srcPos=52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void Conversion0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0492");
        int[] intArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) 10, 0, intArray2, 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0493");
        // The following exception was thrown during execution in Conversion generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (byte) -1, (long) 'b', 0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0494");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('d');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void Conversion0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0495");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray(1, (int) (short) 1, byteArray2, (int) '8', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0496");
        // The following exception was thrown during execution in Conversion generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 100, (short) (byte) -1, 11, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0497");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) (short) 0, booleanArray2, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0498");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 0, "", (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0499");
        // The following exception was thrown during execution in Conversion generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) '8', "", 8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.Conversion0500");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in Conversion generation
        try {
            boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 100, (int) (byte) 0, booleanArray3, (int) '8', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }
}

