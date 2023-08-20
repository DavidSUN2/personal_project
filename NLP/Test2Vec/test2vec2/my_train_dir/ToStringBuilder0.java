
package ToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ToStringBuilder0 {

    public static boolean debug = false;

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The style must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1L), toStringStyle1, true);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray8 = new char[] { 'a', 'a', '#' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendSuper("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        java.lang.Class<?> wildcardClass8 = charArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test007");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        java.lang.String str9 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test008");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test011");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        byte[] byteArray8 = new byte[] { (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test015");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        double[] doubleArray8 = new double[] { (short) -1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test017");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        java.lang.String str9 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test019");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test020");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((long) (byte) 1);
        java.lang.Object obj9 = toStringBuilder4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test021");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 0.0d, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test022");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test023");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test024");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "");
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test025");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((long) (byte) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test026");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.String str7 = toStringBuilder6.build();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder6.getStyle();
        java.lang.Object obj9 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test029");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test030");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        short[] shortArray7 = new short[] { (short) 1, (byte) -1, (byte) 0, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", shortArray7);
        java.lang.Class<?> wildcardClass9 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        java.lang.String str7 = toStringBuilder4.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendAsObjectToString(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test034");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.String str7 = toStringBuilder6.build();
        java.lang.String str8 = toStringBuilder6.toString();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder6.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        java.lang.Class<?> wildcardClass8 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test036");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (double) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test038");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test039");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle2, stringBuffer4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test041");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        float[] floatArray8 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(false);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((java.lang.Object) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test048");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { toStringStyle4 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", objArray6, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test049");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { toStringStyle4 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", objArray6, true);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test050");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test051");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test052");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        java.lang.String str8 = toStringBuilder4.toString();
        java.lang.StringBuffer stringBuffer9 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (double) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test056");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('4');
        java.lang.Object obj9 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test057");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", (long) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test058");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('a');
        java.lang.Object obj9 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test061");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(false);
        java.lang.Class<?> wildcardClass9 = toStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test062");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        boolean[] booleanArray7 = new boolean[] { false, true, false, false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", booleanArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test063");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        short[] shortArray7 = new short[] { (short) 1, (byte) -1, (byte) 0, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", shortArray7);
        java.lang.Class<?> wildcardClass9 = shortArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle1, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test065");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        byte[] byteArray7 = new byte[] { (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", byteArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test066");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('4');
        java.lang.StringBuffer stringBuffer9 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('a');
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d + "'", obj9.equals(10.0d));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test069");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test071");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test072");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray7 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(floatArray7);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
        java.lang.Object obj8 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(0.0f);
        java.lang.String str9 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test075");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('4');
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test076");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test077");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test079");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (short) 100);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test080");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        java.lang.String str7 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test081");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendAsObjectToString((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test082");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test083");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test084");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 10, toStringStyle2, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test085");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test087");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle2, stringBuffer4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test088");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("", (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        java.lang.String str8 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 10.0d, toStringStyle3, false);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test092");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", byteArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test093");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) false, toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test094");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", byteArray4);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = null;
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5, toStringStyle6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test097");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test098");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 10.0f);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (double) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test100");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", byteArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder6.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test101");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (double) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (double) ' ');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test105");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        short[] shortArray5 = new short[] { (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(shortArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        long[] longArray7 = new long[] { 0L, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(longArray7);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test107");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder2.append(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test108");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder1.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test109");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        double[] doubleArray8 = new double[] { (-1L), '#' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test110");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test111");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test112");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        float[] floatArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test113");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test114");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", byteArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((-1.0f));
        java.lang.Class<?> wildcardClass8 = toStringBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test115");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        boolean[] booleanArray7 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("hi!", booleanArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test116");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "");
        java.lang.StringBuffer stringBuffer9 = toStringBuilder8.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test119");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (double) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test120");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        java.lang.String str8 = toStringBuilder4.toString();
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test123");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test125");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test126");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test127");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", byteArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder6.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test128");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test129");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        int[] intArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test130");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test132");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        int[] intArray6 = new int[] { (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("hi!", intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = null;
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder7, toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test134");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test135");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test136");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", (long) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test137");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(1.0d);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test138");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test139");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test140");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str7 = toStringBuilder6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test143");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        int[] intArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(intArray5);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        java.lang.Object obj8 = toStringBuilder4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "<null>,");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test144");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(0.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        short[] shortArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(100.0f);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        byte[] byteArray8 = new byte[] { (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test149");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        java.lang.Class<?> wildcardClass7 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test150");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        boolean[] booleanArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", booleanArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test151");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("hi!", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test152");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (int) (byte) 100);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test153");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle4);
        java.lang.Object[] objArray6 = new java.lang.Object[] { toStringStyle4 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", objArray6, true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder1.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test154");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        double[] doubleArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("", doubleArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test155");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("hi!", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test156");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test157");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
        java.lang.Class<?> wildcardClass8 = stringBuffer7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test158");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((byte) 0);
        java.lang.Class<?> wildcardClass9 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test159");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test160");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("", charArray6, false);
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test163");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 10);
        java.lang.Object obj8 = toStringBuilder5.getObject();
        java.lang.Object obj9 = toStringBuilder5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test164");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test165");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendSuper("");
        java.lang.Object obj9 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendAsObjectToString((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test167");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder4.getStringBuffer();
        java.lang.StringBuffer stringBuffer9 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test168");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test169");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (java.lang.Object) (short) -1);
        long[] longArray8 = new long[] { 10, 0L, 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test170");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test171");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
        java.lang.Class<?> wildcardClass7 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test172");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        int[] intArray7 = new int[] { (short) -1, (short) -1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(intArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test173");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("hi!", charArray3, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test174");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((long) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test175");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", byteArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append("", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test176");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test177");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test178");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle6);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj4, toStringStyle6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test179");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (short) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendSuper("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        char[] charArray8 = new char[] { '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("<null>", charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test181");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test182");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        short[] shortArray5 = new short[] { (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(shortArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test183");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test184");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        java.lang.StringBuffer stringBuffer6 = toStringBuilder1.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test185");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder4.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test186");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        int[] intArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(intArray5);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        java.lang.String str8 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "<null>,<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>,<null>" + "'", str8.equals("<null>,<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test188");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test189");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test191");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray7 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(floatArray7);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", '4');
        java.lang.Object obj8 = toStringBuilder4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 100 + "'", obj8.equals((byte) 100));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test193");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test194");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test195");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>,<null>", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test196");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder4.getStyle();
        java.lang.String str9 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test197");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(100);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder8.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.String str7 = toStringBuilder6.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test199");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        boolean[] booleanArray6 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("<null>,<null>", booleanArray6, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str6 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test202");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle4);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle4, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<null>" + "'", str9.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test203");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test204");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        long[] longArray7 = new long[] { 0L, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(longArray7);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder4.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test205");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test206");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        java.lang.Object obj5 = toStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test208");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('4');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test209");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(100);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("", charArray6, false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder4.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test211");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>", (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test212");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test213");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        java.lang.Class<?> wildcardClass5 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.String str7 = toStringBuilder6.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test215");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test216");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test217");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        java.lang.Object obj7 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test218");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) 100);
        float[] floatArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("hi!", floatArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test219");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test220");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("<null>", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test221");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = null;
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1.0f, toStringStyle2, false);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test222");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) (byte) 10);
        java.lang.String str4 = toStringBuilder3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10,<null>" + "'", str4.equals("10,<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test223");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendSuper("hi!");
        java.lang.String str8 = toStringBuilder7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test224");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test225");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) 1);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        java.lang.String str9 = toStringBuilder7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test226");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = toStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "", toStringStyle3, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test227");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        int[] intArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test228");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) (short) 10);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder1.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test229");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        java.lang.Object obj7 = toStringBuilder1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test230");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (int) (byte) 100);
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test231");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        short[] shortArray7 = new short[] { (short) 10, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(shortArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test232");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(10L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("10,<null>", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test233");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test234");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test235");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str6 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test236");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) '4');
        java.lang.String str9 = toStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test237");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>,<null>");
        java.lang.String str4 = toStringBuilder3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test238");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test239");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>,<null>", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test240");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("10,<null>", (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test241");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test242");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        java.lang.Class<?> wildcardClass4 = toStringBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test243");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null><null>", (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test244");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        java.lang.Object obj5 = toStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.appendSuper("");
        short[] shortArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder2.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test245");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test246");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 100);
        short[] shortArray8 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test247");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>,<null>");
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test248");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder7);
        java.lang.Class<?> wildcardClass9 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test249");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", 10.0d);
        java.lang.String str7 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test250");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder2.append((float) 100);
        java.lang.Class<?> wildcardClass7 = toStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test251");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(false);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test252");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((byte) 0);
        java.lang.String str6 = toStringBuilder5.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test253");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>,<null>", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test254");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) (short) 10);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test255");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test256");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendSuper("hi!");
        java.lang.Object obj8 = toStringBuilder1.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test257");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append('4');
        java.lang.Class<?> wildcardClass8 = toStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test258");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test259");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        int[] intArray7 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test260");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test261");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder6.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test262");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        short[] shortArray7 = new short[] { (short) 10, (short) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(shortArray7);
        java.lang.Class<?> wildcardClass9 = shortArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test263");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((long) (byte) -1);
        java.lang.Class<?> wildcardClass5 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        java.lang.Class<?> wildcardClass2 = toStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test265");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test266");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        java.lang.Object[] objArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", objArray6);
        java.lang.String str8 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test267");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder5.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test268");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("<null>,<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test269");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test270");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        double[] doubleArray6 = new double[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test271");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test272");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test273");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(0.0f);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test274");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (double) (-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test275");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("=0,<null>", (float) 0L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test276");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (double) (-1));
        java.lang.Object obj6 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test277");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendToString("<null>,<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test278");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test279");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        java.lang.Class<?> wildcardClass5 = toStringStyle2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test280");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        java.lang.String str7 = toStringBuilder4.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test281");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((byte) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test282");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(100.0f);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test283");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("=0,<null>", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test284");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((byte) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test285");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test286");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test287");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", (long) 'a');
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test288");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        java.lang.Object obj5 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("=0,<null>", (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test289");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        java.lang.Class<?> wildcardClass9 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test290");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (byte) 100);
        long[] longArray8 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test291");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) 100);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test292");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test293");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1.0d, toStringStyle2, false);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test294");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        java.lang.Class<?> wildcardClass7 = booleanArray5.getClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test295");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test296");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test297");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test298");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test299");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test300");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (double) (-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder1.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test301");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test302");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.Object obj3 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>,<null>", 0.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("10,<null>", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0d + "'", obj3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test303");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((short) (byte) -1);
        java.lang.Object obj6 = toStringBuilder5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '#' + "'", obj6.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test304");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((byte) 0);
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test305");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (short) (byte) 0);
        java.lang.String str8 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=0,<null>" + "'", str8.equals("=0,<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test306");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>,<null>", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test307");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (short) 1, toStringStyle2, false);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test308");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test309");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        float[] floatArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("", floatArray6, false);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test310");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test311");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test312");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = toStringBuilder2.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder2.append("", (double) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendSuper("=0,<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "=0,<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test313");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("hi!", charArray3, false);
        int[] intArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("=0,<null>", intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test314");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (int) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test315");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        java.lang.String str6 = toStringBuilder5.toString();
        java.lang.Object obj7 = toStringBuilder5.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder5.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test316");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test317");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test318");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test319");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("=0,<null>", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test320");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.Object obj3 = toStringBuilder1.getObject();
        java.lang.String str4 = toStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0d + "'", obj3.equals(1.0d));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test321");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 'a', toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test322");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle2, stringBuffer4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test323");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.String str7 = toStringBuilder6.build();
        java.lang.String str8 = toStringBuilder6.toString();
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("=0,<null>", (float) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendToString("10,<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test325");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test326");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test327");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(10L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("=0,<null>", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test328");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = toStringBuilder3.getStyle();
        java.lang.Object obj5 = toStringBuilder3.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("<null>,<null>", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test329");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 100);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test330");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        boolean[] booleanArray5 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(100);
        java.lang.String str9 = toStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test331");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("<null>,<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test332");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        java.lang.String str5 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=0,<null>" + "'", str5.equals("=0,<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test333");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("hi!", charArray3, false);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test334");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test335");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray6 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(floatArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append(floatArray6);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test336");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test337");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("=0,<null>", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test338");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        int[] intArray7 = new int[] { (short) -1, (short) -1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(intArray7);
        java.lang.String str9 = toStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test339");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("");
        java.lang.Class<?> wildcardClass8 = toStringBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test340");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test341");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.Object obj3 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0d + "'", obj3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test342");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("<null><null>", 'a');
        java.lang.String str9 = toStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test343");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.appendSuper("hi!");
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test344");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("10,<null>", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test345");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test346");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test347");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test348");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        java.lang.String str6 = toStringBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test349");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("<null>", (short) 100);
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + ' ' + "'", obj9.equals(' '));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test350");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        java.lang.StringBuffer stringBuffer5 = toStringBuilder4.getStringBuffer();
        java.lang.StringBuffer stringBuffer6 = toStringBuilder4.getStringBuffer();
        java.lang.String str7 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test351");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test352");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (-1L), toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test353");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", byteArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((-1.0f));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test354");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder4.getStringBuffer();
        java.lang.String str9 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test355");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.Object obj4 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendSuper("hi!");
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test356");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        java.lang.Object obj5 = toStringBuilder2.getObject();
        java.lang.String str6 = toStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder2.append((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test357");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("");
        java.lang.Object obj7 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (short) 10 + "'", obj7.equals((short) 10));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test358");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) (short) -1);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder1.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test359");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('4');
        java.lang.String str9 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test360");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendAsObjectToString(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test361");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.Object obj3 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>,<null>", 0.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('#');
        java.lang.String str9 = toStringBuilder8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0d + "'", obj3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test362");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((float) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test363");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test364");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        java.lang.Object obj5 = toStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append((double) (short) 10);
        short[] shortArray8 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test365");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("10,<null>", '#');
        java.lang.StringBuffer stringBuffer9 = toStringBuilder8.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test366");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test367");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", byteArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test368");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder4.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4, toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test369");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = toStringBuilder3.getStyle();
        java.lang.String str5 = toStringBuilder3.build();
        java.lang.String str6 = toStringBuilder3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test370");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (byte) 1);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test371");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        java.lang.String str7 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test372");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", byteArray5);
        java.lang.String str7 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test373");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("=0,<null>", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test374");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>,<null>", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test375");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test376");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test377");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (double) (-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test378");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test379");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        java.lang.Object obj8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>,<null>", obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test380");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", byteArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", false);
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test381");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(100);
        java.lang.String str8 = toStringBuilder5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test382");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        short[] shortArray5 = new short[] { (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(shortArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.appendAsObjectToString((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test383");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle5);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2, toStringStyle5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test384");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((byte) 0);
        java.lang.String str6 = toStringBuilder5.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("=0,<null>", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test385");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("hi!", ' ');
        double[] doubleArray6 = new double[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("hi!", doubleArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test386");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", 10.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test387");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.append((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test388");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test389");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        float[] floatArray7 = new float[] { (-1), (-1L) };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", floatArray7);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test390");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("10,<null>", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("=0,<null>", 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test391");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", (int) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test392");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test393");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.append("=0,<null>", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test394");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle1);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test395");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append((long) (short) -1);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0d + "'", obj8.equals(1.0d));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test396");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test397");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = toStringBuilder4.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test398");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        java.lang.String str7 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test399");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>,<null>", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test400");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 10);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test401");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((int) (byte) 0);
        java.lang.StringBuffer stringBuffer6 = toStringBuilder3.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test402");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = toStringBuilder3.getStyle();
        java.lang.Object obj5 = toStringBuilder3.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("", (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test403");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendToString("<null><null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test404");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test405");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test406");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        java.lang.String str4 = toStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test407");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((float) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test408");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>,<null>", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test409");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 10);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test410");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append(' ');
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test411");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test412");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = toStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2, toStringStyle4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle4);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test413");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("=0,<null>", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test414");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test415");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        java.lang.Object obj5 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append(true);
        java.lang.String str8 = toStringBuilder7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test416");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test417");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder4.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test418");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder2.append((int) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test419");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.Class<?> wildcardClass9 = toStringBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test420");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((double) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("hi!", (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test421");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test422");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test423");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0d + "'", obj5.equals(1.0d));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test424");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((int) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test425");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((int) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test426");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (java.lang.Object) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test427");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test428");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test429");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test430");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((float) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test431");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        java.lang.StringBuffer stringBuffer4 = toStringBuilder3.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append((short) 0);
        java.lang.String str7 = toStringBuilder6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test432");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test433");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) 100);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test434");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        java.lang.String str8 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test435");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test436");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        long[] longArray7 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test437");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        java.lang.Object obj7 = toStringBuilder1.getObject();
        java.lang.StringBuffer stringBuffer8 = toStringBuilder1.getStringBuffer();
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test438");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test439");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test440");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null><null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test441");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("10,<null>", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test442");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = null;
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder3, toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test443");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test444");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test445");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test446");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (int) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test447");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("hi!", true);
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test448");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.append((long) '#');
        java.lang.Object obj5 = toStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.appendSuper("");
        java.lang.StringBuffer stringBuffer8 = toStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test449");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        java.lang.String str6 = toStringBuilder5.toString();
        java.lang.Object obj7 = toStringBuilder5.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test450");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((float) (-1L));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("<null>", (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test451");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", (long) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((float) (byte) 0);
        java.lang.Class<?> wildcardClass9 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test452");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test453");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append((java.lang.Object) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test454");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("<null>", (long) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test455");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test456");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        boolean[] booleanArray4 = new boolean[] { true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", booleanArray4, true);
        java.lang.String str7 = toStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test457");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        java.lang.String str7 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test458");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.Object obj8 = toStringBuilder4.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 10.0d + "'", obj8.equals(10.0d));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test459");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test460");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test461");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = null;
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5, toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test462");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("hi!");
        java.lang.StringBuffer stringBuffer7 = toStringBuilder1.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "=0,");
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test463");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((float) 100);
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test464");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test465");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((byte) 0);
        java.lang.String str6 = toStringBuilder5.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.appendSuper("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test466");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>,<null>", true);
        java.lang.String str7 = toStringBuilder6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test467");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test468");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(true);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder8.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test469");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", 0.0f);
        java.lang.Object obj7 = toStringBuilder6.getObject();
        java.lang.Class<?> wildcardClass8 = toStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0d + "'", obj7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test470");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        char[] charArray7 = new char[] { ' ', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("<null>", charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test471");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        java.lang.String str4 = toStringBuilder1.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test472");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = toStringBuilder3.getStyle();
        java.lang.String str5 = toStringBuilder3.build();
        char[] charArray7 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("hi!", charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test473");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.appendToString("<null>,<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test474");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) 100);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test475");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        short[] shortArray7 = new short[] { (byte) 10, (byte) 0, (short) 100, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("", shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test476");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        int[] intArray5 = new int[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", intArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test477");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((float) (byte) 1);
        java.lang.Object obj7 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test478");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendAsObjectToString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test479");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test480");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((float) 100);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test481");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("<null>", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("<null>", 10.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test482");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Class<?> wildcardClass5 = toStringStyle1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test483");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null><null>", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test484");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", (long) 'a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test485");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendAsObjectToString((java.lang.Object) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("hi!", (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test486");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>,<null>", true);
        java.lang.String str7 = toStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test487");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (java.lang.Object) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(true);
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test488");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        java.lang.String str4 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("<null>,<null>", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test489");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.appendToString("hi!");
        java.lang.StringBuffer stringBuffer5 = toStringBuilder4.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test490");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test491");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("<null>,<null>", (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test492");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((long) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('a');
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test493");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("hi!", (short) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test494");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        byte[] byteArray4 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", byteArray4);
        java.lang.Object obj6 = toStringBuilder5.getObject();
        java.lang.String str7 = toStringBuilder5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test495");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (short) (byte) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder4.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test496");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.String str3 = toStringBuilder1.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>,<null>", (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<null>" + "'", str2.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null><null>" + "'", str3.equals("<null><null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test497");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test498");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder2.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder2.append((byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test499");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        java.lang.String str2 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("10,<null>", (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<null>" + "'", str2.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test500");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.Object obj3 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("10,<null>", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0d + "'", obj3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }
}

