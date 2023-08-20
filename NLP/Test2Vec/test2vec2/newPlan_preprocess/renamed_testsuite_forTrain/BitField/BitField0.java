
package BitField;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitField0 {

    public static boolean debug = false;

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0002");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0003");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0004");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0005");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0006");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0007");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0008");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0009");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0010");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0011");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0012");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0013");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0014");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0015");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0016");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0017");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0018");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0019");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0020");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0021");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0022");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0023");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0024");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0025");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0026");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0027");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0028");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0029");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0030");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0031");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0032");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0033");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0034");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0035");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0036");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0037");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0038");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0039");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0040");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0041");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0042");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0043");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0044");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0045");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0046");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        boolean boolean3 = bitField1.isAllSet(25);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0047");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0048");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0049");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0050");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0051");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0052");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0053");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0054");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0055");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0056");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0057");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0058");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0059");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0060");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0061");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0062");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0063");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0064");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0065");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0066");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0067");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0068");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0069");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0070");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0071");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0072");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0073");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0074");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0075");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0076");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0077");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0078");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0079");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0080");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0081");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0082");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0083");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0084");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0085");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0086");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0087");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0088");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0089");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0090");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0091");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0092");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0093");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(11);
        boolean boolean3 = bitField1.isSet((int) (short) 101);
        int int5 = bitField1.clear(24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0094");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0095");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0096");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0097");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0098");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0099");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0100");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0101");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0102");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0103");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0104");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        short short5 = bitField1.getShortValue((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 5 + "'", short5 == (short) 5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0105");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0106");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0107");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0108");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0109");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0110");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0111");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0112");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0113");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0114");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0115");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0116");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0117");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0118");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0119");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0120");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0121");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0122");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0123");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0124");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0125");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0126");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0127");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0128");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0129");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0130");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0131");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0132");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0133");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0134");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0135");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0136");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0137");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0138");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0139");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0140");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0141");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0142");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0143");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0144");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0145");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0146");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0147");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0148");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0149");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0150");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0151");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0152");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0153");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0154");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0155");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0156");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0157");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0158");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0159");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0160");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0161");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0162");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0163");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0164");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.getShortRawValue((short) (byte) 10);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0165");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0166");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0167");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0168");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0169");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0170");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0171");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0172");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0173");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0174");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0175");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0176");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0177");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0178");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) ' ');
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0179");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0180");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0181");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 117);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0182");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0183");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0184");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setBoolean((int) (short) -1, false);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0185");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0186");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0187");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0188");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0189");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0190");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0191");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0192");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0193");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0194");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0195");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0196");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-98));
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0197");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0198");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0199");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0200");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0201");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0202");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0203");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0204");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0205");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0206");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 26);
        int int4 = bitField1.setValue(0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0207");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0208");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0209");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0210");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0211");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0212");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0213");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0214");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0215");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0216");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0217");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0218");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0219");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0220");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0221");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0222");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0223");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0224");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0225");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0226");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0227");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0228");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0229");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0230");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0231");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0232");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0233");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0234");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0235");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0236");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0237");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0238");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0239");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0240");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0241");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0242");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0243");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0244");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0245");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0246");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0247");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0248");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0249");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0250");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0251");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0252");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0253");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0254");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0255");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0256");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0257");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0258");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0259");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        int int4 = bitField1.setValue((-1), 32);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0260");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0261");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0262");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0263");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0264");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0265");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0266");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0267");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0268");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0269");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        short short4 = bitField1.setShortValue((short) 107, (short) (byte) 101);
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 111 + "'", short4 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0270");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0271");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0272");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 100);
        byte byte4 = bitField1.setByteBoolean((byte) 11, true);
        short short7 = bitField1.setShortValue((short) (byte) 111, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 111 + "'", byte4 == (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 15 + "'", short7 == (short) 15);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0273");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0274");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0275");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0276");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0277");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0278");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0279");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(114);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0280");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0281");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(101);
        boolean boolean3 = bitField1.isSet((int) (short) 100);
        short short5 = bitField1.setShort((short) (byte) -25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -25 + "'", short5 == (short) -25);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0282");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(3);
        int int3 = bitField1.getRawValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0283");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0284");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 27);
        short short3 = bitField1.getShortRawValue((short) (byte) 101);
        int int5 = bitField1.clear(26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0285");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0286");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0287");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 215);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0288");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
        short short3 = bitField1.clearShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0289");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0290");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 1);
        boolean boolean3 = bitField1.isSet((int) (byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0291");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0292");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0293");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0294");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0295");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0296");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0297");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0298");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0299");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0300");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0301");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0302");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0303");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0304");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0305");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0306");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0307");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0308");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0309");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0310");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0311");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0312");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0313");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0314");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0315");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0316");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0317");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0318");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0319");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0320");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0321");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0322");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((-1));
        short short4 = bitField1.setShortBoolean((short) 0, false);
        int int7 = bitField1.setBoolean((int) (byte) 106, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0323");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0324");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0325");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0326");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        short short6 = bitField1.setShortValue((short) (byte) -1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -25 + "'", short6 == (short) -25);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0327");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        short short3 = bitField1.clearShort((short) (byte) 0);
        short short6 = bitField1.setShortValue((short) -1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -12 + "'", short6 == (short) -12);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0328");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0329");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        byte byte3 = bitField1.clearByte((byte) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0330");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        int int4 = bitField1.setValue((int) (byte) 11, (int) 'a');
        java.lang.Class<?> wildcardClass5 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0331");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0332");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0333");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0334");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0335");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0336");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0337");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0338");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0339");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0340");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0341");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0342");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0343");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        boolean boolean3 = bitField1.isSet((int) (short) 214);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0344");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0345");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0346");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0347");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0348");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0349");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0350");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0351");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0352");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        int int4 = bitField1.setBoolean((int) (byte) 3, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0353");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0354");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0355");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0356");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0357");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0358");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 1);
        short short3 = bitField1.getShortRawValue((short) (byte) 0);
        int int5 = bitField1.getRawValue(11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0359");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0360");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0361");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0362");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0363");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0364");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0365");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0366");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0367");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0368");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0369");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0370");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0371");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(117);
        int int3 = bitField1.getRawValue((int) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0372");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0373");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0374");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0375");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0376");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0377");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0378");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0379");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) '#');
        short short3 = bitField1.setShort((short) 109);
        int int6 = bitField1.setBoolean((int) (byte) 1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 111 + "'", short3 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0380");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0381");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0382");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0383");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0384");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0385");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0386");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(116);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0387");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0388");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0389");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0390");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0391");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(103);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0392");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(1);
        java.lang.Class<?> wildcardClass2 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0393");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0394");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0395");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0396");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0397");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0398");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0399");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0400");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0401");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0402");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0403");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 11);
        int int3 = bitField1.getRawValue(53);
        short short5 = bitField1.getShortRawValue((short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0404");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0405");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0406");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0407");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0408");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0409");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0410");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0411");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0412");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0413");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0414");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 100);
        int int3 = bitField1.clear((-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-102) + "'", int3 == (-102));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0415");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0416");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0417");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0418");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0419");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0420");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0421");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0422");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0423");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0424");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0425");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0426");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0427");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0428");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0429");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0430");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0431");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0432");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0433");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0434");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0435");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0436");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0437");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0438");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.getRawValue((int) (short) 9);
        int int6 = bitField1.setBoolean((int) (byte) -102, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-126) + "'", int6 == (-126));
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0439");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) 107);
        short short3 = bitField1.setShort((short) (byte) 11);
        int int5 = bitField1.getRawValue((int) (short) -28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 107 + "'", short3 == (short) 107);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 96 + "'", int5 == 96);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0440");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0441");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(34);
        short short3 = bitField1.getShortRawValue((short) 111);
        int int6 = bitField1.setBoolean((int) (byte) 27, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 34 + "'", short3 == (short) 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0442");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0443");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0444");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0445");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0446");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0447");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0448");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0449");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) -1);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0450");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0451");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0452");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0453");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0454");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0455");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0456");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(27);
        short short3 = bitField1.setShort((short) (byte) -25);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0457");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0458");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0459");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0460");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0461");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0462");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0463");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0464");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0465");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0466");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0467");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0468");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(24);
        int int3 = bitField1.clear((int) (short) 11);
        boolean boolean5 = bitField1.isSet(119);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0469");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0470");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0471");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0472");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0473");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0474");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0475");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0476");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0477");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0478");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0479");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0480");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(96);
        byte byte4 = bitField1.setByteBoolean((byte) -101, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -5 + "'", byte4 == (byte) -5);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0481");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0482");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0483");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0484");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0485");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0486");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0487");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0488");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0489");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0490");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0491");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0492");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0493");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0494");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0495");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 101);
        boolean boolean3 = bitField1.isAllSet((int) (short) 10);
        byte byte5 = bitField1.clearByte((byte) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 26 + "'", byte5 == (byte) 26);
    }

    @Test
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0496");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0497");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0498");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0499");
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
    public void BitField() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test0500");
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

