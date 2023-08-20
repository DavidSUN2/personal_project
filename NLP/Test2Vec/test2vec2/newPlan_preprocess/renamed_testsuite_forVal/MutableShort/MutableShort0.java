
package MutableShort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableShort0 {

    public static boolean debug = false;

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test01");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test02");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test03");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) 0);
        long long7 = mutableShort1.longValue();
        mutableShort1.add((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test04");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort6.setValue((short) (byte) 100);
        boolean boolean9 = mutableShort1.equals((java.lang.Object) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test05");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) 0);
        long long7 = mutableShort1.longValue();
        java.lang.String str8 = mutableShort1.toString();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100" + "'", str8.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test06");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) 0);
        long long7 = mutableShort1.longValue();
        java.lang.String str8 = mutableShort1.toString();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100" + "'", str8.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test07");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.subtract((short) 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test08");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double3 = mutableShort2.doubleValue();
        java.lang.Class<?> wildcardClass4 = mutableShort2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test09");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort4.decrement();
        java.lang.Short short6 = mutableShort4.toShort();
        mutableShort1.setValue((java.lang.Number) mutableShort4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6.equals((short) 9));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test10");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test12");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) 0);
        long long7 = mutableShort1.longValue();
        int int8 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test13");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) 0);
        mutableShort1.setValue((java.lang.Number) 100.0f);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test14");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double3 = mutableShort2.doubleValue();
        mutableShort2.add((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test15");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        short short3 = mutableShort2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test16");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        mutableShort1.decrement();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) (byte) 0);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test17");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.subtract((short) (byte) -1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test18");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test19");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        int int2 = mutableShort1.intValue();
        mutableShort1.increment();
        short short4 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test20");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.decrement();
        int int3 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test21");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort4.setValue((short) (byte) 100);
        int int7 = mutableShort1.compareTo(mutableShort4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test22");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.getValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.subtract((short) 1);
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 99 + "'", short6.equals((short) 99));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test23");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test24");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort4);
        short short7 = mutableShort4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test25");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test26");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.add((short) 0);
        java.lang.Short short8 = mutableShort1.getValue();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test27");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.getValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.subtract((short) 1);
        mutableShort1.setValue((java.lang.Number) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test28");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test29");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.decrement();
        int int3 = mutableShort1.intValue();
        mutableShort1.subtract((java.lang.Number) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test30");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        mutableShort1.add((short) -1);
        float float7 = mutableShort1.floatValue();
        mutableShort1.subtract((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 99.0f + "'", float7 == 99.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test31");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.decrement();
        int int3 = mutableShort1.intValue();
        mutableShort1.add((short) 9);
        short short6 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 18 + "'", short6 == (short) 18);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test32");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        mutableShort1.add((short) 0);
        int int6 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test33");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short5 = mutableShort4.getValue();
        mutableShort4.decrement();
        mutableShort1.subtract((java.lang.Number) mutableShort4);
        mutableShort1.setValue((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test34");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) 0);
        long long7 = mutableShort1.longValue();
        java.lang.String str8 = mutableShort1.toString();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100" + "'", str8.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test35");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short5 = mutableShort4.getValue();
        mutableShort4.decrement();
        mutableShort1.subtract((java.lang.Number) mutableShort4);
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8.equals((short) 1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test36");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.add((short) 0);
        java.lang.Short short8 = mutableShort1.getValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test37");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        java.lang.Short short4 = mutableShort2.toShort();
        short short5 = mutableShort2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test38");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        float float5 = mutableShort1.floatValue();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test39");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test40");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        int int2 = mutableShort1.intValue();
        java.lang.String str3 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test41");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 99);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test42");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        short short5 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test43");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        float float5 = mutableShort1.floatValue();
        java.lang.String str6 = mutableShort1.toString();
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100" + "'", str6.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test44");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.String str7 = mutableShort6.toString();
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test45");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        long long4 = mutableShort1.longValue();
        mutableShort1.decrement();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) (byte) 0);
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test46");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test47");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test48");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        mutableShort1.add((short) 0);
        short short6 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test49");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.add((short) 0);
        java.lang.Short short8 = mutableShort1.getValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100" + "'", str9.equals("100"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test50");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        long long2 = mutableShort1.longValue();
        mutableShort1.setValue((short) 101);
        java.lang.String str5 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "101" + "'", str5.equals("101"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test51");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test52");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.decrement();
        boolean boolean4 = mutableShort1.equals((java.lang.Object) (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test53");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test54");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        java.lang.Short short4 = mutableShort2.getValue();
        float float5 = mutableShort2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test55");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test56");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.getValue();
        long long3 = mutableShort1.longValue();
        long long4 = mutableShort1.longValue();
        mutableShort1.setValue((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test57");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.getValue();
        long long3 = mutableShort1.longValue();
        long long4 = mutableShort1.longValue();
        double double5 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test58");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.increment();
        mutableShort1.subtract((short) 10);
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 91 + "'", short9.equals((short) 91));
    }
}

