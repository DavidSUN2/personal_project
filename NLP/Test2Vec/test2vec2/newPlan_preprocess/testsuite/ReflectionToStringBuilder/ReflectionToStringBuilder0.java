package ReflectionToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReflectionToStringBuilder0 {

    public static boolean debug = false;

    @Test
    public void ReflectionToStringBuilder001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 'a', toStringStyle1);
    }

    @Test
    public void ReflectionToStringBuilder002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder002");
        java.util.Collection<java.lang.String> strCollection1 = null;
        java.lang.String str2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) true, strCollection1);
    }

    @Test
    public void ReflectionToStringBuilder003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder003");
        java.lang.String str1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d));
    }

    @Test
    public void ReflectionToStringBuilder004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean[] booleanArray8 = new boolean[] { true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        char[] charArray8 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder007");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (double) 100.0f);
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder008");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", (java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) "hi!", toStringStyle6, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void ReflectionToStringBuilder010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder010");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ReflectionToStringBuilder011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder011");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj1, (java.util.Collection<java.lang.String>) strList5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10.0f, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ReflectionToStringBuilder012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray7 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        char[] charArray7 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder015");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = reflectionToStringBuilder2.reflectionAppendArray((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ReflectionToStringBuilder016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        java.lang.StringBuffer stringBuffer9 = reflectionToStringBuilder8.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder017");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '4', strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void ReflectionToStringBuilder018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder019");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder020");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj1, (java.util.Collection<java.lang.String>) strList5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, (java.util.Collection<java.lang.String>) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ReflectionToStringBuilder021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder021");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (java.lang.Object) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder022");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle3, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder023");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder024");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder025");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("<null>", (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder026");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((java.lang.Object) 10.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7, toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder029");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj4, toStringStyle5);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder2, toStringStyle5, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        boolean boolean9 = reflectionToStringBuilder8.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (double) 100.0f);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder034");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder036");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        reflectionToStringBuilder2.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle1, false);
    }

    @Test
    public void ReflectionToStringBuilder039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder039");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder041");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        double[] doubleArray8 = new double[] { '4', 0.0d, '#' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((java.lang.Object) "hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder045");
        java.lang.String[] strArray2 = new java.lang.String[] { "<null>" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '#', (java.util.Collection<java.lang.String>) strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void ReflectionToStringBuilder046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle3, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (double) 100.0f);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder049");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder050");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder051");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder052");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.Object obj9 = reflectionToStringBuilder2.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder8.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((java.lang.Object) "hi!");
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder056");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder057");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder058");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder061");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder062");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        java.lang.StringBuffer stringBuffer9 = reflectionToStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder063");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1));
    }

    @Test
    public void ReflectionToStringBuilder064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder7.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder065");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle3, false, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder066");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle3, false, true);
        java.lang.Class<?> wildcardClass9 = toStringStyle3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder7.append((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder069");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle3, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0, toStringStyle3);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder8.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder071");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 0.0f);
    }

    @Test
    public void ReflectionToStringBuilder072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (short) -1);
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean[] booleanArray8 = new boolean[] { false, false };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder075");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        java.lang.Class<?> wildcardClass8 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder076");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder077");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append("<null>", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder2.reflectionAppendArray(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ReflectionToStringBuilder079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder079");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        float[] floatArray8 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder080");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = null;
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The style must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void ReflectionToStringBuilder081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder081");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        java.lang.Object obj6 = toStringBuilder5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + ' ' + "'", obj6.equals(' '));
    }

    @Test
    public void ReflectionToStringBuilder082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder082");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((java.lang.Object) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder083");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray7 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder084");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        reflectionToStringBuilder5.setAppendStatics(false);
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) false, strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder085");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder087");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void ReflectionToStringBuilder088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder2.setExcludeFieldNames(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.StringBuffer stringBuffer9 = reflectionToStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        reflectionToStringBuilder2.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (short) 1);
        java.lang.String str9 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder092");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder7.appendSuper("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder093");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder094");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (short) 1);
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder097");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '4', strArray5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) (byte) 1, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void ReflectionToStringBuilder098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder098");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0, toStringStyle1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder100");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder101");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append((byte) -1);
        java.lang.Object obj9 = toStringBuilder3.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + ' ' + "'", obj9.equals(' '));
    }

    @Test
    public void ReflectionToStringBuilder102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder6.getStringBuffer();
        double[] doubleArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder105");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        reflectionToStringBuilder7.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder107");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        long[] longArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder108");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(100L);
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder109");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder110");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder5.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder111");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder112");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder113");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        reflectionToStringBuilder2.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder114");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder115");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        int[] intArray8 = new int[] { (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder116");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder2.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        java.lang.String str8 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder119");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append("", 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder120");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder122");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append(obj4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", ' ');
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle5);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle5);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle3, toStringStyle5);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder8.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder125");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        java.lang.Object obj8 = toStringBuilder7.getObject();
        java.lang.Class<?> wildcardClass9 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder127");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (short) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder128");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder129");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.appendSuper("<null>");
        java.lang.String str9 = reflectionToStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder130");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        reflectionToStringBuilder7.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        java.lang.Class<?> wildcardClass8 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder133");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        short[] shortArray8 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append("", shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder134");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder135");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder137");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder138");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String str8 = reflectionToStringBuilder2.toString();
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder143");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean7);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder8.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder144");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        long[] longArray7 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(longArray7);
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        long[] longArray8 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder149");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        long[] longArray7 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(longArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder150");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.String str9 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder151");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 10.0d);
    }

    @Test
    public void ReflectionToStringBuilder152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder152");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean[] booleanArray7 = new boolean[] { false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(booleanArray7);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder4.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder153");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", shortArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder154");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj0, strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder155");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append((byte) -1);
        java.lang.Class<?> wildcardClass9 = toStringBuilder3.getClass();
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
    public void ReflectionToStringBuilder156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder156");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>", (float) 100L);
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder157");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder158");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        reflectionToStringBuilder2.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder159");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle4);
        boolean[] booleanArray7 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder5.append("<null>", booleanArray7);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder160");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("<null>", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder163");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", (short) (byte) 1);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder164");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray7 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder165");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (byte) 1);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder8.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder167");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder168");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray7 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder169");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        java.lang.Class<?> wildcardClass6 = toStringBuilder5.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5, toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder170");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        java.lang.Class<?> wildcardClass3 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ReflectionToStringBuilder171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder171");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder172");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder173");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendAsObjectToString((java.lang.Object) toStringStyle7);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder174");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder175");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder176");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.String str9 = toStringBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder177");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append((byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder178");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("hi!", (int) (byte) 0);
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
    public void ReflectionToStringBuilder179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1, toStringStyle1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
    }

    @Test
    public void ReflectionToStringBuilder180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append('4');
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder181");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = reflectionToStringBuilder1.reflectionAppendArray((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder182");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        boolean boolean6 = reflectionToStringBuilder5.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder5.append("hi!", (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder183");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder184");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", shortArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.String str9 = reflectionToStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder185");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray7);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = reflectionToStringBuilder2.setExcludeFieldNames(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder186");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", shortArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder188");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.Object obj9 = reflectionToStringBuilder2.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder189");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder4.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append("", (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        long[] longArray5 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(longArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("<null>", (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder191");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder193");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder194");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) '4');
        java.lang.Class<?> wildcardClass7 = toStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder195");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder196");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder197");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder199");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        java.lang.Object obj6 = reflectionToStringBuilder2.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder202");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ReflectionToStringBuilder203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder203");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder2.setExcludeFieldNames(strArray7);
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder204");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        long[] longArray7 = new long[] { 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("<null>", longArray7);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder205");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append("hi!", 10.0f);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder3.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder206");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = null;
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2, toStringStyle7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder208");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (short) (byte) 0);
        reflectionToStringBuilder2.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder209");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        byte[] byteArray8 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append("<null>", byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder211");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", shortArray6);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder212");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ReflectionToStringBuilder213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder213");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ReflectionToStringBuilder214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("");
        reflectionToStringBuilder4.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder215");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        java.lang.Class<?> wildcardClass6 = toStringStyle2.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle2, toStringStyle7);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder216");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        long[] longArray5 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(longArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder217");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder218");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder219");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder220");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder221");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        byte[] byteArray8 = new byte[] { (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder222");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle2, false);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder223");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", ' ');
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder224");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder225");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder226");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle2);
        java.lang.Object obj4 = reflectionToStringBuilder3.getObject();
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder3.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder3.append((float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0, toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0 + "'", obj4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<null>" + "'", str9.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder227");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        int[] intArray8 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder5.append(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder228");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        double[] doubleArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder5.append((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder229");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.String str7 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder230");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder231");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder5.append("<null>", '4');
        boolean boolean9 = reflectionToStringBuilder5.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder232");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((long) (byte) -1);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder233");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder234");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        short[] shortArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(shortArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder235");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        long[] longArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder236");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", shortArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder237");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("<null>", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder238");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder239");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", (int) (short) 1);
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder240");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        int[] intArray6 = new int[] { (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("<null>", intArray6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder241");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder242");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(true);
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
    public void ReflectionToStringBuilder243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder243");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(0);
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder244");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append("hi!", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder245");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0);
        java.lang.String[] strArray6 = new java.lang.String[] { "<null>", "hi!", "" };
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, strArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder1.setExcludeFieldNames(strArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder1.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder246");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder247");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append((double) (-1));
        java.lang.StringBuffer stringBuffer9 = toStringBuilder5.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder248");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder2.setExcludeFieldNames(strArray7);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder249");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder250");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        long[] longArray7 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder5.append("<null>", longArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder251");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder252");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder6.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder253");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (short) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder254");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append((float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder255");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder256");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (byte) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder257");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        java.lang.StringBuffer stringBuffer8 = toStringBuilder5.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder258");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder259");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder260");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        java.lang.String str9 = reflectionToStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder261");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = null;
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2, toStringStyle7);
        java.lang.String str9 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder262");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder263");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((byte) 10);
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder265");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        java.lang.Class<?> wildcardClass6 = toStringStyle2.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle2, toStringStyle7);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder266");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ReflectionToStringBuilder267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder267");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder268");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder269");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        byte[] byteArray7 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder270");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder271");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder272");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Object obj8 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder273");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("hi!", (int) (byte) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder274");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder275");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray6 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder276");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(false);
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
    public void ReflectionToStringBuilder277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder277");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0);
        java.lang.String[] strArray6 = new java.lang.String[] { "<null>", "hi!", "" };
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, strArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder1.setExcludeFieldNames(strArray6);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder1.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder278");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        boolean boolean8 = reflectionToStringBuilder7.isAppendStatics();
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder279");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        java.lang.StringBuffer stringBuffer6 = toStringBuilder5.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ReflectionToStringBuilder280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder280");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        boolean boolean6 = reflectionToStringBuilder5.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder5.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder281");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((byte) 10);
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder282");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) 1);
        char[] charArray7 = new char[] { '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder283");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder284");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", (int) (short) 10);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder285");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder6.getStringBuffer();
        reflectionToStringBuilder6.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder286");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder287");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder288");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        long[] longArray5 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(longArray5);
        long[] longArray8 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("", longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder289");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder290");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((long) (byte) -1);
        java.lang.String str6 = reflectionToStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder291");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((float) (byte) -1);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder292");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder293");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder294");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append((float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder295");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        java.lang.String str6 = reflectionToStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder296");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        reflectionToStringBuilder2.setAppendTransients(false);
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder297");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append('4');
        boolean boolean8 = reflectionToStringBuilder5.isAppendTransients();
        java.lang.String str9 = reflectionToStringBuilder5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder298");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder299");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle5);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle5);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle3, toStringStyle5);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ReflectionToStringBuilder300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder300");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", booleanArray5, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder301");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", 0L);
        reflectionToStringBuilder4.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder302");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) (byte) 10, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void ReflectionToStringBuilder303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder303");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", booleanArray5, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder304");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        java.lang.String str6 = reflectionToStringBuilder4.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append("<null>", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder305");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder306");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        java.lang.Object[] objArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder307");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", (int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder308");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((float) '4');
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder309");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append(100);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder1.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder310");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder311");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder312");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder313");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        reflectionToStringBuilder2.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder314");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append(obj4);
        java.lang.String str6 = reflectionToStringBuilder1.build();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder315");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder316");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder4.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder317");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder318");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        long[] longArray7 = new long[] { 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("<null>", longArray7);
        java.lang.String str9 = reflectionToStringBuilder2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder319");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder320");
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle3, stringBuffer5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 10.0d, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder321");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("");
        reflectionToStringBuilder4.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder322");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendAsObjectToString((java.lang.Object) toStringStyle7);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder323");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder4.append("hi!", doubleArray7);
        java.lang.String str9 = reflectionToStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        reflectionToStringBuilder2.setAppendStatics(false);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder325");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        boolean[] booleanArray6 = new boolean[] { true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder326");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder327");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder328");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        long[] longArray7 = new long[] { 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("<null>", longArray7);
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder329");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1.0d), toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder330");
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 10.0f, toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder331");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder332");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder333");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        java.lang.String str7 = reflectionToStringBuilder2.build();
        java.lang.String str8 = reflectionToStringBuilder2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder334");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder335");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder336");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder337");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("hi!", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder338");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        boolean boolean8 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder339");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder340");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder341");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder342");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append((long) '#');
        java.lang.Class<?> wildcardClass8 = toStringBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder343");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        float[] floatArray6 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", floatArray6);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder344");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder345");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((float) (short) 0);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder346");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) (byte) 0);
        int[] intArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append("hi!", intArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder347");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder348");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
    }

    @Test
    public void ReflectionToStringBuilder349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder349");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder350");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder351");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        java.lang.String str6 = reflectionToStringBuilder4.build();
        java.lang.String str7 = reflectionToStringBuilder4.toString();
        java.lang.String[] strArray8 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = reflectionToStringBuilder4.setExcludeFieldNames(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder352");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append("hi!", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder353");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ReflectionToStringBuilder354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder354");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        reflectionToStringBuilder5.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder355");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        byte[] byteArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", byteArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder356");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(true);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder8.getStringBuffer();
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
    public void ReflectionToStringBuilder357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder357");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean[] booleanArray7 = new boolean[] { false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(booleanArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder358");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        java.lang.Class<?> wildcardClass8 = toStringBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder359");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder360");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder361");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        java.lang.Class<?> wildcardClass8 = toStringBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder362");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder363");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append((long) '#');
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder364");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", booleanArray5, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder365");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder366");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder367");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder6.getUpToClass();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.appendAsObjectToString(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot get the toString of a null identity");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder368");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('4');
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder369");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ReflectionToStringBuilder370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder370");
        java.lang.String[] strArray5 = new java.lang.String[] { "<null>", "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 100L, strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder371");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("<null>", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder372");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder373");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder374");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        long[] longArray7 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(longArray7);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder375");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (byte) 0);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder7);
        java.lang.Object obj9 = toStringBuilder7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + ' ' + "'", obj9.equals(' '));
    }

    @Test
    public void ReflectionToStringBuilder376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder376");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle3, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder377");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendAsObjectToString((java.lang.Object) toStringStyle7);
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder378");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = reflectionToStringBuilder1.setExcludeFieldNames(strArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder6.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder379");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder380");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder6.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder381");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder382");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder383");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((int) (short) 10);
        java.lang.String str9 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder384");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder385");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        java.lang.String str8 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder386");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append(' ');
        boolean boolean8 = reflectionToStringBuilder4.isAppendTransients();
        boolean boolean9 = reflectionToStringBuilder4.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder387");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray5 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void ReflectionToStringBuilder388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder388");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder4.append((byte) 100);
        reflectionToStringBuilder4.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder389");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder390");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append('#');
        java.lang.Object obj9 = reflectionToStringBuilder2.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder391");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean[] booleanArray7 = new boolean[] { false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append(booleanArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder392");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder393");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder394");
        java.lang.String str1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 0.0f);
    }

    @Test
    public void ReflectionToStringBuilder395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder395");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((long) (byte) 100);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder396");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        reflectionToStringBuilder2.setAppendStatics(false);
        boolean boolean8 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder397");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendStatics();
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ReflectionToStringBuilder398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder398");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder399");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder400");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.Object obj6 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder401");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", (int) (byte) 100);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder402");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.Class<?> wildcardClass4 = toStringStyle1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void ReflectionToStringBuilder403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder403");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append((long) (short) 10);
        reflectionToStringBuilder4.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder404");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder405");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("hi!", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder406");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder4.getUpToClass();
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder4.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder407");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ReflectionToStringBuilder408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder408");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((double) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder6.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder409");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        reflectionToStringBuilder2.setAppendStatics(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder410");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        double[] doubleArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(doubleArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder411");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder412");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append('4');
        java.lang.StringBuffer stringBuffer9 = reflectionToStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder413");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder4.append((byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder4.append((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder414");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.appendToString("<null>");
        boolean boolean8 = reflectionToStringBuilder1.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder415");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        long[] longArray5 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(longArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder416");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder417");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder418");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder419");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) 1);
        reflectionToStringBuilder1.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder420");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder2.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder421");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.Class<?> wildcardClass5 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ReflectionToStringBuilder422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder422");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        reflectionToStringBuilder5.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder5.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder423");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "<null>", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '4', strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void ReflectionToStringBuilder424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder424");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((int) ' ');
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder425");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder426");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        java.lang.Object obj4 = reflectionToStringBuilder2.getObject();
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0 + "'", obj4.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder427");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (byte) 0);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder428");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.String str5 = reflectionToStringBuilder1.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("", (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder429");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        float[] floatArray6 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", floatArray6);
        java.lang.String str8 = reflectionToStringBuilder2.toString();
        java.lang.String str9 = reflectionToStringBuilder2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder430");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.String str5 = reflectionToStringBuilder1.build();
        java.lang.String[] strArray6 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = reflectionToStringBuilder1.setExcludeFieldNames(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder431");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder6.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder432");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder433");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        java.lang.String str7 = reflectionToStringBuilder2.build();
        boolean boolean8 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder434");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void ReflectionToStringBuilder435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder435");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (short) 10);
        reflectionToStringBuilder2.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder436");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        reflectionToStringBuilder5.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder437");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String str5 = reflectionToStringBuilder1.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((double) (-1.0f));
        boolean boolean8 = reflectionToStringBuilder1.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder438");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder439");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder440");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder441");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "<null>", "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj0, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder442");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder443");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ReflectionToStringBuilder444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder444");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder445");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder446");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder4.append(booleanArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder447");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        byte[] byteArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", byteArray6);
        java.lang.String str8 = reflectionToStringBuilder2.toString();
        java.lang.Object obj9 = reflectionToStringBuilder2.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder448");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder449");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (byte) 0);
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder450");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder2.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = reflectionToStringBuilder2.getStyle();
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (short) 1, toStringStyle5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ReflectionToStringBuilder451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder451");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append("", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder452");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder2.build();
        reflectionToStringBuilder2.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder453");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder454");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) true);
    }

    @Test
    public void ReflectionToStringBuilder455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder455");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder456");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (short) 1);
        java.lang.String str9 = reflectionToStringBuilder2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder457");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        double[] doubleArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append(doubleArray6);
        boolean boolean8 = reflectionToStringBuilder5.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder458");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((long) 1);
        reflectionToStringBuilder2.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder459");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((long) 1);
        reflectionToStringBuilder2.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder460");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder3);
        java.lang.Object obj7 = toStringBuilder3.getObject();
        java.lang.String str8 = toStringBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ' ' + "'", obj7.equals(' '));
    }

    @Test
    public void ReflectionToStringBuilder461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder461");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder462");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder463");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle1);
        java.lang.Class<?> wildcardClass3 = toStringStyle1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<null>" + "'", str2.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ReflectionToStringBuilder464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder464");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (short) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder465");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder466");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((byte) 100);
        reflectionToStringBuilder2.setAppendStatics(true);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder467");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        reflectionToStringBuilder5.setAppendStatics(false);
        java.lang.String str8 = reflectionToStringBuilder5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder468");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        boolean boolean9 = reflectionToStringBuilder8.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder469");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder470");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String[] strArray5 = new java.lang.String[] { "<null>", "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 1.0f, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) toStringStyle0, strArray5);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void ReflectionToStringBuilder471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder471");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder472");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", (float) (byte) -1);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = reflectionToStringBuilder2.setExcludeFieldNames(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder473");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle3, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle0, toStringStyle3);
        java.lang.String str9 = reflectionToStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder474");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("", (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder475");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        java.lang.Object obj9 = reflectionToStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ReflectionToStringBuilder476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder476");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder477");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder478");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder2.setExcludeFieldNames(strArray7);
        boolean boolean9 = reflectionToStringBuilder8.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder479");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder480");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle3, false, true);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder1.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder481");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder482");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        java.lang.StringBuffer stringBuffer3 = reflectionToStringBuilder1.getStringBuffer();
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append(obj4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("hi!", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder483");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder484");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append('4');
        java.lang.String str8 = reflectionToStringBuilder5.toString();
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder5.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder485");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder5.append("<null>", '4');
        java.lang.Object obj9 = reflectionToStringBuilder5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ReflectionToStringBuilder486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder486");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((float) (byte) -1);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str8 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder487");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder488");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((java.lang.Object) "hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder5.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder489");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder490");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("hi!", (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder491");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = null;
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder4, toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ReflectionToStringBuilder492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder492");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>", '#');
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
    public void ReflectionToStringBuilder493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder493");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        float[] floatArray6 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", floatArray6);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder494");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", 0L);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder4.getUpToClass();
        boolean boolean9 = reflectionToStringBuilder4.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder495");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder496");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Class<?> wildcardClass3 = reflectionToStringBuilder2.getClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ReflectionToStringBuilder497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder497");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        reflectionToStringBuilder1.setAppendStatics(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.appendToString("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder498");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder499");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((int) (short) 10);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.ReflectionToStringBuilder500");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }
}

