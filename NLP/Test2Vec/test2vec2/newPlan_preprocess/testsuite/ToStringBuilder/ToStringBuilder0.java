package ToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ToStringBuilder0 {

    public static boolean debug = false;

    @Test
    public void ToStringBuilder001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = null;
        // The following exception was thrown during execution in ToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The style must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ToStringBuilder002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1L), toStringStyle1, true);
    }

    @Test
    public void ToStringBuilder003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ToStringBuilder004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder004");
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
    public void ToStringBuilder005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder005");
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
    public void ToStringBuilder006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder006");
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
    public void ToStringBuilder007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder007");
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
    public void ToStringBuilder008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder008");
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
    public void ToStringBuilder009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder009");
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
    public void ToStringBuilder010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder010");
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
    public void ToStringBuilder011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder011");
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
    public void ToStringBuilder012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder012");
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
    public void ToStringBuilder013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder013");
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
    public void ToStringBuilder014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder014");
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
    public void ToStringBuilder015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder015");
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
    public void ToStringBuilder016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder016");
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
    public void ToStringBuilder017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder017");
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
    public void ToStringBuilder018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder018");
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
    public void ToStringBuilder019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder019");
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
    public void ToStringBuilder020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder020");
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
    public void ToStringBuilder021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder021");
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
    public void ToStringBuilder022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder022");
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
    public void ToStringBuilder023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder023");
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
    public void ToStringBuilder024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder024");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "");
    }

    @Test
    public void ToStringBuilder025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder025");
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
    public void ToStringBuilder026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder026");
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
    public void ToStringBuilder027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder027");
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
    public void ToStringBuilder028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder028");
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
    public void ToStringBuilder029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder029");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
    }

    @Test
    public void ToStringBuilder030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder030");
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
    public void ToStringBuilder031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder031");
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
    public void ToStringBuilder032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", intArray6);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in ToStringBuilder generation
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
    public void ToStringBuilder033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder033");
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
    public void ToStringBuilder034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder034");
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
    public void ToStringBuilder035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder035");
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
    public void ToStringBuilder036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder036");
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
    public void ToStringBuilder037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder037");
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
    public void ToStringBuilder038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder038");
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
    public void ToStringBuilder039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder039");
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
    public void ToStringBuilder040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder040");
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
    public void ToStringBuilder041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder041");
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
    public void ToStringBuilder042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder042");
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
    public void ToStringBuilder043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle2, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0f, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder044");
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
    public void ToStringBuilder045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder045");
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
    public void ToStringBuilder046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder046");
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
    public void ToStringBuilder047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder047");
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
    public void ToStringBuilder048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder048");
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
    public void ToStringBuilder049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder049");
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
    public void ToStringBuilder050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder050");
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
    public void ToStringBuilder051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder051");
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
    public void ToStringBuilder052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder052");
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
    public void ToStringBuilder053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder053");
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
    public void ToStringBuilder054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder054");
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
    public void ToStringBuilder055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder055");
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
    public void ToStringBuilder056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder056");
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
    public void ToStringBuilder057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder057");
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
    public void ToStringBuilder058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder058");
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
    public void ToStringBuilder059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder059");
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
    public void ToStringBuilder060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder060");
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
    public void ToStringBuilder061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder061");
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
    public void ToStringBuilder062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder062");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        boolean[] booleanArray7 = new boolean[] { false, true, false, false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", booleanArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder063");
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
    public void ToStringBuilder064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!", toStringStyle1, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
    }

    @Test
    public void ToStringBuilder065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder065");
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
    public void ToStringBuilder066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder066");
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
    public void ToStringBuilder067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder067");
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
    public void ToStringBuilder068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder068");
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
    public void ToStringBuilder069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder069");
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
    public void ToStringBuilder070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder071");
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
    public void ToStringBuilder072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder072");
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
    public void ToStringBuilder073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder073");
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
    public void ToStringBuilder074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder074");
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
    public void ToStringBuilder075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder075");
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
    public void ToStringBuilder076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder076");
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
    public void ToStringBuilder077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder077");
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
    public void ToStringBuilder078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder078");
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
    public void ToStringBuilder079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder079");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (short) 100);
    }

    @Test
    public void ToStringBuilder080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder080");
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
    public void ToStringBuilder081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder081");
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
    public void ToStringBuilder082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder082");
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
    public void ToStringBuilder083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder083");
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
    public void ToStringBuilder084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder084");
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
    public void ToStringBuilder085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder085");
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
    public void ToStringBuilder086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder086");
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
    public void ToStringBuilder087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder087");
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
    public void ToStringBuilder088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder088");
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
    public void ToStringBuilder089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder089");
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
    public void ToStringBuilder090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder090");
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
    public void ToStringBuilder091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder091");
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
    public void ToStringBuilder092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder092");
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
    public void ToStringBuilder093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder093");
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
    public void ToStringBuilder094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder094");
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
    public void ToStringBuilder095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder095");
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
    public void ToStringBuilder096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder096");
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
    public void ToStringBuilder097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder097");
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
    public void ToStringBuilder098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder098");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 10.0f);
    }

    @Test
    public void ToStringBuilder099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder099");
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
    public void ToStringBuilder100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder100");
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
    public void ToStringBuilder101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder101");
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
    public void ToStringBuilder102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder102");
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
    public void ToStringBuilder103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder103");
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
    public void ToStringBuilder104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder104");
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
    public void ToStringBuilder105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder105");
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
    public void ToStringBuilder106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder106");
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
    public void ToStringBuilder107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder107");
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
    public void ToStringBuilder108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder108");
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
    public void ToStringBuilder109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder109");
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
    public void ToStringBuilder110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder110");
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
    public void ToStringBuilder111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder111");
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
    public void ToStringBuilder112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder112");
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
    public void ToStringBuilder113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder113");
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
    public void ToStringBuilder114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder114");
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
    public void ToStringBuilder115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder115");
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
    public void ToStringBuilder116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder116");
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
    public void ToStringBuilder117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder117");
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
    public void ToStringBuilder118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder118");
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
    public void ToStringBuilder119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder119");
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
    public void ToStringBuilder120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder120");
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
    public void ToStringBuilder121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder121");
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
    public void ToStringBuilder122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder122");
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
    public void ToStringBuilder123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder123");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1));
    }

    @Test
    public void ToStringBuilder124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder124");
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
    public void ToStringBuilder125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder125");
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
    public void ToStringBuilder126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder126");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder127");
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
    public void ToStringBuilder128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder128");
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
    public void ToStringBuilder129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder129");
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
    public void ToStringBuilder130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder130");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder131");
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
    public void ToStringBuilder132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder132");
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
    public void ToStringBuilder133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder133");
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
    public void ToStringBuilder134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder134");
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
    public void ToStringBuilder135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder135");
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
    public void ToStringBuilder136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder136");
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
    public void ToStringBuilder137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder137");
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
    public void ToStringBuilder138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder138");
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
    public void ToStringBuilder139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder139");
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
    public void ToStringBuilder140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder140");
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
    public void ToStringBuilder141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder141");
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
    public void ToStringBuilder142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder142");
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
    public void ToStringBuilder143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder143");
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
    public void ToStringBuilder144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder144");
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
    public void ToStringBuilder145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder145");
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
    public void ToStringBuilder146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder146");
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
    public void ToStringBuilder147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder147");
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
    public void ToStringBuilder148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder148");
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
    public void ToStringBuilder149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder149");
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
    public void ToStringBuilder150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder150");
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
    public void ToStringBuilder151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder151");
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
    public void ToStringBuilder152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder152");
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
    public void ToStringBuilder153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder153");
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
    public void ToStringBuilder154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder154");
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
    public void ToStringBuilder155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder155");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("hi!", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder156");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder157");
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
    public void ToStringBuilder158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder158");
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
    public void ToStringBuilder159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder159");
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
    public void ToStringBuilder160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder160");
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
    public void ToStringBuilder161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder161");
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
    public void ToStringBuilder162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder162");
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
    public void ToStringBuilder163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder163");
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
    public void ToStringBuilder164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder164");
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
    public void ToStringBuilder165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder165");
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
    public void ToStringBuilder166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder166");
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
    public void ToStringBuilder167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder167");
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
    public void ToStringBuilder168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder168");
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
    public void ToStringBuilder169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder169");
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
    public void ToStringBuilder170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder170");
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
    public void ToStringBuilder171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder171");
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
    public void ToStringBuilder172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder172");
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
    public void ToStringBuilder173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder173");
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
    public void ToStringBuilder174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder174");
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
    public void ToStringBuilder175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder175");
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
    public void ToStringBuilder176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder176");
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
    public void ToStringBuilder177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder177");
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
    public void ToStringBuilder178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder178");
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
    public void ToStringBuilder179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder179");
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
    public void ToStringBuilder180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder180");
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
    public void ToStringBuilder181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder181");
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
    public void ToStringBuilder182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder182");
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
    public void ToStringBuilder183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder183");
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
    public void ToStringBuilder184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder184");
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
    public void ToStringBuilder185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder185");
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
    public void ToStringBuilder186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder186");
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
    public void ToStringBuilder187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder187");
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
    public void ToStringBuilder188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder188");
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
    public void ToStringBuilder189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder189");
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
    public void ToStringBuilder190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder190");
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
    public void ToStringBuilder191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder191");
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
    public void ToStringBuilder192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder192");
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
    public void ToStringBuilder193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder193");
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
    public void ToStringBuilder194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder194");
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
    public void ToStringBuilder195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder195");
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
    public void ToStringBuilder196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder196");
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
    public void ToStringBuilder197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder197");
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
    public void ToStringBuilder198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder198");
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
    public void ToStringBuilder199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder199");
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
    public void ToStringBuilder200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str6 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder201");
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
    public void ToStringBuilder202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder202");
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
    public void ToStringBuilder203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder203");
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
    public void ToStringBuilder204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder204");
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
    public void ToStringBuilder205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder205");
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
    public void ToStringBuilder206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder206");
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
    public void ToStringBuilder207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder207");
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
    public void ToStringBuilder208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder208");
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
    public void ToStringBuilder209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder209");
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
    public void ToStringBuilder210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder210");
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
    public void ToStringBuilder211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder211");
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
    public void ToStringBuilder212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder212");
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
    public void ToStringBuilder213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder213");
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
    public void ToStringBuilder214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder214");
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
    public void ToStringBuilder215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder215");
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
    public void ToStringBuilder216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder216");
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
    public void ToStringBuilder217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder217");
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
    public void ToStringBuilder218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder218");
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
    public void ToStringBuilder219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder219");
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
    public void ToStringBuilder220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder220");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("<null>", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder221");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = null;
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1.0f, toStringStyle2, false);
    }

    @Test
    public void ToStringBuilder222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder222");
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
    public void ToStringBuilder223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder223");
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
    public void ToStringBuilder224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder224");
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
    public void ToStringBuilder225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder225");
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
    public void ToStringBuilder226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder226");
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
    public void ToStringBuilder227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder227");
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
    public void ToStringBuilder228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder228");
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
    public void ToStringBuilder229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder229");
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
    public void ToStringBuilder230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder230");
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
    public void ToStringBuilder231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder231");
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
    public void ToStringBuilder232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder232");
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
    public void ToStringBuilder233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder233");
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
    public void ToStringBuilder234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder234");
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
    public void ToStringBuilder235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder235");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str6 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder236");
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
    public void ToStringBuilder237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder237");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>,<null>");
        java.lang.String str4 = toStringBuilder3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder238");
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
    public void ToStringBuilder239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder239");
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
    public void ToStringBuilder240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder240");
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
    public void ToStringBuilder241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder241");
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
    public void ToStringBuilder242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder242");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        java.lang.Class<?> wildcardClass4 = toStringBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ToStringBuilder243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder243");
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
    public void ToStringBuilder244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder244");
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
    public void ToStringBuilder245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder245");
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
    public void ToStringBuilder246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder246");
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
    public void ToStringBuilder247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder247");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>,<null>");
    }

    @Test
    public void ToStringBuilder248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder248");
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
    public void ToStringBuilder249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder249");
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
    public void ToStringBuilder250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder250");
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
    public void ToStringBuilder251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder251");
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
    public void ToStringBuilder252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder252");
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
    public void ToStringBuilder253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder253");
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
    public void ToStringBuilder254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder254");
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
    public void ToStringBuilder255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder255");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder256");
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
    public void ToStringBuilder257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder257");
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
    public void ToStringBuilder258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder258");
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
    public void ToStringBuilder259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder259");
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
    public void ToStringBuilder260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder260");
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
    public void ToStringBuilder261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder261");
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
    public void ToStringBuilder262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder262");
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
    public void ToStringBuilder263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder263");
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
    public void ToStringBuilder264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        java.lang.Class<?> wildcardClass2 = toStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ToStringBuilder265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder265");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder266");
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
    public void ToStringBuilder267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder267");
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
    public void ToStringBuilder268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder268");
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
    public void ToStringBuilder269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder269");
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
    public void ToStringBuilder270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder270");
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
    public void ToStringBuilder271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder271");
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
    public void ToStringBuilder272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder272");
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
    public void ToStringBuilder273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder273");
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
    public void ToStringBuilder274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder274");
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
    public void ToStringBuilder275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder275");
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
    public void ToStringBuilder276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder276");
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
    public void ToStringBuilder277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder277");
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
    public void ToStringBuilder278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder278");
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
    public void ToStringBuilder279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder279");
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
    public void ToStringBuilder280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder280");
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
    public void ToStringBuilder281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder281");
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
    public void ToStringBuilder282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder282");
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
    public void ToStringBuilder283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder283");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("=0,<null>", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder284");
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
    public void ToStringBuilder285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder285");
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
    public void ToStringBuilder286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder286");
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
    public void ToStringBuilder287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder287");
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
    public void ToStringBuilder288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder288");
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
    public void ToStringBuilder289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder289");
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
    public void ToStringBuilder290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder290");
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
    public void ToStringBuilder291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder291");
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
    public void ToStringBuilder292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder292");
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
    public void ToStringBuilder293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder293");
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
    public void ToStringBuilder294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder294");
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
    public void ToStringBuilder295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder295");
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
    public void ToStringBuilder296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder296");
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
    public void ToStringBuilder297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder297");
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
    public void ToStringBuilder298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder298");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder299");
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
    public void ToStringBuilder300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder300");
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
    public void ToStringBuilder301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder301");
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
    public void ToStringBuilder302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder302");
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
    public void ToStringBuilder303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder303");
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
    public void ToStringBuilder304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder304");
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
    public void ToStringBuilder305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder305");
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
    public void ToStringBuilder306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder306");
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
    public void ToStringBuilder307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder307");
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
    public void ToStringBuilder308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder308");
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
    public void ToStringBuilder309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder309");
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
    public void ToStringBuilder310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder310");
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
    public void ToStringBuilder311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder311");
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
    public void ToStringBuilder312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder312");
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
    public void ToStringBuilder313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder313");
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
    public void ToStringBuilder314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder314");
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
    public void ToStringBuilder315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder315");
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
    public void ToStringBuilder316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder316");
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
    public void ToStringBuilder317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder317");
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
    public void ToStringBuilder318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder318");
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
    public void ToStringBuilder319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder319");
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
    public void ToStringBuilder320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder320");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.Object obj3 = toStringBuilder1.getObject();
        java.lang.String str4 = toStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0d + "'", obj3.equals(1.0d));
    }

    @Test
    public void ToStringBuilder321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder321");
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
    public void ToStringBuilder322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder322");
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
    public void ToStringBuilder323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder323");
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
    public void ToStringBuilder324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder324");
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
    public void ToStringBuilder325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder325");
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
    public void ToStringBuilder326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder326");
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
    public void ToStringBuilder327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder327");
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
    public void ToStringBuilder328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder328");
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
    public void ToStringBuilder329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder329");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 100);
    }

    @Test
    public void ToStringBuilder330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder330");
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
    public void ToStringBuilder331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder331");
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
    public void ToStringBuilder332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder332");
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
    public void ToStringBuilder333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder333");
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
    public void ToStringBuilder334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder334");
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
    public void ToStringBuilder335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder335");
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
    public void ToStringBuilder336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder336");
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
    public void ToStringBuilder337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder337");
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
    public void ToStringBuilder338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder338");
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
    public void ToStringBuilder339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder339");
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
    public void ToStringBuilder340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder340");
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
    public void ToStringBuilder341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder341");
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
    public void ToStringBuilder342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder342");
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
    public void ToStringBuilder343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder343");
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
    public void ToStringBuilder344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder344");
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
    public void ToStringBuilder345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder345");
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
    public void ToStringBuilder346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder346");
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
    public void ToStringBuilder347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder347");
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
    public void ToStringBuilder348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder348");
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
    public void ToStringBuilder349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder349");
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
    public void ToStringBuilder350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder350");
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
    public void ToStringBuilder351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder351");
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
    public void ToStringBuilder352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder352");
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
    public void ToStringBuilder353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder353");
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
    public void ToStringBuilder354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder354");
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
    public void ToStringBuilder355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder355");
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
    public void ToStringBuilder356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder356");
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
    public void ToStringBuilder357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder357");
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
    public void ToStringBuilder358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder358");
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
    public void ToStringBuilder359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder359");
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
    public void ToStringBuilder360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder360");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in ToStringBuilder generation
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
    public void ToStringBuilder361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder361");
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
    public void ToStringBuilder362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder362");
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
    public void ToStringBuilder363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder363");
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
    public void ToStringBuilder364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder364");
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
    public void ToStringBuilder365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder365");
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
    public void ToStringBuilder366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder366");
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
    public void ToStringBuilder367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder367");
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
    public void ToStringBuilder368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder368");
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
    public void ToStringBuilder369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder369");
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
    public void ToStringBuilder370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder370");
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
    public void ToStringBuilder371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder371");
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
    public void ToStringBuilder372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder372");
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
    public void ToStringBuilder373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder373");
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
    public void ToStringBuilder374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder374");
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
    public void ToStringBuilder375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder375");
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
    public void ToStringBuilder376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder376");
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
    public void ToStringBuilder377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder377");
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
    public void ToStringBuilder378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder378");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder379");
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
    public void ToStringBuilder380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder380");
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
    public void ToStringBuilder381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder381");
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
    public void ToStringBuilder382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder382");
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
    public void ToStringBuilder383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder383");
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
    public void ToStringBuilder384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder384");
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
    public void ToStringBuilder385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder385");
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
    public void ToStringBuilder386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder386");
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
    public void ToStringBuilder387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder387");
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
    public void ToStringBuilder388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder388");
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
    public void ToStringBuilder389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder389");
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
    public void ToStringBuilder390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder390");
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
    public void ToStringBuilder391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder391");
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
    public void ToStringBuilder392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder392");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ToStringBuilder393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder393");
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
    public void ToStringBuilder394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder394");
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
    public void ToStringBuilder395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder395");
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
    public void ToStringBuilder396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder396");
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
    public void ToStringBuilder397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder397");
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
    public void ToStringBuilder398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder398");
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
    public void ToStringBuilder399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder399");
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
    public void ToStringBuilder400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder400");
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
    public void ToStringBuilder401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder401");
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
    public void ToStringBuilder402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder402");
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
    public void ToStringBuilder403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder403");
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
    public void ToStringBuilder404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder404");
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
    public void ToStringBuilder405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder405");
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
    public void ToStringBuilder406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder406");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) (short) 0);
        java.lang.String str4 = toStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder407");
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
    public void ToStringBuilder408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder408");
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
    public void ToStringBuilder409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder409");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 10);
    }

    @Test
    public void ToStringBuilder410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder410");
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
    public void ToStringBuilder411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder411");
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
    public void ToStringBuilder412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder412");
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
    public void ToStringBuilder413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder413");
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
    public void ToStringBuilder414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder414");
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
    public void ToStringBuilder415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder415");
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
    public void ToStringBuilder416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder416");
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
    public void ToStringBuilder417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder417");
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
    public void ToStringBuilder418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder418");
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
    public void ToStringBuilder419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder419");
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
    public void ToStringBuilder420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder420");
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
    public void ToStringBuilder421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder421");
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
    public void ToStringBuilder422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder422");
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
    public void ToStringBuilder423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder423");
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
    public void ToStringBuilder424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder424");
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
    public void ToStringBuilder425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder425");
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
    public void ToStringBuilder426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder426");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (java.lang.Object) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder427");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void ToStringBuilder428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder428");
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
    public void ToStringBuilder429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder429");
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
    public void ToStringBuilder430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder430");
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
    public void ToStringBuilder431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder431");
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
    public void ToStringBuilder432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder432");
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
    public void ToStringBuilder433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder433");
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
    public void ToStringBuilder434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder434");
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
    public void ToStringBuilder435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder435");
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
    public void ToStringBuilder436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder436");
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
    public void ToStringBuilder437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder437");
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
    public void ToStringBuilder438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder438");
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
    public void ToStringBuilder439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder439");
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
    public void ToStringBuilder440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder440");
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
    public void ToStringBuilder441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder441");
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
    public void ToStringBuilder442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder442");
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
    public void ToStringBuilder443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder443");
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
    public void ToStringBuilder444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder444");
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
    public void ToStringBuilder445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder445");
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
    public void ToStringBuilder446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder446");
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
    public void ToStringBuilder447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder447");
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
    public void ToStringBuilder448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder448");
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
    public void ToStringBuilder449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder449");
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
    public void ToStringBuilder450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder450");
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
    public void ToStringBuilder451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder451");
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
    public void ToStringBuilder452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder452");
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
    public void ToStringBuilder453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder453");
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
    public void ToStringBuilder454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder454");
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
    public void ToStringBuilder455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder455");
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
    public void ToStringBuilder456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder456");
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
    public void ToStringBuilder457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder457");
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
    public void ToStringBuilder458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder458");
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
    public void ToStringBuilder459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder459");
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
    public void ToStringBuilder460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder460");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder461");
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
    public void ToStringBuilder462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder462");
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
    public void ToStringBuilder463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder463");
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
    public void ToStringBuilder464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder464");
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
    public void ToStringBuilder465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder465");
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
    public void ToStringBuilder466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder466");
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
    public void ToStringBuilder467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder467");
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
    public void ToStringBuilder468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder468");
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
    public void ToStringBuilder469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder469");
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
    public void ToStringBuilder470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder470");
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
    public void ToStringBuilder471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder471");
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
    public void ToStringBuilder472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder472");
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
    public void ToStringBuilder473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder473");
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
    public void ToStringBuilder474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder474");
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
    public void ToStringBuilder475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder475");
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
    public void ToStringBuilder476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder476");
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
    public void ToStringBuilder477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder477");
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
    public void ToStringBuilder478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder478");
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
    public void ToStringBuilder479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder479");
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
    public void ToStringBuilder480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder480");
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
    public void ToStringBuilder481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder481");
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
    public void ToStringBuilder482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder482");
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
    public void ToStringBuilder483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder483");
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
    public void ToStringBuilder484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder484");
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
    public void ToStringBuilder485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder485");
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
    public void ToStringBuilder486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder486");
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
    public void ToStringBuilder487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder487");
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
    public void ToStringBuilder488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder488");
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
    public void ToStringBuilder489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder489");
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
    public void ToStringBuilder490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder490");
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
    public void ToStringBuilder491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder491");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("<null>,<null>", (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder492");
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
    public void ToStringBuilder493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder493");
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
    public void ToStringBuilder494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder494");
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
    public void ToStringBuilder495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder495");
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
    public void ToStringBuilder496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder496");
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
    public void ToStringBuilder497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder497");
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
    public void ToStringBuilder498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder498");
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
    public void ToStringBuilder499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder499");
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
    public void ToStringBuilder500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.ToStringBuilder500");
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

