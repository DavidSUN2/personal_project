package BitField;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitField1 {

    public static boolean debug = false;

    @Test
    public void BitField0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0501");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int6 = bitField1.setBoolean(223, false);
        int int8 = bitField1.set((int) (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 121 + "'", int8 == 121);
    }

    @Test
    public void BitField0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0502");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.clearByte((byte) 100);
        int int7 = bitField1.getRawValue(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void BitField0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0503");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int5 = bitField1.set((int) (short) 99);
        short short7 = bitField1.clearShort((short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 119 + "'", int5 == 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -117 + "'", short7 == (short) -117);
    }

    @Test
    public void BitField0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0504");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte6 = bitField1.setByteBoolean((byte) 17, false);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0505");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set(16);
        int int7 = bitField1.clear(33);
        boolean boolean9 = bitField1.isSet(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0506");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.clearShort((short) (byte) 27);
        short short9 = bitField1.setShortValue((short) (byte) 26, (short) (byte) 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 212 + "'", short9 == (short) 212);
    }

    @Test
    public void BitField0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0507");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 214);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0508");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        byte byte9 = bitField1.clearByte((byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -112 + "'", byte9 == (byte) -112);
    }

    @Test
    public void BitField0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0509");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        boolean boolean3 = bitField1.isSet((int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0510");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        byte byte7 = bitField1.setByte((byte) -1);
        short short9 = bitField1.getShortRawValue((short) 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0511");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.clearByte((byte) 1);
        short short6 = bitField1.setShortValue((short) 122, (short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 113 + "'", short6 == (short) 113);
    }

    @Test
    public void BitField0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0512");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.getRawValue(222);
        int int7 = bitField1.clear(36);
        short short9 = bitField1.setShort((short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 111 + "'", short9 == (short) 111);
    }

    @Test
    public void BitField0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0513");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.set(26);
        int int7 = bitField1.set((int) (short) 29);
        boolean boolean9 = bitField1.isSet(66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 63 + "'", int7 == 63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0514");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int6 = bitField1.setBoolean(223, false);
        boolean boolean8 = bitField1.isSet((int) (byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0515");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isSet(8);
        short short9 = bitField1.getShortValue((short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0516");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        short short7 = bitField1.setShort((short) 212);
        int int9 = bitField1.getValue((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 212 + "'", short7 == (short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0517");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set(24);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        byte byte9 = bitField1.setByte((byte) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 97 + "'", byte9 == (byte) 97);
    }

    @Test
    public void BitField0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0518");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.setShort((short) (byte) 10);
        byte byte9 = bitField1.setByte((byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0519");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        int int7 = bitField1.setBoolean(212, false);
        byte byte9 = bitField1.setByte((byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 144 + "'", int7 == 144);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -27 + "'", byte9 == (byte) -27);
    }

    @Test
    public void BitField0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0520");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        int int9 = bitField1.getRawValue((int) (short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0521");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        short short6 = bitField1.setShort((short) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6 == (short) 111);
    }

    @Test
    public void BitField0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0522");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        byte byte6 = bitField1.setByteBoolean((byte) 0, true);
        int int8 = bitField1.getRawValue(33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0523");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        byte byte7 = bitField1.setByteBoolean((byte) 10, false);
        byte byte9 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void BitField0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0524");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        byte byte9 = bitField1.setByte((byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 97 + "'", byte9 == (byte) 97);
    }

    @Test
    public void BitField0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0525");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.clearByte((byte) -2);
        short short9 = bitField1.setShortValue((short) (byte) -101, (short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -101 + "'", short9 == (short) -101);
    }

    @Test
    public void BitField0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0526");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte6 = bitField1.setByteBoolean((byte) 17, false);
        short short9 = bitField1.setShortBoolean((short) (byte) 97, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 96 + "'", short9 == (short) 96);
    }

    @Test
    public void BitField0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0527");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 127);
        short short4 = bitField1.setShortBoolean((short) (byte) 106, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void BitField0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0528");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        byte byte7 = bitField1.setByteBoolean((byte) 101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 111 + "'", byte7 == (byte) 111);
    }

    @Test
    public void BitField0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0529");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        short short6 = bitField1.clearShort((short) (byte) -2);
        int int9 = bitField1.setBoolean(32, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -98 + "'", short6 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void BitField0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0530");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.clearByte((byte) 1);
        short short5 = bitField1.getShortRawValue((short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 24 + "'", short5 == (short) 24);
    }

    @Test
    public void BitField0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0531");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        short short6 = bitField1.clearShort((short) (byte) -2);
        int int8 = bitField1.getValue((int) (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -98 + "'", short6 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0532");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.getShortRawValue((short) 101);
        short short8 = bitField1.getShortValue((short) 122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0533");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set(24);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        int int9 = bitField1.getValue((int) (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0534");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int6 = bitField1.setBoolean(223, false);
        byte byte8 = bitField1.setByte((byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 97 + "'", byte8 == (byte) 97);
    }

    @Test
    public void BitField0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0535");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.set(34);
        boolean boolean9 = bitField1.isAllSet(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0536");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        short short5 = bitField1.setShort((short) (byte) -1);
        short short8 = bitField1.setShortBoolean((short) -28, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0537");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        short short7 = bitField1.setShortBoolean((short) 116, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 116 + "'", short7 == (short) 116);
    }

    @Test
    public void BitField0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0538");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        short short6 = bitField1.setShortValue((short) 97, (short) 1);
        byte byte8 = bitField1.setByte((byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 99 + "'", short6 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -5 + "'", byte8 == (byte) -5);
    }

    @Test
    public void BitField0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0539");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.getShortValue((short) 11);
        byte byte9 = bitField1.setByte((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 21 + "'", byte9 == (byte) 21);
    }

    @Test
    public void BitField0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0540");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        short short6 = bitField1.getShortRawValue((short) (byte) 101);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0541");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(36);
        byte byte3 = bitField1.clearByte((byte) -9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -45 + "'", byte3 == (byte) -45);
    }

    @Test
    public void BitField0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0542");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 214);
        int int7 = bitField1.clear(36);
        short short9 = bitField1.getShortValue((short) -117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 3 + "'", short9 == (short) 3);
    }

    @Test
    public void BitField0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0543");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 111);
    }

    @Test
    public void BitField0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0544");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short3 = bitField1.getShortRawValue((short) (byte) 26);
        short short5 = bitField1.getShortRawValue((short) -111);
        short short8 = bitField1.setShortBoolean((short) (byte) -128, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -27 + "'", short8 == (short) -27);
    }

    @Test
    public void BitField0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0545");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        int int5 = bitField1.getRawValue((int) (short) 214);
        boolean boolean7 = bitField1.isAllSet((int) (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 150 + "'", int5 == 150);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0546");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        byte byte7 = bitField1.setByte((byte) 3);
        int int9 = bitField1.clear(27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26 + "'", int9 == 26);
    }

    @Test
    public void BitField0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0547");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set((int) (byte) 11);
        int int8 = bitField1.setValue((int) (short) 123, (int) (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 123 + "'", int8 == 123);
    }

    @Test
    public void BitField0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0548");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        short short6 = bitField1.getShortRawValue((short) (byte) 101);
        boolean boolean8 = bitField1.isSet((int) (short) 109);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0549");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        int int6 = bitField1.set(24);
        byte byte8 = bitField1.setByte((byte) 27);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 27 + "'", byte8 == (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0550");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int6 = bitField1.setValue((int) (short) 21, (int) (short) 100);
        int int9 = bitField1.setValue(4, 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void BitField0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0551");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0552");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        boolean boolean7 = bitField1.isSet((int) (short) 11);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0553");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int6 = bitField1.setValue(15, (int) '4');
        int int9 = bitField1.setBoolean((int) (short) -31, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-31) + "'", int9 == (-31));
    }

    @Test
    public void BitField0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0554");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int4 = bitField1.setValue((int) (byte) 101, (int) (byte) 100);
        int int6 = bitField1.getValue(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81 + "'", int4 == 81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void BitField0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0555");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 56);
        int int3 = bitField1.set((int) (short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void BitField0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0556");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        boolean boolean7 = bitField1.isAllSet((-2));
        short short9 = bitField1.getShortValue((short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0557");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        int int8 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0558");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        short short5 = bitField1.getShortRawValue((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void BitField0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0559");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int7 = bitField1.setValue((-118), (int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-128) + "'", int7 == (-128));
    }

    @Test
    public void BitField0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0560");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getRawValue(17);
        int int8 = bitField1.setBoolean((int) (short) 5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0561");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int8 = bitField1.setBoolean((int) (byte) -37, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-37) + "'", int8 == (-37));
    }

    @Test
    public void BitField0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0562");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0563");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        int int8 = bitField1.setValue((int) (short) -58, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-58) + "'", int8 == (-58));
    }

    @Test
    public void BitField0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0564");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        boolean boolean5 = bitField1.isSet((int) (short) -12);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0565");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set(24);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        byte byte9 = bitField1.setByte((byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 17 + "'", byte9 == (byte) 17);
    }

    @Test
    public void BitField0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0566");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        int int3 = bitField1.getRawValue((-98));
        byte byte5 = bitField1.clearByte((byte) 97);
        int int7 = bitField1.getRawValue(58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 64 + "'", byte5 == (byte) 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
    }

    @Test
    public void BitField0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0567");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        int int3 = bitField1.getRawValue((-98));
        byte byte5 = bitField1.clearByte((byte) 97);
        short short8 = bitField1.setShortValue((short) (byte) -1, (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 64 + "'", byte5 == (byte) 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -34 + "'", short8 == (short) -34);
    }

    @Test
    public void BitField0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0568");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        int int7 = bitField1.setBoolean((int) (short) 3, true);
        int int9 = bitField1.getValue(58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void BitField0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0569");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet(100);
        short short9 = bitField1.getShortRawValue((short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0570");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(158);
    }

    @Test
    public void BitField0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0571");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        int int5 = bitField1.set((int) (byte) 3);
        boolean boolean7 = bitField1.isSet((-58));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0572");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int7 = bitField1.getRawValue(0);
        byte byte9 = bitField1.setByte((byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0573");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        byte byte3 = bitField1.setByte((byte) 0);
        int int5 = bitField1.clear(115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 101 + "'", byte3 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
    }

    @Test
    public void BitField0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0574");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(8);
    }

    @Test
    public void BitField0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0575");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set(16);
        byte byte8 = bitField1.setByteBoolean((byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8 == (byte) 11);
    }

    @Test
    public void BitField0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0576");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.set(26);
        short short7 = bitField1.getShortValue((short) 117);
        short short9 = bitField1.getShortRawValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 16 + "'", short7 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 2 + "'", short9 == (short) 2);
    }

    @Test
    public void BitField0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0577");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        byte byte5 = bitField1.clearByte((byte) -9);
        boolean boolean7 = bitField1.isAllSet((-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -28 + "'", byte5 == (byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0578");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.clearByte((byte) 117);
        boolean boolean7 = bitField1.isAllSet((int) (byte) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 117 + "'", byte5 == (byte) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0579");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        short short6 = bitField1.setShortBoolean((short) 21, true);
        byte byte8 = bitField1.clearByte((byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -25 + "'", byte8 == (byte) -25);
    }

    @Test
    public void BitField0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0580");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int3 = bitField1.set((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void BitField0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0581");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        int int5 = bitField1.getRawValue((int) (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void BitField0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0582");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        boolean boolean5 = bitField1.isSet(48);
        byte byte7 = bitField1.clearByte((byte) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void BitField0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0583");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        int int9 = bitField1.clear((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void BitField0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0584");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.clearShort((short) (byte) 27);
        int int9 = bitField1.setBoolean(117, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0585");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.clearShort((short) (byte) 27);
        short short8 = bitField1.getShortValue((short) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void BitField0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0586");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.clearShort((short) 99);
        boolean boolean7 = bitField1.isAllSet((int) (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0587");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int4 = bitField1.setValue((int) (byte) 101, (int) (byte) 100);
        byte byte6 = bitField1.clearByte((byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81 + "'", int4 == 81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -64 + "'", byte6 == (byte) -64);
    }

    @Test
    public void BitField0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0588");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        byte byte7 = bitField1.setByte((byte) 3);
        boolean boolean9 = bitField1.isAllSet((int) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0589");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void BitField0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0590");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(1);
        short short5 = bitField1.clearShort((short) 21);
        short short8 = bitField1.setShortBoolean((short) -12, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 21 + "'", short5 == (short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -12 + "'", short8 == (short) -12);
    }

    @Test
    public void BitField0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0591");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 6);
    }

    @Test
    public void BitField0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0592");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int8 = bitField1.setBoolean(154, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0593");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int4 = bitField1.setBoolean(8, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27 + "'", int4 == 27);
    }

    @Test
    public void BitField0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0594");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.getShortRawValue((short) (byte) 10);
        int int6 = bitField1.setValue(25, 30);
        byte byte8 = bitField1.setByte((byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 27 + "'", byte8 == (byte) 27);
    }

    @Test
    public void BitField0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0595");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((-1), true);
        short short9 = bitField1.setShort((short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -26 + "'", short9 == (short) -26);
    }

    @Test
    public void BitField0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0596");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.setByte((byte) 26);
        int int9 = bitField1.setValue((-26), (int) (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
    }

    @Test
    public void BitField0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0597");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(70);
        int int3 = bitField1.getRawValue(20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void BitField0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0598");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        byte byte7 = bitField1.clearByte((byte) 0);
        int int9 = bitField1.set((int) (short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void BitField0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0599");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.clearShort((short) (byte) 27);
        int int8 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0600");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 97);
    }

    @Test
    public void BitField0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0601");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0602");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((int) (short) 5, true);
        boolean boolean9 = bitField1.isSet((int) (short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0603");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        short short6 = bitField1.setShortBoolean((short) 21, true);
        int int9 = bitField1.setValue(102, (int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 126 + "'", int9 == 126);
    }

    @Test
    public void BitField0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0604");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-58));
    }

    @Test
    public void BitField0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0605");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int6 = bitField1.setValue((int) (short) 21, (int) (short) 100);
        short short8 = bitField1.setShort((short) -31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -31 + "'", short8 == (short) -31);
    }

    @Test
    public void BitField0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0606");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        short short6 = bitField1.setShortValue((short) 8, (short) 34);
        short short9 = bitField1.setShortBoolean((short) (byte) 16, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 16 + "'", short6 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0607");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        int int8 = bitField1.setBoolean((int) (short) -2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void BitField0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0608");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(96);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0609");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int6 = bitField1.setBoolean(223, false);
        byte byte9 = bitField1.setByteBoolean((byte) 100, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 4 + "'", byte9 == (byte) 4);
    }

    @Test
    public void BitField0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0610");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        byte byte6 = bitField1.setByteBoolean((byte) 117, true);
        int int8 = bitField1.getRawValue(53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 119 + "'", byte6 == (byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37 + "'", int8 == 37);
    }

    @Test
    public void BitField0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0611");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(123);
    }

    @Test
    public void BitField0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0612");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set((int) (byte) 11);
        short short7 = bitField1.setShort((short) (byte) -2);
        int int9 = bitField1.getValue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void BitField0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0613");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        boolean boolean7 = bitField1.isAllSet((int) (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0614");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) (byte) 101);
        short short7 = bitField1.clearShort((short) 0);
        byte byte9 = bitField1.setByte((byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 27 + "'", byte9 == (byte) 27);
    }

    @Test
    public void BitField0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0615");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short4 = bitField1.setShortValue((short) (byte) 1, (short) 117);
        short short6 = bitField1.setShort((short) 4);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 28 + "'", short6 == (short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0616");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int4 = bitField1.setBoolean((int) (short) 27, true);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0617");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0618");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.setByte((byte) 26);
        boolean boolean8 = bitField1.isSet(17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0619");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short6 = bitField1.setShortBoolean((short) -2, true);
        short short8 = bitField1.clearShort((short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void BitField0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0620");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        int int8 = bitField1.getRawValue(123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void BitField0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0621");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        byte byte4 = bitField1.setByteBoolean((byte) -9, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void BitField0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0622");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.clearShort((short) 4);
        boolean boolean5 = bitField1.isAllSet((int) (short) 11);
        short short7 = bitField1.getShortValue((short) -37);
        byte byte9 = bitField1.setByte((byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -31 + "'", short7 == (short) -31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -25 + "'", byte9 == (byte) -25);
    }

    @Test
    public void BitField0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0623");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 29);
    }

    @Test
    public void BitField0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0624");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        boolean boolean7 = bitField1.isAllSet((-2));
        boolean boolean9 = bitField1.isSet(107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0625");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        int int6 = bitField1.setBoolean(32, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
    }

    @Test
    public void BitField0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0626");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        byte byte6 = bitField1.setByteBoolean((byte) 107, true);
        int int8 = bitField1.getValue((int) (short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0627");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.clearShort((short) (byte) -2);
        short short5 = bitField1.getShortValue((short) 97);
        int int7 = bitField1.getRawValue((int) (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0628");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        boolean boolean6 = bitField1.isSet((int) (short) 20);
        short short9 = bitField1.setShortBoolean((short) -26, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0629");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        short short6 = bitField1.setShortBoolean((short) 4, false);
        short short9 = bitField1.setShortValue((short) (byte) -112, (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 4 + "'", short6 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -112 + "'", short9 == (short) -112);
    }

    @Test
    public void BitField0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0630");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 214);
        int int8 = bitField1.setValue((int) (byte) 4, 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
    }

    @Test
    public void BitField0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0631");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.setShort((short) 116);
        int int9 = bitField1.clear(214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 117 + "'", short7 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 214 + "'", int9 == 214);
    }

    @Test
    public void BitField0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0632");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        short short6 = bitField1.getShortRawValue((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void BitField0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0633");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 100);
        boolean boolean5 = bitField1.isAllSet((int) (short) 116);
        byte byte8 = bitField1.setByteBoolean((byte) -64, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -64 + "'", byte8 == (byte) -64);
    }

    @Test
    public void BitField0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0634");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short3 = bitField1.getShortRawValue((short) (byte) 26);
        int int5 = bitField1.getRawValue((int) (short) 127);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0635");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        boolean boolean7 = bitField1.isSet(0);
        byte byte9 = bitField1.clearByte((byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -26 + "'", byte9 == (byte) -26);
    }

    @Test
    public void BitField0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0636");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -2);
        int int3 = bitField1.set((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void BitField0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0637");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((int) (short) 5, true);
        int int9 = bitField1.set((int) (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 103 + "'", int9 == 103);
    }

    @Test
    public void BitField0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0638");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int6 = bitField1.getRawValue(103);
        int int8 = bitField1.clear((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void BitField0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0639");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        int int5 = bitField1.getRawValue(1);
        short short7 = bitField1.clearShort((short) (byte) -28);
        boolean boolean9 = bitField1.isSet((int) (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -32 + "'", short7 == (short) -32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0640");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        byte byte8 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void BitField0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0641");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.clearShort((short) 99);
        short short8 = bitField1.setShortValue((short) -30, (short) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -6 + "'", short8 == (short) -6);
    }

    @Test
    public void BitField0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0642");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.getShortRawValue((short) (byte) 10);
        int int6 = bitField1.setValue(25, 30);
        int int8 = bitField1.set(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 26 + "'", int6 == 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void BitField0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0643");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.clearShort((short) (byte) -2);
        short short6 = bitField1.setShortBoolean((short) 97, true);
        int int9 = bitField1.setBoolean((-118), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 121 + "'", short6 == (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-102) + "'", int9 == (-102));
    }

    @Test
    public void BitField0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0644");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(17);
        int int4 = bitField1.setBoolean((int) (byte) 117, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BitField0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0645");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0646");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int7 = bitField1.setBoolean(103, false);
        int int9 = bitField1.getValue((int) (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0647");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        short short3 = bitField1.getShortRawValue((short) 123);
        byte byte5 = bitField1.setByte((byte) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 113 + "'", short3 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 117 + "'", byte5 == (byte) 117);
    }

    @Test
    public void BitField0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0648");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.getRawValue((int) (short) 29);
        int int5 = bitField1.clear(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void BitField0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0649");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        boolean boolean9 = bitField1.isSet((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0650");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int6 = bitField1.getValue((int) (byte) -1);
        boolean boolean8 = bitField1.isSet((int) (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0651");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(4);
        byte byte3 = bitField1.setByte((byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 119 + "'", byte3 == (byte) 119);
    }

    @Test
    public void BitField0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0652");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        int int5 = bitField1.getRawValue(25);
        int int8 = bitField1.setValue((int) (byte) 21, (int) (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void BitField0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0653");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        boolean boolean6 = bitField1.isSet(0);
        int int8 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0654");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) -1);
        short short8 = bitField1.getShortValue((short) -31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 97 + "'", short8 == (short) 97);
    }

    @Test
    public void BitField0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0655");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -102);
        int int3 = bitField1.getValue(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BitField0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0656");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortBoolean((short) (byte) 29, true);
        boolean boolean8 = bitField1.isAllSet(115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0657");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        byte byte4 = bitField1.setByteBoolean((byte) 11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void BitField0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0658");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getRawValue((int) (short) 214);
        int int9 = bitField1.setBoolean(5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 214 + "'", int6 == 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void BitField0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0659");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int7 = bitField1.setBoolean(103, false);
        short short9 = bitField1.clearShort((short) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -28 + "'", short9 == (short) -28);
    }

    @Test
    public void BitField0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0660");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set(16);
        byte byte7 = bitField1.clearByte((byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 116 + "'", byte7 == (byte) 116);
    }

    @Test
    public void BitField0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0661");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        boolean boolean6 = bitField1.isSet(10);
        short short8 = bitField1.clearShort((short) (byte) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -128 + "'", short8 == (short) -128);
    }

    @Test
    public void BitField0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0662");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(70);
        short short4 = bitField1.setShortValue((short) 9, (short) 215);
        short short6 = bitField1.clearShort((short) 16);
        byte byte9 = bitField1.setByteBoolean((byte) -45, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 15 + "'", short4 == (short) 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 16 + "'", short6 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -111 + "'", byte9 == (byte) -111);
    }

    @Test
    public void BitField0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0663");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short4 = bitField1.setShortValue((short) -15, (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -7 + "'", short4 == (short) -7);
    }

    @Test
    public void BitField0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0664");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        byte byte5 = bitField1.clearByte((byte) 10);
        boolean boolean7 = bitField1.isSet((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0665");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        short short6 = bitField1.setShortBoolean((short) 21, true);
        int int8 = bitField1.clear((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void BitField0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0666");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) (byte) 101);
        byte byte7 = bitField1.clearByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 16 + "'", byte7 == (byte) 16);
    }

    @Test
    public void BitField0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0667");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int7 = bitField1.getRawValue(0);
        int int9 = bitField1.clear((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0668");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(36);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0669");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.clearShort((short) (byte) 27);
        int int9 = bitField1.set(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 26 + "'", short7 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0670");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte3 = bitField1.setByte((byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 107 + "'", byte3 == (byte) 107);
    }

    @Test
    public void BitField0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0671");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short4 = bitField1.setShortBoolean((short) (byte) 111, true);
        short short7 = bitField1.setShortValue((short) -30, (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 127 + "'", short4 == (short) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -26 + "'", short7 == (short) -26);
    }

    @Test
    public void BitField0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0672");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        int int8 = bitField1.set((int) (short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void BitField0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0673");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        byte byte7 = bitField1.setByteBoolean((byte) -111, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -111 + "'", byte7 == (byte) -111);
    }

    @Test
    public void BitField0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0674");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.setShort((short) 27);
        short short9 = bitField1.clearShort((short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 27 + "'", short7 == (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 116 + "'", short9 == (short) 116);
    }

    @Test
    public void BitField0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0675");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.set((int) (byte) -2);
        byte byte6 = bitField1.setByteBoolean((byte) -102, false);
        byte byte9 = bitField1.setByteBoolean((byte) 21, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -128 + "'", byte6 == (byte) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 31 + "'", byte9 == (byte) 31);
    }

    @Test
    public void BitField0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0676");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        short short7 = bitField1.setShort((short) 212);
        boolean boolean9 = bitField1.isAllSet((int) (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 212 + "'", short7 == (short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0677");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        short short3 = bitField1.setShort((short) (byte) 16);
        byte byte5 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 215 + "'", short3 == (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 8 + "'", byte5 == (byte) 8);
    }

    @Test
    public void BitField0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0678");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet(32);
        int int9 = bitField1.clear(107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void BitField0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0679");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        byte byte3 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -34 + "'", byte3 == (byte) -34);
    }

    @Test
    public void BitField0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0680");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 34);
    }

    @Test
    public void BitField0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0681");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.getShortRawValue((short) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void BitField0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0682");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        int int4 = bitField1.setValue((int) (byte) -41, (-128));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-112) + "'", int4 == (-112));
    }

    @Test
    public void BitField0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0683");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int6 = bitField1.setBoolean((int) (short) 100, false);
        int int8 = bitField1.set((int) 'a');
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 107 + "'", int8 == 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0684");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 96);
    }

    @Test
    public void BitField0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0685");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        byte byte7 = bitField1.setByteBoolean((byte) 106, true);
        int int9 = bitField1.getValue(34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 107 + "'", byte7 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0686");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(53);
        short short3 = bitField1.setShort((short) (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 53 + "'", short3 == (short) 53);
    }

    @Test
    public void BitField0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0687");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0688");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        byte byte7 = bitField1.setByteBoolean((byte) -2, false);
        short short9 = bitField1.getShortRawValue((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -102 + "'", byte7 == (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
    }

    @Test
    public void BitField0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0689");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        short short9 = bitField1.clearShort((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 18 + "'", short9 == (short) 18);
    }

    @Test
    public void BitField0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0690");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) -27);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0691");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte7 = bitField1.setByteBoolean((byte) 100, true);
        byte byte9 = bitField1.setByte((byte) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -5 + "'", byte9 == (byte) -5);
    }

    @Test
    public void BitField0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0692");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 11);
        int int9 = bitField1.clear(27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26 + "'", int9 == 26);
    }

    @Test
    public void BitField0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0693");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortBoolean((short) (byte) 29, true);
        int int8 = bitField1.set((int) (short) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 127 + "'", int8 == 127);
    }

    @Test
    public void BitField0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0694");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        byte byte6 = bitField1.setByteBoolean((byte) 0, true);
        boolean boolean8 = bitField1.isSet((-118));
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0695");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.setByte((byte) 97);
        byte byte8 = bitField1.setByteBoolean((byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 97 + "'", byte5 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void BitField0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0696");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.clear((int) (short) 9);
        short short7 = bitField1.setShort((short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 215 + "'", short7 == (short) 215);
    }

    @Test
    public void BitField0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0697");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        byte byte3 = bitField1.setByte((byte) 0);
        int int6 = bitField1.setValue((-37), (int) (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -41 + "'", byte3 == (byte) -41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-33) + "'", int6 == (-33));
    }

    @Test
    public void BitField0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0698");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        short short6 = bitField1.setShortBoolean((short) 4, false);
        short short9 = bitField1.setShortBoolean((short) (byte) 21, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 4 + "'", short6 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void BitField0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0699");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        int int9 = bitField1.clear((int) (short) -15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-16) + "'", int9 == (-16));
    }

    @Test
    public void BitField0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0700");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.getRawValue(222);
        int int7 = bitField1.clear(36);
        int int9 = bitField1.clear((int) (short) -58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-60) + "'", int9 == (-60));
    }

    @Test
    public void BitField0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0701");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.setShort((short) 121);
        int int6 = bitField1.setValue((int) (byte) -64, 63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 121 + "'", short3 == (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-40) + "'", int6 == (-40));
    }

    @Test
    public void BitField0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0702");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        boolean boolean8 = bitField1.isSet((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0703");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        int int3 = bitField1.set((int) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 223 + "'", int3 == 223);
    }

    @Test
    public void BitField0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0704");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        short short7 = bitField1.getShortValue((short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 3 + "'", short7 == (short) 3);
    }

    @Test
    public void BitField0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0705");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.getRawValue(36);
        short short7 = bitField1.setShort((short) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 106 + "'", short7 == (short) 106);
    }

    @Test
    public void BitField0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0706");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.set((int) (short) 214);
        int int8 = bitField1.setValue((int) (byte) 26, 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 222 + "'", int5 == 222);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
    }

    @Test
    public void BitField0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0707");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 100);
        byte byte7 = bitField1.setByte((byte) 0);
        boolean boolean9 = bitField1.isAllSet((int) (short) -30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 110 + "'", byte5 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0708");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) -25);
        boolean boolean9 = bitField1.isSet(121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -27 + "'", byte7 == (byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0709");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getRawValue((-40));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-40) + "'", int6 == (-40));
    }

    @Test
    public void BitField0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0710");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        short short6 = bitField1.getShortRawValue((short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void BitField0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0711");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.clearShort((short) 4);
        boolean boolean5 = bitField1.isAllSet((int) (short) 11);
        int int7 = bitField1.clear(101);
        short short9 = bitField1.setShort((short) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -26 + "'", short9 == (short) -26);
    }

    @Test
    public void BitField0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0712");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int6 = bitField1.getValue((int) (byte) -1);
        short short9 = bitField1.setShortValue((short) -37, (short) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -47 + "'", short9 == (short) -47);
    }

    @Test
    public void BitField0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0713");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.set(26);
        short short7 = bitField1.getShortValue((short) 117);
        int int9 = bitField1.clear(53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 16 + "'", short7 == (short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
    }

    @Test
    public void BitField0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0714");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int6 = bitField1.setBoolean((int) (short) 1, false);
        int int8 = bitField1.clear((int) (short) -111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-127) + "'", int8 == (-127));
    }

    @Test
    public void BitField0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0715");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 29);
    }

    @Test
    public void BitField0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0716");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        short short4 = bitField1.setShortBoolean((short) 11, true);
        byte byte7 = bitField1.setByteBoolean((byte) 116, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 223 + "'", short4 == (short) 223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -9 + "'", byte7 == (byte) -9);
    }

    @Test
    public void BitField0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0717");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        boolean boolean3 = bitField1.isAllSet((int) (short) 101);
        int int5 = bitField1.set((int) (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void BitField0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0718");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        short short6 = bitField1.setShort((short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -17 + "'", short6 == (short) -17);
    }

    @Test
    public void BitField0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0719");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.clear(5);
        int int8 = bitField1.setValue((-25), (int) (short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-57) + "'", int8 == (-57));
    }

    @Test
    public void BitField0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0720");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.clearShort((short) (byte) 27);
        byte byte9 = bitField1.setByteBoolean((byte) 29, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0721");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(2);
    }

    @Test
    public void BitField0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0722");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        int int3 = bitField1.clear(33);
        int int5 = bitField1.getValue(28);
        byte byte8 = bitField1.setByteBoolean((byte) 100, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 96 + "'", byte8 == (byte) 96);
    }

    @Test
    public void BitField0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0723");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        boolean boolean5 = bitField1.isSet((int) (short) -12);
        short short8 = bitField1.setShortBoolean((short) 15, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 4 + "'", short8 == (short) 4);
    }

    @Test
    public void BitField0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0724");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getValue((int) (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0725");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int6 = bitField1.setValue(15, (int) '4');
        short short8 = bitField1.getShortValue((short) 111);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0726");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        short short7 = bitField1.setShort((short) 212);
        short short9 = bitField1.clearShort((short) (byte) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 212 + "'", short7 == (short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 117 + "'", short9 == (short) 117);
    }

    @Test
    public void BitField0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0727");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 17);
        int int4 = bitField1.setValue((int) (short) 109, (-2));
        int int7 = bitField1.setValue((int) (byte) -112, (int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 124 + "'", int4 == 124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-112) + "'", int7 == (-112));
    }

    @Test
    public void BitField0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0728");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        int int4 = bitField1.setBoolean((int) 'a', true);
        byte byte7 = bitField1.setByteBoolean((byte) 107, false);
        int int9 = bitField1.set((int) (byte) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 116 + "'", int9 == 116);
    }

    @Test
    public void BitField0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0729");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        int int5 = bitField1.getRawValue(1);
        short short7 = bitField1.clearShort((short) (byte) -28);
        boolean boolean9 = bitField1.isAllSet((int) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -32 + "'", short7 == (short) -32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0730");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        short short5 = bitField1.setShort((short) (byte) -1);
        boolean boolean7 = bitField1.isAllSet((-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0731");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        int int5 = bitField1.getRawValue((int) (byte) -1);
        byte byte8 = bitField1.setByteBoolean((byte) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void BitField0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0732");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set((int) (byte) 11);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0733");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        int int9 = bitField1.set((int) (short) 122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 123 + "'", int9 == 123);
    }

    @Test
    public void BitField0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0734");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(115);
        short short4 = bitField1.setShortValue((short) -13, (short) -7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -15 + "'", short4 == (short) -15);
    }

    @Test
    public void BitField0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0735");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.clearShort((short) (byte) 100);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0736");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet(103);
        short short9 = bitField1.setShort((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void BitField0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0737");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.setShort((short) 116);
        boolean boolean9 = bitField1.isAllSet((int) (short) -30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 117 + "'", short7 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0738");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0739");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int3 = bitField1.getValue((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void BitField0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0740");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 11);
        boolean boolean9 = bitField1.isAllSet(116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0741");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int3 = bitField1.getValue(20);
        byte byte5 = bitField1.setByte((byte) -25);
        int int7 = bitField1.getRawValue(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void BitField0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0742");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortBoolean((short) (byte) 29, true);
        byte byte8 = bitField1.setByte((byte) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 127 + "'", byte8 == (byte) 127);
    }

    @Test
    public void BitField0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0743");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte7 = bitField1.clearByte((byte) -2);
        int int9 = bitField1.clear((int) (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -2 + "'", byte7 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void BitField0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0744");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 214);
        short short7 = bitField1.clearShort((short) 215);
        boolean boolean9 = bitField1.isAllSet(48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 144 + "'", short7 == (short) 144);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0745");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        boolean boolean9 = bitField1.isAllSet((int) (short) 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0746");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        int int5 = bitField1.getValue((int) (short) 117);
        int int7 = bitField1.getRawValue(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void BitField0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0747");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.setShort((short) (byte) 10);
        short short9 = bitField1.getShortRawValue((short) (byte) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void BitField0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0748");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -101);
        int int4 = bitField1.setBoolean((int) (short) 29, true);
        short short7 = bitField1.setShortBoolean((short) 1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97) + "'", int4 == (-97));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -101 + "'", short7 == (short) -101);
    }

    @Test
    public void BitField0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0749");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 53);
    }

    @Test
    public void BitField0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0750");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        byte byte4 = bitField1.setByteBoolean((byte) 97, false);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 21 + "'", short7 == (short) 21);
    }

    @Test
    public void BitField0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0751");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        int int6 = bitField1.setBoolean(21, true);
        short short9 = bitField1.setShortBoolean((short) (byte) -41, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -41 + "'", short9 == (short) -41);
    }

    @Test
    public void BitField0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0752");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(214);
        byte byte3 = bitField1.setByte((byte) -27);
        int int5 = bitField1.clear((int) (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -9 + "'", byte3 == (byte) -9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void BitField0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0753");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(70);
        short short3 = bitField1.clearShort((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 17 + "'", short3 == (short) 17);
    }

    @Test
    public void BitField0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0754");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        byte byte4 = bitField1.setByteBoolean((byte) 97, false);
        byte byte7 = bitField1.setByteBoolean((byte) -37, true);
        byte byte9 = bitField1.clearByte((byte) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void BitField0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0755");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        boolean boolean6 = bitField1.isSet(10);
        short short9 = bitField1.setShortBoolean((short) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0756");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        short short6 = bitField1.setShortBoolean((short) 21, true);
        short short9 = bitField1.setShortBoolean((short) (byte) -45, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -37 + "'", short9 == (short) -37);
    }

    @Test
    public void BitField0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0757");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        short short4 = bitField1.setShortValue((short) (byte) -111, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -107 + "'", short4 == (short) -107);
    }

    @Test
    public void BitField0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0758");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short5 = bitField1.setShort((short) 21);
        short short7 = bitField1.clearShort((short) -30);
        byte byte9 = bitField1.clearByte((byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -126 + "'", short7 == (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -98 + "'", byte9 == (byte) -98);
    }

    @Test
    public void BitField0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0759");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.clearShort((short) 99);
        short short7 = bitField1.getShortValue((short) (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 3 + "'", short7 == (short) 3);
    }

    @Test
    public void BitField0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0760");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        short short5 = bitField1.setShort((short) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
    }

    @Test
    public void BitField0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0761");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getRawValue(34);
        byte byte5 = bitField1.setByte((byte) -101);
        int int8 = bitField1.setValue(18, (-31));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -101 + "'", byte5 == (byte) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0762");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        byte byte5 = bitField1.setByte((byte) -45);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -37 + "'", byte5 == (byte) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0763");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.getValue((int) (short) 0);
        byte byte9 = bitField1.clearByte((byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void BitField0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0764");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 11 + "'", short5 == (short) 11);
    }

    @Test
    public void BitField0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0765");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.set(33);
        short short7 = bitField1.setShort((short) (byte) 26);
        int int9 = bitField1.set(117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 26 + "'", short7 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 125 + "'", int9 == 125);
    }

    @Test
    public void BitField0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0766");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(0);
        short short9 = bitField1.getShortValue((short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0767");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.set(33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void BitField0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0768");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -102);
        short short3 = bitField1.clearShort((short) (byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 101 + "'", short3 == (short) 101);
    }

    @Test
    public void BitField0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0769");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        int int8 = bitField1.getRawValue(31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void BitField0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0770");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortBoolean((short) 10, true);
        short short9 = bitField1.getShortValue((short) (byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0771");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short5 = bitField1.setShort((short) 21);
        short short7 = bitField1.clearShort((short) -30);
        short short9 = bitField1.getShortRawValue((short) (byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -126 + "'", short7 == (short) -126);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0772");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        short short8 = bitField1.clearShort((short) 100);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0773");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        short short7 = bitField1.setShortBoolean((short) 26, false);
        short short9 = bitField1.getShortValue((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 26 + "'", short7 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0774");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        short short6 = bitField1.setShortBoolean((short) (byte) 4, true);
        int int9 = bitField1.setBoolean((int) (short) -107, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-108) + "'", int9 == (-108));
    }

    @Test
    public void BitField0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0775");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        boolean boolean6 = bitField1.isSet(10);
        short short8 = bitField1.getShortValue((short) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0776");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        short short7 = bitField1.clearShort((short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -27 + "'", short7 == (short) -27);
    }

    @Test
    public void BitField0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0777");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        byte byte5 = bitField1.clearByte((byte) 96);
        short short8 = bitField1.setShortValue((short) 99, (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 96 + "'", byte5 == (byte) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 105 + "'", short8 == (short) 105);
    }

    @Test
    public void BitField0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0778");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) -1);
        byte byte8 = bitField1.setByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 127 + "'", byte8 == (byte) 127);
    }

    @Test
    public void BitField0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0779");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.clearByte((byte) 100);
        int int7 = bitField1.clear((int) (short) 5);
        int int9 = bitField1.set((-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-18) + "'", int9 == (-18));
    }

    @Test
    public void BitField0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0780");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(106);
        short short3 = bitField1.clearShort((short) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -108 + "'", short3 == (short) -108);
    }

    @Test
    public void BitField0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0781");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short4 = bitField1.setShortBoolean((short) (byte) 111, true);
        int int7 = bitField1.setBoolean(97, false);
        short short9 = bitField1.setShort((short) -47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 127 + "'", short4 == (short) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -43 + "'", short9 == (short) -43);
    }

    @Test
    public void BitField0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0782");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 117);
        short short3 = bitField1.setShort((short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -11 + "'", short3 == (short) -11);
    }

    @Test
    public void BitField0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0783");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        int int7 = bitField1.set((int) (byte) 96);
        short short9 = bitField1.getShortValue((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 106 + "'", int7 == 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
    }

    @Test
    public void BitField0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0784");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        boolean boolean3 = bitField1.isAllSet((int) (short) 10);
        int int5 = bitField1.getValue((int) (short) 111);
        int int8 = bitField1.setBoolean(32, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void BitField0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0785");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int7 = bitField1.set(122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 123 + "'", int7 == 123);
    }

    @Test
    public void BitField0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0786");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        byte byte3 = bitField1.setByte((byte) 1);
        short short5 = bitField1.clearShort((short) 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 96 + "'", short5 == (short) 96);
    }

    @Test
    public void BitField0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0787");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        int int3 = bitField1.clear(33);
        byte byte6 = bitField1.setByteBoolean((byte) -97, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -102 + "'", byte6 == (byte) -102);
    }

    @Test
    public void BitField0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0788");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(0);
        short short9 = bitField1.setShort((short) (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 29 + "'", short9 == (short) 29);
    }

    @Test
    public void BitField0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0789");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        short short5 = bitField1.getShortRawValue((short) (byte) 100);
        int int7 = bitField1.set((int) (short) 6);
        boolean boolean9 = bitField1.isSet((int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0790");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        int int3 = bitField1.getValue((int) (short) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BitField0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0791");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -2);
        short short7 = bitField1.clearShort((short) 100);
        byte byte9 = bitField1.setByte((byte) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 127 + "'", byte9 == (byte) 127);
    }

    @Test
    public void BitField0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0792");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int6 = bitField1.getRawValue(103);
        int int8 = bitField1.getRawValue((int) (byte) -34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 107 + "'", byte4 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void BitField0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0793");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int7 = bitField1.setBoolean(31, true);
        short short9 = bitField1.getShortValue((short) -58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0794");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short6 = bitField1.setShortBoolean((short) -2, true);
        int int9 = bitField1.setBoolean((int) (byte) -128, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-117) + "'", int9 == (-117));
    }

    @Test
    public void BitField0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0795");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 100);
        byte byte7 = bitField1.setByte((byte) 0);
        boolean boolean9 = bitField1.isSet(107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 110 + "'", byte5 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0796");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.clearShort((short) 4);
        int int6 = bitField1.setValue((int) (byte) 0, (-1));
        int int8 = bitField1.clear(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-26) + "'", int6 == (-26));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0797");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortValue((short) (byte) -11, (short) 97);
        int int8 = bitField1.getValue(96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -27 + "'", short6 == (short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0798");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        boolean boolean6 = bitField1.isSet((int) (short) 20);
        int int8 = bitField1.set(124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void BitField0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0799");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.clear((int) (short) 9);
        int int8 = bitField1.setValue((-2), 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void BitField0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0800");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.clearShort((short) 4);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0801");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.clearByte((byte) -2);
        short short8 = bitField1.clearShort((short) (byte) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -12 + "'", short8 == (short) -12);
    }

    @Test
    public void BitField0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0802");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        int int3 = bitField1.getRawValue(36);
        short short5 = bitField1.clearShort((short) 99);
        boolean boolean7 = bitField1.isAllSet((int) (short) -26);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 32 + "'", short5 == (short) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0803");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        byte byte5 = bitField1.clearByte((byte) 10);
        byte byte8 = bitField1.setByteBoolean((byte) -101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -101 + "'", byte8 == (byte) -101);
    }

    @Test
    public void BitField0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0804");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        boolean boolean8 = bitField1.isSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0805");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short4 = bitField1.setShortValue((short) (byte) 1, (short) 117);
        short short6 = bitField1.setShort((short) 4);
        int int8 = bitField1.getValue((int) (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 28 + "'", short6 == (short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0806");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.getShortRawValue((short) (byte) 26);
        short short7 = bitField1.clearShort((short) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 26 + "'", short5 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -28 + "'", short7 == (short) -28);
    }

    @Test
    public void BitField0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0807");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.getShortRawValue((short) (byte) 26);
        byte byte7 = bitField1.setByte((byte) 26);
        boolean boolean9 = bitField1.isAllSet(222);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 26 + "'", short5 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 27 + "'", byte7 == (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0808");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        short short3 = bitField1.getShortRawValue((short) 123);
        byte byte6 = bitField1.setByteBoolean((byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 113 + "'", short3 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void BitField0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0809");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        short short5 = bitField1.setShort((short) (byte) 31);
        int int7 = bitField1.clear((int) (short) -108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -97 + "'", short5 == (short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0810");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.set(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
    }

    @Test
    public void BitField0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0811");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        short short6 = bitField1.setShort((short) 215);
        short short8 = bitField1.getShortValue((short) -30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 215 + "'", short6 == (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0812");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isSet((int) (short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0813");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-97));
    }

    @Test
    public void BitField0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0814");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.set((int) (byte) 110);
        byte byte9 = bitField1.setByte((byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 111 + "'", int7 == 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 111 + "'", byte9 == (byte) 111);
    }

    @Test
    public void BitField0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0815");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        short short5 = bitField1.getShortRawValue((short) (byte) -5);
        int int8 = bitField1.setValue((int) (byte) 1, 144);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0816");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -2);
        int int3 = bitField1.set((int) (short) -98);
        short short6 = bitField1.setShortValue((short) (byte) 26, (short) 117);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 234 + "'", short6 == (short) 234);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0817");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getRawValue(17);
        boolean boolean7 = bitField1.isSet((-127));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0818");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        int int5 = bitField1.set(9);
        short short7 = bitField1.getShortValue((short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void BitField0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0819");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.set(26);
        int int7 = bitField1.set((int) (short) 29);
        int int9 = bitField1.clear((int) (byte) -64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 63 + "'", int7 == 63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-64) + "'", int9 == (-64));
    }

    @Test
    public void BitField0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0820");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.getRawValue((int) (short) 29);
        int int5 = bitField1.getValue((int) (byte) 97);
        byte byte7 = bitField1.setByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void BitField0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0821");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte6 = bitField1.setByteBoolean((byte) 17, false);
        int int8 = bitField1.set((int) (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-101) + "'", int8 == (-101));
    }

    @Test
    public void BitField0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0822");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet(103);
        short short9 = bitField1.getShortRawValue((short) -47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0823");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.clearShort((short) (byte) 27);
        short short9 = bitField1.setShortBoolean((short) 53, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0824");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        int int8 = bitField1.setBoolean((int) (short) 19, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void BitField0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0825");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(150);
    }

    @Test
    public void BitField0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0826");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        boolean boolean5 = bitField1.isAllSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0827");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 100);
        byte byte7 = bitField1.setByte((byte) 0);
        boolean boolean9 = bitField1.isSet((-4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 110 + "'", byte5 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0828");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        short short3 = bitField1.getShortRawValue((short) (byte) -45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void BitField0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0829");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.setByte((byte) 97);
        int int8 = bitField1.setBoolean(102, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 97 + "'", byte5 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 102 + "'", int8 == 102);
    }

    @Test
    public void BitField0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0830");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.set((int) (short) 97);
        int int7 = bitField1.clear(52);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 107 + "'", int5 == 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0831");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        int int8 = bitField1.getRawValue((int) (byte) -9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void BitField0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0832");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-26));
        short short3 = bitField1.getShortValue((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 49 + "'", short3 == (short) 49);
    }

    @Test
    public void BitField0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0833");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 96, (short) (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 97 + "'", short6 == (short) 97);
    }

    @Test
    public void BitField0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0834");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        byte byte6 = bitField1.setByteBoolean((byte) 107, true);
        byte byte9 = bitField1.setByteBoolean((byte) 117, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 117 + "'", byte9 == (byte) 117);
    }

    @Test
    public void BitField0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0835");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(30);
        int int3 = bitField1.clear(36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BitField0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0836");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        byte byte4 = bitField1.setByteBoolean((byte) 11, true);
        short short6 = bitField1.setShort((short) (byte) -97);
        boolean boolean8 = bitField1.isAllSet((int) (short) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 111 + "'", byte4 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0837");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        byte byte5 = bitField1.clearByte((byte) 10);
        short short7 = bitField1.getShortRawValue((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void BitField0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0838");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.getShortRawValue((short) 4);
        int int8 = bitField1.setBoolean((int) (byte) -41, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-57) + "'", int8 == (-57));
    }

    @Test
    public void BitField0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0839");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        byte byte5 = bitField1.clearByte((byte) -9);
        int int8 = bitField1.setBoolean(9, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -28 + "'", byte5 == (byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void BitField0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0840");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 4);
    }

    @Test
    public void BitField0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0841");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.clearShort((short) (byte) 100);
        int int5 = bitField1.set((int) (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-37) + "'", int5 == (-37));
    }

    @Test
    public void BitField0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0842");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int6 = bitField1.clear((int) (short) 11);
        short short8 = bitField1.getShortRawValue((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0843");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        boolean boolean5 = bitField1.isAllSet(33);
        byte byte7 = bitField1.setByte((byte) 0);
        byte byte9 = bitField1.clearByte((byte) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 20 + "'", byte9 == (byte) 20);
    }

    @Test
    public void BitField0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0844");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        short short3 = bitField1.setShort((short) (byte) 10);
        int int6 = bitField1.setValue((int) (short) -49, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -98 + "'", short3 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 65 + "'", int6 == 65);
    }

    @Test
    public void BitField0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0845");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.set((int) (short) 97);
        int int7 = bitField1.clear(52);
        boolean boolean9 = bitField1.isAllSet(119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 107 + "'", int5 == 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0846");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.set(33);
        short short7 = bitField1.setShort((short) (byte) 26);
        short short9 = bitField1.setShort((short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 26 + "'", short7 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 123 + "'", short9 == (short) 123);
    }

    @Test
    public void BitField0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0847");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getValue((int) (short) -13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BitField0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0848");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 35);
        short short3 = bitField1.setShort((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 43 + "'", short3 == (short) 43);
    }

    @Test
    public void BitField0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0849");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 1);
        short short5 = bitField1.setShort((short) -37);
        byte byte7 = bitField1.setByte((byte) -45);
        short short9 = bitField1.getShortRawValue((short) (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -37 + "'", short5 == (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -37 + "'", byte7 == (byte) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 8 + "'", short9 == (short) 8);
    }

    @Test
    public void BitField0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0850");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        short short3 = bitField1.getShortRawValue((short) 111);
        short short5 = bitField1.getShortValue((short) 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 34 + "'", short3 == (short) 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0851");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(26);
        byte byte3 = bitField1.setByte((byte) 96);
        short short5 = bitField1.getShortRawValue((short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 122 + "'", byte3 == (byte) 122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0852");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int4 = bitField1.setValue((int) (short) -128, (int) (byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
    }

    @Test
    public void BitField0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0853");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -41);
    }

    @Test
    public void BitField0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0854");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        byte byte6 = bitField1.setByteBoolean((byte) 10, true);
        int int9 = bitField1.setBoolean((int) (short) -32, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-21) + "'", int9 == (-21));
    }

    @Test
    public void BitField0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0855");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        int int5 = bitField1.clear(1);
        int int7 = bitField1.getValue((int) (byte) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
    }

    @Test
    public void BitField0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0856");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        int int3 = bitField1.getRawValue((-98));
        short short6 = bitField1.setShortValue((short) 0, (short) 109);
        byte byte8 = bitField1.clearByte((byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 33 + "'", short6 == (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -100 + "'", byte8 == (byte) -100);
    }

    @Test
    public void BitField0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0857");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        byte byte3 = bitField1.setByte((byte) 1);
        int int5 = bitField1.getValue((int) (short) 13);
        int int7 = bitField1.clear((-21));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-32) + "'", int7 == (-32));
    }

    @Test
    public void BitField0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0858");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        byte byte5 = bitField1.clearByte((byte) -9);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -28 + "'", byte5 == (byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0859");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        short short6 = bitField1.setShortValue((short) (byte) 97, (short) 27);
        short short9 = bitField1.setShortBoolean((short) -128, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 113 + "'", short6 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -107 + "'", short9 == (short) -107);
    }

    @Test
    public void BitField0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0860");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        short short5 = bitField1.setShort((short) (byte) -1);
        boolean boolean7 = bitField1.isAllSet((int) (short) -101);
        boolean boolean9 = bitField1.isAllSet((int) (short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0861");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100);
        int int4 = bitField1.setBoolean((-1), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BitField0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0862");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(65);
    }

    @Test
    public void BitField0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0863");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        byte byte5 = bitField1.clearByte((byte) -61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -62 + "'", byte5 == (byte) -62);
    }

    @Test
    public void BitField0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0864");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        int int7 = bitField1.setBoolean((int) (short) 107, false);
        short short9 = bitField1.getShortValue((short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 5 + "'", short9 == (short) 5);
    }

    @Test
    public void BitField0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0865");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        int int3 = bitField1.getValue((int) (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void BitField0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0866");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.setByte((byte) -37);
        boolean boolean7 = bitField1.isAllSet(107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -37 + "'", byte5 == (byte) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0867");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        short short5 = bitField1.setShort((short) (byte) -1);
        int int7 = bitField1.getRawValue((int) (short) 109);
        byte byte9 = bitField1.clearByte((byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -120 + "'", byte9 == (byte) -120);
    }

    @Test
    public void BitField0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0868");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.getShortRawValue((short) (byte) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
    }

    @Test
    public void BitField0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0869");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        short short6 = bitField1.setShortBoolean((short) 4, false);
        short short9 = bitField1.setShortValue((short) -102, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 4 + "'", short6 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -102 + "'", short9 == (short) -102);
    }

    @Test
    public void BitField0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0870");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortValue((short) (byte) -11, (short) 97);
        short short8 = bitField1.getShortRawValue((short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -27 + "'", short6 == (short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 20 + "'", short8 == (short) 20);
    }

    @Test
    public void BitField0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0871");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        int int6 = bitField1.getValue((-126));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-63) + "'", int6 == (-63));
    }

    @Test
    public void BitField0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0872");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        short short4 = bitField1.setShortValue((short) 116, (short) (byte) 101);
        byte byte7 = bitField1.setByteBoolean((byte) 21, false);
        boolean boolean9 = bitField1.isAllSet((int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 17 + "'", byte7 == (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0873");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        byte byte7 = bitField1.setByteBoolean((byte) -2, false);
        int int9 = bitField1.set(57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -102 + "'", byte7 == (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 125 + "'", int9 == 125);
    }

    @Test
    public void BitField0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0874");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 2);
    }

    @Test
    public void BitField0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0875");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 26, (short) 234);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void BitField0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0876");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getValue(103);
        boolean boolean8 = bitField1.isSet(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103 + "'", int6 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0877");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        boolean boolean3 = bitField1.isSet((int) (short) 122);
        short short5 = bitField1.setShort((short) 20);
        short short7 = bitField1.clearShort((short) (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 31 + "'", short5 == (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 4 + "'", short7 == (short) 4);
    }

    @Test
    public void BitField0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0878");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 223);
        short short3 = bitField1.getShortValue((short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 3 + "'", short3 == (short) 3);
    }

    @Test
    public void BitField0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0879");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        int int7 = bitField1.set((int) (short) 21);
        boolean boolean9 = bitField1.isAllSet(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0880");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short4 = bitField1.setShortValue((short) (byte) -101, (short) (byte) -97);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -101 + "'", short4 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0881");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-22));
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0882");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        int int7 = bitField1.set((int) (byte) 96);
        int int9 = bitField1.getValue((int) (byte) 72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 106 + "'", int7 == 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void BitField0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0883");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.set((int) (byte) -2);
        int int6 = bitField1.setBoolean((int) (short) -98, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-124) + "'", int6 == (-124));
    }

    @Test
    public void BitField0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0884");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 214);
        boolean boolean7 = bitField1.isSet((int) (short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0885");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0886");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(31);
        int int3 = bitField1.clear((int) (byte) 17);
        byte byte5 = bitField1.setByte((byte) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 127 + "'", byte5 == (byte) 127);
    }

    @Test
    public void BitField0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0887");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short4 = bitField1.setShortValue((short) (byte) 1, (short) 117);
        short short6 = bitField1.getShortValue((short) -34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 3 + "'", short6 == (short) 3);
    }

    @Test
    public void BitField0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0888");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int3 = bitField1.getValue(20);
        int int5 = bitField1.set((-118));
        boolean boolean7 = bitField1.isSet((int) (short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0889");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short5 = bitField1.setShort((short) 21);
        int int8 = bitField1.setBoolean((int) (short) 18, true);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115 + "'", int8 == 115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0890");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 101);
        short short9 = bitField1.setShort((short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 31 + "'", short9 == (short) 31);
    }

    @Test
    public void BitField0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0891");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int4 = bitField1.setValue((int) (byte) 101, (int) (byte) 100);
        short short7 = bitField1.setShortBoolean((short) 8, false);
        short short9 = bitField1.clearShort((short) -34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81 + "'", int4 == 81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 8 + "'", short7 == (short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -54 + "'", short9 == (short) -54);
    }

    @Test
    public void BitField0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0892");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 127);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0893");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int6 = bitField1.getValue((int) (short) 10);
        byte byte8 = bitField1.setByte((byte) -120);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -119 + "'", byte8 == (byte) -119);
    }

    @Test
    public void BitField0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0894");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 100);
        byte byte7 = bitField1.setByte((byte) 0);
        int int9 = bitField1.getRawValue(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 110 + "'", byte5 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void BitField0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0895");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        byte byte5 = bitField1.clearByte((byte) 26);
        int int8 = bitField1.setValue(27, 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 16 + "'", byte5 == (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void BitField0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0896");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortValue((short) (byte) -11, (short) 97);
        byte byte9 = bitField1.setByteBoolean((byte) -119, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -27 + "'", short6 == (short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -99 + "'", byte9 == (byte) -99);
    }

    @Test
    public void BitField0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0897");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short6 = bitField1.setShortBoolean((short) -28, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -124 + "'", short6 == (short) -124);
    }

    @Test
    public void BitField0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0898");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 26);
        int int7 = bitField1.getValue((int) (short) -64);
        short short9 = bitField1.clearShort((short) -108);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -112 + "'", short9 == (short) -112);
    }

    @Test
    public void BitField0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0899");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.setShort((short) 19);
        short short8 = bitField1.clearShort((short) (byte) -45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0900");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        byte byte9 = bitField1.setByte((byte) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -101 + "'", byte9 == (byte) -101);
    }

    @Test
    public void BitField0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0901");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        boolean boolean6 = bitField1.isSet(31);
        byte byte9 = bitField1.setByteBoolean((byte) -128, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -27 + "'", byte9 == (byte) -27);
    }

    @Test
    public void BitField0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0902");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        short short3 = bitField1.setShort((short) 109);
        boolean boolean5 = bitField1.isAllSet(62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 111 + "'", short3 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0903");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        short short7 = bitField1.setShortBoolean((short) 26, false);
        short short9 = bitField1.setShort((short) 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 26 + "'", short7 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 117 + "'", short9 == (short) 117);
    }

    @Test
    public void BitField0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0904");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.setByte((byte) -12);
        int int5 = bitField1.set((int) (short) 101);
        boolean boolean7 = bitField1.isAllSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0905");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        short short5 = bitField1.setShort((short) (byte) 31);
        short short7 = bitField1.getShortValue((short) (byte) -34);
        short short9 = bitField1.getShortValue((short) (byte) -120);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -97 + "'", short5 == (short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -49 + "'", short7 == (short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -60 + "'", short9 == (short) -60);
    }

    @Test
    public void BitField0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0906");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        int int3 = bitField1.getRawValue((-98));
        int int5 = bitField1.set(66);
        int int8 = bitField1.setBoolean(64, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8 == 99);
    }

    @Test
    public void BitField0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0907");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        byte byte4 = bitField1.setByteBoolean((byte) 11, true);
        short short6 = bitField1.setShort((short) (byte) -97);
        short short8 = bitField1.getShortRawValue((short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 111 + "'", byte4 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 96 + "'", short8 == (short) 96);
    }

    @Test
    public void BitField0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0908");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        short short4 = bitField1.setShortValue((short) 8, (short) (byte) 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 8 + "'", short4 == (short) 8);
    }

    @Test
    public void BitField0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0909");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.getValue((int) (byte) 0);
        byte byte7 = bitField1.clearByte((byte) 3);
        boolean boolean9 = bitField1.isSet((int) (short) -43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0910");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        int int7 = bitField1.set((int) '4');
        int int9 = bitField1.clear((int) (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 56 + "'", int9 == 56);
    }

    @Test
    public void BitField0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0911");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (short) 20);
        byte byte9 = bitField1.clearByte((byte) -119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -120 + "'", byte9 == (byte) -120);
    }

    @Test
    public void BitField0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0912");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 21, true);
        short short7 = bitField1.setShortValue((short) 1, (short) (byte) 117);
        byte byte9 = bitField1.setByte((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 29 + "'", byte4 == (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 29 + "'", byte9 == (byte) 29);
    }

    @Test
    public void BitField0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0913");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        boolean boolean7 = bitField1.isAllSet((int) (short) -26);
        short short9 = bitField1.clearShort((short) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 122 + "'", short9 == (short) 122);
    }

    @Test
    public void BitField0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0914");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        int int7 = bitField1.getValue(36);
        short short9 = bitField1.setShort((short) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 107 + "'", short9 == (short) 107);
    }

    @Test
    public void BitField0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0915");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        boolean boolean6 = bitField1.isSet(10);
        short short8 = bitField1.getShortRawValue((short) (byte) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 96 + "'", short8 == (short) 96);
    }

    @Test
    public void BitField0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0916");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        byte byte3 = bitField1.setByte((byte) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 101 + "'", byte3 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0917");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        int int6 = bitField1.set((int) (short) 116);
        byte byte8 = bitField1.setByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 117 + "'", int6 == 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 111 + "'", byte8 == (byte) 111);
    }

    @Test
    public void BitField0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0918");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0919");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        boolean boolean7 = bitField1.isAllSet((-2));
        int int9 = bitField1.set(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void BitField0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0920");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        short short6 = bitField1.setShortBoolean((short) (byte) 4, true);
        short short8 = bitField1.setShort((short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 123 + "'", short8 == (short) 123);
    }

    @Test
    public void BitField0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0921");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short3 = bitField1.getShortRawValue((short) (byte) -25);
        short short6 = bitField1.setShortBoolean((short) (byte) 29, true);
        int int8 = bitField1.getRawValue((int) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    }

    @Test
    public void BitField0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0922");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.setShort((short) (byte) -101);
        int int7 = bitField1.getValue((int) (byte) -112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -101 + "'", short5 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0923");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.getRawValue((int) (short) 29);
        int int5 = bitField1.getValue((int) (byte) 97);
        byte byte7 = bitField1.setByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
    }

    @Test
    public void BitField0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0924");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 31);
        int int9 = bitField1.getValue((int) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void BitField0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0925");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        byte byte3 = bitField1.setByte((byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -99 + "'", byte3 == (byte) -99);
    }

    @Test
    public void BitField0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0926");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        short short3 = bitField1.clearShort((short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -101 + "'", short3 == (short) -101);
    }

    @Test
    public void BitField0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0927");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short3 = bitField1.getShortRawValue((short) (byte) -2);
        short short5 = bitField1.clearShort((short) (byte) -1);
        short short7 = bitField1.clearShort((short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 56 + "'", short3 == (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -58 + "'", short5 == (short) -58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -122 + "'", short7 == (short) -122);
    }

    @Test
    public void BitField0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0928");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        byte byte7 = bitField1.setByte((byte) 3);
        int int9 = bitField1.clear((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 3 + "'", byte7 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void BitField0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0929");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.getValue((int) (byte) 96);
        byte byte9 = bitField1.clearByte((byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 20 + "'", byte9 == (byte) 20);
    }

    @Test
    public void BitField0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0930");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        boolean boolean3 = bitField1.isSet((int) (short) 122);
        short short5 = bitField1.setShort((short) 20);
        boolean boolean7 = bitField1.isSet((-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 31 + "'", short5 == (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0931");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.setShort((short) 34);
        int int9 = bitField1.setBoolean(18, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 35 + "'", short6 == (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void BitField0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0932");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        boolean boolean6 = bitField1.isSet((int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void BitField0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0933");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        boolean boolean8 = bitField1.isAllSet((-4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0934");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int6 = bitField1.setValue((int) (byte) 127, (-57));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
    }

    @Test
    public void BitField0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0935");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 100);
        boolean boolean5 = bitField1.isAllSet((int) (short) 116);
        int int7 = bitField1.getRawValue((int) (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
    }

    @Test
    public void BitField0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0936");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 100);
        int int5 = bitField1.set(11);
        boolean boolean7 = bitField1.isSet(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0937");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        byte byte6 = bitField1.clearByte((byte) 107);
        int int8 = bitField1.set((int) (short) -13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void BitField0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0938");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        byte byte6 = bitField1.setByte((byte) -28);
        int int8 = bitField1.getRawValue(88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -27 + "'", byte6 == (byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void BitField0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0939");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        byte byte7 = bitField1.setByteBoolean((byte) 110, false);
        int int9 = bitField1.getRawValue(28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0940");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        short short8 = bitField1.getShortValue((short) -34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 5 + "'", short8 == (short) 5);
    }

    @Test
    public void BitField0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0941");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        byte byte3 = bitField1.clearByte((byte) -1);
        int int5 = bitField1.getValue(115);
        byte byte8 = bitField1.setByteBoolean((byte) -37, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 97 + "'", byte3 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -33 + "'", byte8 == (byte) -33);
    }

    @Test
    public void BitField0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0942");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.setByte((byte) 26);
        short short8 = bitField1.getShortRawValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0943");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.getRawValue(222);
        short short8 = bitField1.setShortValue((short) (byte) 29, (short) (byte) 101);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 31 + "'", short8 == (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0944");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(119);
        short short3 = bitField1.getShortRawValue((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
    }

    @Test
    public void BitField0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0945");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(16);
        boolean boolean3 = bitField1.isAllSet((int) ' ');
        int int5 = bitField1.set(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void BitField0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0946");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 26);
    }

    @Test
    public void BitField0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0947");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        byte byte6 = bitField1.setByteBoolean((byte) 100, true);
        short short9 = bitField1.setShortValue((short) 144, (short) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 145 + "'", short9 == (short) 145);
    }

    @Test
    public void BitField0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0948");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(124);
    }

    @Test
    public void BitField0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0949");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 35);
        short short4 = bitField1.setShortValue((short) -13, (short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -46 + "'", short4 == (short) -46);
    }

    @Test
    public void BitField0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0950");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-124));
    }

    @Test
    public void BitField0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0951");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -7);
    }

    @Test
    public void BitField0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0952");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        short short4 = bitField1.setShortBoolean((short) -31, false);
        short short6 = bitField1.getShortRawValue((short) (byte) -27);
        byte byte8 = bitField1.clearByte((byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -64 + "'", short4 == (short) -64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 33 + "'", short6 == (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 68 + "'", byte8 == (byte) 68);
    }

    @Test
    public void BitField0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0953");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        int int6 = bitField1.setValue((int) (short) -58, 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-58) + "'", int6 == (-58));
    }

    @Test
    public void BitField0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0954");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        int int7 = bitField1.clear((int) (short) 28);
        boolean boolean9 = bitField1.isAllSet(154);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 28 + "'", int7 == 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0955");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        byte byte3 = bitField1.clearByte((byte) 97);
        int int5 = bitField1.clear((int) (byte) -62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-126) + "'", int5 == (-126));
    }

    @Test
    public void BitField0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0956");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short3 = bitField1.setShort((short) -1);
        short short5 = bitField1.getShortRawValue((short) (byte) -111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0957");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        short short6 = bitField1.setShortValue((short) (byte) 97, (short) 27);
        byte byte9 = bitField1.setByteBoolean((byte) -34, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 113 + "'", short6 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -33 + "'", byte9 == (byte) -33);
    }

    @Test
    public void BitField0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0958");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 123);
    }

    @Test
    public void BitField0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0959");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 1);
        int int5 = bitField1.set(0);
        short short7 = bitField1.getShortValue((short) -54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 24 + "'", int5 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void BitField0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0960");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int6 = bitField1.setValue(15, (int) '4');
        int int9 = bitField1.setBoolean((int) (byte) -34, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-54) + "'", int9 == (-54));
    }

    @Test
    public void BitField0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0961");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 110);
        short short9 = bitField1.clearShort((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0962");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        int int6 = bitField1.set(36);
        int int8 = bitField1.clear((int) (short) -46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-64) + "'", int8 == (-64));
    }

    @Test
    public void BitField0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0963");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        int int5 = bitField1.clear((int) (short) -43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0964");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getRawValue(34);
        boolean boolean5 = bitField1.isAllSet((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0965");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short5 = bitField1.setShort((short) 21);
        int int7 = bitField1.clear((int) (byte) -64);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-128) + "'", int7 == (-128));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0966");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.set((int) (byte) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-18) + "'", int5 == (-18));
    }

    @Test
    public void BitField0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0967");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        short short4 = bitField1.setShortValue((short) (byte) 20, (short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
    }

    @Test
    public void BitField0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0968");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) 0);
        short short8 = bitField1.getShortValue((short) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 4 + "'", short8 == (short) 4);
    }

    @Test
    public void BitField0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0969");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        short short3 = bitField1.getShortValue((short) 10);
        int int5 = bitField1.set(106);
        int int8 = bitField1.setBoolean((int) (byte) -12, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 127 + "'", int5 == 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-32) + "'", int8 == (-32));
    }

    @Test
    public void BitField0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0970");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        short short6 = bitField1.setShortValue((short) -31, (short) 34);
        short short8 = bitField1.clearShort((short) (byte) -41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -30 + "'", short6 == (short) -30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -60 + "'", short8 == (short) -60);
    }

    @Test
    public void BitField0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0971");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.setShort((short) 34);
        boolean boolean8 = bitField1.isSet((-101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 35 + "'", short6 == (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0972");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.set(26);
        int int7 = bitField1.set((int) (short) 29);
        int int9 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 58 + "'", int5 == 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 63 + "'", int7 == 63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0973");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 214);
        int int7 = bitField1.clear(36);
        boolean boolean9 = bitField1.isSet((-26));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0974");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int5 = bitField1.clear((-98));
        short short7 = bitField1.getShortRawValue((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-118) + "'", int5 == (-118));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void BitField0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0975");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        int int7 = bitField1.setBoolean(212, false);
        int int9 = bitField1.getValue((int) (byte) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 144 + "'", int7 == 144);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void BitField0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0976");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(126);
        short short3 = bitField1.clearShort((short) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -128 + "'", short3 == (short) -128);
    }

    @Test
    public void BitField0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0977");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(30);
        boolean boolean3 = bitField1.isAllSet(62);
        int int5 = bitField1.getRawValue((-57));
        short short7 = bitField1.clearShort((short) (byte) -119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -127 + "'", short7 == (short) -127);
    }

    @Test
    public void BitField0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0978");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.getShortValue((short) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
    }

    @Test
    public void BitField0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0979");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.getShortRawValue((short) 101);
        short short9 = bitField1.setShortValue((short) 49, (short) -124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 48 + "'", short9 == (short) 48);
    }

    @Test
    public void BitField0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0980");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        boolean boolean8 = bitField1.isAllSet((-97));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0981");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getValue((-124));
        int int9 = bitField1.getRawValue((int) (short) -41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0982");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.set(33);
        int int7 = bitField1.getRawValue(16);
        int int9 = bitField1.getValue(121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void BitField0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0983");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        short short3 = bitField1.setShort((short) (byte) 106);
        boolean boolean5 = bitField1.isAllSet((int) (short) 214);
        short short7 = bitField1.setShort((short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 123 + "'", short3 == (short) 123);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 221 + "'", short7 == (short) 221);
    }

    @Test
    public void BitField0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0984");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.getShortRawValue((short) (byte) 26);
        byte byte7 = bitField1.setByte((byte) 26);
        byte byte9 = bitField1.clearByte((byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 26 + "'", short5 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 27 + "'", byte7 == (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -28 + "'", byte9 == (byte) -28);
    }

    @Test
    public void BitField0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0985");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        boolean boolean6 = bitField1.isSet(26);
        short short9 = bitField1.setShortValue((short) 0, (short) 105);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 97 + "'", short9 == (short) 97);
    }

    @Test
    public void BitField0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0986");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.setByte((byte) -12);
        byte byte6 = bitField1.setByteBoolean((byte) 106, false);
        byte byte8 = bitField1.clearByte((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 96 + "'", byte6 == (byte) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void BitField0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0987");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short4 = bitField1.setShortValue((short) (byte) -101, (short) (byte) -97);
        boolean boolean6 = bitField1.isSet((int) (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -101 + "'", short4 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void BitField0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0988");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        short short5 = bitField1.setShort((short) (byte) -1);
        short short7 = bitField1.clearShort((short) 0);
        short short9 = bitField1.getShortValue((short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 20 + "'", short9 == (short) 20);
    }

    @Test
    public void BitField0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0989");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) 11);
        short short9 = bitField1.clearShort((short) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 5 + "'", short9 == (short) 5);
    }

    @Test
    public void BitField0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0990");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.clearShort((short) -12);
        int int8 = bitField1.setValue((-28), (int) (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -28 + "'", short5 == (short) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void BitField0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0991");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortValue((short) -25);
        int int5 = bitField1.getRawValue((int) (short) -107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -13 + "'", short3 == (short) -13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-108) + "'", int5 == (-108));
    }

    @Test
    public void BitField0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0992");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.clear(5);
        int int8 = bitField1.setValue((-31), 154);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-31) + "'", int8 == (-31));
    }

    @Test
    public void BitField0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0993");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        short short5 = bitField1.getShortRawValue((short) (byte) -128);
        int int7 = bitField1.getValue(223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
    }

    @Test
    public void BitField0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0994");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int3 = bitField1.getValue(20);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0995");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        int int3 = bitField1.getRawValue(88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void BitField0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0996");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.clear(57);
        boolean boolean9 = bitField1.isAllSet(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0997");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-26));
        int int4 = bitField1.setBoolean((int) (short) 97, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BitField0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0998");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        byte byte5 = bitField1.clearByte((byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -30 + "'", byte5 == (byte) -30);
    }

    @Test
    public void BitField0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField0999");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.setShort((short) 121);
        int int5 = bitField1.set(64);
        int int7 = bitField1.getValue((-54));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 121 + "'", short3 == (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 88 + "'", int5 == 88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void BitField1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.BitField1000");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.setShort((short) 116);
        int int9 = bitField1.getRawValue((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 117 + "'", short7 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }
}

