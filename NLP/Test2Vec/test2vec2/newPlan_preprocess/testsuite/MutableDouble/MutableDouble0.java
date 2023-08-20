package MutableDouble;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableDouble0 {

    public static boolean debug = false;

    @Test
    public void MutableDouble0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0001");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0002");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableDouble0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0003");
        // The following exception was thrown during execution in MutableDouble generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0004");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableDouble0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0005");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        short short6 = mutableDouble4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0006");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableDouble0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0007");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        float float8 = mutableDouble1.floatValue();
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0008");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableDouble0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0009");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        float float9 = mutableDouble7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableDouble0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0010");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableDouble0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0011");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        java.lang.Class<?> wildcardClass4 = mutableDouble2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0012");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        byte byte5 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableDouble0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0013");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableDouble0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0014");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
    }

    @Test
    public void MutableDouble0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0015");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.setValue((java.lang.Number) (short) 0);
    }

    @Test
    public void MutableDouble0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0016");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0017");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        mutableDouble1.setValue((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0018");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0019");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0020");
        // The following exception was thrown during execution in MutableDouble generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0021");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableDouble0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0022");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void MutableDouble0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0023");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableDouble0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0024");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0025");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0026");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0027");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0028");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0029");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableDouble0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0030");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void MutableDouble0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0031");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.add((-1.0d));
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0032");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        java.lang.Class<?> wildcardClass8 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0033");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableDouble0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0034");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0035");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableDouble0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0036");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void MutableDouble0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0037");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        short short5 = mutableDouble3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void MutableDouble0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0038");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        mutableDouble1.setValue((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0039");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableDouble0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0040");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        java.lang.String str9 = mutableDouble7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void MutableDouble0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0041");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        byte byte3 = mutableDouble2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void MutableDouble0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0042");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void MutableDouble0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0043");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        float float8 = mutableDouble2.floatValue();
        long long9 = mutableDouble2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0044");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.subtract((double) 0.0f);
        mutableDouble1.setValue((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0045");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.add((-1.0d));
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableDouble0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0046");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        float float3 = mutableDouble1.floatValue();
        java.lang.Double double4 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
    }

    @Test
    public void MutableDouble0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0047");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableDouble0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0048");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        long long7 = mutableDouble1.longValue();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0049");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        java.lang.Class<?> wildcardClass8 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0050");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue((-100.0d));
        mutableDouble1.increment();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0051");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        float float8 = mutableDouble2.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) float8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0052");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0053");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble4.setValue((java.lang.Number) mutableDouble7);
        java.lang.Class<?> wildcardClass9 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0054");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass8 = mutableDouble7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0055");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        mutableDouble1.add((java.lang.Number) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0056");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue((-100.0d));
        mutableDouble1.add((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0057");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        int int8 = mutableDouble7.intValue();
        int int9 = mutableDouble7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableDouble0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0058");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        java.lang.Class<?> wildcardClass3 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0059");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.subtract((double) 0.0f);
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void MutableDouble0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0060");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1.0" + "'", str9.equals("-1.0"));
    }

    @Test
    public void MutableDouble0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0061");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        mutableDouble0.add((double) (byte) 0);
        byte byte7 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void MutableDouble0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0062");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableDouble0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0063");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.increment();
        mutableDouble1.subtract((java.lang.Number) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0064");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        mutableDouble1.subtract((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0065");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        mutableDouble1.subtract((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0066");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        java.lang.String str7 = mutableDouble1.toString();
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0067");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableDouble0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0068");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass5 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0069");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableDouble0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0070");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        double double8 = mutableDouble1.doubleValue();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableDouble0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0071");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        mutableDouble1.subtract(1.0d);
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0072");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((double) 99.0f);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble5.add((double) 99.0f);
        mutableDouble1.setValue((java.lang.Number) 99.0f);
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.0d + "'", double9.equals(99.0d));
    }

    @Test
    public void MutableDouble0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0073");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        long long8 = mutableDouble1.longValue();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void MutableDouble0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0074");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void MutableDouble0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0075");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        int int8 = mutableDouble1.intValue();
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0076");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        long long8 = mutableDouble1.longValue();
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableDouble0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0077");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        boolean boolean4 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0078");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        java.lang.Double double8 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0079");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        float float4 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0080");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        mutableDouble4.subtract((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0081");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0082");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        boolean boolean7 = mutableDouble4.isNaN();
        mutableDouble4.add(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0083");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.subtract((double) 0.0f);
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0084");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        int int8 = mutableDouble7.intValue();
        mutableDouble7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0085");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        java.lang.Class<?> wildcardClass8 = mutableDouble2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0086");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((java.lang.Number) 1);
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0087");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0088");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        mutableDouble0.subtract(0.0d);
        java.lang.Class<?> wildcardClass6 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0089");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1L);
    }

    @Test
    public void MutableDouble0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0090");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble5);
        boolean boolean8 = mutableDouble5.isNaN();
        mutableDouble1.setValue((java.lang.Number) mutableDouble5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0091");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        boolean boolean9 = mutableDouble0.equals((java.lang.Object) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0092");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            int int3 = mutableDouble1.compareTo(mutableDouble2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0093");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        mutableDouble7.decrement();
    }

    @Test
    public void MutableDouble0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0094");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        float float2 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0095");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue((-100.0d));
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -100 + "'", byte8 == (byte) -100);
    }

    @Test
    public void MutableDouble0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0096");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableDouble0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0097");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) (short) -1);
        mutableDouble1.increment();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0098");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        boolean boolean4 = mutableDouble1.isNaN();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 102 + "'", short5 == (short) 102);
    }

    @Test
    public void MutableDouble0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0099");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.subtract((double) 0.0f);
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableDouble0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0100");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        mutableDouble4.subtract((-1.0d));
        int int8 = mutableDouble1.compareTo(mutableDouble4);
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0101");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.add((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableDouble0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0102");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        short short4 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0103");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0104");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble1.add((java.lang.Number) mutableDouble6);
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableDouble0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0105");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        long long7 = mutableDouble4.longValue();
        boolean boolean8 = mutableDouble4.isInfinite();
        mutableDouble4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0106");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0107");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0108");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        int int2 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void MutableDouble0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0109");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        java.lang.String str8 = mutableDouble1.toString();
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableDouble0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0110");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.setValue((double) (short) 1);
    }

    @Test
    public void MutableDouble0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0111");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void MutableDouble0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0112");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble4.setValue((java.lang.Number) mutableDouble7);
        java.lang.Double double9 = mutableDouble7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0113");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.add((double) (-1L));
        mutableDouble1.decrement();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            mutableDouble1.subtract(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0114");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        mutableDouble1.subtract((double) (short) 102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0115");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0116");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("99.0");
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0117");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((java.lang.Number) 2L);
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0118");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.increment();
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 2 + "'", byte9 == (byte) 2);
    }

    @Test
    public void MutableDouble0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0119");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        mutableDouble0.add((double) (byte) 0);
        mutableDouble0.add((java.lang.Number) 1L);
        boolean boolean9 = mutableDouble0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0120");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        mutableDouble4.subtract((-1.0d));
        int int8 = mutableDouble1.compareTo(mutableDouble4);
        float float9 = mutableDouble4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void MutableDouble0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0121");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        mutableDouble4.add((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0122");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        java.lang.String str8 = mutableDouble4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void MutableDouble0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0123");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean8 = mutableDouble1.isNaN();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableDouble0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0124");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.add((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0125");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble1.add((java.lang.Number) mutableDouble6);
        int int9 = mutableDouble6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableDouble0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0126");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble4.setValue((java.lang.Number) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0127");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.subtract(0.0d);
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableDouble0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0128");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        mutableDouble1.subtract((double) (short) 2);
    }

    @Test
    public void MutableDouble0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0129");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableDouble0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0130");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        int int8 = mutableDouble1.intValue();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void MutableDouble0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0131");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        float float5 = mutableDouble1.floatValue();
        double double6 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 2 + "'", short8 == (short) 2);
    }

    @Test
    public void MutableDouble0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0132");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableDouble0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0133");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble1.add((java.lang.Number) mutableDouble6);
        double double9 = mutableDouble6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableDouble0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0134");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        java.lang.String str2 = mutableDouble1.toString();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableDouble0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0135");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        byte byte8 = mutableDouble4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableDouble0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0136");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0137");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        java.lang.String str7 = mutableDouble1.toString();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0138");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue(52.0d);
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void MutableDouble0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0139");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0140");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue(52.0d);
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0141");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0142");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        double double4 = mutableDouble1.doubleValue();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableDouble0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0143");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("1.0");
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableDouble0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0144");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        float float5 = mutableDouble1.floatValue();
        double double6 = mutableDouble1.doubleValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0145");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble5.subtract((java.lang.Number) 0);
        java.lang.String str8 = mutableDouble5.toString();
        mutableDouble1.setValue((java.lang.Number) mutableDouble5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
    }

    @Test
    public void MutableDouble0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0146");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float6 = mutableDouble5.floatValue();
        java.lang.Double double7 = mutableDouble5.toDouble();
        java.lang.Double double8 = mutableDouble5.getValue();
        mutableDouble1.add((java.lang.Number) mutableDouble5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0147");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        java.lang.Double double3 = mutableDouble2.getValue();
        short short4 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableDouble0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0148");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        mutableDouble5.add((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0149");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean3 = mutableDouble1.equals((java.lang.Object) "1.0");
        mutableDouble1.add((java.lang.Number) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0150");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double5);
        double double7 = mutableDouble6.doubleValue();
        java.lang.String str8 = mutableDouble6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void MutableDouble0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0151");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableDouble0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0152");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0153");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        long long7 = mutableDouble1.longValue();
        java.lang.Double double8 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
    }

    @Test
    public void MutableDouble0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0154");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.setValue((double) (-99.0f));
    }

    @Test
    public void MutableDouble0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0155");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble4.setValue((java.lang.Number) mutableDouble7);
        long long9 = mutableDouble4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0156");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((java.lang.Number) 1);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableDouble0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0157");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        float float5 = mutableDouble1.floatValue();
        double double6 = mutableDouble1.doubleValue();
        java.lang.String str7 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.0" + "'", str7.equals("1.0"));
    }

    @Test
    public void MutableDouble0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0158");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble1.add((java.lang.Number) mutableDouble6);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0159");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 2 + "'", byte6 == (byte) 2);
    }

    @Test
    public void MutableDouble0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0160");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        int int6 = mutableDouble1.compareTo(mutableDouble5);
        mutableDouble1.add((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0161");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        int int8 = mutableDouble1.intValue();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void MutableDouble0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0162");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableDouble0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0163");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        double double3 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.0d + "'", double3 == 51.0d);
    }

    @Test
    public void MutableDouble0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0164");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableDouble0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0165");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        long long1 = mutableDouble0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableDouble0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0166");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableDouble0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0167");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        boolean boolean5 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0168");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        float float1 = mutableDouble0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableDouble0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0169");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((double) 99.0f);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble5.add((double) 99.0f);
        mutableDouble1.setValue((java.lang.Number) 99.0f);
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void MutableDouble0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0170");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.add(51.0d);
    }

    @Test
    public void MutableDouble0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0171");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            int int8 = mutableDouble1.compareTo(mutableDouble7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0172");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0173");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        float float8 = mutableDouble1.floatValue();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0174");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.setValue((double) (byte) 100);
        java.lang.Double double9 = mutableDouble4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void MutableDouble0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0175");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0176");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0177");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        mutableDouble4.decrement();
        mutableDouble4.increment();
        java.lang.Class<?> wildcardClass9 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0178");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0179");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble3.subtract((java.lang.Number) 0);
        double double6 = mutableDouble3.doubleValue();
        java.lang.String str7 = mutableDouble3.toString();
        int int8 = mutableDouble1.compareTo(mutableDouble3);
        boolean boolean9 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0180");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double4);
        byte byte6 = mutableDouble5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableDouble0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0181");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        double double6 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableDouble0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0182");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        double double8 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableDouble0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0183");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        java.lang.String str6 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        byte byte8 = mutableDouble7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.0" + "'", str6.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0184");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue(52.0d);
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0185");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        int int3 = mutableDouble0.intValue();
        int int4 = mutableDouble0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void MutableDouble0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0186");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        double double5 = mutableDouble0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void MutableDouble0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0187");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0188");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
    }

    @Test
    public void MutableDouble0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0189");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble5.setValue((double) (short) 100);
        mutableDouble5.decrement();
        int int9 = mutableDouble0.compareTo(mutableDouble5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableDouble0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0190");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean8 = mutableDouble7.isInfinite();
        float float9 = mutableDouble7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void MutableDouble0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0191");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.subtract(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0192");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.subtract((double) 0.0f);
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void MutableDouble0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0193");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0194");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        mutableDouble1.setValue((double) (-1));
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0195");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.subtract((double) (byte) 100);
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -49 + "'", short5 == (short) -49);
    }

    @Test
    public void MutableDouble0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0196");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) (short) -1);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void MutableDouble0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0197");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.setValue((double) 0L);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0198");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        mutableDouble0.subtract(10.0d);
        mutableDouble0.decrement();
        mutableDouble0.add((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0199");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        double double5 = mutableDouble1.doubleValue();
        double double6 = mutableDouble1.doubleValue();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableDouble0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0200");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        long long8 = mutableDouble1.longValue();
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void MutableDouble0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0201");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        double double4 = mutableDouble1.doubleValue();
        java.lang.String str5 = mutableDouble1.toString();
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.0" + "'", str5.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableDouble0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0202");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0203");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        boolean boolean7 = mutableDouble1.isNaN();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0204");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        float float6 = mutableDouble4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0205");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.setValue((double) (byte) 0);
        mutableDouble1.subtract((double) 10.0f);
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9.equals((-10.0d)));
    }

    @Test
    public void MutableDouble0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0206");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        java.lang.Number number1 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            mutableDouble0.subtract(number1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0207");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0208");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        mutableDouble1.subtract((double) (short) -1);
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void MutableDouble0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0209");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-99.0d) + "'", double2.equals((-99.0d)));
    }

    @Test
    public void MutableDouble0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0210");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -99 + "'", byte4 == (byte) -99);
    }

    @Test
    public void MutableDouble0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0211");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        float float6 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0212");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        int int7 = mutableDouble1.intValue();
        double double8 = mutableDouble1.doubleValue();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableDouble0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0213");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        float float7 = mutableDouble1.floatValue();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0214");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        java.lang.Double double4 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableDouble0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0215");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        float float2 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble4.setValue((double) (short) 0);
        mutableDouble4.subtract(0.0d);
        boolean boolean9 = mutableDouble1.equals((java.lang.Object) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0216");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        java.lang.String str6 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double8 = mutableDouble7.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.0" + "'", str6.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0217");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.setValue((double) (byte) 100);
        java.lang.Double double9 = mutableDouble4.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void MutableDouble0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0218");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        java.lang.String str8 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
    }

    @Test
    public void MutableDouble0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0219");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableDouble0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0220");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0221");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.add(35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableDouble0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0222");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        double double8 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void MutableDouble0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0223");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        float float2 = mutableDouble1.floatValue();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableDouble0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0224");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0225");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble7);
    }

    @Test
    public void MutableDouble0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0226");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        mutableDouble0.increment();
    }

    @Test
    public void MutableDouble0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0227");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble3.subtract((java.lang.Number) 0);
        double double6 = mutableDouble3.doubleValue();
        java.lang.String str7 = mutableDouble3.toString();
        int int8 = mutableDouble1.compareTo(mutableDouble3);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableDouble0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0228");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble4.subtract((java.lang.Number) 0);
        java.lang.String str7 = mutableDouble4.toString();
        mutableDouble1.subtract((java.lang.Number) mutableDouble4);
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableDouble0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0229");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-1.0d));
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
    }

    @Test
    public void MutableDouble0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0230");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble5);
        mutableDouble1.subtract((java.lang.Number) 99.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableDouble0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0231");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        double double6 = mutableDouble1.doubleValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
    }

    @Test
    public void MutableDouble0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0232");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        mutableDouble5.add((double) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0233");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        mutableDouble4.increment();
        mutableDouble4.subtract((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableDouble0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0234");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableDouble0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0235");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        java.lang.String str7 = mutableDouble5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2.0" + "'", str7.equals("2.0"));
    }

    @Test
    public void MutableDouble0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0236");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0237");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0238");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        int int6 = mutableDouble1.intValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0239");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.add((-1.0d));
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableDouble0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0240");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 'a');
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -97 + "'", byte7 == (byte) -97);
    }

    @Test
    public void MutableDouble0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0241");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float4 = mutableDouble3.floatValue();
        java.lang.String str5 = mutableDouble3.toString();
        double double6 = mutableDouble3.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble7);
        float float9 = mutableDouble7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableDouble0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0242");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble1.subtract((-1.0d));
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "101.0" + "'", str9.equals("101.0"));
    }

    @Test
    public void MutableDouble0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0243");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        float float4 = mutableDouble1.floatValue();
        java.lang.String str5 = mutableDouble1.toString();
        double double6 = mutableDouble1.doubleValue();
        mutableDouble1.setValue(92.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "99.0" + "'", str5.equals("99.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
    }

    @Test
    public void MutableDouble0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0244");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        double double6 = mutableDouble1.doubleValue();
        boolean boolean7 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0245");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.add((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
    }

    @Test
    public void MutableDouble0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0246");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0247");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableDouble0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0248");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.increment();
        double double4 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
    }

    @Test
    public void MutableDouble0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0249");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableDouble0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0250");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        float float5 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableDouble0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0251");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int8 = mutableDouble6.compareTo(mutableDouble7);
        int int9 = mutableDouble1.compareTo(mutableDouble7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0252");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0253");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        mutableDouble4.decrement();
        mutableDouble4.increment();
        mutableDouble4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableDouble0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0254");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.subtract((double) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0255");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double7);
        short short9 = mutableDouble8.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0256");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.add((double) 10);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableDouble0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0257");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0258");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        boolean boolean4 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble6.increment();
        mutableDouble1.setValue((java.lang.Number) mutableDouble6);
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "101.0" + "'", str9.equals("101.0"));
    }

    @Test
    public void MutableDouble0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0259");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.increment();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void MutableDouble0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0260");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        mutableDouble1.add((double) 1.0f);
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0261");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.0" + "'", str6.equals("2.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0262");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        java.lang.Double double4 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble6.add((double) 2L);
        mutableDouble1.setValue((java.lang.Number) mutableDouble6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
    }

    @Test
    public void MutableDouble0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0263");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
    }

    @Test
    public void MutableDouble0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0264");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean3 = mutableDouble1.equals((java.lang.Object) "1.0");
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableDouble0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0265");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 92 + "'", short6 == (short) 92);
    }

    @Test
    public void MutableDouble0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0266");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.add((double) 100.0f);
        int int5 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void MutableDouble0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0267");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double7);
        long long9 = mutableDouble8.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0268");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        long long8 = mutableDouble1.longValue();
        boolean boolean9 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0269");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        double double8 = mutableDouble1.doubleValue();
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0270");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.setValue(35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void MutableDouble0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0271");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        double double8 = mutableDouble1.doubleValue();
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableDouble0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0272");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        long long7 = mutableDouble1.longValue();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void MutableDouble0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0273");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble6.decrement();
        boolean boolean9 = mutableDouble4.equals((java.lang.Object) mutableDouble6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0274");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        java.lang.Double double3 = mutableDouble2.getValue();
        float float4 = mutableDouble2.floatValue();
        long long5 = mutableDouble2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void MutableDouble0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0275");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) (short) -1);
        double double7 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void MutableDouble0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0276");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        byte byte7 = mutableDouble4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableDouble0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0277");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble1.add((java.lang.Number) mutableDouble6);
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0278");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        int int8 = mutableDouble1.intValue();
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void MutableDouble0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0279");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        java.lang.Double double5 = mutableDouble0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
    }

    @Test
    public void MutableDouble0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0280");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble4.subtract((java.lang.Number) 0);
        java.lang.String str7 = mutableDouble4.toString();
        mutableDouble1.subtract((java.lang.Number) mutableDouble4);
        long long9 = mutableDouble4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0281");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.subtract((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0282");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float4 = mutableDouble3.floatValue();
        java.lang.String str5 = mutableDouble3.toString();
        double double6 = mutableDouble3.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble7);
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableDouble0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0283");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.increment();
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0284");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble4.subtract(3.0d);
    }

    @Test
    public void MutableDouble0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0285");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        float float4 = mutableDouble1.floatValue();
        boolean boolean5 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0286");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float4 = mutableDouble3.floatValue();
        java.lang.String str5 = mutableDouble3.toString();
        double double6 = mutableDouble3.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble7);
        mutableDouble7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0287");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 10.0f);
    }

    @Test
    public void MutableDouble0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0288");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.subtract((java.lang.Number) 99.0f);
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-99L) + "'", long9 == (-99L));
    }

    @Test
    public void MutableDouble0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0289");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.setValue(10.0d);
        boolean boolean7 = mutableDouble1.isInfinite();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableDouble0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0290");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        java.lang.String str7 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0" + "'", str7.equals("100.0"));
    }

    @Test
    public void MutableDouble0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0291");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        float float4 = mutableDouble1.floatValue();
        byte byte5 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5 == (byte) 99);
    }

    @Test
    public void MutableDouble0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0292");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble1.add(10.0d);
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0293");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        mutableDouble4.decrement();
        mutableDouble4.increment();
        java.lang.String str9 = mutableDouble4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableDouble0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0294");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        int int8 = mutableDouble1.intValue();
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableDouble0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0295");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.increment();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9.equals(2.0d));
    }

    @Test
    public void MutableDouble0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0296");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.setValue((java.lang.Number) (-100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0297");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float4 = mutableDouble3.floatValue();
        java.lang.String str5 = mutableDouble3.toString();
        double double6 = mutableDouble3.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble7);
        boolean boolean9 = mutableDouble7.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0298");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        long long7 = mutableDouble6.longValue();
        short short8 = mutableDouble6.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableDouble0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0299");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        mutableDouble1.subtract((java.lang.Number) 0L);
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableDouble0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0300");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.subtract((double) 0.0f);
        boolean boolean8 = mutableDouble1.isInfinite();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0301");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        java.lang.Double double8 = mutableDouble0.toDouble();
        byte byte9 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0302");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.setValue((double) '#');
        mutableDouble1.setValue(0.0d);
    }

    @Test
    public void MutableDouble0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0303");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-1.0d));
        mutableDouble1.add((double) (byte) 2);
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 4.0f + "'", float7 == 4.0f);
    }

    @Test
    public void MutableDouble0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0304");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.subtract((java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0305");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble3.setValue((double) (short) 100);
        mutableDouble3.decrement();
        int int7 = mutableDouble3.intValue();
        java.lang.Double double8 = mutableDouble3.toDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8.equals(99.0d));
    }

    @Test
    public void MutableDouble0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0306");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((double) 99.0f);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble5.add((double) 99.0f);
        mutableDouble1.setValue((java.lang.Number) 99.0f);
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.0d + "'", double9.equals(99.0d));
    }

    @Test
    public void MutableDouble0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0307");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float4 = mutableDouble3.floatValue();
        mutableDouble3.subtract((double) (byte) 100);
        mutableDouble3.setValue((double) (byte) 0);
        mutableDouble1.add((java.lang.Number) mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void MutableDouble0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0308");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0309");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.increment();
        java.lang.Double double7 = mutableDouble0.getValue();
        java.lang.String str8 = mutableDouble0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-99.0" + "'", str8.equals("-99.0"));
    }

    @Test
    public void MutableDouble0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0310");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0311");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableDouble0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0312");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        mutableDouble1.subtract((double) (short) 92);
    }

    @Test
    public void MutableDouble0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0313");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        mutableDouble1.subtract((double) 1);
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableDouble0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0314");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        int int8 = mutableDouble1.intValue();
        double double9 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void MutableDouble0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0315");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.setValue((double) (byte) 0);
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0316");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0317");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue(52.0d);
        double double9 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void MutableDouble0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0318");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        int int4 = mutableDouble0.intValue();
        mutableDouble0.setValue((double) (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void MutableDouble0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0319");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((java.lang.Number) 101.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0320");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
    }

    @Test
    public void MutableDouble0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0321");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble4);
        int int9 = mutableDouble4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0322");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        mutableDouble4.subtract((-1.0d));
        int int8 = mutableDouble1.compareTo(mutableDouble4);
        java.lang.Double double9 = mutableDouble4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9.equals(2.0d));
    }

    @Test
    public void MutableDouble0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0323");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 0.0f);
        mutableDouble1.setValue((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableDouble0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0324");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.decrement();
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void MutableDouble0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0325");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0326");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        mutableDouble4.subtract((-1.0d));
        int int8 = mutableDouble1.compareTo(mutableDouble4);
        short short9 = mutableDouble4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 2 + "'", short9 == (short) 2);
    }

    @Test
    public void MutableDouble0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0327");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0328");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0329");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.add((double) 100.0f);
        int int5 = mutableDouble1.intValue();
        float float6 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 101.0f + "'", float6 == 101.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0330");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0331");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        java.lang.Double double4 = mutableDouble1.getValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
    }

    @Test
    public void MutableDouble0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0332");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.decrement();
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableDouble0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0333");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double9 = mutableDouble8.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0334");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.add((double) 10);
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-89.0" + "'", str9.equals("-89.0"));
    }

    @Test
    public void MutableDouble0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0335");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble1.add(0.0d);
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0336");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        int int6 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0337");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableDouble0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0338");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-99.0");
        int int2 = mutableDouble1.intValue();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99) + "'", int2 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-99L) + "'", long3 == (-99L));
    }

    @Test
    public void MutableDouble0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0339");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            mutableDouble1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0340");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.add((double) (-1L));
        mutableDouble1.decrement();
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0341");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0342");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        float float7 = mutableDouble1.floatValue();
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-99.0f) + "'", float7 == (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -99 + "'", short8 == (short) -99);
    }

    @Test
    public void MutableDouble0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0343");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.increment();
        mutableDouble0.increment();
        mutableDouble0.setValue((double) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0344");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        boolean boolean7 = mutableDouble1.isInfinite();
        long long8 = mutableDouble1.longValue();
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void MutableDouble0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0345");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((java.lang.Number) 2L);
        mutableDouble1.subtract((java.lang.Number) 99);
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
    }

    @Test
    public void MutableDouble0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0346");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        double double6 = mutableDouble1.doubleValue();
        long long7 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0347");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        mutableDouble1.setValue((double) (-1));
        mutableDouble1.subtract((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0348");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.subtract((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0349");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0350");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        mutableDouble1.subtract(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
    }

    @Test
    public void MutableDouble0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0351");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        long long4 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void MutableDouble0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0352");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.subtract((java.lang.Number) (-1L));
        long long6 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
    }

    @Test
    public void MutableDouble0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0353");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        long long4 = mutableDouble1.longValue();
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableDouble0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0354");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        java.lang.Double double8 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0355");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        long long8 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void MutableDouble0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0356");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) (short) -1);
        mutableDouble1.increment();
        int int8 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0357");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.subtract((double) (short) 0);
        int int8 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0358");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        boolean boolean6 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0359");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        boolean boolean7 = mutableDouble1.isInfinite();
        mutableDouble1.add((double) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0360");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
    }

    @Test
    public void MutableDouble0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0361");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(92.0d);
    }

    @Test
    public void MutableDouble0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0362");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2.0f);
        mutableDouble1.add((java.lang.Number) 2.0f);
    }

    @Test
    public void MutableDouble0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0363");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        boolean boolean7 = mutableDouble4.isNaN();
        boolean boolean8 = mutableDouble4.isNaN();
        boolean boolean9 = mutableDouble4.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0364");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        mutableDouble1.add((double) (short) 0);
        long long7 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0365");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double4 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
    }

    @Test
    public void MutableDouble0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0366");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        float float4 = mutableDouble1.floatValue();
        byte byte5 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableDouble0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0367");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0368");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        long long6 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void MutableDouble0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0369");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        double double8 = mutableDouble1.doubleValue();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0370");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        java.lang.String str8 = mutableDouble7.toString();
        mutableDouble0.subtract((java.lang.Number) mutableDouble7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
    }

    @Test
    public void MutableDouble0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0371");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double5);
        mutableDouble6.add((double) (short) 2);
        byte byte9 = mutableDouble6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 3 + "'", byte9 == (byte) 3);
    }

    @Test
    public void MutableDouble0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0372");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableDouble0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0373");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        long long8 = mutableDouble1.longValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void MutableDouble0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0374");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        long long7 = mutableDouble6.longValue();
        java.lang.Double double8 = mutableDouble6.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
    }

    @Test
    public void MutableDouble0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0375");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble5.add((java.lang.Number) (byte) 100);
        java.lang.Double double8 = mutableDouble5.toDouble();
        mutableDouble1.add((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8.equals(100.0d));
    }

    @Test
    public void MutableDouble0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0376");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        float float4 = mutableDouble1.floatValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.subtract((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableDouble0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0377");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble5.decrement();
        mutableDouble5.subtract((double) (byte) 100);
        mutableDouble1.setValue((java.lang.Number) mutableDouble5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
    }

    @Test
    public void MutableDouble0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0378");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        long long5 = mutableDouble1.longValue();
        mutableDouble1.add(92.0d);
        mutableDouble1.add((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableDouble0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0379");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        boolean boolean2 = mutableDouble1.isInfinite();
        boolean boolean3 = mutableDouble1.isInfinite();
        boolean boolean4 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0380");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble2.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0381");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        long long6 = mutableDouble1.longValue();
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableDouble0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0382");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long6 = mutableDouble5.longValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        mutableDouble1.increment();
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0383");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 99);
    }

    @Test
    public void MutableDouble0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0384");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.decrement();
        mutableDouble1.setValue((java.lang.Number) 100.0d);
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void MutableDouble0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0385");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        boolean boolean2 = mutableDouble1.isNaN();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableDouble0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0386");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        mutableDouble5.subtract((double) (-1.0f));
        float float8 = mutableDouble5.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 3.0f + "'", float8 == 3.0f);
    }

    @Test
    public void MutableDouble0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0387");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0388");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("33.0");
    }

    @Test
    public void MutableDouble0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0389");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        mutableDouble4.setValue(51.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100.0f);
        int int9 = mutableDouble4.compareTo(mutableDouble8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableDouble0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0390");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.add((double) 99.0f);
        double double7 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void MutableDouble0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0391");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0392");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) (short) -1);
        mutableDouble1.increment();
        mutableDouble1.increment();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0393");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        java.lang.Double double3 = mutableDouble2.getValue();
        float float4 = mutableDouble2.floatValue();
        boolean boolean5 = mutableDouble2.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0394");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        double double7 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        long long9 = mutableDouble8.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void MutableDouble0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0395");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 0);
        int int9 = mutableDouble4.compareTo(mutableDouble8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0396");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        mutableDouble3.subtract((double) (byte) 100);
        boolean boolean7 = mutableDouble3.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0397");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) (-1));
        float float5 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void MutableDouble0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0398");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        long long4 = mutableDouble2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void MutableDouble0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0399");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.subtract((java.lang.Number) (-1L));
        boolean boolean6 = mutableDouble1.isInfinite();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
    }

    @Test
    public void MutableDouble0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0400");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.increment();
        java.lang.Double double7 = mutableDouble0.getValue();
        mutableDouble0.subtract((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
    }

    @Test
    public void MutableDouble0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0401");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        mutableDouble1.add((java.lang.Number) 52);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
    }

    @Test
    public void MutableDouble0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0402");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 10);
        mutableDouble1.subtract((double) 2.0f);
    }

    @Test
    public void MutableDouble0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0403");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.add((double) 10.0f);
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 11 + "'", short5 == (short) 11);
    }

    @Test
    public void MutableDouble0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0404");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        double double8 = mutableDouble1.doubleValue();
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableDouble0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0405");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.setValue((double) (byte) 100);
        mutableDouble4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0406");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 0.0f);
        int int8 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0407");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0408");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        short short3 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableDouble0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0409");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        float float4 = mutableDouble1.floatValue();
        java.lang.String str5 = mutableDouble1.toString();
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "99.0" + "'", str5.equals("99.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 99 + "'", byte6 == (byte) 99);
    }

    @Test
    public void MutableDouble0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0410");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '#');
        double double2 = mutableDouble1.doubleValue();
        boolean boolean3 = mutableDouble1.isNaN();
        boolean boolean4 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str7 = mutableDouble6.toString();
        java.lang.Double double8 = mutableDouble6.getValue();
        int int9 = mutableDouble1.compareTo(mutableDouble6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0" + "'", str7.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableDouble0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0411");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.decrement();
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0412");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.add((double) 10.0f);
        mutableDouble1.setValue((double) (short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }

    @Test
    public void MutableDouble0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0413");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 0.0f);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableDouble0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0414");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0415");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.decrement();
        mutableDouble1.setValue((java.lang.Number) 100.0d);
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100.0" + "'", str9.equals("100.0"));
    }

    @Test
    public void MutableDouble0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0416");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
    }

    @Test
    public void MutableDouble0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0417");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableDouble0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0418");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(35.0d);
    }

    @Test
    public void MutableDouble0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0419");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) -1);
    }

    @Test
    public void MutableDouble0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0420");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.increment();
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 2 + "'", byte7 == (byte) 2);
    }

    @Test
    public void MutableDouble0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0421");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        boolean boolean3 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0422");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableDouble0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0423");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        int int4 = mutableDouble1.intValue();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0424");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        mutableDouble4.increment();
        java.lang.Double double8 = mutableDouble4.getValue();
        long long9 = mutableDouble4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void MutableDouble0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0425");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        float float6 = mutableDouble1.floatValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0426");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.setValue(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0427");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        long long5 = mutableDouble1.longValue();
        mutableDouble1.add(92.0d);
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 93 + "'", int8 == 93);
    }

    @Test
    public void MutableDouble0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0428");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Double double2 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        long long4 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void MutableDouble0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0429");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        double double3 = mutableDouble1.doubleValue();
        mutableDouble1.setValue((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void MutableDouble0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0430");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        double double6 = mutableDouble1.doubleValue();
        java.lang.Double double7 = mutableDouble1.toDouble();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableDouble0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0431");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        long long8 = mutableDouble6.longValue();
        byte byte9 = mutableDouble6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0432");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.subtract(2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0433");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        java.lang.Double double5 = mutableDouble0.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble0.add((java.lang.Number) 100L);
        int int9 = mutableDouble0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0434");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        float float7 = mutableDouble1.floatValue();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableDouble0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0435");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 2);
        int int6 = mutableDouble5.intValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void MutableDouble0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0436");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        long long8 = mutableDouble1.longValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableDouble0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0437");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.subtract((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
    }

    @Test
    public void MutableDouble0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0438");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.setValue((double) (byte) 0);
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0439");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((double) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0440");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isInfinite();
        double double7 = mutableDouble1.doubleValue();
        boolean boolean8 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0441");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        mutableDouble1.add((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableDouble0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0442");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        float float2 = mutableDouble1.floatValue();
        double double3 = mutableDouble1.doubleValue();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0443");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.add((double) (-1L));
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
    }

    @Test
    public void MutableDouble0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0444");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0445");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isInfinite();
        java.lang.Double double5 = mutableDouble1.getValue();
        int int6 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-99) + "'", int6 == (-99));
    }

    @Test
    public void MutableDouble0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0446");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 52);
    }

    @Test
    public void MutableDouble0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0447");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-100));
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -100 + "'", byte2 == (byte) -100);
    }

    @Test
    public void MutableDouble0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0448");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.decrement();
        int int7 = mutableDouble1.intValue();
        mutableDouble1.subtract(35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableDouble0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0449");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.subtract((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0450");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble("1.0");
        int int6 = mutableDouble5.intValue();
        mutableDouble1.setValue((java.lang.Number) int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0451");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-1.0d));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble6.decrement();
        mutableDouble1.setValue((java.lang.Number) mutableDouble6);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0452");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0453");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableDouble0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0454");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        java.lang.String str3 = mutableDouble1.toString();
        java.lang.Double double4 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0" + "'", str3.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4.equals(100.0d));
    }

    @Test
    public void MutableDouble0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0455");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }

    @Test
    public void MutableDouble0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0456");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble4);
        float float6 = mutableDouble4.floatValue();
        mutableDouble4.add(0.0d);
        byte byte9 = mutableDouble4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0457");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.decrement();
        mutableDouble1.setValue((java.lang.Number) 100.0d);
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void MutableDouble0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0458");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        boolean boolean7 = mutableDouble4.isNaN();
        mutableDouble4.increment();
        short short9 = mutableDouble4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableDouble0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0459");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        mutableDouble0.subtract(0.0d);
        mutableDouble0.increment();
        java.lang.Double double7 = mutableDouble0.getValue();
        java.lang.Class<?> wildcardClass8 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0460");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        java.lang.Double double5 = mutableDouble1.getValue();
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableDouble0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0461");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 'a');
        java.lang.Double double7 = mutableDouble1.toDouble();
        java.lang.Double double8 = mutableDouble1.toDouble();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-97.0d) + "'", double7.equals((-97.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-97.0d) + "'", double8.equals((-97.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-97) + "'", int9 == (-97));
    }

    @Test
    public void MutableDouble0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0462");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3.equals(101.0d));
    }

    @Test
    public void MutableDouble0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0463");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble2.subtract((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0464");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        mutableDouble1.subtract((java.lang.Number) 51.0d);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -50 + "'", byte7 == (byte) -50);
    }

    @Test
    public void MutableDouble0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0465");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        int int9 = mutableDouble8.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableDouble0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0466");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        double double7 = mutableDouble1.doubleValue();
        boolean boolean8 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0467");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableDouble0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0468");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.subtract((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void MutableDouble0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0469");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        java.lang.Double double5 = mutableDouble0.toDouble();
        mutableDouble0.setValue((java.lang.Number) 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
    }

    @Test
    public void MutableDouble0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0470");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        double double6 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableDouble0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0471");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0472");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0473");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0f);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0474");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        long long2 = mutableDouble1.longValue();
        java.lang.String str3 = mutableDouble1.toString();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0" + "'", str3.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0475");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.subtract((java.lang.Number) (-1L));
        int int6 = mutableDouble1.intValue();
        int int7 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void MutableDouble0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0476");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) (short) -1);
        mutableDouble0.setValue((double) 1L);
        float float7 = mutableDouble0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableDouble0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0477");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        java.lang.Double double8 = mutableDouble1.getValue();
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0478");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        float float4 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble5.setValue((double) (short) 100);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) (short) 100);
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.0d + "'", double9.equals(99.0d));
    }

    @Test
    public void MutableDouble0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0479");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.setValue((double) (byte) 100);
        java.lang.Class<?> wildcardClass9 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0480");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        int int6 = mutableDouble1.compareTo(mutableDouble5);
        long long7 = mutableDouble1.longValue();
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0481");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.add((double) (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.0" + "'", str6.equals("2.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
    }

    @Test
    public void MutableDouble0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0482");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
    }

    @Test
    public void MutableDouble0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0483");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.decrement();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0484");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        boolean boolean7 = mutableDouble4.isNaN();
        boolean boolean8 = mutableDouble4.isNaN();
        long long9 = mutableDouble4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0485");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        float float2 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableDouble0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0486");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.increment();
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2.0" + "'", str9.equals("2.0"));
    }

    @Test
    public void MutableDouble0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0487");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        java.lang.Double double6 = mutableDouble1.toDouble();
        mutableDouble1.add((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.0d + "'", double6.equals(92.0d));
    }

    @Test
    public void MutableDouble0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0488");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble3.add((-10.0d));
        byte byte9 = mutableDouble3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -10 + "'", byte9 == (byte) -10);
    }

    @Test
    public void MutableDouble0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0489");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        float float5 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void MutableDouble0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0490");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.decrement();
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableDouble0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0491");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.setValue((double) (byte) 0);
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0492");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((java.lang.Number) 1);
        double double9 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableDouble0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0493");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.decrement();
        byte byte2 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void MutableDouble0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0494");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.increment();
        mutableDouble0.increment();
        mutableDouble0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0495");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0496");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        double double6 = mutableDouble1.doubleValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0497");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        int int8 = mutableDouble2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0498");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        java.lang.Double double6 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6.equals(10.0d));
    }

    @Test
    public void MutableDouble0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0499");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("1.0");
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.MutableDouble0500");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        boolean boolean7 = mutableDouble1.isNaN();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.0" + "'", str6.equals("2.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }
}

