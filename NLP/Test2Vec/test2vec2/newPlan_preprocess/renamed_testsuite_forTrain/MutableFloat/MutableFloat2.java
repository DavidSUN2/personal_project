
package MutableFloat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableFloat2 {

    public static boolean debug = false;

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1001");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 1);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float5 = mutableFloat4.floatValue();
        mutableFloat4.subtract((float) (short) 0);
        boolean boolean8 = mutableFloat4.isNaN();
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1002");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float7 = mutableFloat6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1003");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((java.lang.Number) 10L);
        int int5 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1004");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.add((float) (byte) 100);
        boolean boolean8 = mutableFloat1.isNaN();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1005");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        int int6 = mutableFloat1.intValue();
        boolean boolean7 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1006");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-20L));
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat3.setValue(0.0f);
        float float6 = mutableFloat3.floatValue();
        mutableFloat1.subtract((java.lang.Number) float6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1007");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        boolean boolean2 = mutableFloat1.isNaN();
        double double3 = mutableFloat1.doubleValue();
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1008");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1009");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("18.0");
        mutableFloat1.setValue((float) '4');
        long long4 = mutableFloat1.longValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 52 + "'", short5 == (short) 52);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1010");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1011");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1012");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (short) 1);
        int int5 = mutableFloat4.intValue();
        mutableFloat4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1013");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.increment();
        boolean boolean3 = mutableFloat1.isNaN();
        float float4 = mutableFloat1.floatValue();
        java.lang.String str5 = mutableFloat1.toString();
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1014");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        double double7 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1015");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        java.lang.Float float6 = mutableFloat3.toFloat();
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) mutableFloat3);
        int int8 = mutableFloat3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1016");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) 35L);
        int int5 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 68);
        mutableFloat1.subtract((java.lang.Number) 68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-25) + "'", int5 == (-25));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1017");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat3.add((java.lang.Number) (byte) 0);
        mutableFloat3.increment();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        float float9 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1018");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        long long6 = mutableFloat4.longValue();
        boolean boolean8 = mutableFloat4.equals((java.lang.Object) 1);
        mutableFloat4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1019");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long7 = mutableFloat6.longValue();
        int int8 = mutableFloat0.compareTo(mutableFloat6);
        java.lang.Float float9 = mutableFloat0.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-100.0f) + "'", float9.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1020");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean5 = mutableFloat4.isInfinite();
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        int int7 = mutableFloat4.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1021");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean6 = mutableFloat3.isNaN();
        byte byte7 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1022");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1023");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.decrement();
        mutableFloat1.setValue(0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1024");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.decrement();
        mutableFloat1.subtract((-11.0f));
        java.lang.Float float7 = mutableFloat1.getValue();
        java.lang.Float float8 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7.equals(11.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 11.0f + "'", float8.equals(11.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1025");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        java.lang.Float float6 = mutableFloat1.toFloat();
        boolean boolean7 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1026");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        float float5 = mutableFloat1.floatValue();
        int int6 = mutableFloat1.intValue();
        long long7 = mutableFloat1.longValue();
        boolean boolean8 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1027");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat3.add((float) (byte) -110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1028");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        java.lang.Float float4 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1029");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean7 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1030");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        mutableFloat3.setValue(0.0f);
        int int8 = mutableFloat1.compareTo(mutableFloat3);
        java.lang.Float float9 = mutableFloat3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1031");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        double double6 = mutableFloat1.doubleValue();
        long long7 = mutableFloat1.longValue();
        java.lang.Float float8 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1032");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        java.lang.Float float6 = mutableFloat3.toFloat();
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) mutableFloat3);
        java.lang.Float float8 = mutableFloat3.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8.equals(35.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1033");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isInfinite();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat0);
        boolean boolean6 = mutableFloat5.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1034");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.setValue(200.0f);
        float float4 = mutableFloat1.floatValue();
        java.lang.String str5 = mutableFloat1.toString();
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 200.0f + "'", float4 == 200.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "200.0" + "'", str5.equals("200.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 200.0f + "'", float6.equals(200.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1035");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableFloat1.setValue(number7);
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
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1036");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long4 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat5.add((float) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1037");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 30);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float4 = mutableFloat3.floatValue();
        mutableFloat3.subtract((float) (short) 0);
        boolean boolean7 = mutableFloat3.isNaN();
        boolean boolean8 = mutableFloat3.isNaN();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1038");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        mutableFloat1.add((-50.0f));
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1039");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.setValue(0.0f);
        float float8 = mutableFloat1.floatValue();
        java.lang.Class<?> wildcardClass9 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1040");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat3.setValue((float) 52L);
        java.lang.Object obj6 = null;
        boolean boolean7 = mutableFloat3.equals(obj6);
        java.lang.Float float8 = mutableFloat3.getValue();
        double double9 = mutableFloat3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 52.0f + "'", float8.equals(52.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1041");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.setValue((float) (byte) 10);
        java.lang.Float float4 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1042");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.setValue((float) (-100));
        mutableFloat1.subtract((float) (short) 110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1043");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        boolean boolean2 = mutableFloat1.isNaN();
        boolean boolean3 = mutableFloat1.isNaN();
        mutableFloat1.subtract((-50.0f));
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 85 + "'", short6 == (short) 85);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1044");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        java.lang.Float float6 = mutableFloat1.toFloat();
        long long7 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6.equals(32.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1045");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        java.lang.Float float2 = mutableFloat1.toFloat();
        java.lang.Float float3 = mutableFloat1.getValue();
        int int4 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1046");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        boolean boolean7 = mutableFloat5.equals((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1047");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.setValue((float) (byte) 0);
        mutableFloat1.setValue((-7.0f));
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
            System.out.format("%n%s%n", "MutableFloat2.test1048");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1049");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        int int3 = mutableFloat1.intValue();
        java.lang.String str4 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "35.0" + "'", str4.equals("35.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1050");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Float float3 = mutableFloat1.toFloat();
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1051");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-99.0" + "'", str5.equals("-99.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1052");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        boolean boolean6 = mutableFloat1.isNaN();
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1053");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1054");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        java.lang.Float float6 = mutableFloat0.getValue();
        long long7 = mutableFloat0.longValue();
        double double8 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100L) + "'", long7 == (-100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1055");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.setValue((float) (short) 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1056");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        mutableFloat1.add((float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1057");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("22.0");
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1058");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        java.lang.Float float4 = mutableFloat0.getValue();
        java.lang.Float float5 = mutableFloat0.getValue();
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-100.0f) + "'", float5.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1059");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        mutableFloat3.subtract(100.0f);
        mutableFloat0.subtract((java.lang.Number) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1060");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(23.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1061");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean7 = mutableFloat6.isInfinite();
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
            System.out.format("%n%s%n", "MutableFloat2.test1062");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.add((float) (byte) 10);
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 110.0f + "'", float7 == 110.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 109 + "'", byte9 == (byte) 109);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1063");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0L);
        float float3 = mutableFloat2.floatValue();
        boolean boolean4 = mutableFloat2.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1064");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        double double4 = mutableFloat1.doubleValue();
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1065");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        java.lang.Float float4 = mutableFloat1.toFloat();
        float float5 = mutableFloat1.floatValue();
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 35 + "'", byte6 == (byte) 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1066");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4.equals(2.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1067");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        mutableFloat3.setValue(0.0f);
        int int8 = mutableFloat1.compareTo(mutableFloat3);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1068");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        float float4 = mutableFloat1.floatValue();
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1069");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        int int3 = mutableFloat1.intValue();
        java.lang.String str4 = mutableFloat1.toString();
        java.lang.Float float5 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "35.0" + "'", str4.equals("35.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5.equals(35.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1070");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        double double7 = mutableFloat3.doubleValue();
        java.lang.Float float8 = mutableFloat3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1071");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        float float3 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat5);
        int int7 = mutableFloat1.compareTo(mutableFloat5);
        mutableFloat5.add((float) (short) 22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1072");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((-2.0f));
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1073");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean2 = mutableFloat1.isInfinite();
        boolean boolean3 = mutableFloat1.isInfinite();
        mutableFloat1.increment();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1074");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) 10);
        float float8 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 110.0f + "'", float8 == 110.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1075");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        boolean boolean5 = mutableFloat0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1076");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Class<?> wildcardClass6 = mutableFloat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1077");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((java.lang.Number) 10.0d);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1078");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        java.lang.String str5 = mutableFloat1.toString();
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3.0" + "'", str5.equals("3.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 3 + "'", short6 == (short) 3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat2.test1079");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        java.lang.String str5 = mutableFloat1.toString();
        java.lang.String str6 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3.0" + "'", str5.equals("3.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "3.0" + "'", str6.equals("3.0"));
    }
}

