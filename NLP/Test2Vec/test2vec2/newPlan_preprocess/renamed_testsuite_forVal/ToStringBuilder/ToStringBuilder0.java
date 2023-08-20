
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
            System.out.format("%n%s%n", "ToStringBuilder0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test02");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 10, 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test03");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        double[] doubleArray8 = new double[] { 'a', 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test04");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        byte[] byteArray8 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", byteArray8);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test05");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        java.lang.Class<?> wildcardClass5 = toStringStyle1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test06");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("<null>", longArray6, false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test07");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("<null>", longArray6, false);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test08");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (double) (byte) -1);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test09");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        java.lang.Class<?> wildcardClass7 = toStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test10");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(0L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0L);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test11");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        char[] charArray8 = new char[] { ' ', '#', ' ', '#', ' ', 'a' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test12");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (-1L), toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((long) 100);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test13");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        java.lang.String str5 = toStringBuilder4.toString();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("", doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test14");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle3, stringBuffer5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle3, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) "<null>", toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test15");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        java.lang.Object[] objArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", objArray5, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test16");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        java.lang.Object[] objArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", objArray5, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test17");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        java.lang.String str5 = toStringBuilder4.toString();
        java.lang.Object obj6 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 0 + "'", obj6.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test18");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        java.lang.Object[] objArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", objArray5, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test19");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("<null>", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test20");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        java.lang.Object obj7 = toStringBuilder6.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 0 + "'", obj7.equals((byte) 0));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test21");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(0L);
        java.lang.Class<?> wildcardClass9 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test22");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("<null>", longArray6, false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder4.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test23");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        java.lang.String str7 = toStringBuilder4.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(true);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test24");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append((float) (byte) 10);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test25");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(' ');
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
            System.out.format("%n%s%n", "ToStringBuilder0.test26");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", (java.lang.Object) 0L);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test27");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        float[] floatArray5 = new float[] { 10L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(floatArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test28");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test29");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test30");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        long[] longArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(longArray7);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test31");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        java.lang.String str7 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test32");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle4, stringBuffer6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append("<null>", (java.lang.Object) toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test33");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        java.lang.String str5 = toStringBuilder4.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) 1L);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test34");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append(doubleArray4);
        float[] floatArray7 = new float[] { 10L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append(floatArray7);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test35");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(0L);
        java.lang.String str9 = toStringBuilder4.toString();
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
            System.out.format("%n%s%n", "ToStringBuilder0.test36");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("<null>", (byte) 100);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test37");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (int) '4');
        java.lang.String str8 = toStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test38");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((byte) 10);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test39");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.appendSuper("hi!");
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
            System.out.format("%n%s%n", "ToStringBuilder0.test40");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test41");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        short[] shortArray8 = new short[] { (byte) 10, (short) 100, (byte) 1, (byte) -1, (short) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>", shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test42");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((byte) 10);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test43");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        long[] longArray6 = new long[] { (-1), (short) -1, (byte) 0, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append(longArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test44");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle2, stringBuffer4);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test45");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        double[] doubleArray7 = new double[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(doubleArray7);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test46");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        float[] floatArray6 = new float[] { (short) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", floatArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test47");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        long[] longArray6 = new long[] { (-1), (short) -1, (byte) 0, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append(longArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test48");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        float[] floatArray6 = new float[] { (short) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", floatArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test49");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((java.lang.Object) '4');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle6);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5, toStringStyle6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test50");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        boolean[] booleanArray8 = new boolean[] { false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test51");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", (byte) 0);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test52");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        float[] floatArray5 = new float[] { 10L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(floatArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test53");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", 'a');
        double[] doubleArray7 = new double[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(doubleArray7);
        java.lang.String str9 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test54");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(1L);
        java.lang.String str9 = toStringBuilder6.toString();
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
            System.out.format("%n%s%n", "ToStringBuilder0.test55");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(100.0f);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test56");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", (int) '4');
        java.lang.String str8 = toStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test57");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (double) 0L);
        int[] intArray6 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("hi!", intArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test58");
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
            System.out.format("%n%s%n", "ToStringBuilder0.test59");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append("hi!", false);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test60");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        char[] charArray2 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test61");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        java.lang.String str5 = toStringBuilder4.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(1.0f);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test62");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
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
            System.out.format("%n%s%n", "ToStringBuilder0.test63");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test64");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        java.lang.Class<?> wildcardClass4 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test65");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        float[] floatArray5 = new float[] { 10L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append(floatArray5);
        java.lang.Class<?> wildcardClass7 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test66");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test67");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((long) 'a');
        java.lang.String str9 = toStringBuilder6.toString();
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
            System.out.format("%n%s%n", "ToStringBuilder0.test68");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(false);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test69");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        java.lang.Object obj7 = toStringBuilder6.getObject();
        java.lang.String str8 = toStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 0 + "'", obj7.equals((byte) 0));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test70");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((java.lang.Object) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendSuper("");
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder1);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test71");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 0);
        float[] floatArray6 = new float[] { (-1L), 0, 100L, 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test72");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", '#');
        java.lang.Object obj7 = toStringBuilder6.getObject();
        java.lang.Object obj8 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte) 1 + "'", obj7.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 1 + "'", obj8.equals((byte) 1));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test73");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 1);
        double[] doubleArray2 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(doubleArray2);
        boolean[] booleanArray7 = new boolean[] { false, false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append("<null>", booleanArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder0.test74");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((double) (short) 100);
        java.lang.Class<?> wildcardClass9 = toStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
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
            System.out.format("%n%s%n", "ToStringBuilder0.test75");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 100, toStringStyle2, false);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }
}

