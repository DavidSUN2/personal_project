
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
            System.out.format("%n%s%n", "Conversion0.test0001");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0003");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0004");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0005");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0006");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0007");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0008");
        int[] intArray2 = new int[] { 4, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) ' ', (short) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) 'a', (byte) -1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0012");
        org.apache.commons.lang3.Conversion conversion0 = new org.apache.commons.lang3.Conversion();
        java.lang.Class<?> wildcardClass1 = conversion0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0013");
        int[] intArray4 = new int[] { '4', (byte) 0, 1, '#' };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 0, (int) (byte) 100, "hi!", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0015");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0016");
        java.util.UUID uUID0 = null;
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0017");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0018");
        boolean[] booleanArray6 = new boolean[] { false, true, false, true, false, false };
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0019");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0020");
        int[] intArray1 = new int[] { 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret ' ' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0022");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0023");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '4', "", 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, 1, "hi!", 4, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) '8', (long) (short) 1, (int) '8', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0027");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', (int) '5', (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 0, (int) (byte) 10, "hi!", (int) '#', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0030");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 10, 4, (int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 10, (int) '5', "hi!", (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0032");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0033");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (-1), "hi!", (int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (byte) -1, (int) '5', 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0035");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0038");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, 4, (short) 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) -1, 100, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0041");
        java.util.UUID uUID0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0042");
        short[] shortArray2 = new short[] { (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '#', (int) '5', "hi!", (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 10, "hi!", 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '4', (int) (short) 0, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0046");
        boolean[] booleanArray2 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 100, (short) 10, (int) '5', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (short) -1, "", (int) (byte) -1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) -1, (int) '5', "hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0050");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0051");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0052");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 100, (byte) -1, (int) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0053");
        int[] intArray6 = new int[] { ' ', 10, (short) 100, 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0054");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 100, (byte) 0, (-1), (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0056");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0057");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0058");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0059");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('d');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0060");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
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
            System.out.format("%n%s%n", "Conversion0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '8', "", (int) '5', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 100, "", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0064");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (byte) 1, 0, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0066");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0067");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(4, (int) ' ', "hi!", (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0069");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 0, (long) 11, (int) (short) 0, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) '8', (short) (byte) -1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 56");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 10, (int) '4', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0072");
        boolean[] booleanArray3 = new boolean[] { true, true, false };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0073");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0074");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0075");
        short[] shortArray0 = new short[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0076");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (short) 0, "hi!", (int) '0', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0077");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 10, (short) 100, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) 'b', "hi!", 2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 0, (long) (short) 10, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 10, 10, "", 11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0082");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0083");
        short[] shortArray1 = new short[] { (byte) 1 };
        int int6 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray1, (int) 'a', 0, (int) '8', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (byte) 10, "", 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0085");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0086");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0087");
        boolean[] booleanArray5 = new boolean[] { true, true, false, true, true };
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0088");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (short) 10, (long) '5', (int) (short) -1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 53L + "'", long5 == 53L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0089");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0090");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (short) -1, "", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0091");
        short[] shortArray3 = new short[] { (short) -1 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 100, (long) '8', 11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 10, (-1), "hi!", (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (byte) 0, "hi!", (int) '5', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0095");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('b');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0096");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0097");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (byte) 100, "hi!", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0099");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0100");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(11, (int) (short) 1, "", (int) '0', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0101");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) ' ', "", (int) (short) 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(2, 13, "hi!", (int) (byte) 0, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0104");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0105");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, (int) '8', "hi!", (int) '0', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0107");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0108");
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
            System.out.format("%n%s%n", "Conversion0.test0109");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '5', (int) (byte) 1, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) -1, (short) 0, 0, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0112");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 2, (long) (byte) 100, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) ' ', "hi!", (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 1, (int) ' ', "hi!", (int) (byte) 0, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0116");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0117");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) 'a', (short) 1, 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 2, (short) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 10, (int) '#', "", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), 10, "", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0122");
        int[] intArray2 = new int[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 10, (int) '5', (int) (byte) 1, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 10, (long) '4', (int) (byte) 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 2, (byte) 1, (int) (byte) 10, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) '0', "", (int) '8', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0127");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0128");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (short) -1, (int) (short) -1, "", (int) ' ', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) '#', "", (int) '8', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0131");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) (byte) 1, (int) (short) 1, booleanArray2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0132");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 100, (int) (short) 100, "", (int) (short) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0135");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 100, (byte) -1, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0136");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0137");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) -1, (short) -1, (int) 'd', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0139");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0140");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 5, (short) (byte) -1, (int) ' ', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0142");
        boolean[] booleanArray5 = new boolean[] { true, false, false };
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray5);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0143");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0144");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (int) (short) 1, "hi!", (int) (byte) 0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0145");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3, (int) (short) 0);
        char char6 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) -1, (byte) 100, (int) '8', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '1', (int) (byte) 10, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 13, (int) '5', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot interpret '#' as a hexadecimal digit");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) (short) 100, "hi!", 11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) 'b', (short) 10, (int) '1', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0154");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0155");
        boolean[] booleanArray0 = new boolean[] {};
        long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, 0, 0L, 0, (int) '4');
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0156");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 0, "hi!", (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0158");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) -1, (int) (short) 1, intArray2, (int) '0', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0159");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0160");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 100, (byte) 10, 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0161");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0162");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0163");
        java.util.UUID uUID0 = null;
        java.util.UUID uUID1 = null;
        byte[] byteArray3 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID1, byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(11L, (int) (short) 100, "hi!", (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0166");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 1, "hi!", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0168");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) (short) 1, (int) 'd', 11, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0169");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) 'a', "hi!", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0170");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (byte) 100, "hi!", (int) '0', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 1, (byte) 100, 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0173");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0174");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0175");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0176");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0177");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.shortToBinary((short) (byte) -1, (int) (short) 1, booleanArray2, (int) '#', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 5, (int) (short) 100, 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0179");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('2');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0180");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 0, (long) '#', (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0181");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0182");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0183");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0184");
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
            System.out.format("%n%s%n", "Conversion0.test0185");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0186");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('4');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0187");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) -1, 0L, (int) 'd', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (byte) 10, (byte) 100, 13, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0189");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0190");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 0 };
        short[] shortArray7 = org.apache.commons.lang3.Conversion.intToShortArray(0, 10, shortArray4, 2, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0191");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) 'b', (int) '1', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0193");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0194");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) (byte) 1, (long) (byte) -1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", 2, (byte) -1, 11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, 0, "", (int) '8', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0198");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 1 };
        long long7 = org.apache.commons.lang3.Conversion.shortArrayToLong(shortArray2, (int) 'd', (long) '2', (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 50L + "'", long7 == 50L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0199");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) '0', "hi!", 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", 0, (long) 5, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 10, (int) (short) 0, (int) '2', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) 10, (-1L), (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0203");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) (byte) 100, "hi!", (int) 'b', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0205");
        short[] shortArray2 = new short[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0206");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0207");
        byte[] byteArray2 = null;
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.longToByteArray((long) (byte) 1, 0, byteArray2, (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0208");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('0');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0209");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0210");
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
            System.out.format("%n%s%n", "Conversion0.test0211");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (short) 0, (short) 10, (int) (short) 10, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0212");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0213");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (-1), 10L, (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) (short) 0, "hi!", 1, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0217");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '8', (int) (byte) 0, 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) 'a', (int) (short) 0, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 2, (int) '5', (int) ' ', (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0220");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (int) (byte) 0, (short) (byte) 0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", 0, (int) (short) 10, (int) (byte) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 10, (short) (byte) 100, 13, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) 'a', (int) (short) 100, "hi!", (int) (short) -1, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) 'b', (short) -1, 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0225");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) (byte) 1, (int) (short) 0, shortArray2, (int) '2', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0226");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) 'b', "", (int) ' ', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0228");
        boolean[] booleanArray2 = new boolean[] { false, true };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0229");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) (short) -1, "", (int) (byte) 100, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(50L, (-1), "hi!", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0232");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 10, (int) '#', "hi!", (int) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0233");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 0, (byte) -1, (int) (byte) 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0235");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0236");
        int[] intArray2 = new int[] {};
        int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (byte) 1, 1, intArray2, 5, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0237");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0238");
        int[] intArray0 = new int[] {};
        long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) (byte) 0, (long) (short) 1, (int) (short) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) '2', "hi!", (int) '5', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '8', (int) 'b', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0241");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0242");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0243");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0244");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0245");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToInt('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0246");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0247");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0248");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('8');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0249");
        short[] shortArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.Conversion.longToShortArray((long) 11, (int) '1', shortArray2, (-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nShorts-1)*16+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (short) 10, 13, (int) '1', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0251");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0252");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('5');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0253");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        long long6 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray1, 2, (long) 100, (int) '1', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 562949953421412L + "'", long6 == 562949953421412L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0254");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0255");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '1', (short) 0, (int) '0', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0257");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) 0, (int) '4', booleanArray3, (int) '5', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0259");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) (byte) 10, "", (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0261");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 13, (long) '#', 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0262");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '1', "", (int) '0', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0263");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        char char6 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'a' + "'", char3 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'a' + "'", char4 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0264");
        byte[] byteArray2 = new byte[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, (int) 'b', "", (int) '0', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) '4', (int) (short) 10, 100, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0267");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (short) 1, (long) (byte) 100, (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0268");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), (int) (short) 1, "hi!", (int) (short) 100, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0270");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 10, (int) (byte) 100, "hi!", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0272");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 1, (short) (byte) 0, (int) (short) 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0274");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0275");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
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
            System.out.format("%n%s%n", "Conversion0.test0276");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, (int) '5', 8, (int) '2', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0277");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 10, (int) (byte) 1, "hi!", (int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0278");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0279");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) 'a', (long) (byte) 1, (int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0280");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0281");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.binaryToLong(booleanArray0, (int) '8', 1L, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("", (int) '#', 1, 5, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0283");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, 8, (byte) 1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0284");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '0', "", (int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0285");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.intArrayToLong(intArray0, (int) '5', (long) (short) 0, (int) 'b', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (-1), (int) '4', "", (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0287");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0288");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) 1, (short) 0, (int) (byte) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex(11L, (int) 'a', "", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0290");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0291");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.byteArrayToShort(byteArray0, 2, (short) 1, (int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0292");
        boolean[] booleanArray5 = new boolean[] { false, true, true };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0293");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray6);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0294");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) 10, (short) -1, 4, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0295");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) 'b', (short) 1, 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi!", (int) (byte) -1, (long) (byte) 1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0297");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (-1), (short) -1, (int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0298");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0299");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0300");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0301");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) (short) 100, "", 4, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 11, (long) (byte) 100, (int) (short) 100, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0304");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 0, (int) (short) 0, "hi!", 2, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0305");
        int[] intArray4 = new int[] { (short) 0, '5' };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0306");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0307");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (byte) -1, (short) (byte) 1, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0309");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '8' + "'", char1 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '4', (int) (short) 1, "hi!", (int) '0', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 8, (byte) 1, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0312");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) 'b', (short) (byte) 10, 8, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0313");
        int[] intArray3 = new int[] { '0' };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 1, (-1L), (int) (short) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0315");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(10, (int) 'd', "hi!", (int) 'b', (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0317");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0318");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 100, "", (int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (int) (short) 1, (byte) 100, (int) '8', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(5, (int) '2', "hi00000", 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (byte) 0, (int) '2', "hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", 11, (short) 100, 5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) -1, (long) (short) 1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0325");
        int[] intArray6 = new int[] { 13, (byte) -1, (short) 1, '4' };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0326");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 56");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0328");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', (int) (short) 100, "hi00000", (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0330");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", 8, (byte) 0, 11, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0332");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.shortArrayToInt(shortArray0, (int) '#', 13, 11, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0333");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '8' + "'", char3 == '8');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(10, 13, "hi00000", (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) (byte) 100, 0, "hi!", 5, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0336");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, (-1), (short) -1, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", 10, (int) (byte) 1, 11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 1, (short) 0, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0339");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0340");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) '4', (short) 0, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0341");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0342");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.binaryToShort(booleanArray0, 100, (short) 100, 1, (int) 'b');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0343");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) '8', "hi00000", 11, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0345");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0346");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((-1), (-1), "", 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "f" + "'", str5.equals("f"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0347");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0348");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0349");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 48");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0351");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, 8, "", (int) '1', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0353");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0354");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) '#', (byte) 100, 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0355");
        int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi!", (int) (byte) 1, (int) 'd', (int) (byte) 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0356");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) 4, (int) '8', booleanArray2, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0357");
        boolean[] booleanArray2 = null;
        boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) '8', booleanArray2, (int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booleanArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '1', 1, "", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", (int) (short) 10, (short) 0, (int) '5', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) '4', "hi!", 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) '8', (int) (short) 10, "", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0362");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, (int) '8', "hi00000", 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 10, (byte) 1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) (short) 10, (byte) 100, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0366");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('2');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0367");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0368");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0369");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('b');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0370");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('d');
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0371");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0372");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0373");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('1');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0374");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 100, 1, "", (int) (short) -1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0376");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char3 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0377");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'd' + "'", char1 == 'd');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0378");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0379");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) '5', (byte) -1, (int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0380");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'b' + "'", char1 == 'b');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) -1, (int) '0', "", (int) '0', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0382");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0383");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 10, 2, "", (int) '1', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0385");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) 8, 0, intArray2, (int) '2', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0386");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('8');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0387");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) 0, 10, byteArray2, (int) (short) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0388");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0389");
        short[] shortArray2 = null;
        short[] shortArray5 = org.apache.commons.lang3.Conversion.intToShortArray((int) '1', 1, shortArray2, 11, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(shortArray5);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0390");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", (int) 'd', 49, (int) (byte) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0392");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, 0, "hi!", (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0393");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", (int) '2', (long) '#', (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 50");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0394");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.byteArrayToInt(byteArray0, 11, (int) ' ', 10, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0395");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 0, (short) (byte) -1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0397");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) (short) 0, (int) (short) -1, "", (int) (short) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0398");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, (int) (byte) 0, "hi!", 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", (int) (short) 0, (short) 100, (int) '#', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", 1, 0L, 13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) (short) 1, (byte) -1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0403");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0404");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (byte) -1, (long) '5', 11, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0406");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) ' ', (int) '2', booleanArray3, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) 'd', (short) -1, (int) (byte) 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0408");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '8', 49, "hi!", (int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("f", 2, (short) (byte) 0, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0410");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", 0, (byte) 0, (int) '1', (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0412");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0413");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 49, (int) (byte) 0, 1, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 13, (short) (byte) 0, 49, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0416");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.binaryToByte(booleanArray0, (int) (short) 10, (byte) 0, 8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 50");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 0, (byte) 0, (int) (short) 100, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) '1', "hi00000", 5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0420");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0421");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) (byte) 1, "", (int) '5', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0423");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.longToBinary((long) 'a', (int) (short) 100, booleanArray2, (int) '5', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nBools-1+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, 10, "hi00000", 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0425");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0426");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(100, (int) (byte) 10, "hi00000", 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi00000" + "'", str5.equals("hi00000"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0427");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('8');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0428");
        boolean[] booleanArray3 = new boolean[] { true, false, false };
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi00000", (int) (short) -1, (byte) -1, (int) '5', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", (int) 'a', (short) -1, (int) '5', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0431");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('4');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("0", (int) (short) 10, 35L, 1, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0433");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char3 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray1, (int) (short) 0);
        char char4 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(2, (int) '8', "hi!", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0435");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (short) 100, 10, booleanArray3, (int) 'd', 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("0", (int) 'a', (byte) 100, 2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0437");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", 49, (long) 1, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0439");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("hi!", (int) (byte) 100, (short) 0, (int) ' ', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) -1, (int) 'b', "hi00000", (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("f", (int) (byte) 10, (byte) 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0443");
        java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex(1, (int) '2', "hi!", (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0444");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('2');
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("0", (int) (short) -1, (int) (short) 100, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0446");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0447");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.UUID uUID2 = org.apache.commons.lang3.Conversion.byteArrayToUuid(byteArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0448");
        java.util.UUID uUID0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray4, 10, 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0449");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, 11, "hi!", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0451");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        java.lang.Class<?> wildcardClass2 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("", (-1), (byte) 1, (int) 'd', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0453");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0454");
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
            System.out.format("%n%s%n", "Conversion0.test0455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '1', (int) (byte) 10, "hi!", (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) (short) 10, (long) '2', (int) 'a', (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("f", (int) (byte) -1, (int) 'b', 1, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            char char1 = org.apache.commons.lang3.Conversion.intToHexDigitMsb0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: nibble value not between 0 and 15: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0460");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0461");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.Conversion.hexToInt("hi00000", 2, (int) (short) 10, (int) '8', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0463");
        char char1 = org.apache.commons.lang3.Conversion.intToHexDigit((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) -1, 4, "0", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 10, (int) (byte) 10, "hi!", (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0466");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 1, (int) '1', "f", (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 0, 1, "hi!", 5, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0468");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) (short) 10, (byte) 0, (int) (short) 10, (int) '8');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0470");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) 1, 2, intArray2, (int) '1', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) 0, (int) '5', "f", 2, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0472");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0473");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0474");
        long long5 = org.apache.commons.lang3.Conversion.hexToLong("", (int) 'a', 4L, (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4L + "'", long5 == 4L);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("hi00000", 1, 0L, 5, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0476");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0477");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('5');
        char char4 = org.apache.commons.lang3.Conversion.binaryToHexDigitMsb0_4bits(booleanArray3);
        char char5 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray3);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0478");
        short[] shortArray6 = new short[] { (short) 1, (byte) 1, (short) 0, (byte) 10 };
        short[] shortArray9 = org.apache.commons.lang3.Conversion.longToShortArray((long) '8', (int) (byte) 1, shortArray6, (int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray9);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.intToHex((int) '0', 10, "f", (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 100, (-1), "", (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0481");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.Conversion.shortToByteArray((short) (byte) -1, 0, byteArray4, 4, (int) (short) -1);
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
            System.out.format("%n%s%n", "Conversion0.test0482");
        boolean[] booleanArray1 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('0');
        char char2 = org.apache.commons.lang3.Conversion.binaryToHexDigit(booleanArray1);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0483");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.longToBinary((long) (-1), (int) '5', booleanArray3, (int) '8', 0);
        char char7 = org.apache.commons.lang3.Conversion.binaryBeMsb0ToHexDigit(booleanArray6);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0484");
        short[] shortArray5 = new short[] { (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0485");
        short short5 = org.apache.commons.lang3.Conversion.hexToShort("0", 2, (short) (byte) -1, (int) 'b', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.shortToHex((short) (byte) 1, (int) (short) 1, "hi00000", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0487");
        byte byte5 = org.apache.commons.lang3.Conversion.hexToByte("hi!", (int) ' ', (byte) 1, 5, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.longToHex((long) 2, 10, "f", (int) '4', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0489");
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0490");
        java.util.UUID uUID0 = null;
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.lang3.Conversion.uuidToByteArray(uUID0, byteArray2, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0491");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitMsb0ToBinary('a');
        boolean[] booleanArray6 = org.apache.commons.lang3.Conversion.intToBinary((int) (byte) 10, 0, booleanArray3, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
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
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0492");
        int[] intArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = org.apache.commons.lang3.Conversion.longToIntArray((long) (short) 10, 0, intArray2, 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nInts-1)*32+srcPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.Conversion.hexToLong("f", (int) (byte) -1, (long) 'b', 0, (int) '2');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 64");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0494");
        int int1 = org.apache.commons.lang3.Conversion.hexDigitToInt('d');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0495");
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.Conversion.intToByteArray(1, (int) (short) 1, byteArray2, (int) '8', (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nBytes-1)*8+srcPos is greather or equal to than 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.Conversion.hexToShort("", 100, (short) (byte) -1, 11, (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+dstPos is greather or equal to than 16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0497");
        boolean[] booleanArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.Conversion.byteToBinary((byte) 0, (int) (short) 0, booleanArray2, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 0, 0, "", (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.Conversion.byteToHex((byte) 1, (int) '8', "", 8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: (nHexs-1)*4+srcPos is greather or equal to than 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void Conversion() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Conversion0.test0500");
        boolean[] booleanArray3 = org.apache.commons.lang3.Conversion.hexDigitToBinary('0');
        // The following exception was thrown during execution in test generation
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

