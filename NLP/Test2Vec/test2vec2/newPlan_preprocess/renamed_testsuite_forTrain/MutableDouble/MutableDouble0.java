
package MutableDouble;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableDouble0 {

    public static boolean debug = false;

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0001");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0002");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0004");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0005");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        short short6 = mutableDouble4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0006");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0007");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0008");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0009");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0010");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0011");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0012");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0013");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0014");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 2 + "'", short3 == (short) 2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0015");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.setValue((java.lang.Number) (short) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0016");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0017");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0018");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0019");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0021");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0022");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0023");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0024");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0025");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0026");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0027");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0028");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0029");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0030");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0031");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0032");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0033");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0034");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0035");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0036");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0037");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0038");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0039");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0040");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0041");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        byte byte3 = mutableDouble2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0042");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0043");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0044");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0045");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0046");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0047");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0048");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0049");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0050");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0051");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0052");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0053");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0054");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0055");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0056");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0057");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0058");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        java.lang.Class<?> wildcardClass3 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0059");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0060");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0061");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0062");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0063");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0064");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0065");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0066");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0067");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0068");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass5 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0069");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0070");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0071");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0072");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0073");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0074");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0075");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0076");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0077");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0078");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0079");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0080");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0081");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0082");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0083");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0084");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0085");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0086");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0087");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0088");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        mutableDouble0.subtract(0.0d);
        java.lang.Class<?> wildcardClass6 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0089");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0090");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0091");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0092");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = mutableDouble1.compareTo(mutableDouble2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0093");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        mutableDouble7.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0094");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        float float2 = mutableDouble1.floatValue();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0095");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0096");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0097");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0098");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0099");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0100");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0101");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.add((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0102");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0103");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0104");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0105");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0106");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0107");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0108");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        int int2 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0109");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0110");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.setValue((double) (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0111");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0112");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0113");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.add((double) (-1L));
        mutableDouble1.decrement();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0114");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0115");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0116");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("99.0");
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0117");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0118");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0119");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0120");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0121");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0122");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0123");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0124");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0125");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0126");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble4.setValue((java.lang.Number) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0127");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0128");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        mutableDouble1.subtract((double) (short) 2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0129");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0130");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0131");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0132");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0133");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0134");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        java.lang.String str2 = mutableDouble1.toString();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0135");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0136");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0137");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0138");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0139");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0140");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0141");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0142");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0143");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("1.0");
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0144");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0145");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0146");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0147");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0148");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0149");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean3 = mutableDouble1.equals((java.lang.Object) "1.0");
        mutableDouble1.add((java.lang.Number) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0150");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0151");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0152");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0153");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0154");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.setValue((double) (-99.0f));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0155");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0156");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0157");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0158");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0159");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0160");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0161");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0162");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0163");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        double double3 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.0d + "'", double3 == 51.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0164");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0165");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        long long1 = mutableDouble0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0166");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0167");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0168");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        float float1 = mutableDouble0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0169");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0170");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        mutableDouble1.setValue((double) (byte) 1);
        mutableDouble1.add(51.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0171");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0172");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0173");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0174");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0175");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0176");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0177");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0178");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0179");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0180");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0181");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0182");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0183");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0184");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0185");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0186");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        double double5 = mutableDouble0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0187");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0188");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0189");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0190");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0191");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0192");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0193");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0194");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0195");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.subtract((double) (byte) 100);
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -49 + "'", short5 == (short) -49);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0196");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0197");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.setValue((double) 0L);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0198");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0199");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0200");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0201");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0202");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0203");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0204");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0205");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0206");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        java.lang.Number number1 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDouble0.subtract(number1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0207");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0208");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        mutableDouble1.subtract((double) (short) -1);
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0209");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-99.0d) + "'", double2.equals((-99.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0210");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0211");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0212");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0213");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0214");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0215");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0216");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0217");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0218");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0219");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0220");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0221");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0222");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0223");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        float float2 = mutableDouble1.floatValue();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0224");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0225");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble7);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0226");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        mutableDouble0.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0227");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0228");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0229");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0230");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0231");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0232");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0233");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0234");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0235");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0236");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0237");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0238");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0239");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0240");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0241");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0242");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0243");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0244");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0245");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0246");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0247");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0248");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.increment();
        double double4 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0249");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0250");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0251");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0252");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0253");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0254");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0255");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0256");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0257");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0258");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0259");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.increment();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0260");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        mutableDouble1.add((double) 1.0f);
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0261");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0262");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0263");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0264");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean3 = mutableDouble1.equals((java.lang.Object) "1.0");
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0265");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 92 + "'", short6 == (short) 92);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0266");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0267");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0268");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0269");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0270");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0271");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0272");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0273");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0274");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0275");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0276");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0277");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0278");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0279");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        java.lang.Double double5 = mutableDouble0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0280");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0281");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0282");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0283");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0284");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble4.subtract(3.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0285");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0286");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0287");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 10.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0288");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0289");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0290");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0291");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0292");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0293");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0294");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0295");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0296");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0297");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0298");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0299");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0300");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0301");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0302");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.setValue((double) '#');
        mutableDouble1.setValue(0.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0303");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0304");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0305");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0306");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0307");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0308");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0309");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0310");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0311");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0312");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        mutableDouble1.subtract((double) (short) 92);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0313");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        mutableDouble1.subtract((double) 1);
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0314");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0315");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0316");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0317");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0318");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        int int4 = mutableDouble0.intValue();
        mutableDouble0.setValue((double) (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0319");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0320");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0321");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0322");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0323");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0324");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0325");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0326");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0327");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0328");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0329");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0330");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0331");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0332");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0333");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0334");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0335");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0336");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0337");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0338");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-99.0");
        int int2 = mutableDouble1.intValue();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-99) + "'", int2 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-99L) + "'", long3 == (-99L));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0339");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDouble1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0340");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0341");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0342");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0343");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0344");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0345");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0346");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0347");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0348");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.subtract((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0349");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0350");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0351");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0352");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0353");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0354");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0355");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0356");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0357");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0358");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0359");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0360");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0361");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(92.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0362");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2.0f);
        mutableDouble1.add((java.lang.Number) 2.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0363");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0364");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0365");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0366");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0367");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0368");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0369");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0370");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0371");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0372");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0373");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0374");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0375");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0376");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0377");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0378");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0379");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0380");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble2.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0381");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0382");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0383");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 99);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0384");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0385");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        boolean boolean2 = mutableDouble1.isNaN();
        short short3 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0386");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0387");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0388");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("33.0");
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0389");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0390");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0391");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0392");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0393");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0394");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0395");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0396");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0397");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0398");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0399");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0400");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0401");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0402");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 10);
        mutableDouble1.subtract((double) 2.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0403");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0404");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0405");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0406");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0407");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0408");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        short short3 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0409");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0410");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0411");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.decrement();
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0412");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.add((double) 10.0f);
        mutableDouble1.setValue((double) (short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0413");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0414");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0415");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0416");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0417");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0418");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(35.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0419");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0420");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0421");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        boolean boolean3 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0422");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0423");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0424");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0425");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0426");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0427");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0428");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0429");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        double double3 = mutableDouble1.doubleValue();
        mutableDouble1.setValue((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0430");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0431");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0432");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0433");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0434");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0435");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0436");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0437");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0438");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0439");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((double) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0440");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0441");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0442");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0443");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0444");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0445");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0446");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 52);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0447");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-100));
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -100 + "'", byte2 == (byte) -100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0448");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0449");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0450");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0451");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0452");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0453");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0454");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0455");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0456");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0457");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0458");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0459");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0460");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0461");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0462");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3.equals(101.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0463");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble2.subtract((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0464");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0465");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0466");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0467");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0468");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.subtract((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0469");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0470");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0471");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0472");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0473");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0f);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0474");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0475");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0476");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) (short) -1);
        mutableDouble0.setValue((double) 1L);
        float float7 = mutableDouble0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0477");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0478");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0479");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0480");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0481");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0482");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0483");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.decrement();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0484");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0485");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0486");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0487");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        java.lang.Double double6 = mutableDouble1.toDouble();
        mutableDouble1.add((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.0d + "'", double6.equals(92.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0488");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0489");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0490");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0491");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0492");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0493");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.decrement();
        byte byte2 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0494");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0495");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0496");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0497");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0498");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0499");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("1.0");
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test0500");
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

