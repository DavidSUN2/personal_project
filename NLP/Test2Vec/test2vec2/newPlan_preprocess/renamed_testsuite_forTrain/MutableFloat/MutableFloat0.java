
package MutableFloat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableFloat0 {

    public static boolean debug = false;

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0001");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0002");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0004");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0005");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        short short6 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0006");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0007");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0008");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        byte byte3 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -100 + "'", byte3 == (byte) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0009");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0010");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0011");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0012");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0013");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0014");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0015");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0016");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0017");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        java.lang.Class<?> wildcardClass5 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0018");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0019");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0020");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0021");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0022");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0023");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0024");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0025");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0026");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0027");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0028");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0029");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0030");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0031");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0032");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.increment();
        byte byte3 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0033");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0034");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0035");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0036");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0037");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean7 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0038");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0039");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0040");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0041");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0042");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0043");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0044");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0045");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0046");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0047");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0048");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0049");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0050");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0051");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0052");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0053");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0054");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0055");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0056");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0057");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0058");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0059");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0060");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0061");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0062");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0063");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0064");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0065");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0066");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0067");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (short) 10);
        java.lang.Float float2 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0068");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0070");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0071");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0072");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0073");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0074");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0075");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0076");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0077");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        double double6 = mutableFloat1.doubleValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0078");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((float) '#');
        java.lang.Class<?> wildcardClass4 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0079");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0080");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0081");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0082");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        long long3 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0083");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0084");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0085");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0086");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0087");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0088");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0089");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0090");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0091");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("100.0");
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0092");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0093");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0094");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0095");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0096");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0097");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        float float4 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0098");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        mutableFloat1.setValue((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0099");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0100");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0101");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0102");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0103");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0104");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0105");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean2 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0106");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0107");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0108");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0109");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0110");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0111");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0112");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0113");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0114");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0115");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0116");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0117");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0118");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0119");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0120");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0121");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0122");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0123");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        byte byte7 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0124");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0125");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0126");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0127");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 35 + "'", short3 == (short) 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0128");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 1L);
        java.lang.Class<?> wildcardClass7 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0129");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0130");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0131");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0132");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0133");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0134");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0135");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0136");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0137");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0138");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0139");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0140");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0141");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((float) (byte) 10);
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 20L + "'", long4 == 20L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0142");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0143");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0144");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0145");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0146");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0147");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0148");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0149");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0150");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0151");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0152");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0153");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0154");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0155");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0156");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0157");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0158");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0159");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0160");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0161");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0162");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 101 + "'", byte2 == (byte) 101);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0163");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0164");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0165");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0166");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0167");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0168");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0169");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0170");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0171");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        byte byte3 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 35 + "'", byte3 == (byte) 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0172");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0173");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0174");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0175");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0176");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        mutableFloat1.subtract(11.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0177");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0178");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0179");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0180");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0181");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0182");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0183");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.increment();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 36 + "'", short5 == (short) 36);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0184");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0185");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        boolean boolean2 = mutableFloat1.isNaN();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0186");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0187");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0188");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0189");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) -8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0190");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0191");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0192");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0193");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0194");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0195");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0196");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat1.setValue((float) 35);
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 35 + "'", short7 == (short) 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0197");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0198");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0199");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0200");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 32);
        boolean boolean2 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0201");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) double2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0202");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0203");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0204");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0205");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.add((float) (byte) 100);
        mutableFloat1.add((float) (short) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0206");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0207");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0208");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0209");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0210");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0211");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0212");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0213");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0214");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0215");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0216");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0217");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0218");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0219");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0220");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0221");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0222");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0223");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0224");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0225");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '4');
        mutableFloat1.subtract((float) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0226");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0227");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.Float float2 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0228");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0229");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0230");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0231");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0232");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0233");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0234");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        java.lang.String str4 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0235");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0236");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        boolean boolean2 = mutableFloat1.isNaN();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0237");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0238");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0239");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0240");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0241");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0242");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0243");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0244");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0245");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0246");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0247");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0248");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0249");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0250");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0251");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        mutableFloat3.subtract((float) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0252");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0253");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0254");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0255");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0256");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0257");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0258");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0259");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        mutableFloat1.add(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0260");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0261");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0262");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.subtract((java.lang.Number) mutableFloat7);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0263");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0264");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        mutableFloat1.setValue((float) (byte) -100);
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -100 + "'", byte4 == (byte) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0265");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0266");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0267");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0268");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0269");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0270");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0271");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableFloat1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0272");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        int int6 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0273");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0274");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-10L));
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -10 + "'", byte2 == (byte) -10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0275");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0276");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0277");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0278");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0279");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0280");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0281");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0282");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0283");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.setValue((float) (byte) 10);
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0284");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0285");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.subtract((java.lang.Number) 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0286");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0287");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-11.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0288");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0289");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0290");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0291");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0292");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0293");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0294");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0295");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0296");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0297");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.add(1.0f);
        mutableFloat1.setValue((float) (-8L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0298");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0.0d);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0299");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0300");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0301");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0302");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean2 = mutableFloat1.isInfinite();
        java.lang.Float float3 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0303");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0304");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0305");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0306");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(30.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0307");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0308");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        java.lang.String str3 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10.0" + "'", str3.equals("10.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0309");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0.0d);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0310");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 32L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0311");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-31.0f));
        java.lang.Float float2 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-31.0f) + "'", float2.equals((-31.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0312");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0313");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0314");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 35L);
        java.lang.Float float2 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0315");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((float) (byte) 10);
        double double4 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0316");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0317");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0318");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0319");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0320");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0321");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0322");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0323");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0324");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0325");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0326");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Float float5 = mutableFloat3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0327");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0328");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0329");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0330");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0331");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0332");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0333");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0334");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0335");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0336");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0337");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0338");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0339");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0340");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        mutableFloat1.decrement();
        mutableFloat1.add((float) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0341");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0342");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0343");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 32 + "'", byte5 == (byte) 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0344");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0345");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.increment();
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0346");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0347");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        mutableFloat1.subtract((float) (short) 101);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0348");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0349");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0350");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0351");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0352");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0353");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        short short3 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -100 + "'", short3 == (short) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0354");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0355");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0356");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0357");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0358");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '4');
        float float2 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0359");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0360");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0361");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0362");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0363");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.add(22.0f);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0364");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0365");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0366");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0367");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0368");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0369");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) ' ');
        boolean boolean5 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0370");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0371");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0372");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0373");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0374");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0375");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0376");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0377");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0378");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0379");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add(35.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0380");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.String str2 = mutableFloat1.toString();
        int int3 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0381");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0382");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0383");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        short short3 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 35 + "'", short3 == (short) 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0384");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0385");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0386");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean2 = mutableFloat1.isInfinite();
        double double3 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0387");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0388");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0389");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0390");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0391");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0392");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0393");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0394");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.add(1.0f);
        mutableFloat1.subtract((float) 101L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0395");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0396");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0397");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0398");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0399");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0400");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0401");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((java.lang.Number) (-88));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0402");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0403");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        double double5 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0404");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        mutableFloat1.subtract(100.0f);
        mutableFloat1.decrement();
        mutableFloat1.setValue((float) 65L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0405");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0406");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0407");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0408");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0409");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0410");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        long long2 = mutableFloat1.longValue();
        int int3 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0411");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0412");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 23);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0413");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0414");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0415");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0416");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0417");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0418");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0419");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0420");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0421");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0422");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0423");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        mutableFloat0.increment();
        mutableFloat0.subtract((float) 0L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0424");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0425");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0426");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0427");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0428");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0429");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0430");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0431");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        double double1 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0432");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0433");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        boolean boolean2 = mutableFloat1.isNaN();
        mutableFloat1.subtract((float) (-10L));
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0434");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0435");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0436");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0437");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0438");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0439");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0440");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0441");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0442");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0443");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 3);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 3 + "'", byte2 == (byte) 3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0444");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0445");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        int int2 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0446");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        java.lang.String str3 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-2.0" + "'", str3.equals("-2.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0447");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0448");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0449");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0450");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0451");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0452");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("35.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0453");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0454");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0455");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-110.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0456");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0457");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0458");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0459");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0460");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0461");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean4 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0462");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0463");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0464");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0465");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0466");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.setValue(200.0f);
        mutableFloat1.add((float) 65L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0467");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add(10.0f);
        mutableFloat3.decrement();
        mutableFloat3.add((java.lang.Number) 22.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0468");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0469");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0470");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0471");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0472");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0473");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0474");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0475");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0476");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("110.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0477");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0478");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0479");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0480");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat1.setValue((float) '4');
        float float4 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 52.0f + "'", float4 == 52.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0481");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0482");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0483");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        java.lang.Float float2 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0484");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0485");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        double double3 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0486");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.add(99.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0487");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0488");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0489");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0490");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0491");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0492");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0493");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0494");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        mutableFloat1.add((java.lang.Number) (-20L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0495");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0496");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0497");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0498");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0499");
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
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat0.test0500");
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

