package BitField;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitField2 {

    public static boolean debug = false;

    @Test
    public void BitField1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1001");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.clearByte((byte) -34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -44 + "'", byte5 == (byte) -44);
    }

    @Test
    public void BitField1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1002");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(31);
        int int3 = bitField1.clear((int) (byte) 17);
        int int5 = bitField1.getRawValue(145);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void BitField1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1003");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        short short4 = bitField1.setShortBoolean((short) -31, false);
        short short6 = bitField1.getShortRawValue((short) (byte) -27);
        byte byte9 = bitField1.setByteBoolean((byte) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -64 + "'", short4 == (short) -64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 33 + "'", short6 == (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void BitField1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1004");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        boolean boolean6 = bitField1.isSet((int) (short) -41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void BitField1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1005");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.clearByte((byte) 11);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1006");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -13);
    }

    @Test
    public void BitField1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1007");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte7 = bitField1.clearByte((byte) -2);
        short short9 = bitField1.setShort((short) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -2 + "'", byte7 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 97 + "'", short9 == (short) 97);
    }

    @Test
    public void BitField1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1008");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.getRawValue(222);
        int int7 = bitField1.clear(36);
        int int9 = bitField1.set(126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 126 + "'", int9 == 126);
    }

    @Test
    public void BitField1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1009");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        byte byte5 = bitField1.clearByte((byte) 26);
        int int7 = bitField1.getRawValue((-22));
        short short9 = bitField1.getShortValue((short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 16 + "'", short9 == (short) 16);
    }

    @Test
    public void BitField1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1010");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -25);
        int int4 = bitField1.setBoolean((int) (byte) -112, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9) + "'", int4 == (-9));
    }

    @Test
    public void BitField1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1011");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(107);
        byte byte4 = bitField1.setByteBoolean((byte) -119, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -128 + "'", byte4 == (byte) -128);
    }

    @Test
    public void BitField1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1012");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        short short5 = bitField1.getShortRawValue((short) 6);
        boolean boolean7 = bitField1.isAllSet(13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1013");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.clear((int) (short) 127);
        short short5 = bitField1.clearShort((short) 13);
        int int7 = bitField1.set((int) (short) 122);
        int int9 = bitField1.getValue((int) (short) -31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 117 + "'", int3 == 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 5 + "'", short5 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 122 + "'", int7 == 122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1014");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        short short5 = bitField1.clearShort((short) 122);
        int int7 = bitField1.getRawValue(32);
        byte byte9 = bitField1.setByte((byte) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 106 + "'", short5 == (short) 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 31 + "'", byte9 == (byte) 31);
    }

    @Test
    public void BitField1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1015");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 48);
    }

    @Test
    public void BitField1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1016");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -111);
    }

    @Test
    public void BitField1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1017");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        int int5 = bitField1.clear(1);
        int int7 = bitField1.clear(222);
        short short9 = bitField1.setShort((short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 196 + "'", int7 == 196);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 27 + "'", short9 == (short) 27);
    }

    @Test
    public void BitField1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1018");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 105);
    }

    @Test
    public void BitField1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1019");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int6 = bitField1.setValue((int) (byte) 68, (-25));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 84 + "'", int6 == 84);
    }

    @Test
    public void BitField1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1020");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 11);
        int int3 = bitField1.getRawValue((int) (byte) -120);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void BitField1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1021");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.set((int) (byte) -2);
        short short6 = bitField1.setShortBoolean((short) -54, true);
        int int8 = bitField1.set(36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -37 + "'", short6 == (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 63 + "'", int8 == 63);
    }

    @Test
    public void BitField1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1022");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -102);
        byte byte3 = bitField1.setByte((byte) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -102 + "'", byte3 == (byte) -102);
    }

    @Test
    public void BitField1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1023");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        boolean boolean5 = bitField1.isAllSet((-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void BitField1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1024");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        short short4 = bitField1.setShortValue((short) (byte) -1, (short) 20);
        byte byte6 = bitField1.clearByte((byte) -12);
        int int8 = bitField1.getRawValue((int) (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -37 + "'", short4 == (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -64 + "'", byte6 == (byte) -64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void BitField1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1025");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.setByte((byte) -12);
        int int5 = bitField1.set((int) (short) 101);
        short short7 = bitField1.setShort((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void BitField1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1026");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        int int8 = bitField1.clear((int) (short) -60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-60) + "'", int8 == (-60));
    }

    @Test
    public void BitField1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1027");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        boolean boolean6 = bitField1.isSet(31);
        int int9 = bitField1.setValue((int) (byte) 11, (int) (short) -13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
    }

    @Test
    public void BitField1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1028");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        boolean boolean3 = bitField1.isAllSet((int) (short) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1029");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(222);
        byte byte3 = bitField1.clearByte((byte) -119);
        short short5 = bitField1.setShort((short) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 222 + "'", short5 == (short) 222);
    }

    @Test
    public void BitField1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1030");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.setShort((short) 121);
        int int5 = bitField1.set(64);
        byte byte8 = bitField1.setByteBoolean((byte) 127, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 121 + "'", short3 == (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 88 + "'", int5 == 88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 127 + "'", byte8 == (byte) 127);
    }

    @Test
    public void BitField1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1031");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        int int8 = bitField1.set((-126));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-118) + "'", int8 == (-118));
    }

    @Test
    public void BitField1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1032");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int5 = bitField1.clear((int) (short) -1);
        int int7 = bitField1.set((int) (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void BitField1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1033");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        boolean boolean7 = bitField1.isSet((-128));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1034");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int3 = bitField1.set((int) (short) 144);
        boolean boolean5 = bitField1.isSet(127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 145 + "'", int3 == 145);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void BitField1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1035");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 107 + "'", short5 == (short) 107);
    }

    @Test
    public void BitField1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1036");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(64);
        short short3 = bitField1.setShort((short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -25 + "'", short3 == (short) -25);
    }

    @Test
    public void BitField1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1037");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        int int9 = bitField1.set((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1038");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        byte byte5 = bitField1.clearByte((byte) 26);
        byte byte8 = bitField1.setByteBoolean((byte) -27, true);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -11 + "'", byte8 == (byte) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1039");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(107);
        short short4 = bitField1.setShortValue((short) 27, (short) (byte) -112);
        short short7 = bitField1.setShortValue((short) (byte) 10, (short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 16 + "'", short4 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 8 + "'", short7 == (short) 8);
    }

    @Test
    public void BitField1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1040");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) -25);
        boolean boolean9 = bitField1.isAllSet((int) (byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -27 + "'", byte7 == (byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1041");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -12);
    }

    @Test
    public void BitField1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1042");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        boolean boolean6 = bitField1.isAllSet(11);
        int int8 = bitField1.set((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1043");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        boolean boolean3 = bitField1.isAllSet((-98));
        boolean boolean5 = bitField1.isAllSet((int) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1044");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short3 = bitField1.getShortRawValue((short) (byte) -2);
        boolean boolean5 = bitField1.isAllSet((int) (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 56 + "'", short3 == (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1045");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.getShortRawValue((short) 4);
        short short7 = bitField1.setShort((short) (byte) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 125 + "'", short7 == (short) 125);
    }

    @Test
    public void BitField1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1046");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100);
        boolean boolean3 = bitField1.isAllSet(15);
        boolean boolean5 = bitField1.isAllSet((int) (byte) -25);
        short short7 = bitField1.getShortRawValue((short) 0);
        short short9 = bitField1.getShortRawValue((short) -32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
    }

    @Test
    public void BitField1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1047");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 1);
        short short5 = bitField1.setShort((short) -37);
        int int7 = bitField1.getRawValue(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -37 + "'", short5 == (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void BitField1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1048");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        short short5 = bitField1.clearShort((short) 122);
        short short7 = bitField1.clearShort((short) -12);
        short short9 = bitField1.getShortRawValue((short) 223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 106 + "'", short5 == (short) 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -32 + "'", short7 == (short) -32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void BitField1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1049");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        int int3 = bitField1.getRawValue(36);
        short short5 = bitField1.clearShort((short) 99);
        short short8 = bitField1.setShortValue((short) 100, (short) (byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 32 + "'", short5 == (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 180 + "'", short8 == (short) 180);
    }

    @Test
    public void BitField1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1050");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.clearByte((byte) -1);
        byte byte8 = bitField1.clearByte((byte) -98);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -25 + "'", byte6 == (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -122 + "'", byte8 == (byte) -122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1051");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 21, true);
        int int6 = bitField1.getRawValue((int) (short) -126);
        short short9 = bitField1.setShortValue((short) (byte) 101, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 29 + "'", byte4 == (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 125 + "'", short9 == (short) 125);
    }

    @Test
    public void BitField1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1052");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.clear((-108));
        short short7 = bitField1.clearShort((short) (byte) -119);
        int int9 = bitField1.getValue((-108));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-124) + "'", int5 == (-124));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -128 + "'", short7 == (short) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void BitField1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1053");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        byte byte5 = bitField1.clearByte((byte) 72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 64 + "'", byte5 == (byte) 64);
    }

    @Test
    public void BitField1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1054");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -5);
    }

    @Test
    public void BitField1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1055");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        short short5 = bitField1.setShort((short) (byte) -101);
        short short7 = bitField1.setShort((short) (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -101 + "'", short5 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 31 + "'", short7 == (short) 31);
    }

    @Test
    public void BitField1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1056");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        byte byte7 = bitField1.setByteBoolean((byte) 110, true);
        int int9 = bitField1.set((-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void BitField1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1057");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.setByte((byte) -12);
        int int6 = bitField1.setValue(1, (int) (short) 28);
        short short8 = bitField1.setShort((short) 5);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 31 + "'", short8 == (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1058");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        short short5 = bitField1.setShort((short) (byte) 31);
        short short7 = bitField1.getShortValue((short) (byte) -34);
        int int9 = bitField1.getRawValue((int) (short) 180);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -97 + "'", short5 == (short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -49 + "'", short7 == (short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 148 + "'", int9 == 148);
    }

    @Test
    public void BitField1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1059");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        int int7 = bitField1.setBoolean((int) (short) -6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void BitField1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1060");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        int int5 = bitField1.getValue((int) (short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
    }

    @Test
    public void BitField1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1061");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        int int7 = bitField1.setBoolean(1, true);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1062");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) (byte) -27);
        int int5 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1063");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        int int3 = bitField1.getRawValue(53);
        int int5 = bitField1.getRawValue(66);
        short short8 = bitField1.setShortValue((short) (byte) 96, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 97 + "'", short8 == (short) 97);
    }

    @Test
    public void BitField1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1064");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1065");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getRawValue(34);
        short short6 = bitField1.setShortBoolean((short) 96, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 96 + "'", short6 == (short) 96);
    }

    @Test
    public void BitField1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1066");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(127);
    }

    @Test
    public void BitField1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1067");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-127));
    }

    @Test
    public void BitField1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1068");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        byte byte3 = bitField1.clearByte((byte) -1);
        short short6 = bitField1.setShortValue((short) 24, (short) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 150 + "'", short6 == (short) 150);
    }

    @Test
    public void BitField1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1069");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        byte byte6 = bitField1.setByte((byte) 1);
        int int9 = bitField1.setValue(11, (int) (byte) -62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void BitField1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1070");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 223);
        boolean boolean3 = bitField1.isAllSet(13);
        short short5 = bitField1.clearShort((short) (byte) -33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -256 + "'", short5 == (short) -256);
    }

    @Test
    public void BitField1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1071");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -2);
        int int8 = bitField1.setValue((int) (byte) -100, 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-100) + "'", int8 == (-100));
    }

    @Test
    public void BitField1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1072");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 100);
        boolean boolean5 = bitField1.isAllSet((int) (short) 116);
        short short7 = bitField1.clearShort((short) 0);
        boolean boolean9 = bitField1.isSet((-108));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1073");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 101);
    }

    @Test
    public void BitField1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1074");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short3 = bitField1.getShortRawValue((short) (byte) 26);
        short short5 = bitField1.setShort((short) -43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -11 + "'", short5 == (short) -11);
    }

    @Test
    public void BitField1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1075");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 127);
    }

    @Test
    public void BitField1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1076");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        int int7 = bitField1.setBoolean((int) (short) 107, false);
        int int9 = bitField1.getRawValue(121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
    }

    @Test
    public void BitField1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1077");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (byte) -2);
        byte byte9 = bitField1.clearByte((byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -12 + "'", byte9 == (byte) -12);
    }

    @Test
    public void BitField1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1078");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        short short5 = bitField1.getShortRawValue((short) (byte) -128);
        short short8 = bitField1.setShortValue((short) 34, (short) 221);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 58 + "'", short8 == (short) 58);
    }

    @Test
    public void BitField1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1079");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.clear((int) (short) 9);
        short short7 = bitField1.getShortRawValue((short) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void BitField1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1080");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        short short3 = bitField1.setShort((short) (byte) 10);
        int int5 = bitField1.getRawValue((int) (short) 5);
        short short8 = bitField1.setShortValue((short) (byte) 122, (short) (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -98 + "'", short3 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -140 + "'", short8 == (short) -140);
    }

    @Test
    public void BitField1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1081");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.clearByte((byte) 1);
        int int5 = bitField1.clear((int) (short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1082");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.setByte((byte) 97);
        int int8 = bitField1.setValue((int) (short) -97, 2);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 97 + "'", byte5 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1083");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        int int6 = bitField1.getRawValue((-25));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void BitField1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1084");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        byte byte3 = bitField1.clearByte((byte) -41);
        short short5 = bitField1.clearShort((short) -58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -61 + "'", byte3 == (byte) -61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -62 + "'", short5 == (short) -62);
    }

    @Test
    public void BitField1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1085");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.setShort((short) 116);
        int int9 = bitField1.getValue(57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 117 + "'", short7 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1086");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        boolean boolean5 = bitField1.isSet((int) (byte) 0);
        short short8 = bitField1.setShortValue((short) (byte) -45, (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -53 + "'", short8 == (short) -53);
    }

    @Test
    public void BitField1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1087");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.getShortRawValue((short) (byte) 26);
        int int8 = bitField1.setBoolean((int) (short) 144, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 26 + "'", short5 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 155 + "'", int8 == 155);
    }

    @Test
    public void BitField1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1088");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        int int3 = bitField1.getRawValue(53);
        int int5 = bitField1.getRawValue(66);
        int int7 = bitField1.clear(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1089");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.set((int) (short) 97);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 107 + "'", int5 == 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1090");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue(127);
        short short5 = bitField1.getShortRawValue((short) -108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1091");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isAllSet((int) (short) -41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BitField1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1092");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        int int5 = bitField1.set((int) (byte) 3);
        short short7 = bitField1.getShortValue((short) 8);
        short short9 = bitField1.clearShort((short) 150);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 150 + "'", short9 == (short) 150);
    }

    @Test
    public void BitField1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1093");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        int int5 = bitField1.set((int) (byte) 110);
        short short7 = bitField1.getShortRawValue((short) 18);
        int int9 = bitField1.getRawValue(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 126 + "'", int5 == 126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 16 + "'", short7 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1094");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100);
        byte byte3 = bitField1.setByte((byte) 111);
        short short6 = bitField1.setShortValue((short) (byte) -128, (short) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 111 + "'", byte3 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -28 + "'", short6 == (short) -28);
    }

    @Test
    public void BitField1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1095");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        byte byte5 = bitField1.clearByte((byte) -9);
        short short7 = bitField1.getShortRawValue((short) (byte) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -28 + "'", byte5 == (byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void BitField1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1096");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int5 = bitField1.set((int) (short) 99);
        short short8 = bitField1.setShortBoolean((short) (byte) 127, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 119 + "'", int5 == 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 107 + "'", short8 == (short) 107);
    }

    @Test
    public void BitField1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1097");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) -27);
        short short7 = bitField1.getShortRawValue((short) -122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -122 + "'", short7 == (short) -122);
    }

    @Test
    public void BitField1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1098");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        byte byte6 = bitField1.setByteBoolean((byte) -2, false);
        boolean boolean8 = bitField1.isSet((int) (byte) -62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -12 + "'", byte6 == (byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1099");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        byte byte8 = bitField1.clearByte((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void BitField1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1100");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        byte byte6 = bitField1.setByteBoolean((byte) 10, true);
        int int9 = bitField1.setBoolean(57, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 123 + "'", int9 == 123);
    }

    @Test
    public void BitField1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1101");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        int int8 = bitField1.setValue((int) (short) 145, 65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 147 + "'", int8 == 147);
    }

    @Test
    public void BitField1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1102");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        int int5 = bitField1.set((int) (short) 29);
        byte byte8 = bitField1.setByteBoolean((byte) -9, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void BitField1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1103");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        int int5 = bitField1.set((int) (byte) 110);
        byte byte7 = bitField1.setByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 126 + "'", int5 == 126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 26 + "'", byte7 == (byte) 26);
    }

    @Test
    public void BitField1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1104");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 107);
        short short4 = bitField1.setShortBoolean((short) 97, true);
        int int6 = bitField1.getRawValue(154);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 107 + "'", short4 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void BitField1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1105");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(222);
        byte byte3 = bitField1.clearByte((byte) -119);
        int int5 = bitField1.getValue((int) (short) -124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 66 + "'", int5 == 66);
    }

    @Test
    public void BitField1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1106");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        int int5 = bitField1.clear((int) (short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-124) + "'", int5 == (-124));
    }

    @Test
    public void BitField1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1107");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.setShort((short) 27);
        int int9 = bitField1.getValue(70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 27 + "'", short7 == (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1108");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short6 = bitField1.setShortValue((short) (byte) 4, (short) -27);
        short short9 = bitField1.setShortValue((short) 0, (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 16 + "'", short9 == (short) 16);
    }

    @Test
    public void BitField1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1109");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 106);
    }

    @Test
    public void BitField1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1110");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        byte byte7 = bitField1.setByteBoolean((byte) -2, false);
        int int9 = bitField1.set((int) (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -102 + "'", byte7 == (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 125 + "'", int9 == 125);
    }

    @Test
    public void BitField1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1111");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.clearShort((short) 4);
        boolean boolean5 = bitField1.isAllSet((int) (short) 11);
        int int7 = bitField1.clear(101);
        int int9 = bitField1.set((int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void BitField1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1112");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.clear((-108));
        int int7 = bitField1.set((int) (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-124) + "'", int5 == (-124));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-101) + "'", int7 == (-101));
    }

    @Test
    public void BitField1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1113");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        short short3 = bitField1.getShortRawValue((short) -112);
        boolean boolean5 = bitField1.isAllSet(147);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 16 + "'", short3 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1114");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        short short3 = bitField1.setShort((short) (byte) 106);
        short short5 = bitField1.setShort((short) (byte) -97);
        short short7 = bitField1.getShortRawValue((short) (byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 123 + "'", short3 == (short) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -97 + "'", short5 == (short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 16 + "'", short7 == (short) 16);
    }

    @Test
    public void BitField1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1115");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -54);
    }

    @Test
    public void BitField1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1116");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        byte byte9 = bitField1.setByteBoolean((byte) 8, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 8 + "'", byte9 == (byte) 8);
    }

    @Test
    public void BitField1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1117");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int4 = bitField1.setValue((-1), 0);
        short short6 = bitField1.getShortRawValue((short) -47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-28) + "'", int4 == (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 17 + "'", short6 == (short) 17);
    }

    @Test
    public void BitField1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1118");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int4 = bitField1.setBoolean((int) (short) 27, true);
        byte byte7 = bitField1.setByteBoolean((byte) -112, true);
        short short9 = bitField1.getShortRawValue((short) -47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -47 + "'", short9 == (short) -47);
    }

    @Test
    public void BitField1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1119");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) (short) -64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1120");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) (byte) -37, false);
        int int6 = bitField1.getRawValue((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -102 + "'", short4 == (short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void BitField1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1121");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 68);
        int int4 = bitField1.setValue(31, (int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 91 + "'", int4 == 91);
    }

    @Test
    public void BitField1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1122");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        byte byte8 = bitField1.setByte((byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -11 + "'", byte8 == (byte) -11);
    }

    @Test
    public void BitField1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1123");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.getRawValue(222);
        boolean boolean7 = bitField1.isSet((int) (byte) 72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1124");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        short short5 = bitField1.getShortRawValue((short) (byte) 100);
        int int8 = bitField1.setBoolean((int) (byte) -61, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-37) + "'", int8 == (-37));
    }

    @Test
    public void BitField1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1125");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.clear(5);
        short short7 = bitField1.setShort((short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 35 + "'", short7 == (short) 35);
    }

    @Test
    public void BitField1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1126");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        byte byte6 = bitField1.setByteBoolean((byte) 107, true);
        int int8 = bitField1.set((int) (short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-102) + "'", int8 == (-102));
    }

    @Test
    public void BitField1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1127");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        short short4 = bitField1.setShortValue((short) 35, (short) (byte) 17);
        short short6 = bitField1.setShort((short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 35 + "'", short4 == (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -5 + "'", short6 == (short) -5);
    }

    @Test
    public void BitField1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1128");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 35);
        byte byte3 = bitField1.setByte((byte) -5);
        short short6 = bitField1.setShortBoolean((short) 8, true);
        int int9 = bitField1.setBoolean((int) (short) 3, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -5 + "'", byte3 == (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 43 + "'", short6 == (short) 43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1129");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        byte byte3 = bitField1.clearByte((byte) 106);
        int int6 = bitField1.setBoolean(24, false);
        short short8 = bitField1.getShortValue((short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 72 + "'", byte3 == (byte) 72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1130");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        byte byte5 = bitField1.clearByte((byte) -102);
        int int8 = bitField1.setValue((-112), (int) (short) 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -112 + "'", byte5 == (byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-110) + "'", int8 == (-110));
    }

    @Test
    public void BitField1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1131");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        int int7 = bitField1.getValue((int) (short) 234);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1132");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int3 = bitField1.getValue(20);
        int int5 = bitField1.set((-118));
        short short7 = bitField1.clearShort((short) 105);
        short short9 = bitField1.getShortValue((short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -126 + "'", short9 == (short) -126);
    }

    @Test
    public void BitField1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1133");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.clearByte((byte) 1);
        short short5 = bitField1.setShort((short) -28);
        byte byte7 = bitField1.clearByte((byte) 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 64 + "'", byte7 == (byte) 64);
    }

    @Test
    public void BitField1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1134");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short3 = bitField1.getShortRawValue((short) (byte) -2);
        int int5 = bitField1.clear((int) (byte) -61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 56 + "'", short3 == (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-62) + "'", int5 == (-62));
    }

    @Test
    public void BitField1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1135");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        short short7 = bitField1.clearShort((short) (byte) 11);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1136");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        boolean boolean5 = bitField1.isSet((int) (byte) 0);
        int int7 = bitField1.getValue(30);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1137");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 100);
        byte byte7 = bitField1.setByte((byte) 0);
        byte byte9 = bitField1.setByte((byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 110 + "'", byte5 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 111 + "'", byte9 == (byte) 111);
    }

    @Test
    public void BitField1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1138");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(17);
        int int3 = bitField1.clear(25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void BitField1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1139");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        short short3 = bitField1.getShortRawValue((short) -112);
        short short5 = bitField1.setShort((short) (byte) 26);
        int int7 = bitField1.getValue(122);
        boolean boolean9 = bitField1.isSet((int) (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 16 + "'", short3 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 27 + "'", short5 == (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1140");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        byte byte3 = bitField1.clearByte((byte) 106);
        int int6 = bitField1.setValue((int) (byte) -98, (int) (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 72 + "'", byte3 == (byte) 72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-98) + "'", int6 == (-98));
    }

    @Test
    public void BitField1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1141");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) 0);
        int int8 = bitField1.getRawValue((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void BitField1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1142");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        byte byte4 = bitField1.setByteBoolean((byte) 11, true);
        short short6 = bitField1.setShort((short) (byte) -97);
        int int9 = bitField1.setValue((int) (short) 4, 223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 111 + "'", byte4 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void BitField1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1143");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        byte byte8 = bitField1.setByteBoolean((byte) -98, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -98 + "'", byte8 == (byte) -98);
    }

    @Test
    public void BitField1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1144");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        short short5 = bitField1.setShort((short) (byte) -1);
        boolean boolean7 = bitField1.isAllSet((int) (short) -101);
        int int9 = bitField1.set(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void BitField1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1145");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        byte byte3 = bitField1.setByte((byte) 1);
        int int5 = bitField1.getValue((int) (short) 13);
        int int7 = bitField1.set(65);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 75 + "'", int7 == 75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1146");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getRawValue(17);
        int int8 = bitField1.setBoolean((int) (short) -111, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-112) + "'", int8 == (-112));
    }

    @Test
    public void BitField1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1147");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int3 = bitField1.set((int) (short) 100);
        short short6 = bitField1.setShortBoolean((short) 13, true);
        int int9 = bitField1.setBoolean(106, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 13 + "'", short6 == (short) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
    }

    @Test
    public void BitField1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1148");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short3 = bitField1.clearShort((short) -58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -58 + "'", short3 == (short) -58);
    }

    @Test
    public void BitField1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1149");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -102);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1150");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 3);
        byte byte5 = bitField1.setByte((byte) -120);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -118 + "'", byte5 == (byte) -118);
    }

    @Test
    public void BitField1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1151");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.set(26);
        byte byte7 = bitField1.clearByte((byte) -118);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -120 + "'", byte7 == (byte) -120);
    }

    @Test
    public void BitField1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1152");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        int int6 = bitField1.set((int) (short) 116);
        byte byte9 = bitField1.setByteBoolean((byte) -1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 117 + "'", int6 == 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -102 + "'", byte9 == (byte) -102);
    }

    @Test
    public void BitField1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1153");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        int int6 = bitField1.clear((-18));
        short short8 = bitField1.setShort((short) 144);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-28) + "'", int6 == (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 155 + "'", short8 == (short) 155);
    }

    @Test
    public void BitField1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1154");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 68);
        int int3 = bitField1.getValue((int) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BitField1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1155");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        short short8 = bitField1.clearShort((short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1156");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(222);
        byte byte3 = bitField1.clearByte((byte) -119);
        int int5 = bitField1.set((-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void BitField1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1157");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        int int3 = bitField1.clear((int) (short) 20);
        boolean boolean5 = bitField1.isAllSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1158");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        int int5 = bitField1.getValue(147);
        short short7 = bitField1.clearShort((short) -127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -128 + "'", short7 == (short) -128);
    }

    @Test
    public void BitField1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1159");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        byte byte3 = bitField1.clearByte((byte) 97);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1160");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        byte byte3 = bitField1.clearByte((byte) 106);
        int int6 = bitField1.setBoolean(24, false);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 72 + "'", byte3 == (byte) 72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1161");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        int int8 = bitField1.set((int) (short) 145);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 145 + "'", int8 == 145);
    }

    @Test
    public void BitField1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1162");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int3 = bitField1.getValue(20);
        int int5 = bitField1.set(150);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void BitField1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1163");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        int int3 = bitField1.getRawValue((-60));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BitField1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1164");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getRawValue(100);
        short short5 = bitField1.getShortRawValue((short) -98);
        boolean boolean7 = bitField1.isAllSet(0);
        short short9 = bitField1.getShortValue((short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1165");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int6 = bitField1.setBoolean(223, false);
        byte byte9 = bitField1.setByteBoolean((byte) -2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -98 + "'", byte9 == (byte) -98);
    }

    @Test
    public void BitField1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1166");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        short short3 = bitField1.getShortRawValue((short) 32);
        byte byte5 = bitField1.setByte((byte) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 123 + "'", byte5 == (byte) 123);
    }

    @Test
    public void BitField1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1167");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.set((int) (short) 97);
        int int7 = bitField1.getValue(63);
        short short9 = bitField1.setShort((short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 107 + "'", int5 == 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 123 + "'", short9 == (short) 123);
    }

    @Test
    public void BitField1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1168");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        int int7 = bitField1.set((int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 116 + "'", int7 == 116);
    }

    @Test
    public void BitField1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1169");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 100);
        int int5 = bitField1.set(11);
        int int8 = bitField1.setValue(117, (-54));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
    }

    @Test
    public void BitField1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1170");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.clearShort((short) (byte) -2);
        byte byte5 = bitField1.clearByte((byte) -120);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -128 + "'", byte5 == (byte) -128);
    }

    @Test
    public void BitField1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1171");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) -27);
        int int8 = bitField1.setValue((-62), (-108));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-108) + "'", int8 == (-108));
    }

    @Test
    public void BitField1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1172");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-21));
    }

    @Test
    public void BitField1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1173");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) -31);
        int int9 = bitField1.getRawValue((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1174");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.clearByte((byte) 100);
        int int7 = bitField1.clear((int) (short) 5);
        int int9 = bitField1.getValue((int) (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void BitField1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1175");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1176");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        byte byte4 = bitField1.setByteBoolean((byte) 1, true);
        byte byte7 = bitField1.setByteBoolean((byte) -101, true);
        short short9 = bitField1.clearShort((short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 21 + "'", byte4 == (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -97 + "'", byte7 == (byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 8 + "'", short9 == (short) 8);
    }

    @Test
    public void BitField1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1177");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        int int7 = bitField1.clear((-28));
        short short9 = bitField1.getShortValue((short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-28) + "'", int7 == (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1178");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 35);
        byte byte3 = bitField1.setByte((byte) -5);
        short short6 = bitField1.setShortBoolean((short) 8, true);
        int int8 = bitField1.getRawValue((int) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -5 + "'", byte3 == (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 43 + "'", short6 == (short) 43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void BitField1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1179");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        boolean boolean6 = bitField1.isSet(26);
        int int8 = bitField1.set(116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
    }

    @Test
    public void BitField1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1180");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        short short6 = bitField1.getShortRawValue((short) (byte) 17);
        boolean boolean8 = bitField1.isSet(145);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1181");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short4 = bitField1.setShortValue((short) (byte) 1, (short) 117);
        int int6 = bitField1.set((int) (short) -12);
        byte byte8 = bitField1.setByte((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 29 + "'", byte8 == (byte) 29);
    }

    @Test
    public void BitField1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1182");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        int int7 = bitField1.getValue((int) (short) 234);
        short short9 = bitField1.setShort((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void BitField1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1183");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        int int9 = bitField1.setBoolean((int) (short) 27, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void BitField1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1184");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        short short6 = bitField1.clearShort((short) (byte) -2);
        short short9 = bitField1.setShortBoolean((short) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -98 + "'", short6 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 97 + "'", short9 == (short) 97);
    }

    @Test
    public void BitField1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1185");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -2);
        short short7 = bitField1.clearShort((short) 100);
        byte byte9 = bitField1.setByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 26 + "'", byte9 == (byte) 26);
    }

    @Test
    public void BitField1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1186");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        short short4 = bitField1.setShortValue((short) 35, (short) (byte) 17);
        short short7 = bitField1.setShortBoolean((short) (byte) -5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 35 + "'", short4 == (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -15 + "'", short7 == (short) -15);
    }

    @Test
    public void BitField1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1187");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100);
        byte byte3 = bitField1.setByte((byte) 111);
        short short6 = bitField1.setShortValue((short) (byte) -98, (short) (byte) 68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 111 + "'", byte3 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -102 + "'", short6 == (short) -102);
    }

    @Test
    public void BitField1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1188");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.getShortRawValue((short) 4);
        int int7 = bitField1.getRawValue(25);
        int int9 = bitField1.getValue((int) (byte) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void BitField1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1189");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte8 = bitField1.setByteBoolean((byte) -37, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -38 + "'", byte8 == (byte) -38);
    }

    @Test
    public void BitField1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1190");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        short short7 = bitField1.setShort((short) 10);
        short short9 = bitField1.clearShort((short) -53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -54 + "'", short9 == (short) -54);
    }

    @Test
    public void BitField1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1191");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        byte byte7 = bitField1.setByte((byte) -12);
        int int9 = bitField1.getRawValue((int) (short) 222);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -12 + "'", byte7 == (byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1192");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        short short3 = bitField1.getShortValue((short) 10);
        int int5 = bitField1.set(106);
        int int7 = bitField1.clear((int) (short) -60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-64) + "'", int7 == (-64));
    }

    @Test
    public void BitField1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1193");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short4 = bitField1.setShortValue((short) (byte) -101, (short) (byte) -97);
        short short6 = bitField1.clearShort((short) (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -101 + "'", short4 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -126 + "'", short6 == (short) -126);
    }

    @Test
    public void BitField1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1194");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        int int5 = bitField1.set((int) (byte) 110);
        short short7 = bitField1.getShortRawValue((short) (byte) 111);
        short short9 = bitField1.clearShort((short) -124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 126 + "'", int5 == 126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 8 + "'", short7 == (short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -124 + "'", short9 == (short) -124);
    }

    @Test
    public void BitField1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1195");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-3));
        short short3 = bitField1.getShortRawValue((short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 212 + "'", short3 == (short) 212);
    }

    @Test
    public void BitField1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1196");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        int int8 = bitField1.set(4);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1197");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set((int) (byte) 11);
        short short7 = bitField1.setShort((short) (byte) -2);
        short short9 = bitField1.clearShort((short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -60 + "'", short9 == (short) -60);
    }

    @Test
    public void BitField1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1198");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        byte byte3 = bitField1.clearByte((byte) -1);
        boolean boolean5 = bitField1.isSet((int) (short) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void BitField1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1199");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set((int) (byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-17) + "'", int5 == (-17));
    }

    @Test
    public void BitField1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1200");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        short short6 = bitField1.setShortValue((short) (byte) 97, (short) 27);
        boolean boolean8 = bitField1.isSet(56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 113 + "'", short6 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1201");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.clear(123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 89 + "'", int5 == 89);
    }

    @Test
    public void BitField1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1202");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(9);
        byte byte4 = bitField1.setByteBoolean((byte) -5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -5 + "'", byte4 == (byte) -5);
    }

    @Test
    public void BitField1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1203");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        byte byte7 = bitField1.setByteBoolean((byte) 110, false);
        int int9 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1204");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        short short3 = bitField1.getShortValue((short) -28);
        int int5 = bitField1.clear((int) (short) -58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-58) + "'", int5 == (-58));
    }

    @Test
    public void BitField1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1205");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        short short3 = bitField1.setShort((short) (byte) -28);
        int int6 = bitField1.setBoolean((int) (short) -13, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -28 + "'", short3 == (short) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
    }

    @Test
    public void BitField1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1206");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short4 = bitField1.setShortBoolean((short) 24, true);
        int int6 = bitField1.clear((int) (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 24 + "'", short4 == (short) 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 121 + "'", int6 == 121);
    }

    @Test
    public void BitField1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1207");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.clearShort((short) (byte) -2);
        short short6 = bitField1.setShortBoolean((short) 97, true);
        short short9 = bitField1.setShortValue((short) -11, (short) (byte) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 121 + "'", short6 == (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -3 + "'", short9 == (short) -3);
    }

    @Test
    public void BitField1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1208");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        boolean boolean3 = bitField1.isAllSet((-98));
        byte byte6 = bitField1.setByteBoolean((byte) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void BitField1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1209");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 212);
        int int5 = bitField1.getValue((int) (short) 2);
        int int8 = bitField1.setValue((int) (byte) 68, (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 68 + "'", int8 == 68);
    }

    @Test
    public void BitField1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1210");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.getShortRawValue((short) -2);
        short short8 = bitField1.setShortBoolean((short) 35, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 33 + "'", short8 == (short) 33);
    }

    @Test
    public void BitField1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1211");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.getRawValue((int) (short) 29);
        int int5 = bitField1.getRawValue(21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void BitField1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1212");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set(16);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        int int9 = bitField1.getValue((int) (short) -124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1213");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        byte byte4 = bitField1.setByteBoolean((byte) 1, true);
        byte byte7 = bitField1.setByteBoolean((byte) -101, true);
        short short9 = bitField1.clearShort((short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 21 + "'", byte4 == (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -97 + "'", byte7 == (byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 98 + "'", short9 == (short) 98);
    }

    @Test
    public void BitField1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1214");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set((int) (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 215 + "'", int5 == 215);
    }

    @Test
    public void BitField1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1215");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -99);
    }

    @Test
    public void BitField1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1216");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 106);
        byte byte3 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void BitField1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1217");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        short short8 = bitField1.setShort((short) 109);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 111 + "'", short8 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1218");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (byte) -2);
        int int9 = bitField1.clear((-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
    }

    @Test
    public void BitField1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1219");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        byte byte3 = bitField1.clearByte((byte) -41);
        byte byte5 = bitField1.clearByte((byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -61 + "'", byte3 == (byte) -61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -128 + "'", byte5 == (byte) -128);
    }

    @Test
    public void BitField1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1220");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getRawValue(100);
        short short5 = bitField1.clearShort((short) 21);
        byte byte8 = bitField1.setByteBoolean((byte) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 21 + "'", short5 == (short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 42 + "'", byte8 == (byte) 42);
    }

    @Test
    public void BitField1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1221");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        int int5 = bitField1.set((int) (short) 97);
        byte byte8 = bitField1.setByteBoolean((byte) 42, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void BitField1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1222");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(70);
        short short4 = bitField1.setShortValue((short) 9, (short) 215);
        int int6 = bitField1.getValue(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 15 + "'", short4 == (short) 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void BitField1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1223");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        int int5 = bitField1.getRawValue(1);
        int int7 = bitField1.getValue(148);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void BitField1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1224");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 1);
        int int5 = bitField1.set(0);
        short short7 = bitField1.getShortRawValue((short) (byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 24 + "'", int5 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 24 + "'", short7 == (short) 24);
    }

    @Test
    public void BitField1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1225");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        byte byte5 = bitField1.clearByte((byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -102 + "'", byte5 == (byte) -102);
    }

    @Test
    public void BitField1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1226");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        short short3 = bitField1.getShortValue((short) -28);
        int int5 = bitField1.getRawValue(0);
        int int7 = bitField1.set((int) (short) -53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-53) + "'", int7 == (-53));
    }

    @Test
    public void BitField1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1227");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.clearShort((short) (byte) -34);
        byte byte8 = bitField1.setByteBoolean((byte) 122, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -44 + "'", short5 == (short) -44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 112 + "'", byte8 == (byte) 112);
    }

    @Test
    public void BitField1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1228");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(26);
        short short3 = bitField1.getShortRawValue((short) (byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void BitField1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1229");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        short short6 = bitField1.clearShort((short) (byte) -2);
        byte byte8 = bitField1.setByte((byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -98 + "'", short6 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void BitField1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1230");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 31);
        boolean boolean9 = bitField1.isSet((int) (byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1231");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        byte byte3 = bitField1.clearByte((byte) -1);
        boolean boolean5 = bitField1.isAllSet(63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1232");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        byte byte5 = bitField1.clearByte((byte) -9);
        short short7 = bitField1.getShortValue((short) 234);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -28 + "'", byte5 == (byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void BitField1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1233");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 1);
        byte byte5 = bitField1.clearByte((byte) 1);
        short short7 = bitField1.clearShort((short) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -128 + "'", short7 == (short) -128);
    }

    @Test
    public void BitField1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1234");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        byte byte3 = bitField1.setByte((byte) 1);
        short short5 = bitField1.getShortRawValue((short) 101);
        byte byte7 = bitField1.setByte((byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
    }

    @Test
    public void BitField1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1235");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.clearShort((short) 99);
        int int7 = bitField1.getRawValue((int) (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1236");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortValue((short) -124);
        int int5 = bitField1.getValue((int) (short) -124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1237");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        boolean boolean3 = bitField1.isAllSet((int) (short) 101);
        short short5 = bitField1.getShortRawValue((short) (byte) -128);
        boolean boolean7 = bitField1.isAllSet(125);
        short short9 = bitField1.getShortRawValue((short) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 16 + "'", short9 == (short) 16);
    }

    @Test
    public void BitField1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1238");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short7 = bitField1.setShort((short) 5);
        short short9 = bitField1.clearShort((short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 121 + "'", short9 == (short) 121);
    }

    @Test
    public void BitField1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1239");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortBoolean((short) (byte) 29, true);
        boolean boolean8 = bitField1.isSet(212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField2.BitField1240");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getRawValue(34);
        byte byte5 = bitField1.clearByte((byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }
}

