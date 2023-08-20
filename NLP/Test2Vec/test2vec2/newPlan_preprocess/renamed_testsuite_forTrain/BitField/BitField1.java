
package BitField;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitField1 {

    public static boolean debug = false;

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0501");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0502");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0503");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0504");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0505");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0506");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0507");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 214);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0508");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0509");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        boolean boolean3 = bitField1.isSet((int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0510");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0511");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.clearByte((byte) 1);
        short short6 = bitField1.setShortValue((short) 122, (short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 113 + "'", short6 == (short) 113);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0512");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0513");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0514");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0515");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0516");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0517");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0518");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0519");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0520");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0521");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        short short6 = bitField1.setShort((short) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6 == (short) 111);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0522");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0523");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0524");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0525");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0526");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0527");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 127);
        short short4 = bitField1.setShortBoolean((short) (byte) 106, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0528");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        byte byte7 = bitField1.setByteBoolean((byte) 101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 111 + "'", byte7 == (byte) 111);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0529");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0530");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        byte byte3 = bitField1.clearByte((byte) 1);
        short short5 = bitField1.getShortRawValue((short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 24 + "'", short5 == (short) 24);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0531");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0532");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0533");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0534");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0535");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0536");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0537");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        short short7 = bitField1.setShortBoolean((short) 116, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 116 + "'", short7 == (short) 116);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0538");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0539");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0540");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0541");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(36);
        byte byte3 = bitField1.clearByte((byte) -9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -45 + "'", byte3 == (byte) -45);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0542");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0543");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 111);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0544");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0545");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0546");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0547");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0548");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0549");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0550");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0551");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getValue((int) (byte) 106);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0552");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0553");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0554");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int4 = bitField1.setValue((int) (byte) 101, (int) (byte) 100);
        int int6 = bitField1.getValue(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81 + "'", int4 == 81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0555");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 56);
        int int3 = bitField1.set((int) (short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0556");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0557");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0558");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        short short5 = bitField1.getShortRawValue((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0559");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int7 = bitField1.setValue((-118), (int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-128) + "'", int7 == (-128));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0560");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0561");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0562");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0563");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0564");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0565");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0566");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0567");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0568");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0569");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0570");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(158);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0571");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0572");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0573");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        byte byte3 = bitField1.setByte((byte) 0);
        int int5 = bitField1.clear(115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 101 + "'", byte3 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 18 + "'", int5 == 18);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0574");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(8);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0575");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0576");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0577");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0578");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0579");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0580");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int3 = bitField1.set((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0581");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        int int5 = bitField1.getRawValue((int) (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0582");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0583");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0584");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0585");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0586");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0587");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int4 = bitField1.setValue((int) (byte) 101, (int) (byte) 100);
        byte byte6 = bitField1.clearByte((byte) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 81 + "'", int4 == 81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -64 + "'", byte6 == (byte) -64);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0588");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0589");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0590");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0591");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 6);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0592");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0593");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int4 = bitField1.setBoolean(8, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27 + "'", int4 == 27);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0594");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0595");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0596");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0597");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(70);
        int int3 = bitField1.getRawValue(20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0598");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0599");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0600");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 97);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0601");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0602");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0603");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0604");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-58));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0605");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0606");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0607");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0608");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(96);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0609");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0610");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0611");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(123);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0612");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0613");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0614");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0615");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0616");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int4 = bitField1.setBoolean((int) (short) 27, true);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0617");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0618");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0619");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0620");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0621");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        byte byte4 = bitField1.setByteBoolean((byte) -9, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0622");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0623");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 29);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0624");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0625");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        int int6 = bitField1.setBoolean(32, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0626");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0627");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0628");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0629");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0630");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0631");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0632");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        short short6 = bitField1.getShortRawValue((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0633");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0634");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0635");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0636");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -2);
        int int3 = bitField1.set((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0637");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0638");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0639");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0640");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0641");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0642");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0643");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0644");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(17);
        int int4 = bitField1.setBoolean((int) (byte) 117, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0645");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0646");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0647");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        short short3 = bitField1.getShortRawValue((short) 123);
        byte byte5 = bitField1.setByte((byte) 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 113 + "'", short3 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 117 + "'", byte5 == (byte) 117);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0648");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.getRawValue((int) (short) 29);
        int int5 = bitField1.clear(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0649");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0650");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0651");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(4);
        byte byte3 = bitField1.setByte((byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 119 + "'", byte3 == (byte) 119);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0652");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0653");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0654");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0655");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -102);
        int int3 = bitField1.getValue(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0656");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0657");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        byte byte4 = bitField1.setByteBoolean((byte) 11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0658");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0659");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0660");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0661");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0662");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0663");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short4 = bitField1.setShortValue((short) -15, (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -7 + "'", short4 == (short) -7);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0664");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0665");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0666");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0667");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0668");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(36);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0669");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0670");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte3 = bitField1.setByte((byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 107 + "'", byte3 == (byte) 107);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0671");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        short short4 = bitField1.setShortBoolean((short) (byte) 111, true);
        short short7 = bitField1.setShortValue((short) -30, (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 127 + "'", short4 == (short) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -26 + "'", short7 == (short) -26);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0672");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0673");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setValue((int) (short) 28, 0);
        byte byte7 = bitField1.setByteBoolean((byte) -111, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -111 + "'", byte7 == (byte) -111);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0674");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0675");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0676");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0677");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        short short3 = bitField1.setShort((short) (byte) 16);
        byte byte5 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 215 + "'", short3 == (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 8 + "'", byte5 == (byte) 8);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0678");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0679");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        byte byte3 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -34 + "'", byte3 == (byte) -34);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0680");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 34);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0681");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0682");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        int int4 = bitField1.setValue((int) (byte) -41, (-128));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-112) + "'", int4 == (-112));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0683");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0684");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 96);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0685");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0686");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(53);
        short short3 = bitField1.setShort((short) (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 53 + "'", short3 == (short) 53);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0687");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0688");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0689");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0690");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0691");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0692");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0693");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0694");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0695");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0696");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0697");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        byte byte3 = bitField1.setByte((byte) 0);
        int int6 = bitField1.setValue((-37), (int) (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -41 + "'", byte3 == (byte) -41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-33) + "'", int6 == (-33));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0698");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0699");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0700");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0701");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.setShort((short) 121);
        int int6 = bitField1.setValue((int) (byte) -64, 63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 121 + "'", short3 == (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-40) + "'", int6 == (-40));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0702");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0703");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        int int3 = bitField1.set((int) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 223 + "'", int3 == 223);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0704");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0705");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0706");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0707");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0708");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0709");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getRawValue((-40));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-40) + "'", int6 == (-40));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0710");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        short short6 = bitField1.getShortRawValue((short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0711");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0712");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0713");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0714");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0715");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 29);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0716");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        short short4 = bitField1.setShortBoolean((short) 11, true);
        byte byte7 = bitField1.setByteBoolean((byte) 116, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 223 + "'", short4 == (short) 223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -9 + "'", byte7 == (byte) -9);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0717");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(25);
        boolean boolean3 = bitField1.isAllSet((int) (short) 101);
        int int5 = bitField1.set((int) (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0718");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        short short6 = bitField1.setShort((short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -17 + "'", short6 == (short) -17);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0719");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0720");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0721");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0722");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0723");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0724");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getValue((int) (short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0725");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0726");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0727");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 17);
        int int4 = bitField1.setValue((int) (short) 109, (-2));
        int int7 = bitField1.setValue((int) (byte) -112, (int) (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 124 + "'", int4 == 124);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-112) + "'", int7 == (-112));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0728");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0729");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0730");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0731");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0732");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0733");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0734");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(115);
        short short4 = bitField1.setShortValue((short) -13, (short) -7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -15 + "'", short4 == (short) -15);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0735");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.clearShort((short) (byte) 100);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0736");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0737");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0738");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0739");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(52);
        int int3 = bitField1.getValue((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0740");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0741");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0742");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0743");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0744");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0745");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0746");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0747");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0748");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -101);
        int int4 = bitField1.setBoolean((int) (short) 29, true);
        short short7 = bitField1.setShortBoolean((short) 1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-97) + "'", int4 == (-97));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -101 + "'", short7 == (short) -101);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0749");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 53);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0750");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        byte byte4 = bitField1.setByteBoolean((byte) 97, false);
        short short7 = bitField1.setShortValue((short) 100, (short) (byte) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 21 + "'", short7 == (short) 21);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0751");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0752");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(214);
        byte byte3 = bitField1.setByte((byte) -27);
        int int5 = bitField1.clear((int) (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -9 + "'", byte3 == (byte) -9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0753");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(70);
        short short3 = bitField1.clearShort((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 17 + "'", short3 == (short) 17);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0754");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0755");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0756");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0757");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 21);
        short short4 = bitField1.setShortValue((short) (byte) -111, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -107 + "'", short4 == (short) -107);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0758");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0759");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0760");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        boolean boolean3 = bitField1.isSet((int) (byte) 11);
        short short5 = bitField1.setShort((short) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0761");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0762");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0763");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0764");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 11 + "'", short5 == (short) 11);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0765");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0766");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0767");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        int int3 = bitField1.set(33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0768");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -102);
        short short3 = bitField1.clearShort((short) (byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 101 + "'", short3 == (short) 101);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0769");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0770");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0771");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0772");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0773");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0774");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0775");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0776");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0777");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0778");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0779");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0780");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(106);
        short short3 = bitField1.clearShort((short) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -108 + "'", short3 == (short) -108);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0781");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0782");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 117);
        short short3 = bitField1.setShort((short) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -11 + "'", short3 == (short) -11);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0783");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0784");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0785");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0786");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        byte byte3 = bitField1.setByte((byte) 1);
        short short5 = bitField1.clearShort((short) 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 96 + "'", short5 == (short) 96);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0787");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        int int3 = bitField1.clear(33);
        byte byte6 = bitField1.setByteBoolean((byte) -97, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -102 + "'", byte6 == (byte) -102);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0788");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0789");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0790");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        int int3 = bitField1.getValue((int) (short) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0791");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0792");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0793");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0794");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0795");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0796");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0797");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0798");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0799");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0800");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.clearShort((short) 4);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0801");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0802");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0803");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0804");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0805");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0806");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0807");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0808");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        short short3 = bitField1.getShortRawValue((short) 123);
        byte byte6 = bitField1.setByteBoolean((byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 113 + "'", short3 == (short) 113);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0809");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0810");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.set(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0811");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0812");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isSet((int) (short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0813");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-97));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0814");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0815");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0816");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0817");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0818");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0819");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0820");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0821");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0822");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0823");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0824");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0825");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(150);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0826");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        boolean boolean5 = bitField1.isAllSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0827");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0828");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(5);
        short short3 = bitField1.getShortRawValue((short) (byte) -45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0829");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0830");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0831");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0832");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-26));
        short short3 = bitField1.getShortValue((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 49 + "'", short3 == (short) 49);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0833");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 96, (short) (byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 97 + "'", short6 == (short) 97);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0834");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0835");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(30);
        int int3 = bitField1.clear(36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0836");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0837");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0838");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0839");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0840");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0841");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.clearShort((short) (byte) 100);
        int int5 = bitField1.set((int) (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-37) + "'", int5 == (-37));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0842");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0843");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0844");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        short short3 = bitField1.setShort((short) (byte) 10);
        int int6 = bitField1.setValue((int) (short) -49, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -98 + "'", short3 == (short) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 65 + "'", int6 == 65);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0845");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0846");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0847");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getValue((int) (short) -13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0848");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 35);
        short short3 = bitField1.setShort((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 43 + "'", short3 == (short) 43);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0849");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0850");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        short short3 = bitField1.getShortRawValue((short) 111);
        short short5 = bitField1.getShortValue((short) 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 34 + "'", short3 == (short) 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0851");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(26);
        byte byte3 = bitField1.setByte((byte) 96);
        short short5 = bitField1.getShortRawValue((short) 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 122 + "'", byte3 == (byte) 122);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0852");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int4 = bitField1.setValue((int) (short) -128, (int) (byte) 119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0853");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -41);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0854");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0855");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0856");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0857");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0858");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0859");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0860");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0861");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(100);
        int int4 = bitField1.setBoolean((-1), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0862");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(65);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0863");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        byte byte5 = bitField1.clearByte((byte) -61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -62 + "'", byte5 == (byte) -62);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0864");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0865");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        int int3 = bitField1.getValue((int) (short) 31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0866");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0867");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0868");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.getShortRawValue((short) (byte) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0869");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0870");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0871");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        int int6 = bitField1.getValue((-126));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-63) + "'", int6 == (-63));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0872");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0873");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0874");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0875");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 26, (short) 234);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0876");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0877");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0878");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 223);
        short short3 = bitField1.getShortValue((short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 3 + "'", short3 == (short) 3);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0879");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0880");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short4 = bitField1.setShortValue((short) (byte) -101, (short) (byte) -97);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -101 + "'", short4 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0881");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-22));
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0882");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0883");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.set((int) (byte) -2);
        int int6 = bitField1.setBoolean((int) (short) -98, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-124) + "'", int6 == (-124));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0884");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0885");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0886");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(31);
        int int3 = bitField1.clear((int) (byte) 17);
        byte byte5 = bitField1.setByte((byte) 127);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 127 + "'", byte5 == (byte) 127);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0887");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short4 = bitField1.setShortValue((short) (byte) 1, (short) 117);
        short short6 = bitField1.getShortValue((short) -34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 3 + "'", short6 == (short) 3);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0888");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0889");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0890");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0891");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0892");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 127);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0893");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0894");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0895");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0896");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0897");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short6 = bitField1.setShortBoolean((short) -28, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -124 + "'", short6 == (short) -124);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0898");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0899");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0900");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0901");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0902");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        short short3 = bitField1.setShort((short) 109);
        boolean boolean5 = bitField1.isAllSet(62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 111 + "'", short3 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0903");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0904");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0905");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0906");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0907");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0908");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(33);
        short short4 = bitField1.setShortValue((short) 8, (short) (byte) 64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 8 + "'", short4 == (short) 8);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0909");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0910");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0911");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0912");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0913");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0914");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0915");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0916");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        byte byte3 = bitField1.setByte((byte) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 101 + "'", byte3 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0917");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0918");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0919");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0920");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0921");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0922");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0923");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0924");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0925");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        byte byte3 = bitField1.setByte((byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -99 + "'", byte3 == (byte) -99);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0926");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        short short3 = bitField1.clearShort((short) (byte) -5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -101 + "'", short3 == (short) -101);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0927");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0928");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0929");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0930");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0931");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0932");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        boolean boolean6 = bitField1.isSet((int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0933");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0934");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int6 = bitField1.setValue((int) (byte) 127, (-57));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0935");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0936");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0937");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0938");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0939");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0940");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0941");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0942");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0943");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0944");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(119);
        short short3 = bitField1.getShortRawValue((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0945");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(16);
        boolean boolean3 = bitField1.isAllSet((int) ' ');
        int int5 = bitField1.set(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0946");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 26);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0947");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0948");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(124);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0949");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 35);
        short short4 = bitField1.setShortValue((short) -13, (short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -46 + "'", short4 == (short) -46);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0950");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-124));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0951");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -7);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0952");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0953");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        int int6 = bitField1.setValue((int) (short) -58, 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-58) + "'", int6 == (-58));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0954");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0955");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        byte byte3 = bitField1.clearByte((byte) 97);
        int int5 = bitField1.clear((int) (byte) -62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-126) + "'", int5 == (-126));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0956");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short3 = bitField1.setShort((short) -1);
        short short5 = bitField1.getShortRawValue((short) (byte) -111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0957");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0958");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 123);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0959");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0960");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0961");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0962");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0963");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        int int5 = bitField1.clear((int) (short) -43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0964");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int3 = bitField1.getRawValue(34);
        boolean boolean5 = bitField1.isAllSet((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0965");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0966");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.set((int) (byte) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-18) + "'", int5 == (-18));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0967");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        short short4 = bitField1.setShortValue((short) (byte) 20, (short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0968");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0969");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0970");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0971");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0972");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0973");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0974");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0975");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0976");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(126);
        short short3 = bitField1.clearShort((short) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -128 + "'", short3 == (short) -128);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0977");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0978");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -26);
        short short3 = bitField1.getShortValue((short) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0979");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0980");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0981");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0982");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0983");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0984");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0985");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0986");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0987");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(57);
        short short4 = bitField1.setShortValue((short) (byte) -101, (short) (byte) -97);
        boolean boolean6 = bitField1.isSet((int) (short) 121);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -101 + "'", short4 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0988");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0989");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0990");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0991");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortValue((short) -25);
        int int5 = bitField1.getRawValue((int) (short) -107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -13 + "'", short3 == (short) -13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-108) + "'", int5 == (-108));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0992");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0993");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0994");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int3 = bitField1.getValue(20);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0995");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        int int3 = bitField1.getRawValue(88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0996");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0997");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-26));
        int int4 = bitField1.setBoolean((int) (short) 97, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0998");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.set(33);
        byte byte5 = bitField1.clearByte((byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -30 + "'", byte5 == (byte) -30);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test0999");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField1.test1000");
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

