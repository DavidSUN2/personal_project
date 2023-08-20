package MutableFloat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableFloat0 {

    public static boolean debug = false;

    @Test
    public void MutableFloat0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0001");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0002");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableFloat0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0003");
        // The following exception was thrown during execution in MutableFloat generation
        try {
            org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0004");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableFloat0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0005");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        short short6 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableFloat0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0006");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableFloat0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0007");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        float float8 = mutableFloat1.floatValue();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9.equals(0.0f));
    }

    @Test
    public void MutableFloat0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0008");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        byte byte3 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -100 + "'", byte3 == (byte) -100);
    }

    @Test
    public void MutableFloat0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0009");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableFloat0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0010");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        long long6 = mutableFloat1.longValue();
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0011");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0012");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void MutableFloat0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0013");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        java.lang.Float float5 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long8 = mutableFloat7.longValue();
        mutableFloat0.subtract((java.lang.Number) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void MutableFloat0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0014");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long7 = mutableFloat6.longValue();
        int int8 = mutableFloat0.compareTo(mutableFloat6);
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableFloat0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0015");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableFloat0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0016");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        java.lang.Class<?> wildcardClass6 = mutableFloat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0017");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        java.lang.Class<?> wildcardClass5 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0018");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float7 = mutableFloat6.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7.equals(10.0f));
    }

    @Test
    public void MutableFloat0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0019");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean7 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0020");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        java.lang.Float float5 = mutableFloat0.toFloat();
        java.lang.Class<?> wildcardClass6 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0021");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0022");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.subtract((java.lang.Number) mutableFloat7);
        short short9 = mutableFloat7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableFloat0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0023");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long7 = mutableFloat6.longValue();
        int int8 = mutableFloat0.compareTo(mutableFloat6);
        float float9 = mutableFloat6.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void MutableFloat0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0024");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        short short7 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableFloat0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0025");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        float float8 = mutableFloat1.floatValue();
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableFloat0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0026");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        java.lang.Class<?> wildcardClass4 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableFloat0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0027");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableFloat0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0028");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableFloat0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0029");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableFloat0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0030");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float4 = mutableFloat3.floatValue();
        java.lang.String str5 = mutableFloat3.toString();
        mutableFloat3.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
    }

    @Test
    public void MutableFloat0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0031");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int6 = mutableFloat5.intValue();
        short short7 = mutableFloat5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableFloat0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0032");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.increment();
        byte byte3 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableFloat0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0033");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        short short6 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableFloat0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0034");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.increment();
        double double6 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 101.0d + "'", double6 == 101.0d);
    }

    @Test
    public void MutableFloat0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0035");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.subtract((float) (byte) -1);
        mutableFloat1.add((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableFloat0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0036");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat4.getValue();
        float float7 = mutableFloat4.floatValue();
        java.lang.Class<?> wildcardClass8 = mutableFloat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0037");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean7 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            int int9 = mutableFloat1.compareTo(mutableFloat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0038");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        double double9 = mutableFloat6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableFloat0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0039");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long7 = mutableFloat6.longValue();
        int int8 = mutableFloat0.compareTo(mutableFloat6);
        java.lang.Class<?> wildcardClass9 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0040");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -8 + "'", byte7 == (byte) -8);
    }

    @Test
    public void MutableFloat0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0041");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        double double7 = mutableFloat1.doubleValue();
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableFloat0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0042");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0043");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        mutableFloat6.add((float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0044");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((java.lang.Number) (byte) 10);
        mutableFloat1.subtract(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0045");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.subtract((float) (byte) -1);
        java.lang.Float float8 = mutableFloat1.toFloat();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 11.0f + "'", float8.equals(11.0f));
    }

    @Test
    public void MutableFloat0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0046");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
    }

    @Test
    public void MutableFloat0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0047");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableFloat0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0048");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        byte byte5 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -100 + "'", byte5 == (byte) -100);
    }

    @Test
    public void MutableFloat0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0049");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int7 = mutableFloat3.compareTo(mutableFloat6);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        boolean boolean9 = mutableFloat3.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0050");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat6.subtract((float) 10L);
        int int9 = mutableFloat4.compareTo(mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableFloat0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0051");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        boolean boolean7 = mutableFloat4.isNaN();
        byte byte8 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableFloat0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0052");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void MutableFloat0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0053");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.subtract((float) (byte) -1);
        java.lang.Float float8 = mutableFloat1.toFloat();
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 11.0f + "'", float8.equals(11.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0054");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        int int6 = mutableFloat3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableFloat0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0055");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.Class<?> wildcardClass6 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0056");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int7 = mutableFloat3.compareTo(mutableFloat6);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Class<?> wildcardClass9 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0057");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        java.lang.Class<?> wildcardClass6 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0058");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0059");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableFloat0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0060");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str5 = mutableFloat4.toString();
        mutableFloat4.subtract(100.0f);
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableFloat0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0061");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        int int9 = mutableFloat6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableFloat0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0062");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0063");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0064");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int7 = mutableFloat3.compareTo(mutableFloat6);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Float float9 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 33.0f + "'", float9.equals(33.0f));
    }

    @Test
    public void MutableFloat0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0065");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        java.lang.Float float7 = mutableFloat1.toFloat();
        mutableFloat1.subtract((float) (byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-8.0f) + "'", float7.equals((-8.0f)));
    }

    @Test
    public void MutableFloat0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0066");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean6 = mutableFloat4.equals((java.lang.Object) (byte) 100);
        mutableFloat4.subtract((java.lang.Number) 0);
        boolean boolean9 = mutableFloat1.equals((java.lang.Object) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableFloat0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0067");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (short) 10);
        java.lang.Float float2 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
    }

    @Test
    public void MutableFloat0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0068");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableFloat0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0069");
        // The following exception was thrown during execution in MutableFloat generation
        try {
            org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0070");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        java.lang.Float float9 = mutableFloat8.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9.equals(100.0f));
    }

    @Test
    public void MutableFloat0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0071");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        short short9 = mutableFloat6.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableFloat0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0072");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat1.subtract((float) (short) 1);
        java.lang.Float float8 = mutableFloat1.toFloat();
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1.0" + "'", str9.equals("-1.0"));
    }

    @Test
    public void MutableFloat0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0073");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        long long7 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void MutableFloat0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0074");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0075");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            mutableFloat1.subtract(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0076");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        double double7 = mutableFloat1.doubleValue();
        double double8 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableFloat0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0077");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        double double6 = mutableFloat1.doubleValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            int int9 = mutableFloat1.compareTo(mutableFloat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0078");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((float) '#');
        java.lang.Class<?> wildcardClass4 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableFloat0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0079");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        int int9 = mutableFloat1.compareTo(mutableFloat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableFloat0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0080");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.subtract((java.lang.Number) 1L);
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableFloat0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0081");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        long long7 = mutableFloat3.longValue();
        mutableFloat3.setValue(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableFloat0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0082");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        long long3 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void MutableFloat0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0083");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        mutableFloat3.decrement();
        mutableFloat3.decrement();
        boolean boolean9 = mutableFloat3.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0084");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) 1L);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0085");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0086");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        double double2 = mutableFloat0.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float5 = mutableFloat4.floatValue();
        java.lang.String str6 = mutableFloat4.toString();
        mutableFloat4.setValue((float) 10);
        mutableFloat0.setValue((java.lang.Number) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
    }

    @Test
    public void MutableFloat0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0087");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableFloat0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0088");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void MutableFloat0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0089");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.subtract((java.lang.Number) mutableFloat7);
        byte byte9 = mutableFloat7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableFloat0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0090");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0091");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("100.0");
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableFloat0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0092");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableFloat0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0093");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void MutableFloat0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0094");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.decrement();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 99 + "'", short8 == (short) 99);
    }

    @Test
    public void MutableFloat0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0095");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        boolean boolean9 = mutableFloat6.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0096");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        int int8 = mutableFloat1.intValue();
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0097");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        float float4 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
    }

    @Test
    public void MutableFloat0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0098");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        mutableFloat1.setValue((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void MutableFloat0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0099");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        long long6 = mutableFloat4.longValue();
        boolean boolean8 = mutableFloat4.equals((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass9 = mutableFloat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0100");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        double double2 = mutableFloat0.doubleValue();
        short short3 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableFloat0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0101");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.add((float) (short) 100);
        boolean boolean9 = mutableFloat3.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0102");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0103");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.increment();
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
    }

    @Test
    public void MutableFloat0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0104");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.add((float) (byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0105");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean2 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0106");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        boolean boolean6 = mutableFloat1.isNaN();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableFloat0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0107");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0108");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat1.add(2.0f);
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0109");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat2.subtract((java.lang.Number) 100L);
        java.lang.Float float5 = mutableFloat2.toFloat();
        mutableFloat1.add((java.lang.Number) mutableFloat2);
        mutableFloat2.subtract(22.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-100.0f) + "'", float5.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0110");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        mutableFloat1.setValue((-37.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
    }

    @Test
    public void MutableFloat0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0111");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        boolean boolean6 = mutableFloat1.isNaN();
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableFloat0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0112");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat7);
        int int9 = mutableFloat7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void MutableFloat0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0113");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((java.lang.Number) (byte) 10);
        java.lang.Float float8 = mutableFloat1.getValue();
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableFloat0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0114");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableFloat0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0115");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
    }

    @Test
    public void MutableFloat0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0116");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.subtract((java.lang.Number) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0117");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableFloat0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0118");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.subtract((float) 10L);
        mutableFloat4.decrement();
        java.lang.Float float9 = mutableFloat4.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-11.0f) + "'", float9.equals((-11.0f)));
    }

    @Test
    public void MutableFloat0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0119");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float7 = mutableFloat6.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        boolean boolean9 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0120");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat6.subtract((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0121");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) (byte) 1);
        mutableFloat1.add((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0122");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        byte byte8 = mutableFloat6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void MutableFloat0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0123");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        byte byte7 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableFloat0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0124");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.add((float) (short) 1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0125");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void MutableFloat0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0126");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
    }

    @Test
    public void MutableFloat0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0127");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 35 + "'", short3 == (short) 35);
    }

    @Test
    public void MutableFloat0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0128");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 1L);
        java.lang.Class<?> wildcardClass7 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0129");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        mutableFloat1.setValue((float) (byte) -100);
        double double4 = mutableFloat1.doubleValue();
        boolean boolean5 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0130");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void MutableFloat0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0131");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableFloat0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0132");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        mutableFloat4.subtract((java.lang.Number) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0133");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        boolean boolean8 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0134");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat4.add((java.lang.Number) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0135");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat1.subtract((float) (short) 1);
        long long8 = mutableFloat1.longValue();
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1.0" + "'", str9.equals("-1.0"));
    }

    @Test
    public void MutableFloat0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0136");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0137");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0138");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float6 = mutableFloat5.getValue();
        mutableFloat1.subtract((java.lang.Number) float6);
        boolean boolean8 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0139");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        boolean boolean4 = mutableFloat1.equals((java.lang.Object) "10.0");
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5.equals(2.0f));
    }

    @Test
    public void MutableFloat0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0140");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.subtract((float) (short) 10);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0141");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((float) (byte) 10);
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 20L + "'", long4 == 20L);
    }

    @Test
    public void MutableFloat0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0142");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat7);
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableFloat0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0143");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0144");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        short short6 = mutableFloat5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableFloat0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0145");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableFloat0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0146");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        mutableFloat1.increment();
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void MutableFloat0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0147");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        java.lang.Float float7 = mutableFloat3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7.equals((-1.0f)));
    }

    @Test
    public void MutableFloat0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0148");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((float) (byte) 9);
        java.lang.String str9 = mutableFloat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void MutableFloat0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0149");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        long long6 = mutableFloat1.longValue();
        mutableFloat1.add((float) 100L);
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "101.0" + "'", str9.equals("101.0"));
    }

    @Test
    public void MutableFloat0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0150");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableFloat0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0151");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        int int6 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void MutableFloat0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0152");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            int int9 = mutableFloat1.compareTo(mutableFloat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0153");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        mutableFloat1.decrement();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 99 + "'", short8 == (short) 99);
    }

    @Test
    public void MutableFloat0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0154");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        boolean boolean8 = mutableFloat1.isNaN();
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableFloat0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0155");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat6.add((float) 20L);
        java.lang.Float float9 = mutableFloat6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 30.0f + "'", float9.equals(30.0f));
    }

    @Test
    public void MutableFloat0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0156");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        long long5 = mutableFloat1.longValue();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0157");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
    }

    @Test
    public void MutableFloat0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0158");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat6.add((float) 20L);
        byte byte9 = mutableFloat6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 30 + "'", byte9 == (byte) 30);
    }

    @Test
    public void MutableFloat0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0159");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        byte byte7 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableFloat0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0160");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        int int3 = mutableFloat1.intValue();
        mutableFloat1.setValue((java.lang.Number) 20.0d);
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableFloat0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0161");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        mutableFloat4.subtract((-1.0f));
        mutableFloat4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0162");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 101 + "'", byte2 == (byte) 101);
    }

    @Test
    public void MutableFloat0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0163");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long7 = mutableFloat6.longValue();
        int int8 = mutableFloat0.compareTo(mutableFloat6);
        int int9 = mutableFloat6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableFloat0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0164");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        mutableFloat1.increment();
        mutableFloat1.add((-8.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void MutableFloat0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0165");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Float float6 = mutableFloat5.getValue();
        java.lang.Float float7 = mutableFloat5.getValue();
        java.lang.Class<?> wildcardClass8 = mutableFloat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0166");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableFloat0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0167");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        mutableFloat1.add((float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
    }

    @Test
    public void MutableFloat0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0168");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract(100.0f);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0169");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableFloat0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0170");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.add(22.0f);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 23 + "'", short6 == (short) 23);
    }

    @Test
    public void MutableFloat0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0171");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        byte byte3 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 35 + "'", byte3 == (byte) 35);
    }

    @Test
    public void MutableFloat0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0172");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        int int3 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat5.subtract((java.lang.Number) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableFloat0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0173");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Float float6 = mutableFloat5.getValue();
        java.lang.Float float7 = mutableFloat5.getValue();
        mutableFloat5.subtract((float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0174");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((float) (byte) 9);
        byte byte9 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableFloat0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0175");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean5 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0176");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        mutableFloat1.subtract(11.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0177");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        mutableFloat1.add((float) (byte) 1);
        java.lang.Float float8 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8.equals(2.0f));
    }

    @Test
    public void MutableFloat0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0178");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        byte byte4 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableFloat0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0179");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        mutableFloat1.subtract(10.0f);
        long long8 = mutableFloat1.longValue();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8 == (-10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -10 + "'", byte9 == (byte) -10);
    }

    @Test
    public void MutableFloat0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0180");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.String str8 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
    }

    @Test
    public void MutableFloat0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0181");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((float) (byte) 9);
        double double9 = mutableFloat3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableFloat0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0182");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat1.subtract((float) (short) 1);
        java.lang.Float float8 = mutableFloat1.toFloat();
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableFloat0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0183");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.increment();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 36 + "'", short5 == (short) 36);
    }

    @Test
    public void MutableFloat0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0184");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean7 = mutableFloat1.isInfinite();
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0185");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        boolean boolean2 = mutableFloat1.isNaN();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0186");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.decrement();
        float float8 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8 == 99.0f);
    }

    @Test
    public void MutableFloat0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0187");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Float float3 = mutableFloat1.toFloat();
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableFloat0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0188");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        mutableFloat0.setValue((float) (byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0189");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) -8);
    }

    @Test
    public void MutableFloat0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0190");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean5 = mutableFloat4.isInfinite();
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        java.lang.Float float7 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 25.0f + "'", float7.equals(25.0f));
    }

    @Test
    public void MutableFloat0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0191");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.setValue((float) (byte) -8);
        mutableFloat1.subtract((float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0192");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float7 = mutableFloat6.floatValue();
        int int8 = mutableFloat6.intValue();
        int int9 = mutableFloat4.compareTo(mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableFloat0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0193");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        double double6 = mutableFloat1.doubleValue();
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableFloat0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0194");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        double double6 = mutableFloat1.doubleValue();
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0195");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void MutableFloat0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0196");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat1.setValue((float) 35);
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 35 + "'", short7 == (short) 35);
    }

    @Test
    public void MutableFloat0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0197");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        java.lang.String str6 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
    }

    @Test
    public void MutableFloat0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0198");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        java.lang.Float float4 = mutableFloat1.toFloat();
        int int5 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void MutableFloat0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0199");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        mutableFloat4.add((float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableFloat0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0200");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 32);
        boolean boolean2 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0201");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) double2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0202");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.add((float) (short) 1);
        mutableFloat1.add((float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0203");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Float float5 = mutableFloat3.getValue();
        float float6 = mutableFloat3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void MutableFloat0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0204");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        double double5 = mutableFloat1.doubleValue();
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableFloat0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0205");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.add((float) (byte) 100);
        mutableFloat1.add((float) (short) 100);
    }

    @Test
    public void MutableFloat0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0206");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        int int3 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        boolean boolean6 = mutableFloat5.isNaN();
        java.lang.Float float7 = mutableFloat5.toFloat();
        mutableFloat1.setValue((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0207");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        double double6 = mutableFloat1.doubleValue();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableFloat0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0208");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.add((-8.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
    }

    @Test
    public void MutableFloat0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0209");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        double double3 = mutableFloat1.doubleValue();
        mutableFloat1.increment();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableFloat0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0210");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat2.subtract((java.lang.Number) 100L);
        java.lang.Float float5 = mutableFloat2.toFloat();
        mutableFloat1.add((java.lang.Number) mutableFloat2);
        java.lang.Class<?> wildcardClass7 = mutableFloat2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-100.0f) + "'", float5.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0211");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        java.lang.Float float8 = mutableFloat4.getValue();
        short short9 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableFloat0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0212");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.add((float) (short) 100);
        java.lang.String str9 = mutableFloat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "110.0" + "'", str9.equals("110.0"));
    }

    @Test
    public void MutableFloat0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0213");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0214");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((float) (byte) 9);
        int int9 = mutableFloat3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableFloat0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0215");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        double double4 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) double4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void MutableFloat0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0216");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        mutableFloat6.setValue((float) (byte) -100);
        java.lang.Class<?> wildcardClass9 = mutableFloat6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0217");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        java.lang.Float float8 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass9 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0218");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0219");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat5.setValue(200.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0220");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        mutableFloat4.subtract((-1.0f));
        double double9 = mutableFloat4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void MutableFloat0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0221");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        double double7 = mutableFloat3.doubleValue();
        mutableFloat3.add((-100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableFloat0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0222");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.decrement();
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableFloat0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0223");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        long long7 = mutableFloat1.longValue();
        int int8 = mutableFloat1.intValue();
        float float9 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableFloat0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0224");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat6.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableFloat0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0225");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '4');
        mutableFloat1.subtract((float) 2);
    }

    @Test
    public void MutableFloat0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0226");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        double double7 = mutableFloat3.doubleValue();
        float float8 = mutableFloat3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableFloat0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0227");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.Float float2 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
    }

    @Test
    public void MutableFloat0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0228");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.increment();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -89 + "'", short8 == (short) -89);
    }

    @Test
    public void MutableFloat0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0229");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        boolean boolean6 = mutableFloat5.isInfinite();
        byte byte7 = mutableFloat5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableFloat0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0230");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        mutableFloat3.decrement();
        mutableFloat3.decrement();
        double double9 = mutableFloat3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.0d + "'", double9 == 8.0d);
    }

    @Test
    public void MutableFloat0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0231");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float5 = mutableFloat4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
    }

    @Test
    public void MutableFloat0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0232");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int4 = mutableFloat1.intValue();
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0" + "'", str5.equals("10.0"));
    }

    @Test
    public void MutableFloat0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0233");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.add((float) 100);
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0234");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        java.lang.String str4 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            int int6 = mutableFloat1.compareTo(mutableFloat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0" + "'", str4.equals("-1.0"));
    }

    @Test
    public void MutableFloat0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0235");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float4 = mutableFloat3.floatValue();
        java.lang.String str5 = mutableFloat3.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void MutableFloat0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0236");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        boolean boolean2 = mutableFloat1.isNaN();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0237");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        double double6 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1L));
        mutableFloat1.add((java.lang.Number) mutableFloat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableFloat0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0238");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        long long8 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 101L + "'", long8 == 101L);
    }

    @Test
    public void MutableFloat0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0239");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableFloat0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0240");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.String str8 = mutableFloat6.toString();
        short short9 = mutableFloat6.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100.0" + "'", str8.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableFloat0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0241");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float7 = mutableFloat6.getValue();
        mutableFloat6.decrement();
        boolean boolean9 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0242");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.setValue((float) (short) 100);
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void MutableFloat0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0243");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float4 = mutableFloat3.floatValue();
        mutableFloat3.subtract((float) (short) 0);
        boolean boolean7 = mutableFloat3.isNaN();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) boolean7);
        java.lang.Float float9 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9.equals(32.0f));
    }

    @Test
    public void MutableFloat0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0244");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("32.0");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float4 = mutableFloat3.floatValue();
        boolean boolean5 = mutableFloat3.isInfinite();
        boolean boolean6 = mutableFloat3.isInfinite();
        long long7 = mutableFloat3.longValue();
        mutableFloat1.subtract((java.lang.Number) long7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void MutableFloat0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0245");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        int int2 = mutableFloat1.intValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.increment();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void MutableFloat0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0246");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        long long4 = mutableFloat1.longValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableFloat0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0247");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean6 = mutableFloat1.isInfinite();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableFloat0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0248");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat5.longValue();
        short short7 = mutableFloat5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableFloat0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0249");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0250");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((java.lang.Number) (byte) 10);
        mutableFloat1.setValue(33.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0251");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        mutableFloat3.subtract((float) 0);
    }

    @Test
    public void MutableFloat0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0252");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        java.lang.Float float8 = mutableFloat1.toFloat();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9.equals(1.0f));
    }

    @Test
    public void MutableFloat0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0253");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        java.lang.Float float4 = mutableFloat1.toFloat();
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 35 + "'", byte5 == (byte) 35);
    }

    @Test
    public void MutableFloat0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0254");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str2 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean6 = mutableFloat4.equals((java.lang.Object) (byte) 100);
        mutableFloat4.subtract((java.lang.Number) 0);
        boolean boolean9 = mutableFloat1.equals((java.lang.Object) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0255");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat4.getValue();
        float float7 = mutableFloat4.floatValue();
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableFloat4.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0256");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void MutableFloat0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0257");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.add((float) 100);
        float float8 = mutableFloat1.floatValue();
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 200.0f + "'", float8 == 200.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 200 + "'", short9 == (short) 200);
    }

    @Test
    public void MutableFloat0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0258");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.decrement();
    }

    @Test
    public void MutableFloat0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0259");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        mutableFloat1.add(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void MutableFloat0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0260");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        boolean boolean8 = mutableFloat1.isNaN();
        long long9 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableFloat0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0261");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.decrement();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat6.setValue((float) (byte) 10);
        mutableFloat1.setValue((java.lang.Number) mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0262");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.subtract((java.lang.Number) mutableFloat7);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0263");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long9 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableFloat0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0264");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        mutableFloat1.setValue((float) (byte) -100);
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -100 + "'", byte4 == (byte) -100);
    }

    @Test
    public void MutableFloat0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0265");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.increment();
        mutableFloat0.setValue((float) (short) 10);
        mutableFloat0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0266");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void MutableFloat0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0267");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        mutableFloat4.decrement();
        mutableFloat4.setValue((float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0268");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        mutableFloat4.subtract((-1.0f));
        java.lang.Float float9 = mutableFloat4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9.equals(2.0f));
    }

    @Test
    public void MutableFloat0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0269");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        mutableFloat1.add((float) 1L);
        boolean boolean8 = mutableFloat1.isInfinite();
        long long9 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void MutableFloat0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0270");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0271");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            mutableFloat1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0272");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        int int6 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableFloat0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0273");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean6 = mutableFloat3.isNaN();
        short short7 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableFloat0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0274");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-10L));
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -10 + "'", byte2 == (byte) -10);
    }

    @Test
    public void MutableFloat0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0275");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        int int6 = mutableFloat4.intValue();
        short short7 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableFloat0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0276");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        float float3 = mutableFloat1.floatValue();
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableFloat0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0277");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        double double5 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void MutableFloat0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0278");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat5.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat5);
        boolean boolean9 = mutableFloat1.equals((java.lang.Object) mutableFloat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0279");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        java.lang.String str9 = mutableFloat6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100.0" + "'", str9.equals("100.0"));
    }

    @Test
    public void MutableFloat0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0280");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.String str8 = mutableFloat6.toString();
        java.lang.Float float9 = mutableFloat6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100.0" + "'", str8.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9.equals(100.0f));
    }

    @Test
    public void MutableFloat0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0281");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean5 = mutableFloat4.isInfinite();
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 25 + "'", short7 == (short) 25);
    }

    @Test
    public void MutableFloat0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0282");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        float float8 = mutableFloat6.floatValue();
        mutableFloat6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void MutableFloat0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0283");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.setValue((float) (byte) 10);
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableFloat0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0284");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.add((float) (byte) 101);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0285");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.subtract((java.lang.Number) 1.0d);
    }

    @Test
    public void MutableFloat0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0286");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.increment();
        mutableFloat1.increment();
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-88) + "'", int9 == (-88));
    }

    @Test
    public void MutableFloat0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0287");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-11.0f));
    }

    @Test
    public void MutableFloat0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0288");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        int int6 = mutableFloat4.intValue();
        double double7 = mutableFloat4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableFloat0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0289");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        int int4 = mutableFloat3.intValue();
        int int5 = mutableFloat1.compareTo(mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableFloat0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0290");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.decrement();
        mutableFloat1.add((float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
    }

    @Test
    public void MutableFloat0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0291");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void MutableFloat0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0292");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) (byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0293");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract(2.0f);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -3 + "'", byte5 == (byte) -3);
    }

    @Test
    public void MutableFloat0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0294");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        mutableFloat4.add((float) (short) 36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0295");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-8) + "'", int7 == (-8));
    }

    @Test
    public void MutableFloat0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0296");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        int int4 = mutableFloat1.compareTo(mutableFloat3);
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0" + "'", str5.equals("32.0"));
    }

    @Test
    public void MutableFloat0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0297");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.add(1.0f);
        mutableFloat1.setValue((float) (-8L));
    }

    @Test
    public void MutableFloat0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0298");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0.0d);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0299");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float3 = mutableFloat1.floatValue();
        boolean boolean4 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0300");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Float float6 = mutableFloat5.getValue();
        short short7 = mutableFloat5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableFloat0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0301");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Float float6 = mutableFloat5.getValue();
        java.lang.Float float7 = mutableFloat5.getValue();
        mutableFloat5.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0302");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean2 = mutableFloat1.isInfinite();
        java.lang.Float float3 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3.equals(10.0f));
    }

    @Test
    public void MutableFloat0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0303");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0.0d);
        mutableFloat1.subtract((java.lang.Number) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
    }

    @Test
    public void MutableFloat0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0304");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        mutableFloat0.subtract(10.0f);
        java.lang.String str7 = mutableFloat0.toString();
        short short8 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-110.0" + "'", str7.equals("-110.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -110 + "'", short8 == (short) -110);
    }

    @Test
    public void MutableFloat0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0305");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.String str8 = mutableFloat6.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100.0" + "'", str8.equals("100.0"));
    }

    @Test
    public void MutableFloat0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0306");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(30.0f);
    }

    @Test
    public void MutableFloat0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0307");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        boolean boolean2 = mutableFloat1.isNaN();
        double double3 = mutableFloat1.doubleValue();
        float float4 = mutableFloat1.floatValue();
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
    }

    @Test
    public void MutableFloat0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0308");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        java.lang.String str3 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10.0" + "'", str3.equals("10.0"));
    }

    @Test
    public void MutableFloat0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0309");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0.0d);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableFloat0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0310");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 32L);
    }

    @Test
    public void MutableFloat0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0311");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-31.0f));
        java.lang.Float float2 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-31.0f) + "'", float2.equals((-31.0f)));
    }

    @Test
    public void MutableFloat0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0312");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.add((float) (byte) 1);
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2.0" + "'", str9.equals("2.0"));
    }

    @Test
    public void MutableFloat0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0313");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0314");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 35L);
        java.lang.Float float2 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
    }

    @Test
    public void MutableFloat0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0315");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((float) (byte) 10);
        double double4 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void MutableFloat0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0316");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float6 = mutableFloat5.getValue();
        mutableFloat1.subtract((java.lang.Number) float6);
        double double8 = mutableFloat1.doubleValue();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 65 + "'", byte9 == (byte) 65);
    }

    @Test
    public void MutableFloat0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0317");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9.equals(0.0f));
    }

    @Test
    public void MutableFloat0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0318");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isInfinite();
        java.lang.Float float4 = mutableFloat0.toFloat();
        long long5 = mutableFloat0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-100L) + "'", long5 == (-100L));
    }

    @Test
    public void MutableFloat0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0319");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.add((float) (short) 1);
        mutableFloat1.setValue((-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0320");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean5 = mutableFloat4.isInfinite();
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        float float7 = mutableFloat4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableFloat0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0321");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0322");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        boolean boolean7 = mutableFloat1.isNaN();
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableFloat0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0323");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0324");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
    }

    @Test
    public void MutableFloat0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0325");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0326");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Float float5 = mutableFloat3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
    }

    @Test
    public void MutableFloat0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0327");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        java.lang.Float float7 = mutableFloat1.toFloat();
        long long8 = mutableFloat1.longValue();
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-8.0f) + "'", float7.equals((-8.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-8L) + "'", long8 == (-8L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-8.0d) + "'", double9 == (-8.0d));
    }

    @Test
    public void MutableFloat0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0328");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long7 = mutableFloat6.longValue();
        int int8 = mutableFloat0.compareTo(mutableFloat6);
        java.lang.String str9 = mutableFloat6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableFloat0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0329");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        double double5 = mutableFloat3.doubleValue();
        java.lang.Class<?> wildcardClass6 = mutableFloat3.getClass();
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0330");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.decrement();
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 99 + "'", byte8 == (byte) 99);
    }

    @Test
    public void MutableFloat0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0331");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        long long7 = mutableFloat3.longValue();
        boolean boolean8 = mutableFloat3.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0332");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat7);
        mutableFloat7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0333");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long5 = mutableFloat4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableFloat0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0334");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        int int6 = mutableFloat4.intValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        boolean boolean8 = mutableFloat4.isNaN();
        mutableFloat4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0335");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        java.lang.Float float6 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
    }

    @Test
    public void MutableFloat0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0336");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat5.increment();
        java.lang.Float float7 = mutableFloat5.toFloat();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat5);
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0337");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        mutableFloat0.increment();
        boolean boolean5 = mutableFloat0.isInfinite();
        mutableFloat0.subtract((float) (byte) 1);
        int int8 = mutableFloat0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-100) + "'", int8 == (-100));
    }

    @Test
    public void MutableFloat0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0338");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        long long6 = mutableFloat4.longValue();
        boolean boolean8 = mutableFloat4.equals((java.lang.Object) 1);
        double double9 = mutableFloat4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableFloat0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0339");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -110);
    }

    @Test
    public void MutableFloat0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0340");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        mutableFloat1.decrement();
        mutableFloat1.add((float) 2);
    }

    @Test
    public void MutableFloat0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0341");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        java.lang.Float float3 = mutableFloat1.toFloat();
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-2.0f) + "'", float3.equals((-2.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -2 + "'", byte4 == (byte) -2);
    }

    @Test
    public void MutableFloat0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0342");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        short short5 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -100 + "'", short5 == (short) -100);
    }

    @Test
    public void MutableFloat0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0343");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 32 + "'", byte5 == (byte) 32);
    }

    @Test
    public void MutableFloat0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0344");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.add((float) (byte) 101);
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 201.0f + "'", float6.equals(201.0f));
    }

    @Test
    public void MutableFloat0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0345");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.increment();
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0346");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        boolean boolean8 = mutableFloat7.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0347");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        mutableFloat1.subtract((float) (short) 101);
    }

    @Test
    public void MutableFloat0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0348");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        float float7 = mutableFloat3.floatValue();
        mutableFloat3.setValue((float) (short) -89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableFloat0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0349");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat5.increment();
        java.lang.Float float7 = mutableFloat5.toFloat();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat5);
        float float9 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
    }

    @Test
    public void MutableFloat0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0350");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        boolean boolean2 = mutableFloat1.isNaN();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0351");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        mutableFloat6.setValue((float) (byte) -100);
        java.lang.Float float9 = mutableFloat6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-100.0f) + "'", float9.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0352");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        boolean boolean5 = mutableFloat4.isNaN();
        boolean boolean6 = mutableFloat4.isInfinite();
        int int7 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat4.add((float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableFloat0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0353");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        short short3 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -100 + "'", short3 == (short) -100);
    }

    @Test
    public void MutableFloat0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0354");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableFloat0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0355");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            mutableFloat1.add(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0356");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float4 = mutableFloat3.floatValue();
        java.lang.String str5 = mutableFloat3.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        mutableFloat1.add(3.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0357");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        long long6 = mutableFloat3.longValue();
        boolean boolean7 = mutableFloat3.isInfinite();
        boolean boolean9 = mutableFloat3.equals((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0358");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '4');
        float float2 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void MutableFloat0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0359");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        boolean boolean6 = mutableFloat1.isInfinite();
        boolean boolean7 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Class<?> wildcardClass9 = mutableFloat8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0360");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long5 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableFloat0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0361");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        short short4 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableFloat0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0362");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.add(35.0f);
        java.lang.Float float9 = mutableFloat4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9.equals(35.0f));
    }

    @Test
    public void MutableFloat0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0363");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.add(22.0f);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0364");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.increment();
        boolean boolean7 = mutableFloat4.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0365");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        boolean boolean4 = mutableFloat1.equals((java.lang.Object) "10.0");
        mutableFloat1.increment();
        int int6 = mutableFloat1.intValue();
        mutableFloat1.add((float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void MutableFloat0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0366");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        boolean boolean6 = mutableFloat1.isNaN();
        double double7 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableFloat0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0367");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        boolean boolean6 = mutableFloat1.isNaN();
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0368");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 100);
        java.lang.Class<?> wildcardClass8 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0369");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) ' ');
        boolean boolean5 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0370");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float4 = mutableFloat3.floatValue();
        mutableFloat3.subtract((float) (short) 0);
        boolean boolean7 = mutableFloat3.isNaN();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) boolean7);
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32.0" + "'", str9.equals("32.0"));
    }

    @Test
    public void MutableFloat0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0371");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long5 = mutableFloat4.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int8 = mutableFloat4.compareTo(mutableFloat7);
        int int9 = mutableFloat1.compareTo(mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableFloat0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0372");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        double double6 = mutableFloat1.doubleValue();
        mutableFloat1.add((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableFloat0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0373");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        int int4 = mutableFloat1.compareTo(mutableFloat3);
        long long5 = mutableFloat3.longValue();
        mutableFloat3.subtract(10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void MutableFloat0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0374");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        java.lang.Float float7 = mutableFloat1.toFloat();
        long long8 = mutableFloat1.longValue();
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-8.0f) + "'", float7.equals((-8.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-8L) + "'", long8 == (-8L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
    }

    @Test
    public void MutableFloat0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0375");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat1.add(2.0f);
        java.lang.Float float8 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 3.0f + "'", float8.equals(3.0f));
    }

    @Test
    public void MutableFloat0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0376");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Object obj3 = null;
        boolean boolean4 = mutableFloat1.equals(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0377");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        java.lang.Object obj2 = null;
        boolean boolean3 = mutableFloat1.equals(obj2);
        java.lang.String str4 = mutableFloat1.toString();
        boolean boolean5 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0" + "'", str4.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0378");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.subtract((java.lang.Number) 100L);
        java.lang.Float float4 = mutableFloat1.toFloat();
        mutableFloat1.add((float) 0L);
        mutableFloat0.setValue((java.lang.Number) 0L);
        java.lang.Float float8 = mutableFloat0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8.equals(0.0f));
    }

    @Test
    public void MutableFloat0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0379");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add(35.0f);
    }

    @Test
    public void MutableFloat0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0380");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.String str2 = mutableFloat1.toString();
        int int3 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableFloat0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0381");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.subtract(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
    }

    @Test
    public void MutableFloat0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0382");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat1.floatValue();
        mutableFloat1.setValue((float) (short) 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0383");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 35 + "'", short3 == (short) 35);
    }

    @Test
    public void MutableFloat0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0384");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        int int3 = mutableFloat1.intValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4.equals(35.0f));
    }

    @Test
    public void MutableFloat0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0385");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        mutableFloat1.setValue((float) (-100));
        long long8 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-100L) + "'", long8 == (-100L));
    }

    @Test
    public void MutableFloat0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0386");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean2 = mutableFloat1.isInfinite();
        double double3 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void MutableFloat0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0387");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableFloat0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0388");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat1.subtract((float) (short) 1);
        long long8 = mutableFloat1.longValue();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9.equals((-1.0f)));
    }

    @Test
    public void MutableFloat0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0389");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int6 = mutableFloat1.intValue();
        double double7 = mutableFloat1.doubleValue();
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void MutableFloat0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0390");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        boolean boolean5 = mutableFloat3.isNaN();
        java.lang.String str6 = mutableFloat3.toString();
        long long7 = mutableFloat3.longValue();
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        long long9 = mutableFloat3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableFloat0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0391");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        int int7 = mutableFloat1.intValue();
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0392");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        long long7 = mutableFloat3.longValue();
        long long8 = mutableFloat3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableFloat0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0393");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        java.lang.Float float4 = mutableFloat0.getValue();
        boolean boolean5 = mutableFloat0.isNaN();
        byte byte6 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -100 + "'", byte6 == (byte) -100);
    }

    @Test
    public void MutableFloat0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0394");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.add(1.0f);
        mutableFloat1.subtract((float) 101L);
    }

    @Test
    public void MutableFloat0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0395");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        java.lang.Float float6 = mutableFloat1.getValue();
        int int7 = mutableFloat1.intValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 68.0f + "'", float6.equals(68.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 68 + "'", int7 == 68);
    }

    @Test
    public void MutableFloat0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0396");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.String str5 = mutableFloat4.toString();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0" + "'", str5.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableFloat0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0397");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean5 = mutableFloat1.isNaN();
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0398");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean6 = mutableFloat3.isNaN();
        float float7 = mutableFloat3.floatValue();
        byte byte8 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableFloat0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0399");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        mutableFloat1.setValue((float) (short) 1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float6 = mutableFloat5.getValue();
        long long7 = mutableFloat5.longValue();
        java.lang.String str8 = mutableFloat5.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1.0" + "'", str8.equals("-1.0"));
    }

    @Test
    public void MutableFloat0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0400");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add((java.lang.Number) 30.0f);
        double double5 = mutableFloat1.doubleValue();
        long long6 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 65.0d + "'", double5 == 65.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 65L + "'", long6 == 65L);
    }

    @Test
    public void MutableFloat0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0401");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((java.lang.Number) (-88));
    }

    @Test
    public void MutableFloat0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0402");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        boolean boolean4 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0403");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        double double5 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void MutableFloat0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0404");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        mutableFloat1.subtract(100.0f);
        mutableFloat1.decrement();
        mutableFloat1.setValue((float) 65L);
    }

    @Test
    public void MutableFloat0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0405");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        mutableFloat0.increment();
        double double5 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5 == (-99.0d));
    }

    @Test
    public void MutableFloat0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0406");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        int int3 = mutableFloat1.intValue();
        mutableFloat1.add((float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void MutableFloat0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0407");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        int int8 = mutableFloat1.intValue();
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableFloat0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0408");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        boolean boolean6 = mutableFloat1.isNaN();
        java.lang.Float float7 = mutableFloat1.toFloat();
        long long8 = mutableFloat1.longValue();
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableFloat0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0409");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double6 = mutableFloat5.doubleValue();
        mutableFloat0.setValue((java.lang.Number) mutableFloat5);
        float float8 = mutableFloat0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableFloat0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0410");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        long long2 = mutableFloat1.longValue();
        int int3 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableFloat0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0411");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        boolean boolean5 = mutableFloat3.isNaN();
        java.lang.String str6 = mutableFloat3.toString();
        long long7 = mutableFloat3.longValue();
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableFloat0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0412");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 23);
    }

    @Test
    public void MutableFloat0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0413");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        java.lang.Float float5 = mutableFloat1.getValue();
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableFloat0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0414");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.add((float) (byte) 101);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 101);
        byte byte7 = mutableFloat6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 101 + "'", byte7 == (byte) 101);
    }

    @Test
    public void MutableFloat0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0415");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0416");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        java.lang.Float float6 = mutableFloat0.getValue();
        mutableFloat0.subtract((float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0417");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat3.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat3.setValue((java.lang.Number) mutableFloat6);
        boolean boolean8 = mutableFloat3.isInfinite();
        mutableFloat0.setValue((java.lang.Number) mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0418");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        boolean boolean5 = mutableFloat4.isNaN();
        boolean boolean6 = mutableFloat4.isInfinite();
        int int7 = mutableFloat1.compareTo(mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableFloat0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0419");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float4 = mutableFloat3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
    }

    @Test
    public void MutableFloat0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0420");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        mutableFloat0.increment();
        boolean boolean5 = mutableFloat0.isInfinite();
        long long6 = mutableFloat0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
    }

    @Test
    public void MutableFloat0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0421");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float5 = mutableFloat4.getValue();
        mutableFloat4.setValue((java.lang.Number) (-31.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
    }

    @Test
    public void MutableFloat0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0422");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        java.lang.Class<?> wildcardClass8 = mutableFloat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0423");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        mutableFloat0.increment();
        mutableFloat0.subtract((float) 0L);
    }

    @Test
    public void MutableFloat0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0424");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        int int2 = mutableFloat1.intValue();
        long long3 = mutableFloat1.longValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4.equals(0.0f));
    }

    @Test
    public void MutableFloat0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0425");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        java.lang.Float float8 = mutableFloat4.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
    }

    @Test
    public void MutableFloat0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0426");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        double double5 = mutableFloat1.doubleValue();
        mutableFloat1.increment();
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0427");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean7 = mutableFloat6.isInfinite();
        int int8 = mutableFloat1.compareTo(mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableFloat0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0428");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat4.getValue();
        float float7 = mutableFloat4.floatValue();
        double double8 = mutableFloat4.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableFloat0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0429");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        double double5 = mutableFloat1.doubleValue();
        long long6 = mutableFloat1.longValue();
        mutableFloat1.add((float) (byte) 1);
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void MutableFloat0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0430");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        boolean boolean5 = mutableFloat3.isNaN();
        java.lang.String str6 = mutableFloat3.toString();
        long long7 = mutableFloat3.longValue();
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        mutableFloat3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableFloat0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0431");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        double double1 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void MutableFloat0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0432");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int7 = mutableFloat3.compareTo(mutableFloat6);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        short short9 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableFloat0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0433");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        boolean boolean2 = mutableFloat1.isNaN();
        mutableFloat1.subtract((float) (-10L));
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0434");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0435");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        double double4 = mutableFloat1.doubleValue();
        java.lang.String str5 = mutableFloat1.toString();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.0" + "'", str5.equals("2.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void MutableFloat0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0436");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat2.subtract((java.lang.Number) 100L);
        java.lang.Float float5 = mutableFloat2.toFloat();
        mutableFloat1.add((java.lang.Number) mutableFloat2);
        mutableFloat2.increment();
        java.lang.Float float8 = mutableFloat2.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-100.0f) + "'", float5.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-99.0f) + "'", float8.equals((-99.0f)));
    }

    @Test
    public void MutableFloat0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0437");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.Float float8 = mutableFloat1.getValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8.equals(0.0f));
    }

    @Test
    public void MutableFloat0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0438");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32L);
    }

    @Test
    public void MutableFloat0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0439");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.increment();
        mutableFloat1.decrement();
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0440");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        java.lang.String str6 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10.0" + "'", str6.equals("10.0"));
    }

    @Test
    public void MutableFloat0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0441");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        double double6 = mutableFloat1.doubleValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        mutableFloat1.subtract((float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0442");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        double double7 = mutableFloat1.doubleValue();
        mutableFloat1.add((float) (short) 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableFloat0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0443");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 3);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
    }

    @Test
    public void MutableFloat0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0444");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        double double6 = mutableFloat1.doubleValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        mutableFloat1.subtract((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0445");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        int int2 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableFloat0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0446");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        java.lang.String str3 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-2.0" + "'", str3.equals("-2.0"));
    }

    @Test
    public void MutableFloat0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0447");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.subtract((java.lang.Number) 100L);
        java.lang.Float float4 = mutableFloat1.toFloat();
        mutableFloat1.add((float) 0L);
        mutableFloat0.setValue((java.lang.Number) 0L);
        boolean boolean8 = mutableFloat0.isNaN();
        java.lang.Float float9 = mutableFloat0.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9.equals(0.0f));
    }

    @Test
    public void MutableFloat0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0448");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        short short5 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableFloat0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0449");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableFloat0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0450");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        double double2 = mutableFloat0.doubleValue();
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0451");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.String str8 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0" + "'", str8.equals("10.0"));
    }

    @Test
    public void MutableFloat0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0452");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("35.0");
    }

    @Test
    public void MutableFloat0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0453");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        double double7 = mutableFloat1.doubleValue();
        java.lang.String str8 = mutableFloat1.toString();
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10.0" + "'", str8.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableFloat0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0454");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        java.lang.Float float4 = mutableFloat1.getValue();
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
    }

    @Test
    public void MutableFloat0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0455");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-110.0");
    }

    @Test
    public void MutableFloat0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0456");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float4 = mutableFloat3.getValue();
        boolean boolean5 = mutableFloat1.equals((java.lang.Object) float4);
        long long6 = mutableFloat1.longValue();
        java.lang.String str7 = mutableFloat1.toString();
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0" + "'", str7.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void MutableFloat0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0457");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0458");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.subtract((java.lang.Number) 100L);
        java.lang.Float float4 = mutableFloat1.toFloat();
        mutableFloat1.add((float) 0L);
        mutableFloat0.setValue((java.lang.Number) 0L);
        boolean boolean8 = mutableFloat0.isNaN();
        boolean boolean9 = mutableFloat0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0459");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        mutableFloat3.setValue((float) 10L);
        int int8 = mutableFloat3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void MutableFloat0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0460");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        boolean boolean8 = mutableFloat4.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0461");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean4 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0462");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0463");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        double double6 = mutableFloat3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void MutableFloat0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0464");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract((java.lang.Number) 0L);
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
    }

    @Test
    public void MutableFloat0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0465");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        java.lang.Float float5 = mutableFloat1.getValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
    }

    @Test
    public void MutableFloat0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0466");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.setValue(200.0f);
        mutableFloat1.add((float) 65L);
    }

    @Test
    public void MutableFloat0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0467");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        mutableFloat3.decrement();
        mutableFloat3.add((java.lang.Number) 22.0d);
    }

    @Test
    public void MutableFloat0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0468");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 32);
    }

    @Test
    public void MutableFloat0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0469");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.add((float) (byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
    }

    @Test
    public void MutableFloat0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0470");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        boolean boolean6 = mutableFloat1.isNaN();
        long long7 = mutableFloat1.longValue();
        boolean boolean8 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0471");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat6.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0472");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        double double7 = mutableFloat6.doubleValue();
        mutableFloat6.setValue((float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void MutableFloat0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0473");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.increment();
        boolean boolean7 = mutableFloat4.isInfinite();
        byte byte8 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableFloat0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0474");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
    }

    @Test
    public void MutableFloat0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0475");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableFloat0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0476");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("110.0");
    }

    @Test
    public void MutableFloat0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0477");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.increment();
        mutableFloat1.increment();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableFloat0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0478");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.increment();
        java.lang.String str8 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-89.0" + "'", str8.equals("-89.0"));
    }

    @Test
    public void MutableFloat0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0479");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        double double6 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableFloat0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0480");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat1.setValue((float) '4');
        float float4 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 52.0f + "'", float4 == 52.0f);
    }

    @Test
    public void MutableFloat0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0481");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((java.lang.Number) (-2.0f));
        java.lang.Float float5 = mutableFloat1.getValue();
        java.lang.Float float6 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6.equals((-1.0f)));
    }

    @Test
    public void MutableFloat0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0482");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long7 = mutableFloat6.longValue();
        mutableFloat6.decrement();
        mutableFloat1.subtract((java.lang.Number) mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableFloat0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0483");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        java.lang.Float float2 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0484");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        int int4 = mutableFloat1.compareTo(mutableFloat3);
        long long5 = mutableFloat3.longValue();
        int int6 = mutableFloat3.intValue();
        java.lang.Float float7 = mutableFloat3.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7.equals(10.0f));
    }

    @Test
    public void MutableFloat0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0485");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        double double3 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void MutableFloat0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0486");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.add(99.0f);
    }

    @Test
    public void MutableFloat0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0487");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        boolean boolean7 = mutableFloat4.isNaN();
        boolean boolean8 = mutableFloat4.isInfinite();
        byte byte9 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableFloat0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0488");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        java.lang.Float float4 = mutableFloat0.getValue();
        java.lang.Class<?> wildcardClass5 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0489");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.decrement();
        int int5 = mutableFloat1.intValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableFloat0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0490");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.increment();
        java.lang.String str5 = mutableFloat0.toString();
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-99.0" + "'", str5.equals("-99.0"));
    }

    @Test
    public void MutableFloat0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0491");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        int int6 = mutableFloat1.intValue();
        mutableFloat1.add((float) 32L);
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 132.0f + "'", float9.equals(132.0f));
    }

    @Test
    public void MutableFloat0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0492");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        int int4 = mutableFloat1.compareTo(mutableFloat3);
        long long5 = mutableFloat3.longValue();
        int int6 = mutableFloat3.intValue();
        float float7 = mutableFloat3.floatValue();
        boolean boolean8 = mutableFloat3.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0493");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        long long5 = mutableFloat1.longValue();
        java.lang.String str6 = mutableFloat1.toString();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableFloat0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0494");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        mutableFloat1.add((java.lang.Number) (-20L));
    }

    @Test
    public void MutableFloat0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0495");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.increment();
        mutableFloat1.setValue((float) (byte) 10);
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableFloat0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0496");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) ' ');
        long long7 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-31L) + "'", long7 == (-31L));
    }

    @Test
    public void MutableFloat0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0497");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4.equals(0.0f));
    }

    @Test
    public void MutableFloat0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0498");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        mutableFloat1.add(201.0f);
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 202 + "'", int9 == 202);
    }

    @Test
    public void MutableFloat0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0499");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.setValue((float) (byte) -8);
        mutableFloat1.increment();
        java.lang.Class<?> wildcardClass9 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.MutableFloat0500");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        double double2 = mutableFloat0.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float5 = mutableFloat4.getValue();
        java.lang.Class<?> wildcardClass6 = mutableFloat4.getClass();
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) wildcardClass6);
        byte byte8 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }
}

