package BitField;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitField0 {

    public static boolean debug = false;

    @Test
    public void BitField0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BitField0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0002");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        int int8 = bitField1.getValue((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0003");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        byte byte9 = bitField1.setByteBoolean((byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void BitField0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0004");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        int int9 = bitField1.clear((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0005");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortBoolean((short) 10, true);
        int int9 = bitField1.clear(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void BitField0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0006");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        short short8 = bitField1.setShortBoolean((short) (byte) 100, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
    }

    @Test
    public void BitField0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0007");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortBoolean((short) 10, true);
        short short9 = bitField1.getShortValue((short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0008");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        int int9 = bitField1.setValue(1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0009");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        short short9 = bitField1.setShortValue((short) (byte) 0, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0010");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0011");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        int int9 = bitField1.set((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void BitField0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0012");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        short short9 = bitField1.setShortValue((short) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0013");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        int int9 = bitField1.setValue((int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void BitField0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0014");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(100);
        int int9 = bitField1.set((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void BitField0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0015");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        int int9 = bitField1.getValue((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0016");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        short short9 = bitField1.setShort((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0017");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0018");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        short short8 = bitField1.setShort((short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void BitField0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0019");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short8 = bitField1.setShortValue((short) (byte) 101, (short) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
    }

    @Test
    public void BitField0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0020");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        byte byte6 = bitField1.setByte((byte) 1);
        int int9 = bitField1.setBoolean(35, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void BitField0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0021");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        short short9 = bitField1.setShortBoolean((short) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0022");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        byte byte9 = bitField1.setByteBoolean((byte) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void BitField0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0023");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(100);
        int int9 = bitField1.clear((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0024");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        byte byte6 = bitField1.setByte((byte) 1);
        int int9 = bitField1.setValue((int) (short) 1, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0025");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        int int8 = bitField1.clear(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void BitField0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0026");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        int int9 = bitField1.clear(34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void BitField0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0027");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        byte byte9 = bitField1.setByteBoolean((byte) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void BitField0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0028");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        int int9 = bitField1.getRawValue((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0029");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        byte byte6 = bitField1.setByte((byte) 1);
        short short8 = bitField1.setShort((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void BitField0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0030");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setValue((int) (short) 11, (int) 'a');
        int int9 = bitField1.getValue((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void BitField0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0031");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        short short8 = bitField1.clearShort((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0032");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 101);
        boolean boolean9 = bitField1.isAllSet((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0033");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        int int9 = bitField1.getValue(34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0034");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setValue((int) (short) 11, (int) 'a');
        short short9 = bitField1.getShortValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0035");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setValue((int) (short) 11, (int) 'a');
        byte byte9 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void BitField0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0036");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        int int9 = bitField1.setValue((int) (short) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void BitField0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0037");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        boolean boolean6 = bitField1.isAllSet(11);
        short short9 = bitField1.setShortValue((short) (byte) -1, (short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0038");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet(100);
        short short9 = bitField1.getShortValue((short) (byte) 101);
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
    public void BitField0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0039");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setValue((int) (short) 11, (int) 'a');
        int int9 = bitField1.getRawValue((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0040");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet(100);
        int int9 = bitField1.getRawValue(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0041");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet(100);
        int int9 = bitField1.getRawValue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0042");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        byte byte6 = bitField1.setByteBoolean((byte) 100, true);
        short short8 = bitField1.clearShort((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void BitField0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0043");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        int int9 = bitField1.clear(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void BitField0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0044");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        byte byte9 = bitField1.setByteBoolean((byte) 100, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 101 + "'", byte9 == (byte) 101);
    }

    @Test
    public void BitField0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0045");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short8 = bitField1.setShortValue((short) 0, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0046");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0047");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) 1);
        int int9 = bitField1.clear(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void BitField0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0048");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        short short9 = bitField1.setShortBoolean((short) (byte) 101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 101 + "'", short9 == (short) 101);
    }

    @Test
    public void BitField0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0049");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        int int8 = bitField1.set((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void BitField0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0050");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int8 = bitField1.setValue(35, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
    }

    @Test
    public void BitField0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0051");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        byte byte9 = bitField1.setByte((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void BitField0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0052");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        short short8 = bitField1.clearShort((short) (byte) 100);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0053");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0054");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        boolean boolean9 = bitField1.isSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0055");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet(100);
        boolean boolean9 = bitField1.isAllSet((int) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0056");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(100);
        int int9 = bitField1.getValue((int) (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0057");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((-1), true);
        int int9 = bitField1.set((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void BitField0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0058");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0059");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 101);
        int int9 = bitField1.set((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void BitField0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0060");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        int int8 = bitField1.getValue((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0061");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short8 = bitField1.setShortValue((short) (byte) -1, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void BitField0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0062");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        int int8 = bitField1.setValue(100, 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void BitField0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0063");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        int int9 = bitField1.clear(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void BitField0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0064");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        byte byte8 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
    }

    @Test
    public void BitField0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0065");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        short short9 = bitField1.getShortRawValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0066");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short7 = bitField1.setShort((short) 5);
        int int9 = bitField1.set((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void BitField0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0067");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        int int8 = bitField1.clear((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0068");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        byte byte9 = bitField1.setByteBoolean((byte) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void BitField0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0069");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        byte byte8 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void BitField0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0070");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        short short9 = bitField1.getShortRawValue((short) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0071");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short7 = bitField1.setShort((short) 5);
        byte byte9 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0072");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        int int8 = bitField1.set(0);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0073");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(0);
        int int9 = bitField1.clear((int) (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void BitField0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0074");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 0, (short) (byte) 10);
        short short9 = bitField1.clearShort((short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
    }

    @Test
    public void BitField0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0075");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0076");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        boolean boolean8 = bitField1.isAllSet((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0077");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        int int9 = bitField1.setBoolean(25, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void BitField0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0078");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        byte byte6 = bitField1.setByte((byte) 1);
        short short8 = bitField1.getShortRawValue((short) (byte) 101);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0079");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.clearByte((byte) 100);
        short short8 = bitField1.setShortValue((short) 101, (short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 109 + "'", short8 == (short) 109);
    }

    @Test
    public void BitField0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0080");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0081");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        byte byte8 = bitField1.clearByte((byte) 1);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0082");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((-1), true);
        boolean boolean9 = bitField1.isAllSet((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0083");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        int int9 = bitField1.setBoolean(0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0084");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int6 = bitField1.getValue((int) (short) 10);
        int int8 = bitField1.clear((int) (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void BitField0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0085");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortBoolean((short) 10, true);
        int int9 = bitField1.getValue(53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0086");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        int int8 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0087");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        int int9 = bitField1.setValue((int) '4', (int) (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void BitField0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0088");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.getShortRawValue((short) 101);
        int int8 = bitField1.getValue(34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0089");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.getShortRawValue((short) 101);
        boolean boolean8 = bitField1.isSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0090");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        boolean boolean6 = bitField1.isAllSet(11);
        short short8 = bitField1.getShortValue((short) (byte) 101);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0091");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        int int8 = bitField1.getRawValue(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0092");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        boolean boolean7 = bitField1.isSet(0);
        short short9 = bitField1.getShortRawValue((short) (byte) 100);
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
    public void BitField0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0093");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        int int5 = bitField1.clear(24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void BitField0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0094");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) 11);
        boolean boolean9 = bitField1.isSet((int) (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0095");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        short short7 = bitField1.getShortRawValue((short) -1);
        int int9 = bitField1.clear((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void BitField0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0096");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        boolean boolean6 = bitField1.isSet((int) (short) 20);
        byte byte8 = bitField1.setByte((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
    }

    @Test
    public void BitField0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0097");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortBoolean((short) 10, true);
        int int9 = bitField1.getValue((int) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0098");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        int int9 = bitField1.set((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void BitField0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0099");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        int int6 = bitField1.set(24);
        int int9 = bitField1.setBoolean((int) (short) 11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0100");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        int int8 = bitField1.setBoolean((int) (short) 10, false);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0101");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        boolean boolean6 = bitField1.isAllSet(11);
        short short8 = bitField1.setShort((short) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 27 + "'", short8 == (short) 27);
    }

    @Test
    public void BitField0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0102");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        short short8 = bitField1.clearShort((short) 5);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 4 + "'", short8 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0103");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0104");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        short short5 = bitField1.getShortValue((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 5 + "'", short5 == (short) 5);
    }

    @Test
    public void BitField0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0105");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        byte byte9 = bitField1.setByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void BitField0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0106");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        short short7 = bitField1.setShortBoolean((short) (byte) -1, true);
        boolean boolean9 = bitField1.isSet((int) (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0107");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0108");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0109");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        byte byte9 = bitField1.setByteBoolean((byte) 107, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 107 + "'", byte9 == (byte) 107);
    }

    @Test
    public void BitField0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0110");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        short short9 = bitField1.setShortBoolean((short) 27, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 27 + "'", short9 == (short) 27);
    }

    @Test
    public void BitField0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0111");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        int int8 = bitField1.getRawValue((int) (short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0112");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 10, (short) 100);
        byte byte9 = bitField1.setByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void BitField0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0113");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        int int8 = bitField1.getRawValue(27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0114");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((-1), true);
        int int9 = bitField1.clear((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void BitField0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0115");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0116");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.getRawValue((int) (byte) 10);
        boolean boolean9 = bitField1.isSet((-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0117");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        int int7 = bitField1.set((int) (short) 21);
        boolean boolean9 = bitField1.isAllSet((int) (byte) 1);
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
    public void BitField0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0118");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        short short9 = bitField1.setShortBoolean((short) 1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0119");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        short short7 = bitField1.getShortValue((short) -1);
        int int9 = bitField1.getRawValue(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void BitField0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0120");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        short short9 = bitField1.setShortBoolean((short) (byte) 107, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 107 + "'", short9 == (short) 107);
    }

    @Test
    public void BitField0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0121");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        short short8 = bitField1.getShortValue((short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0122");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int6 = bitField1.getValue((int) (short) 10);
        int int8 = bitField1.getRawValue(34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0123");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        short short8 = bitField1.setShort((short) 20);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 21 + "'", short8 == (short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0124");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        int int9 = bitField1.getRawValue((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0125");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        int int7 = bitField1.set((int) (short) 21);
        boolean boolean9 = bitField1.isAllSet((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0126");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        boolean boolean9 = bitField1.isSet(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0127");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 101);
        int int9 = bitField1.set(27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void BitField0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0128");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        byte byte9 = bitField1.setByteBoolean((byte) -2, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -2 + "'", byte9 == (byte) -2);
    }

    @Test
    public void BitField0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0129");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0130");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        byte byte7 = bitField1.setByte((byte) -1);
        short short9 = bitField1.clearShort((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0131");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) 1);
        short short9 = bitField1.getShortRawValue((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0132");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        byte byte7 = bitField1.setByte((byte) -1);
        int int9 = bitField1.clear((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void BitField0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0133");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 10, (short) 100);
        int int9 = bitField1.getRawValue(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0134");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        short short8 = bitField1.clearShort((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0135");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int8 = bitField1.setValue((int) (byte) 1, (int) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0136");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) 11);
        boolean boolean9 = bitField1.isSet((int) (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0137");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        short short8 = bitField1.setShortBoolean((short) (byte) 26, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 26 + "'", short8 == (short) 26);
    }

    @Test
    public void BitField0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0138");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        boolean boolean8 = bitField1.isAllSet((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0139");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int4 = bitField1.setValue((-1), 0);
        int int6 = bitField1.set(1);
        short short9 = bitField1.setShortBoolean((short) 100, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-28) + "'", int4 == (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void BitField0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0140");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short8 = bitField1.setShortValue((short) (byte) -2, (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void BitField0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0141");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        int int7 = bitField1.clear((int) (short) -1);
        short short9 = bitField1.getShortRawValue((short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0142");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        int int7 = bitField1.clear((int) (short) -1);
        int int9 = bitField1.set(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void BitField0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0143");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 0, (short) (byte) 10);
        int int9 = bitField1.set((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void BitField0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0144");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        byte byte8 = bitField1.clearByte((byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void BitField0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0145");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        byte byte8 = bitField1.setByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void BitField0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0146");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        int int6 = bitField1.setValue((int) (short) 5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0147");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        short short9 = bitField1.setShortValue((short) -1, (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0148");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        int int7 = bitField1.set((int) (short) 21);
        int int9 = bitField1.getValue(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0149");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (byte) -2);
        short short9 = bitField1.getShortValue((short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0150");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int5 = bitField1.clear((int) (short) -1);
        int int7 = bitField1.clear(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0151");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet(100);
        byte byte9 = bitField1.clearByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 26 + "'", byte9 == (byte) 26);
    }

    @Test
    public void BitField0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0152");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        byte byte9 = bitField1.setByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void BitField0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0153");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        int int9 = bitField1.setValue((int) (byte) 101, (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void BitField0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0154");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int6 = bitField1.getValue((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0155");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        int int6 = bitField1.set((int) (short) 5);
        short short8 = bitField1.clearShort((short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0156");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        short short7 = bitField1.getShortValue((short) -1);
        boolean boolean9 = bitField1.isSet((-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0157");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte7 = bitField1.clearByte((byte) -2);
        int int9 = bitField1.getRawValue(96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -2 + "'", byte7 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0158");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        short short9 = bitField1.setShortBoolean((short) 214, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 214 + "'", short9 == (short) 214);
    }

    @Test
    public void BitField0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0159");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.clearShort((short) (byte) 107);
        byte byte9 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void BitField0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0160");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        short short7 = bitField1.setShortBoolean((short) (byte) -1, true);
        short short9 = bitField1.getShortValue((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void BitField0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0161");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        short short7 = bitField1.setShortBoolean((short) (byte) -1, true);
        int int9 = bitField1.getValue((int) (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
    }

    @Test
    public void BitField0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0162");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 11);
        int int9 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0163");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isSet((int) (byte) -1);
        short short9 = bitField1.getShortRawValue((short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0164");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.getShortRawValue((short) (byte) 10);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0165");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.clearByte((byte) -1);
        boolean boolean8 = bitField1.isSet((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -25 + "'", byte6 == (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0166");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((int) (short) 5, true);
        int int9 = bitField1.set(16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 116 + "'", int9 == 116);
    }

    @Test
    public void BitField0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0167");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        int int7 = bitField1.clear((int) (short) -1);
        short short9 = bitField1.setShort((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 107 + "'", short9 == (short) 107);
    }

    @Test
    public void BitField0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0168");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int5 = bitField1.clear((int) (short) -1);
        byte byte8 = bitField1.setByteBoolean((byte) 107, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void BitField0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0169");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        boolean boolean8 = bitField1.isAllSet(107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0170");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        short short9 = bitField1.getShortValue((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0171");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(100);
        int int9 = bitField1.clear((-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-28) + "'", int9 == (-28));
    }

    @Test
    public void BitField0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0172");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        boolean boolean8 = bitField1.isAllSet(101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0173");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        short short8 = bitField1.setShort((short) 101);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0174");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        int int8 = bitField1.set(24);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0175");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        short short7 = bitField1.getShortValue((short) -1);
        int int9 = bitField1.clear((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
    }

    @Test
    public void BitField0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0176");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        int int6 = bitField1.set((int) (short) 5);
        byte byte8 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void BitField0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0177");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        short short6 = bitField1.setShortBoolean((short) 4, false);
        short short9 = bitField1.setShortBoolean((short) (byte) -2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 4 + "'", short6 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void BitField0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0178");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) ' ');
    }

    @Test
    public void BitField0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0179");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        short short7 = bitField1.setShortBoolean((short) (byte) -1, true);
        int int9 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0180");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setValue((int) (short) 11, (int) 'a');
        int int9 = bitField1.set(96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void BitField0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0181");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 117);
    }

    @Test
    public void BitField0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0182");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        boolean boolean7 = bitField1.isSet(0);
        short short9 = bitField1.getShortRawValue((short) 5);
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
    public void BitField0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0183");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int7 = bitField1.setBoolean(103, false);
        int int9 = bitField1.getValue((int) (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void BitField0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0184");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0185");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.getRawValue(1);
        int int8 = bitField1.getValue((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0186");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int6 = bitField1.getValue((int) (byte) -1);
        boolean boolean8 = bitField1.isAllSet(53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0187");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        int int9 = bitField1.getRawValue((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0188");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        boolean boolean9 = bitField1.isSet((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0189");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        boolean boolean7 = bitField1.isSet(53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0190");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.setByte((byte) 11);
        byte byte9 = bitField1.setByte((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void BitField0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0191");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short5 = bitField1.setShort((short) 21);
        short short7 = bitField1.getShortValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void BitField0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0192");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        boolean boolean8 = bitField1.isSet(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0193");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        int int9 = bitField1.getRawValue(36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0194");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        short short9 = bitField1.getShortRawValue((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0195");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        int int8 = bitField1.getRawValue((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0196");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0197");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        short short8 = bitField1.getShortValue((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0198");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        short short7 = bitField1.setShortBoolean((short) (byte) -1, true);
        byte byte9 = bitField1.setByte((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0199");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        byte byte8 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void BitField0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0200");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0201");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        int int8 = bitField1.setValue((int) (short) 100, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void BitField0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0202");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        boolean boolean6 = bitField1.isSet((int) (short) 20);
        byte byte9 = bitField1.setByteBoolean((byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -2 + "'", byte9 == (byte) -2);
    }

    @Test
    public void BitField0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0203");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 101);
        short short9 = bitField1.clearShort((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void BitField0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0204");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short7 = bitField1.setShort((short) 5);
        boolean boolean9 = bitField1.isSet((int) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0205");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.setByte((byte) -2);
        int int8 = bitField1.getRawValue(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0206");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int4 = bitField1.setValue(0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void BitField0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0207");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set(24);
        short short7 = bitField1.getShortRawValue((short) (byte) 111);
        short short9 = bitField1.setShort((short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 215 + "'", short9 == (short) 215);
    }

    @Test
    public void BitField0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0208");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortBoolean((short) (byte) 101, false);
        short short8 = bitField1.clearShort((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0209");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.setByte((byte) -2);
        short short8 = bitField1.setShort((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void BitField0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0210");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        boolean boolean7 = bitField1.isAllSet(24);
        short short9 = bitField1.setShort((short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void BitField0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0211");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        byte byte9 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void BitField0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0212");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        boolean boolean7 = bitField1.isAllSet((int) (byte) 0);
        short short9 = bitField1.getShortRawValue((short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0213");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.clearShort((short) (byte) 107);
        short short9 = bitField1.clearShort((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0214");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        byte byte9 = bitField1.setByte((byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 107 + "'", byte9 == (byte) 107);
    }

    @Test
    public void BitField0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0215");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        int int6 = bitField1.setBoolean(103, false);
        int int9 = bitField1.setValue(15, 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115 + "'", int9 == 115);
    }

    @Test
    public void BitField0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0216");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        byte byte6 = bitField1.setByteBoolean((byte) 107, true);
        boolean boolean8 = bitField1.isAllSet(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0217");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        boolean boolean6 = bitField1.isSet(0);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0218");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        short short5 = bitField1.setShort((short) (byte) -1);
        int int8 = bitField1.setValue((int) (short) 9, 222);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
    }

    @Test
    public void BitField0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0219");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        boolean boolean6 = bitField1.isSet((int) (short) 20);
        short short8 = bitField1.setShort((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void BitField0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0220");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int6 = bitField1.getValue((int) (short) 10);
        int int9 = bitField1.setBoolean(115, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 114 + "'", int9 == 114);
    }

    @Test
    public void BitField0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0221");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.set((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void BitField0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0222");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        int int6 = bitField1.set(24);
        int int9 = bitField1.setValue(0, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0223");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        int int9 = bitField1.clear(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0224");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        byte byte6 = bitField1.setByteBoolean((byte) 100, true);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0225");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        short short5 = bitField1.setShort((short) (byte) -1);
        boolean boolean7 = bitField1.isSet((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0226");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        short short6 = bitField1.setShortBoolean((short) 4, false);
        int int9 = bitField1.setBoolean(100, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 4 + "'", short6 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void BitField0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0227");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        short short9 = bitField1.setShortValue((short) 4, (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 5 + "'", short9 == (short) 5);
    }

    @Test
    public void BitField0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0228");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) (byte) 101);
        short short8 = bitField1.setShortValue((short) (byte) 26, (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 18 + "'", short8 == (short) 18);
    }

    @Test
    public void BitField0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0229");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.set(33);
        short short8 = bitField1.setShortValue((short) -26, (short) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void BitField0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0230");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        boolean boolean7 = bitField1.isSet(0);
        int int9 = bitField1.set((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void BitField0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0231");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isSet((int) (byte) -1);
        short short9 = bitField1.getShortValue((short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0232");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short6 = bitField1.setShortValue((short) 101, (short) -1);
        byte byte8 = bitField1.clearByte((byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 101 + "'", short6 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 106 + "'", byte8 == (byte) 106);
    }

    @Test
    public void BitField0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0233");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        int int8 = bitField1.getRawValue(57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void BitField0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0234");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        boolean boolean7 = bitField1.isAllSet((-2));
        short short9 = bitField1.getShortValue((short) (byte) -1);
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
    public void BitField0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0235");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        byte byte6 = bitField1.setByteBoolean((byte) 107, true);
        byte byte9 = bitField1.setByteBoolean((byte) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void BitField0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0236");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int6 = bitField1.setValue((int) (short) 21, (int) (short) 100);
        short short9 = bitField1.setShortValue((short) 18, (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 19 + "'", short9 == (short) 19);
    }

    @Test
    public void BitField0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0237");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        byte byte9 = bitField1.setByteBoolean((byte) 106, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 107 + "'", byte9 == (byte) 107);
    }

    @Test
    public void BitField0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0238");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        boolean boolean6 = bitField1.isSet(10);
        short short8 = bitField1.setShort((short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
    }

    @Test
    public void BitField0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0239");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        short short6 = bitField1.getShortRawValue((short) (byte) 101);
        boolean boolean8 = bitField1.isSet((int) (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0240");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int5 = bitField1.set(33);
        int int7 = bitField1.getRawValue(16);
        boolean boolean9 = bitField1.isSet(107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0241");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.setByte((byte) 26);
        byte byte8 = bitField1.setByte((byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void BitField0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0242");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 11);
        short short9 = bitField1.clearShort((short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 116 + "'", short9 == (short) 116);
    }

    @Test
    public void BitField0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0243");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.clearByte((byte) 11);
        int int8 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0244");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        short short7 = bitField1.setShort((short) 10);
        int int9 = bitField1.clear((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void BitField0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0245");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        boolean boolean7 = bitField1.isSet(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0246");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        int int8 = bitField1.getRawValue((-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0247");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        boolean boolean7 = bitField1.isAllSet(24);
        int int9 = bitField1.clear((int) (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26 + "'", int9 == 26);
    }

    @Test
    public void BitField0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0248");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int5 = bitField1.clear((int) (short) -1);
        int int8 = bitField1.setValue(0, 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void BitField0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0249");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        int int7 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0250");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        int int6 = bitField1.set((int) (short) 5);
        short short8 = bitField1.clearShort((short) (byte) -1);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0251");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        short short8 = bitField1.clearShort((short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 97 + "'", short8 == (short) 97);
    }

    @Test
    public void BitField0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0252");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.clearByte((byte) -2);
        short short9 = bitField1.setShortBoolean((short) (byte) -1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void BitField0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0253");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int6 = bitField1.setValue((int) (short) 21, (int) (short) 100);
        byte byte9 = bitField1.setByteBoolean((byte) -25, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -25 + "'", byte9 == (byte) -25);
    }

    @Test
    public void BitField0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0254");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 101);
        int int7 = bitField1.clear((-28));
        short short9 = bitField1.setShort((short) (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-28) + "'", int7 == (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -25 + "'", short9 == (short) -25);
    }

    @Test
    public void BitField0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0255");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.clearByte((byte) 100);
        int int7 = bitField1.clear((int) (short) 5);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0256");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short8 = bitField1.setShortValue((short) 117, (short) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 117 + "'", short8 == (short) 117);
    }

    @Test
    public void BitField0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0257");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        byte byte9 = bitField1.setByte((byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 17 + "'", byte9 == (byte) 17);
    }

    @Test
    public void BitField0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0258");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.set(34);
        int int9 = bitField1.getValue((int) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0259");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0260");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        int int9 = bitField1.clear(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
    }

    @Test
    public void BitField0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0261");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isAllSet((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0262");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) 1);
        int int9 = bitField1.getValue(115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0263");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        boolean boolean9 = bitField1.isAllSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0264");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        int int8 = bitField1.set(100);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0265");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int8 = bitField1.setValue((int) (short) 117, 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 117 + "'", int8 == 117);
    }

    @Test
    public void BitField0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0266");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short7 = bitField1.setShort((short) 5);
        boolean boolean9 = bitField1.isSet(102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0267");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int5 = bitField1.clear((int) (short) -1);
        short short8 = bitField1.setShortValue((short) 11, (short) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 107 + "'", short8 == (short) 107);
    }

    @Test
    public void BitField0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0268");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((int) (short) 5, true);
        byte byte9 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -101 + "'", byte9 == (byte) -101);
    }

    @Test
    public void BitField0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0269");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0270");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 101);
        int int9 = bitField1.getValue(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0271");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.set(34);
        int int9 = bitField1.clear((int) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26 + "'", int9 == 26);
    }

    @Test
    public void BitField0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0272");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        byte byte4 = bitField1.setByteBoolean((byte) 11, true);
        short short7 = bitField1.setShortValue((short) (byte) 111, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 111 + "'", byte4 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 15 + "'", short7 == (short) 15);
    }

    @Test
    public void BitField0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0273");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        int int9 = bitField1.setBoolean((int) '4', false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void BitField0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0274");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 101);
        boolean boolean9 = bitField1.isAllSet((int) (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0275");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        int int8 = bitField1.getRawValue((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void BitField0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0276");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.setByte((byte) 11);
        int int9 = bitField1.setValue((int) (byte) 106, 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 106 + "'", int9 == 106);
    }

    @Test
    public void BitField0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0277");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortValue((short) 4, (short) (byte) 107);
        int int8 = bitField1.getValue(21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 214 + "'", short6 == (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void BitField0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0278");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set(24);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        int int9 = bitField1.set(26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void BitField0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0279");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(114);
    }

    @Test
    public void BitField0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0280");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet(0);
        short short8 = bitField1.setShort((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void BitField0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0281");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        short short5 = bitField1.setShort((short) (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -25 + "'", short5 == (short) -25);
    }

    @Test
    public void BitField0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0282");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(3);
        int int3 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BitField0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0283");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        int int6 = bitField1.setBoolean(103, false);
        int int8 = bitField1.getRawValue((int) (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 214 + "'", int8 == 214);
    }

    @Test
    public void BitField0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0284");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.clear(26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0285");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        boolean boolean9 = bitField1.isSet((int) (short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0286");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) 100);
        byte byte8 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void BitField0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0287");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0288");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0289");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue(24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0290");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isSet((int) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0291");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        int int7 = bitField1.setBoolean(100, false);
        int int9 = bitField1.set((int) (short) 223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 223 + "'", int9 == 223);
    }

    @Test
    public void BitField0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0292");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.getShortValue((short) 11);
        short short9 = bitField1.setShort((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 17 + "'", short9 == (short) 17);
    }

    @Test
    public void BitField0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0293");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.setShort((short) (byte) -1);
        int int9 = bitField1.set((int) (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void BitField0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0294");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        int int7 = bitField1.clear((int) (short) -1);
        int int9 = bitField1.set((int) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void BitField0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0295");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        short short3 = bitField1.getShortRawValue((short) 0);
        int int5 = bitField1.getRawValue((int) 'a');
        boolean boolean7 = bitField1.isSet((int) (byte) -1);
        byte byte9 = bitField1.setByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 26 + "'", byte9 == (byte) 26);
    }

    @Test
    public void BitField0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0296");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int6 = bitField1.setBoolean(11, false);
        int int8 = bitField1.getValue(116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0297");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.getShortRawValue((short) 101);
        int int8 = bitField1.clear(28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
    }

    @Test
    public void BitField0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0298");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short8 = bitField1.setShortValue((short) -26, (short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -26 + "'", short8 == (short) -26);
    }

    @Test
    public void BitField0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0299");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.clearByte((byte) 11);
        int int8 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0300");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        short short6 = bitField1.setShortValue((short) 10, (short) (byte) 10);
        int int8 = bitField1.set((int) (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
    }

    @Test
    public void BitField0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0301");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        int int8 = bitField1.set(21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
    }

    @Test
    public void BitField0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0302");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        short short6 = bitField1.setShort((short) (byte) 101);
        int int8 = bitField1.set(28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 101 + "'", short6 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 125 + "'", int8 == 125);
    }

    @Test
    public void BitField0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0303");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        int int6 = bitField1.set(36);
        short short9 = bitField1.setShortBoolean((short) (byte) -25, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0304");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) 0);
        int int8 = bitField1.set(15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 111 + "'", int8 == 111);
    }

    @Test
    public void BitField0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0305");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortBoolean((short) (byte) 10, false);
        short short9 = bitField1.getShortValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0306");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        int int6 = bitField1.set(36);
        int int8 = bitField1.set(25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void BitField0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0307");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.clearByte((byte) 11);
        int int8 = bitField1.set(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void BitField0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0308");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        short short6 = bitField1.setShortBoolean((short) 4, false);
        byte byte8 = bitField1.setByte((byte) 100);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 4 + "'", short6 == (short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 101 + "'", byte8 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0309");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int7 = bitField1.set((int) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void BitField0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0310");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        byte byte6 = bitField1.setByteBoolean((byte) 107, true);
        short short8 = bitField1.getShortRawValue((short) 117);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0311");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.clearByte((byte) -2);
        int int8 = bitField1.getValue((-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0312");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.clearByte((byte) 11);
        short short8 = bitField1.setShort((short) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 3 + "'", byte6 == (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void BitField0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0313");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        byte byte7 = bitField1.clearByte((byte) 0);
        short short9 = bitField1.clearShort((short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 116 + "'", short9 == (short) 116);
    }

    @Test
    public void BitField0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0314");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) 1);
        short short9 = bitField1.setShort((short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void BitField0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0315");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        short short7 = bitField1.getShortRawValue((short) 26);
        int int9 = bitField1.set((int) (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
    }

    @Test
    public void BitField0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0316");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int7 = bitField1.setValue(36, (-2));
        boolean boolean9 = bitField1.isSet((int) (byte) 106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0317");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        boolean boolean5 = bitField1.isAllSet(20);
        byte byte8 = bitField1.setByteBoolean((byte) 0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
    }

    @Test
    public void BitField0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0318");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        int int7 = bitField1.set(214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 214 + "'", int7 == 214);
    }

    @Test
    public void BitField0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0319");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        short short6 = bitField1.setShort((short) 215);
        int int8 = bitField1.getValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 215 + "'", short6 == (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0320");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) -25);
        short short8 = bitField1.getShortValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -26 + "'", short6 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0321");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.clear(57);
        byte byte9 = bitField1.setByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0322");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int7 = bitField1.setBoolean((int) (byte) 106, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0323");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        byte byte8 = bitField1.setByte((byte) 11);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0324");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) (byte) 101);
        int int8 = bitField1.setValue((int) ' ', (int) (short) -26);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0325");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (byte) -2);
        short short9 = bitField1.setShort((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0326");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        short short6 = bitField1.setShortValue((short) (byte) -1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -25 + "'", short6 == (short) -25);
    }

    @Test
    public void BitField0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0327");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        short short6 = bitField1.setShortValue((short) -1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -12 + "'", short6 == (short) -12);
    }

    @Test
    public void BitField0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0328");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.getRawValue((int) (byte) 10);
        boolean boolean9 = bitField1.isSet((int) (short) 116);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0329");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        byte byte3 = bitField1.clearByte((byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void BitField0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0330");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0331");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        short short5 = bitField1.setShort((short) 21);
        short short7 = bitField1.setShort((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 117 + "'", short5 == (short) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
    }

    @Test
    public void BitField0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0332");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 10, (short) 100);
        short short9 = bitField1.setShort((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0333");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.clearShort((short) (byte) -2);
        short short5 = bitField1.getShortValue((short) 97);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -26 + "'", short3 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0334");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        short short6 = bitField1.setShortValue((short) 97, (short) 1);
        int int8 = bitField1.set((int) (short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 99 + "'", short6 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void BitField0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0335");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int6 = bitField1.setValue((int) (short) 21, (int) (short) 100);
        short short8 = bitField1.getShortRawValue((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0336");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        byte byte8 = bitField1.clearByte((byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void BitField0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0337");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        short short8 = bitField1.setShort((short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -101 + "'", short8 == (short) -101);
    }

    @Test
    public void BitField0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0338");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        int int8 = bitField1.clear(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void BitField0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0339");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        short short7 = bitField1.getShortRawValue((short) -1);
        short short9 = bitField1.clearShort((short) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 26 + "'", short9 == (short) 26);
    }

    @Test
    public void BitField0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0340");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        byte byte6 = bitField1.setByteBoolean((byte) 0, true);
        short short8 = bitField1.getShortRawValue((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void BitField0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0341");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        int int5 = bitField1.getRawValue(1);
        short short8 = bitField1.setShortBoolean((short) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0342");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int6 = bitField1.setValue((int) (short) 21, (int) (short) 100);
        int int8 = bitField1.getValue((int) (short) 28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0343");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        boolean boolean3 = bitField1.isSet((int) (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0344");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        short short5 = bitField1.getShortRawValue((short) (byte) 26);
        short short8 = bitField1.setShortBoolean((short) 109, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 26 + "'", short5 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void BitField0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0345");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 101);
        int int9 = bitField1.set((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0346");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet(32);
        int int9 = bitField1.set((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
    }

    @Test
    public void BitField0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0347");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        short short3 = bitField1.setShort((short) 109);
        int int5 = bitField1.clear(103);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 111 + "'", short3 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0348");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short6 = bitField1.setShortValue((short) 101, (short) -1);
        int int9 = bitField1.setBoolean((int) (short) -2, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 101 + "'", short6 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void BitField0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0349");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        int int3 = bitField1.clear(0);
        boolean boolean5 = bitField1.isSet((int) (byte) 0);
        byte byte8 = bitField1.setByteBoolean((byte) -2, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
    }

    @Test
    public void BitField0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0350");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        int int9 = bitField1.setValue((int) (byte) 0, (int) (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void BitField0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0351");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte6 = bitField1.clearByte((byte) -1);
        int int8 = bitField1.getRawValue((int) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -25 + "'", byte6 == (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void BitField0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0352");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        int int4 = bitField1.setBoolean((int) (byte) 3, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BitField0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0353");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int6 = bitField1.getValue((int) (byte) -1);
        int int8 = bitField1.getValue((int) (short) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void BitField0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0354");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        int int6 = bitField1.clear(25);
        int int9 = bitField1.setBoolean((int) (byte) 10, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void BitField0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0355");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        byte byte7 = bitField1.clearByte((byte) 1);
        short short9 = bitField1.getShortRawValue((short) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0356");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        int int8 = bitField1.set((int) (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-25) + "'", int8 == (-25));
    }

    @Test
    public void BitField0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0357");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        short short8 = bitField1.getShortValue((short) 9);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0358");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int5 = bitField1.getRawValue(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void BitField0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0359");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short6 = bitField1.clearShort((short) (byte) -25);
        short short8 = bitField1.getShortValue((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -26 + "'", short6 == (short) -26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0360");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) -25);
        short short9 = bitField1.clearShort((short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -27 + "'", byte7 == (byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 212 + "'", short9 == (short) 212);
    }

    @Test
    public void BitField0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0361");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        short short6 = bitField1.setShort((short) (byte) 101);
        byte byte9 = bitField1.setByteBoolean((byte) 17, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 101 + "'", short6 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 117 + "'", byte9 == (byte) 117);
    }

    @Test
    public void BitField0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0362");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        short short6 = bitField1.setShortBoolean((short) (byte) 101, false);
        boolean boolean8 = bitField1.isSet(62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BitField0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0363");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        short short8 = bitField1.getShortValue((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0364");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        int int6 = bitField1.set(24);
        int int9 = bitField1.setBoolean((-4), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void BitField0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0365");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        short short7 = bitField1.setShortBoolean((short) 26, false);
        int int9 = bitField1.set(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 26 + "'", short7 == (short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 117 + "'", int9 == 117);
    }

    @Test
    public void BitField0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0366");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        byte byte4 = bitField1.setByteBoolean((byte) 0, false);
        int int6 = bitField1.set(36);
        short short8 = bitField1.getShortValue((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 13 + "'", short8 == (short) 13);
    }

    @Test
    public void BitField0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0367");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int7 = bitField1.setBoolean((int) (short) 27, false);
        boolean boolean9 = bitField1.isAllSet((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0368");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (byte) -2);
        int int9 = bitField1.set(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void BitField0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0369");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short6 = bitField1.getShortValue((short) 1);
        byte byte8 = bitField1.clearByte((byte) 100);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0370");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.setShort((short) 19);
        short short8 = bitField1.getShortValue((short) 13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 6 + "'", short8 == (short) 6);
    }

    @Test
    public void BitField0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0371");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        int int3 = bitField1.getRawValue((int) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void BitField0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0372");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.setShort((short) 0);
        short short7 = bitField1.getShortValue((short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void BitField0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0373");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 20);
        int int3 = bitField1.getRawValue((int) (short) -1);
        int int6 = bitField1.setValue(15, (int) '4');
        int int8 = bitField1.set(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void BitField0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0374");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        int int6 = bitField1.setBoolean((int) (short) 1, false);
        boolean boolean8 = bitField1.isAllSet((int) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0375");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.setShort((short) (byte) 10);
        boolean boolean9 = bitField1.isSet((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0376");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        short short7 = bitField1.getShortRawValue((short) -1);
        int int9 = bitField1.clear(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void BitField0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0377");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        short short3 = bitField1.setShort((short) 109);
        int int5 = bitField1.clear(103);
        int int8 = bitField1.setValue((int) (short) 99, (int) (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 111 + "'", short3 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 68 + "'", int5 == 68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 66 + "'", int8 == 66);
    }

    @Test
    public void BitField0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0378");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.setShort((short) (byte) -101);
        int int7 = bitField1.set(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -101 + "'", short5 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void BitField0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0379");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        short short3 = bitField1.setShort((short) 109);
        int int6 = bitField1.setBoolean((int) (byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 111 + "'", short3 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void BitField0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0380");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        byte byte6 = bitField1.clearByte((byte) 11);
        short short9 = bitField1.setShortBoolean((short) 214, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0381");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        boolean boolean6 = bitField1.isSet(10);
        short short9 = bitField1.setShortValue((short) 99, (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 99 + "'", short9 == (short) 99);
    }

    @Test
    public void BitField0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0382");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) 11);
        int int9 = bitField1.clear(106);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
    }

    @Test
    public void BitField0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0383");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        byte byte7 = bitField1.setByteBoolean((byte) 0, true);
        byte byte9 = bitField1.setByte((byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 117 + "'", byte9 == (byte) 117);
    }

    @Test
    public void BitField0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0384");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        short short8 = bitField1.getShortValue((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 5 + "'", short8 == (short) 5);
    }

    @Test
    public void BitField0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0385");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        byte byte7 = bitField1.setByte((byte) 101);
        int int9 = bitField1.set((int) (short) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void BitField0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0386");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(116);
    }

    @Test
    public void BitField0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0387");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        byte byte6 = bitField1.clearByte((byte) 107);
        int int8 = bitField1.getRawValue(48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void BitField0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0388");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(21);
        int int3 = bitField1.clear((-2));
        short short5 = bitField1.setShort((short) (byte) -1);
        short short8 = bitField1.setShortValue((short) (byte) -12, (short) -37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -15 + "'", short8 == (short) -15);
    }

    @Test
    public void BitField0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0389");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        int int7 = bitField1.setBoolean(103, false);
        int int9 = bitField1.getRawValue(16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void BitField0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0390");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 10, (short) 100);
        int int9 = bitField1.clear((int) (short) 212);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 212 + "'", int9 == 212);
    }

    @Test
    public void BitField0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0391");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0392");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0393");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) 1);
        short short9 = bitField1.clearShort((short) (byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -28 + "'", short9 == (short) -28);
    }

    @Test
    public void BitField0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0394");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        boolean boolean8 = bitField1.isAllSet(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0395");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        short short7 = bitField1.getShortValue((short) 11);
        int int9 = bitField1.getRawValue(114);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0396");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.setShort((short) (byte) -101);
        byte byte7 = bitField1.setByte((byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -101 + "'", short5 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 111 + "'", byte7 == (byte) 111);
    }

    @Test
    public void BitField0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0397");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) 0);
        int int8 = bitField1.set(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void BitField0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0398");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        int int5 = bitField1.set(24);
        short short7 = bitField1.getShortRawValue((short) (byte) 1);
        short short9 = bitField1.clearShort((short) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 4 + "'", short9 == (short) 4);
    }

    @Test
    public void BitField0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0399");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getValue((int) (short) 214);
        int int7 = bitField1.clear(36);
        int int9 = bitField1.clear((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0400");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        short short9 = bitField1.setShort((short) (byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -11 + "'", short9 == (short) -11);
    }

    @Test
    public void BitField0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0401");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int6 = bitField1.clear((int) (short) 11);
        byte byte8 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void BitField0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0402");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getRawValue((int) (short) 214);
        boolean boolean8 = bitField1.isAllSet(117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 214 + "'", int6 == 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0403");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        int int3 = bitField1.getRawValue(53);
        short short5 = bitField1.getShortRawValue((short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void BitField0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0404");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.getRawValue((int) 'a');
        short short7 = bitField1.getShortRawValue((short) -1);
        boolean boolean9 = bitField1.isSet((int) (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BitField0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0405");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        byte byte6 = bitField1.setByteBoolean((byte) 10, true);
        boolean boolean8 = bitField1.isAllSet((-22));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 107 + "'", byte6 == (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0406");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getRawValue((int) (short) 214);
        byte byte8 = bitField1.setByte((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 214 + "'", int6 == 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void BitField0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0407");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        boolean boolean5 = bitField1.isAllSet(20);
        byte byte8 = bitField1.setByteBoolean((byte) 26, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void BitField0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0408");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        short short9 = bitField1.setShortBoolean((short) 34, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 35 + "'", short9 == (short) 35);
    }

    @Test
    public void BitField0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0409");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        int int6 = bitField1.setBoolean(103, false);
        short short9 = bitField1.setShortValue((short) (byte) 21, (short) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 215 + "'", short9 == (short) 215);
    }

    @Test
    public void BitField0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0410");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        int int6 = bitField1.setValue(0, (int) (short) -15);
        short short8 = bitField1.getShortRawValue((short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0411");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        byte byte4 = bitField1.setByteBoolean((byte) 10, true);
        byte byte7 = bitField1.setByteBoolean((byte) -25, true);
        short short9 = bitField1.getShortRawValue((short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 26 + "'", byte4 == (byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 8 + "'", short9 == (short) 8);
    }

    @Test
    public void BitField0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0412");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        int int6 = bitField1.setValue(0, (int) (short) -15);
        short short9 = bitField1.setShortBoolean((short) -1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void BitField0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0413");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.setByte((byte) 97);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 97 + "'", byte5 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0414");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        int int3 = bitField1.clear((-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-102) + "'", int3 == (-102));
    }

    @Test
    public void BitField0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0415");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set(16);
        boolean boolean7 = bitField1.isAllSet((-112));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0416");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        int int7 = bitField1.setBoolean((int) (short) 27, true);
        short short9 = bitField1.clearShort((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27 + "'", int7 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0417");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        byte byte6 = bitField1.setByte((byte) 1);
        int int8 = bitField1.clear((int) (byte) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-102) + "'", int8 == (-102));
    }

    @Test
    public void BitField0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0418");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        short short5 = bitField1.setShort((short) 10);
        short short7 = bitField1.setShort((short) 5);
        int int9 = bitField1.clear(115);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 5 + "'", short7 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115 + "'", int9 == 115);
    }

    @Test
    public void BitField0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0419");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        short short4 = bitField1.setShortValue((short) 116, (short) (byte) 101);
        byte byte7 = bitField1.setByteBoolean((byte) 21, false);
        int int9 = bitField1.clear(57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 17 + "'", byte7 == (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void BitField0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0420");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        int int3 = bitField1.getRawValue(53);
        int int6 = bitField1.setValue((int) (short) -101, (int) (short) 0);
        short short8 = bitField1.getShortRawValue((short) 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-112) + "'", int6 == (-112));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 2 + "'", short8 == (short) 2);
    }

    @Test
    public void BitField0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0421");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short6 = bitField1.setShortBoolean((short) -2, true);
        short short8 = bitField1.getShortRawValue((short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0422");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isAllSet((int) (short) -1);
        boolean boolean5 = bitField1.isSet(10);
        byte byte7 = bitField1.setByte((byte) 117);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 117 + "'", byte7 == (byte) 117);
    }

    @Test
    public void BitField0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0423");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.clearByte((byte) 11);
        short short8 = bitField1.clearShort((short) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void BitField0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0424");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short4 = bitField1.setShortBoolean((short) 10, true);
        short short6 = bitField1.getShortValue((short) 10);
        byte byte9 = bitField1.setByteBoolean((byte) 17, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 5 + "'", short6 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 17 + "'", byte9 == (byte) 17);
    }

    @Test
    public void BitField0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0425");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short4 = bitField1.setShortBoolean((short) 100, true);
        byte byte6 = bitField1.clearByte((byte) 107);
        short short9 = bitField1.setShortValue((short) -26, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -126 + "'", short9 == (short) -126);
    }

    @Test
    public void BitField0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0426");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int3 = bitField1.getValue(101);
        int int5 = bitField1.clear(1);
        byte byte7 = bitField1.setByte((byte) -128);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -102 + "'", byte7 == (byte) -102);
    }

    @Test
    public void BitField0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0427");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.clearShort((short) (byte) 107);
        short short9 = bitField1.getShortRawValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0428");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        byte byte6 = bitField1.setByteBoolean((byte) -2, false);
        short short8 = bitField1.setShort((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -12 + "'", byte6 == (byte) -12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void BitField0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0429");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) '4');
        short short5 = bitField1.getShortRawValue((short) 4);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0430");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short3 = bitField1.getShortRawValue((short) (byte) 26);
        short short5 = bitField1.getShortValue((short) (byte) -2);
        boolean boolean7 = bitField1.isAllSet(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void BitField0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0431");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.clearShort((short) (byte) 27);
        int int9 = bitField1.getValue((int) (short) 19);
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
    public void BitField0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0432");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int6 = bitField1.setBoolean((int) (short) 100, false);
        byte byte9 = bitField1.setByteBoolean((byte) 106, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 96 + "'", byte9 == (byte) 96);
    }

    @Test
    public void BitField0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0433");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        boolean boolean5 = bitField1.isSet(35);
        int int7 = bitField1.set(34);
        short short9 = bitField1.setShort((short) (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -25 + "'", short9 == (short) -25);
    }

    @Test
    public void BitField0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0434");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short6 = bitField1.setShortBoolean((short) -2, true);
        short short8 = bitField1.getShortRawValue((short) 109);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void BitField0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0435");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 0);
        byte byte7 = bitField1.clearByte((byte) 11);
        short short9 = bitField1.setShort((short) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 27 + "'", short9 == (short) 27);
    }

    @Test
    public void BitField0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0436");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        short short6 = bitField1.setShortBoolean((short) 21, true);
        int int8 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 29 + "'", short6 == (short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0437");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        int int3 = bitField1.getValue(97);
        int int5 = bitField1.getRawValue(222);
        int int7 = bitField1.clear(36);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BitField0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0438");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        int int6 = bitField1.setBoolean((int) (byte) -102, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-126) + "'", int6 == (-126));
    }

    @Test
    public void BitField0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0439");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        int int5 = bitField1.getRawValue((int) (short) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
    }

    @Test
    public void BitField0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0440");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        int int7 = bitField1.setBoolean((-1), true);
        boolean boolean9 = bitField1.isSet(214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0441");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        short short3 = bitField1.getShortRawValue((short) 111);
        int int6 = bitField1.setBoolean((int) (byte) 27, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 34 + "'", short3 == (short) 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
    }

    @Test
    public void BitField0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0442");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        int int4 = bitField1.setValue(1, (int) (short) -1);
        byte byte6 = bitField1.setByte((byte) -1);
        int int8 = bitField1.clear(158);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 154 + "'", int8 == 154);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0443");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isSet((int) (short) 100);
        int int9 = bitField1.setValue(2, (int) (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void BitField0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0444");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        int int7 = bitField1.getRawValue(0);
        int int9 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0445");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        byte byte5 = bitField1.clearByte((byte) 26);
        byte byte8 = bitField1.setByteBoolean((byte) 101, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 16 + "'", byte5 == (byte) 16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 101 + "'", byte8 == (byte) 101);
    }

    @Test
    public void BitField0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0446");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet(103);
        short short9 = bitField1.clearShort((short) 10);
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
    public void BitField0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0447");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.getRawValue(15);
        int int6 = bitField1.setValue((int) (short) 5, (int) (byte) -1);
        int int8 = bitField1.getRawValue((int) (short) 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void BitField0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0448");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.setByte((byte) 26);
        byte byte8 = bitField1.clearByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void BitField0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0449");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -1);
    }

    @Test
    public void BitField0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0450");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        byte byte6 = bitField1.setByte((byte) 26);
        int int8 = bitField1.getRawValue(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
    }

    @Test
    public void BitField0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0451");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        short short7 = bitField1.setShortBoolean((short) (byte) -1, true);
        int int9 = bitField1.getRawValue((int) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 111 + "'", int9 == 111);
    }

    @Test
    public void BitField0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0452");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        short short3 = bitField1.getShortRawValue((short) 100);
        int int5 = bitField1.set(11);
        byte byte8 = bitField1.setByteBoolean((byte) -9, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -25 + "'", byte8 == (byte) -25);
    }

    @Test
    public void BitField0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0453");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(0);
        short short3 = bitField1.clearShort((short) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -2);
        byte byte7 = bitField1.setByte((byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
    }

    @Test
    public void BitField0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0454");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        byte byte6 = bitField1.clearByte((byte) 11);
        byte byte9 = bitField1.setByteBoolean((byte) -112, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void BitField0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0455");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        boolean boolean6 = bitField1.isAllSet((int) (byte) -1);
        short short9 = bitField1.setShortBoolean((short) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void BitField0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0456");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0457");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        int int4 = bitField1.setValue((-1), 0);
        int int6 = bitField1.set(1);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-28) + "'", int4 == (-28));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BitField0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0458");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        int int6 = bitField1.set((int) (short) 5);
        int int8 = bitField1.getRawValue((int) (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void BitField0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0459");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        int int6 = bitField1.clear((int) ' ');
        byte byte8 = bitField1.setByte((byte) 26);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 27 + "'", byte8 == (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0460");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (byte) 11, false);
        short short6 = bitField1.setShort((short) 215);
        short short9 = bitField1.setShortValue((short) 15, (short) (byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 215 + "'", short6 == (short) 215);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 15 + "'", short9 == (short) 15);
    }

    @Test
    public void BitField0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0461");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        byte byte3 = bitField1.setByte((byte) 1);
        boolean boolean5 = bitField1.isSet((int) (byte) 3);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0462");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        short short6 = bitField1.setShortValue((short) 97, (short) 1);
        short short9 = bitField1.setShortValue((short) -101, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 99 + "'", short6 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -111 + "'", short9 == (short) -111);
    }

    @Test
    public void BitField0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0463");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte6 = bitField1.setByteBoolean((byte) 17, false);
        short short9 = bitField1.setShortValue((short) 8, (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 26 + "'", short9 == (short) 26);
    }

    @Test
    public void BitField0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0464");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.clear((int) '#');
        boolean boolean5 = bitField1.isSet((int) (short) 4);
        boolean boolean7 = bitField1.isAllSet(32);
        int int9 = bitField1.clear((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
    }

    @Test
    public void BitField0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0465");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        byte byte5 = bitField1.setByte((byte) 100);
        short short7 = bitField1.setShort((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 110 + "'", byte5 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void BitField0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0466");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int6 = bitField1.getRawValue((int) (short) 214);
        short short8 = bitField1.getShortValue((short) (byte) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 214 + "'", int6 == 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -102 + "'", short8 == (short) -102);
    }

    @Test
    public void BitField0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0467");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        byte byte6 = bitField1.setByteBoolean((byte) 0, true);
        int int9 = bitField1.setBoolean(0, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void BitField0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0468");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        boolean boolean5 = bitField1.isSet(119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void BitField0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0469");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) -1);
        short short7 = bitField1.getShortValue((short) 1);
        boolean boolean9 = bitField1.isAllSet((int) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BitField0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0470");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        boolean boolean7 = bitField1.isSet((int) (short) 11);
        int int9 = bitField1.getRawValue((int) (short) -15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void BitField0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0471");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short3 = bitField1.getShortRawValue((short) (byte) 26);
        int int5 = bitField1.getRawValue((int) (short) 127);
        int int7 = bitField1.clear(8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void BitField0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0472");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.setShort((short) (byte) -101);
        short short8 = bitField1.setShortBoolean((short) 19, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -101 + "'", short5 == (short) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 27 + "'", short8 == (short) 27);
    }

    @Test
    public void BitField0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0473");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        short short7 = bitField1.setShortValue((short) (byte) 0, (short) (byte) 10);
        byte byte9 = bitField1.setByte((byte) -27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -27 + "'", byte9 == (byte) -27);
    }

    @Test
    public void BitField0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0474");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        short short7 = bitField1.setShortValue((short) (byte) 101, (short) (byte) 16);
        short short9 = bitField1.getShortRawValue((short) -111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void BitField0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0475");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        short short9 = bitField1.setShortBoolean((short) 29, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void BitField0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0476");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int6 = bitField1.setBoolean(223, false);
        byte byte8 = bitField1.setByte((byte) 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 158 + "'", int6 == 158);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 123 + "'", byte8 == (byte) 123);
    }

    @Test
    public void BitField0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0477");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 10);
        int int4 = bitField1.setBoolean((int) 'a', false);
        short short6 = bitField1.clearShort((short) 20);
        int int9 = bitField1.setBoolean(15, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void BitField0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0478");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        short short3 = bitField1.getShortRawValue((short) (byte) 26);
        short short5 = bitField1.getShortValue((short) (byte) -2);
        int int8 = bitField1.setValue(0, 62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void BitField0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0479");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) (byte) 101);
        byte byte7 = bitField1.clearByte((byte) -2);
        int int9 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -2 + "'", byte7 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void BitField0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0480");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(96);
        byte byte4 = bitField1.setByteBoolean((byte) -101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -5 + "'", byte4 == (byte) -5);
    }

    @Test
    public void BitField0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0481");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        int int3 = bitField1.clear(5);
        boolean boolean5 = bitField1.isSet(48);
        int int8 = bitField1.setValue((int) (byte) 101, (int) 'a');
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0482");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        byte byte6 = bitField1.clearByte((byte) 11);
        boolean boolean8 = bitField1.isAllSet((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BitField0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0483");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        int int5 = bitField1.set(16);
        int int7 = bitField1.clear(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0484");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        boolean boolean5 = bitField1.isSet(35);
        short short7 = bitField1.clearShort((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 20 + "'", short7 == (short) 20);
    }

    @Test
    public void BitField0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0485");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        boolean boolean5 = bitField1.isAllSet(33);
        int int8 = bitField1.setBoolean(17, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void BitField0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0486");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 0);
        int int3 = bitField1.set(0);
        byte byte5 = bitField1.setByte((byte) 97);
        boolean boolean7 = bitField1.isAllSet(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 97 + "'", byte5 == (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void BitField0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0487");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        short short3 = bitField1.clearShort((short) (byte) 3);
        int int5 = bitField1.getRawValue(17);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0488");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        boolean boolean6 = bitField1.isSet((int) (short) 20);
        int int8 = bitField1.getValue((int) (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void BitField0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0489");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        short short5 = bitField1.getShortValue((short) (byte) 101);
        int int8 = bitField1.setBoolean((int) (short) 1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void BitField0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0490");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        short short6 = bitField1.setShortValue((short) 97, (short) 1);
        short short8 = bitField1.getShortValue((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 99 + "'", short6 == (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void BitField0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0491");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        int int3 = bitField1.getRawValue((int) (short) -26);
        byte byte6 = bitField1.setByteBoolean((byte) 0, true);
        short short8 = bitField1.setShort((short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 107 + "'", short8 == (short) 107);
    }

    @Test
    public void BitField0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0492");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        short short4 = bitField1.setShortValue((short) 10, (short) (byte) 100);
        boolean boolean6 = bitField1.isSet(0);
        boolean boolean8 = bitField1.isAllSet((int) (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void BitField0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0493");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        int int5 = bitField1.set((int) (short) 100);
        int int7 = bitField1.getRawValue((int) (byte) -2);
        short short9 = bitField1.clearShort((short) -64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -64 + "'", short9 == (short) -64);
    }

    @Test
    public void BitField0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0494");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        int int3 = bitField1.getRawValue((int) (short) 100);
        int int5 = bitField1.clear((int) (short) -1);
        byte byte8 = bitField1.setByteBoolean((byte) 1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 97 + "'", byte8 == (byte) 97);
    }

    @Test
    public void BitField0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0495");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        boolean boolean3 = bitField1.isAllSet((int) (short) 10);
        byte byte5 = bitField1.clearByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 26 + "'", byte5 == (byte) 26);
    }

    @Test
    public void BitField0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0496");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int3 = bitField1.set((int) (byte) 10);
        short short5 = bitField1.getShortRawValue((short) 11);
        short short8 = bitField1.setShortValue((short) (byte) 123, (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 122 + "'", short8 == (short) 122);
    }

    @Test
    public void BitField0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0497");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short3 = bitField1.getShortRawValue((short) 101);
        boolean boolean5 = bitField1.isAllSet(20);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BitField0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0498");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        short short4 = bitField1.setShortValue((short) 0, (short) 101);
        int int6 = bitField1.set(24);
        int int8 = bitField1.clear(223);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 212 + "'", int8 == 212);
    }

    @Test
    public void BitField0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0499");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-2));
        short short4 = bitField1.setShortValue((short) 10, (short) 10);
        short short6 = bitField1.setShort((short) 19);
        byte byte9 = bitField1.setByteBoolean((byte) -128, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 20 + "'", short4 == (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -2 + "'", byte9 == (byte) -2);
    }

    @Test
    public void BitField0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.BitField0500");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        byte byte6 = bitField1.clearByte((byte) -2);
        byte byte8 = bitField1.setByte((byte) -101);
        java.lang.Class<?> wildcardClass9 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -101 + "'", byte8 == (byte) -101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

