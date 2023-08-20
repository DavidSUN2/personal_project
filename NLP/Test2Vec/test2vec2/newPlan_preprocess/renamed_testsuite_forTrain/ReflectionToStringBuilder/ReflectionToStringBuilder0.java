
package ReflectionToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReflectionToStringBuilder0 {

    public static boolean debug = false;

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 'a', toStringStyle1);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test002");
        java.util.Collection<java.lang.String> strCollection1 = null;
        java.lang.String str2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) true, strCollection1);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test003");
        java.lang.String str1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d));
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test004");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test005");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test006");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test007");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test008");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test009");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test010");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test011");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test012");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test014");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test015");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test016");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test017");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '4', strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test018");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test019");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test020");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test021");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test022");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test023");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test024");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test025");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test026");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test027");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test028");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test029");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test030");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test031");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test032");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test033");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test034");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test035");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test036");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test037");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle1, false);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test039");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test040");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test041");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test042");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test043");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test044");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test045");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test046");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test047");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test048");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test049");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test050");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test051");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test052");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test054");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test055");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test056");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test057");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test058");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test059");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test060");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test061");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test062");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test063");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1));
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test064");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test065");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test066");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test067");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test068");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test069");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test070");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test071");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 0.0f);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test072");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test073");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test074");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test075");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test076");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test077");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test079");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test080");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test081");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test082");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test083");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test084");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test085");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test086");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test087");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test088");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test089");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test090");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test091");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test092");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test093");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test094");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test096");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test097");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '4', strArray5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) (byte) 1, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test098");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0, toStringStyle1, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test099");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test100");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test101");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test102");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test103");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test104");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test105");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test106");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test107");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test108");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test109");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test110");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test111");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test112");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test113");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test114");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test115");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test116");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test117");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test118");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test119");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test120");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test121");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test122");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test123");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test124");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test125");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test126");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test127");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test128");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test129");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test130");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test131");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test132");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test133");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test134");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test135");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test136");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test137");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test138");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test139");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test141");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test142");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test143");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean7);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test144");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test145");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test146");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test148");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test149");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test150");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test151");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 10.0d);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test152");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test153");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test154");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test155");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test156");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test157");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test158");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test159");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test160");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test161");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test162");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test163");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", (short) (byte) 1);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test164");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test165");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test166");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test167");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test168");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test169");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test170");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        java.lang.Class<?> wildcardClass3 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test171");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test172");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test173");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test174");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test175");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test176");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test177");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test178");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1, toStringStyle1, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test180");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test181");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test182");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test183");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test184");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test185");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test186");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test187");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test188");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test189");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test190");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test191");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test192");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test193");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test194");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test195");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test196");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test197");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test198");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test199");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test200");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test201");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test202");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass2 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test203");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test204");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test205");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test206");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test207");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test208");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test209");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test210");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test211");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test212");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test213");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test214");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test215");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test216");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test217");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test218");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test219");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test220");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test221");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test222");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (-1.0d), toStringStyle2, false);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test223");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test224");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test225");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test226");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test227");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test228");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test229");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test230");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test231");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test232");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test233");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test234");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test235");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test236");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test237");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test238");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test239");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test240");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test241");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test242");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test243");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test244");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test245");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test246");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test247");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test248");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test249");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test250");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test251");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test252");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test253");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test254");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test255");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test256");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test257");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test258");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test259");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test260");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test261");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test262");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test263");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test264");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test265");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test266");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test267");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test268");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test269");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test270");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test271");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test272");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test273");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test274");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test275");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test276");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test277");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test278");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test279");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test280");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test281");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test282");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test283");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test284");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", (int) (short) 10);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test285");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test286");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test287");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test288");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test289");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test290");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test291");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test292");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test293");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test294");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test295");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test296");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test297");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test298");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test299");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test300");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test301");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test302");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10L, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) 10, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) (byte) 10, strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test303");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test304");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test305");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test306");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test307");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test308");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test309");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test310");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test311");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test312");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test313");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        reflectionToStringBuilder2.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test314");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test315");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test316");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test317");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test318");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test319");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test320");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test321");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test322");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test323");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        reflectionToStringBuilder2.setAppendStatics(false);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test325");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test326");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test327");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test328");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test329");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1.0d), toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test330");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test331");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test332");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test333");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test334");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test335");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test336");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test337");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test338");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test339");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test340");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test341");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test342");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test343");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test344");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test345");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test346");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test347");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test348");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test349");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test350");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test351");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test352");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test353");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test354");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test355");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test356");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test357");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test358");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test359");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test360");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test361");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test362");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test363");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test364");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test365");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test366");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test367");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder6.getUpToClass();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test368");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test369");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test370");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test371");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test372");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test373");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test374");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test375");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test376");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test377");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test378");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test379");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test380");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test381");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test382");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test383");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test384");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test385");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test386");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test387");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test388");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test389");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test390");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test391");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test392");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test393");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test394");
        java.lang.String str1 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) 0.0f);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test395");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test396");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test397");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test398");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test399");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test400");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test401");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test402");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test403");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test404");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test405");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test406");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test407");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test408");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test409");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test410");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test411");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test412");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test413");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test414");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test415");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test416");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test417");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test418");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test419");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) 1);
        reflectionToStringBuilder1.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test420");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder2.getStringBuffer();
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test421");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.Class<?> wildcardClass5 = toStringBuilder4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test422");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test423");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "<null>", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) '4', strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test424");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((int) ' ');
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test425");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test426");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test427");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test428");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test429");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test430");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test431");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test432");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test433");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test434");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test435");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test436");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test437");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test438");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test439");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test440");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test441");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test442");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test443");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test444");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test445");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test446");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test447");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test448");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test449");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test450");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder2.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = reflectionToStringBuilder2.getStyle();
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) (short) 1, toStringStyle5, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test451");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test452");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test453");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test454");
        java.lang.String str1 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) true);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test455");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test456");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test457");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test458");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test459");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test460");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test461");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test462");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test463");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test464");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test465");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test466");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((byte) 100);
        reflectionToStringBuilder2.setAppendStatics(true);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test467");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test468");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test469");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test470");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test471");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test472");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test473");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test474");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test475");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test476");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test477");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test478");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test479");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test480");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test481");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test482");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test483");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test484");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test485");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test486");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test487");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test488");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test489");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test490");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("hi!", (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test491");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = null;
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder4, toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test492");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test493");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test494");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test495");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test496");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Class<?> wildcardClass3 = reflectionToStringBuilder2.getClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test497");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test498");
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test499");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((int) (short) 10);
        // The following exception was thrown during execution in test generation
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
    public void ReflectionToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder0.test500");
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

