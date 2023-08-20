package BitField;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitField0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test01");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        short short5 = bitField1.clearShort((short) -1);
        int int7 = bitField1.clear(10);
        byte byte9 = bitField1.setByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -11 + "'", short5 == (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test02");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        short short5 = bitField1.clearShort((short) -1);
        int int7 = bitField1.clear(10);
        byte byte9 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -11 + "'", short5 == (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test03");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test04");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        short short3 = bitField1.setShort((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 110 + "'", short3 == (short) 110);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test05");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        short short5 = bitField1.clearShort((short) -1);
        int int7 = bitField1.clear(10);
        short short9 = bitField1.setShort((short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -11 + "'", short5 == (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test06");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test07");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        boolean boolean5 = bitField1.isSet((int) (short) -1);
        short short8 = bitField1.setShortBoolean((short) 1, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test08");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        byte byte7 = bitField1.setByte((byte) 100);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test09");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        byte byte5 = bitField1.clearByte((byte) 10);
        boolean boolean7 = bitField1.isAllSet((-1));
        short short9 = bitField1.getShortValue((short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 5 + "'", short9 == (short) 5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test10");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        boolean boolean7 = bitField1.isAllSet((int) 'a');
        int int9 = bitField1.getRawValue((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test11");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        short short5 = bitField1.clearShort((short) -1);
        int int7 = bitField1.clear(10);
        int int9 = bitField1.getValue((int) (short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -11 + "'", short5 == (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test12");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        int int5 = bitField1.clear(10);
        boolean boolean7 = bitField1.isAllSet(0);
        byte byte9 = bitField1.setByte((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test13");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        boolean boolean7 = bitField1.isAllSet((int) 'a');
        short short9 = bitField1.setShort((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test14");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -1);
        int int7 = bitField1.getRawValue((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test15");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (byte) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test16");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        byte byte7 = bitField1.setByte((byte) 100);
        int int9 = bitField1.clear((int) (short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test17");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int7 = bitField1.getValue((int) (byte) 110);
        byte byte9 = bitField1.setByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test18");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        int int5 = bitField1.getRawValue((-1));
        boolean boolean7 = bitField1.isAllSet((int) (short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test19");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        byte byte9 = bitField1.clearByte((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test20");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        boolean boolean7 = bitField1.isAllSet((int) 'a');
        int int9 = bitField1.clear((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test21");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        short short5 = bitField1.getShortValue((short) (byte) 110);
        boolean boolean7 = bitField1.isAllSet((int) (short) -1);
        int int9 = bitField1.getRawValue((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 5 + "'", short5 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test22");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        byte byte5 = bitField1.clearByte((byte) 10);
        int int7 = bitField1.getValue((int) (byte) 110);
        int int9 = bitField1.clear((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test23");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        byte byte5 = bitField1.clearByte((byte) 10);
        short short7 = bitField1.setShort((short) (byte) 0);
        int int9 = bitField1.getRawValue((int) (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test24");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        java.lang.Class<?> wildcardClass8 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test25");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test26");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        byte byte5 = bitField1.clearByte((byte) 100);
        boolean boolean7 = bitField1.isAllSet(11);
        short short9 = bitField1.getShortRawValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test27");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test28");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -1);
        byte byte8 = bitField1.setByteBoolean((byte) 11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test29");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int4 = bitField1.setBoolean((-11), true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test30");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        short short7 = bitField1.getShortRawValue((short) (byte) 10);
        int int9 = bitField1.getValue((-11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test31");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        short short8 = bitField1.setShortBoolean((short) -11, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test32");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -1);
        int int7 = bitField1.getRawValue((int) (byte) 10);
        int int9 = bitField1.clear((int) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test33");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        int int8 = bitField1.setValue(5, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test34");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        byte byte7 = bitField1.setByte((byte) 100);
        short short9 = bitField1.getShortValue((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 5 + "'", short9 == (short) 5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test35");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test36");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        boolean boolean5 = bitField1.isSet((int) (short) -1);
        boolean boolean7 = bitField1.isAllSet(5);
        byte byte9 = bitField1.clearByte((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test37");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        byte byte5 = bitField1.clearByte((byte) 100);
        boolean boolean7 = bitField1.isAllSet(11);
        int int9 = bitField1.getRawValue(110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test38");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        byte byte5 = bitField1.clearByte((byte) 100);
        boolean boolean7 = bitField1.isAllSet(11);
        short short9 = bitField1.setShort((short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test39");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        byte byte6 = bitField1.setByteBoolean((byte) 1, false);
        short short9 = bitField1.setShortValue((short) (byte) 100, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 102 + "'", short9 == (short) 102);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test40");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isSet(100);
        boolean boolean7 = bitField1.isSet((int) (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test41");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        int int6 = bitField1.setBoolean((int) '#', false);
        java.lang.Class<?> wildcardClass7 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33 + "'", int6 == 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test42");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        int int5 = bitField1.getRawValue((int) (short) 110);
        short short8 = bitField1.setShortBoolean((short) -11, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -11 + "'", short8 == (short) -11);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test43");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        byte byte5 = bitField1.clearByte((byte) 100);
        short short7 = bitField1.getShortRawValue((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test44");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) 'a');
        byte byte4 = bitField1.setByteBoolean((byte) 10, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test45");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        int int5 = bitField1.getRawValue((int) (short) -11);
        int int7 = bitField1.getValue((int) 'a');
        byte byte9 = bitField1.setByte((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test46");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        short short5 = bitField1.getShortValue((short) (byte) 110);
        short short8 = bitField1.setShortValue((short) (byte) 11, (short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 5 + "'", short5 == (short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 3 + "'", short8 == (short) 3);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test47");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        short short5 = bitField1.getShortRawValue((short) -1);
        java.lang.Class<?> wildcardClass6 = bitField1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test48");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        int int5 = bitField1.clear(10);
        short short7 = bitField1.setShort((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 110 + "'", short7 == (short) 110);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test49");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        int int5 = bitField1.getRawValue((int) (short) -11);
        int int7 = bitField1.clear((int) (short) 100);
        int int9 = bitField1.clear((int) (short) 102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test50");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.getValue((int) (short) 1);
        boolean boolean5 = bitField1.isAllSet((-1));
        byte byte7 = bitField1.setByte((byte) 100);
        int int9 = bitField1.getRawValue((int) (short) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 110 + "'", byte7 == (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test51");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (byte) 1);
        byte byte5 = bitField1.clearByte((byte) 10);
        short short7 = bitField1.setShort((short) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 15 + "'", short7 == (short) 15);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test52");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        boolean boolean5 = bitField1.isSet((int) (short) -1);
        int int7 = bitField1.getValue(11);
        int int9 = bitField1.set((int) (short) 15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test53");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        boolean boolean5 = bitField1.isSet((int) (short) -1);
        int int8 = bitField1.setValue(0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test54");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField((int) (short) -1);
        int int4 = bitField1.setValue((int) (short) 10, (int) (short) 110);
        byte byte6 = bitField1.clearByte((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 110 + "'", int4 == 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitField0.test55");
        org.apache.commons.lang3.BitField bitField1 = new org.apache.commons.lang3.BitField(10);
        int int3 = bitField1.set((int) (short) -1);
        int int5 = bitField1.getRawValue((int) (short) 110);
        short short7 = bitField1.setShort((short) (byte) 10);
        short short9 = bitField1.clearShort((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }
}

