package ReflectionToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReflectionToStringBuilder1 {

    public static boolean debug = false;

    @Test
    public void ReflectionToStringBuilder501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder501");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        java.lang.String str8 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        reflectionToStringBuilder2.setAppendStatics(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder503");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", (float) (byte) 100);
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder504");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(true);
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
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
    public void ReflectionToStringBuilder505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder505");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder506");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((int) ' ');
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.appendAsObjectToString((java.lang.Object) toStringStyle7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder508");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        java.lang.String str6 = reflectionToStringBuilder4.build();
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
    }

    @Test
    public void ReflectionToStringBuilder510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((double) 'a');
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
    public void ReflectionToStringBuilder511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        int[] intArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(intArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append(' ');
        int[] intArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append(intArray8);
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
    public void ReflectionToStringBuilder513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder5.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("hi!", (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder515");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append((int) (short) 10);
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Object obj8 = reflectionToStringBuilder2.getObject();
        java.lang.Object obj9 = reflectionToStringBuilder2.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder517");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray6 = reflectionToStringBuilder5.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        double[] doubleArray8 = new double[] { 10L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder6.append((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder520");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append(100);
        boolean boolean9 = reflectionToStringBuilder1.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder521");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", (int) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("", 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder522");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        boolean boolean6 = reflectionToStringBuilder5.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder5.isAppendTransients();
        boolean boolean8 = reflectionToStringBuilder5.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.Object obj9 = reflectionToStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ReflectionToStringBuilder524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        java.lang.Object obj7 = toStringBuilder6.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder525");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        boolean boolean6 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ReflectionToStringBuilder526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder527");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder528");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = reflectionToStringBuilder1.reflectionAppendArray((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        java.lang.Object obj6 = toStringBuilder5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder530");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder6);
        java.lang.String str8 = reflectionToStringBuilder6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder531");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder532");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        reflectionToStringBuilder1.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder533");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
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
    public void ReflectionToStringBuilder534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder534");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        java.lang.String str6 = reflectionToStringBuilder4.build();
        java.lang.String str7 = reflectionToStringBuilder4.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append(10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(booleanArray8);
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
    public void ReflectionToStringBuilder536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder536");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.Object obj3 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj3, toStringStyle4);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle4);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj1, toStringStyle4);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle4);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder8.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<null>" + "'", str5.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder537");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((long) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(true);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder539");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder540");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder541");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder6);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder542");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder543");
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (short) 100, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder544");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder6.getStringBuffer();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder545");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        float[] floatArray6 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", floatArray6);
        java.lang.String str8 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (short) 10);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder547");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", (int) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((int) (short) -1);
        java.lang.StringBuffer stringBuffer7 = toStringBuilder4.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder548");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.StringBuffer stringBuffer6 = reflectionToStringBuilder2.getStringBuffer();
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ReflectionToStringBuilder549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder549");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("<null>", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder550");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder551");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        java.lang.String str8 = reflectionToStringBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder552");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        boolean boolean8 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder553");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", (int) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((int) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder554");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", booleanArray5, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder555");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", 0L);
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder556");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((byte) 100);
        reflectionToStringBuilder2.setAppendStatics(true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder558");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        java.lang.StringBuffer stringBuffer3 = reflectionToStringBuilder1.getStringBuffer();
        reflectionToStringBuilder1.setAppendStatics(false);
        java.lang.String str6 = reflectionToStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer3);
    }

    @Test
    public void ReflectionToStringBuilder559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder559");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder560");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder561");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("hi!", (short) 100);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder562");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder1.getUpToClass();
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (byte) -1);
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
    public void ReflectionToStringBuilder564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder564");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        java.lang.StringBuffer stringBuffer6 = toStringBuilder5.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ReflectionToStringBuilder565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder565");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder566");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder567");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendTransients();
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ReflectionToStringBuilder568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder568");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        boolean boolean7 = reflectionToStringBuilder6.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder569");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        java.lang.String str3 = reflectionToStringBuilder1.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder570");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder4.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder4.append((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder571");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str5 = reflectionToStringBuilder2.build();
        char[] charArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("hi!", charArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder572");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", booleanArray5, true);
        boolean boolean8 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder2.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder573");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) (byte) 0);
        java.lang.StringBuffer stringBuffer6 = toStringBuilder5.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
    }

    @Test
    public void ReflectionToStringBuilder574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((long) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder575");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('4');
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
    public void ReflectionToStringBuilder576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder576");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder4.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder4.append(false);
        boolean boolean9 = reflectionToStringBuilder4.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder577");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder578");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>", (int) (short) 10);
        java.lang.Object obj9 = toStringBuilder5.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder579");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<null>" + "'", str2.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder580");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", booleanArray5, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder581");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder583");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        reflectionToStringBuilder4.setAppendStatics(true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder4.getUpToClass();
        java.lang.String str8 = reflectionToStringBuilder4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder584");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("", (double) 0);
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder585");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((long) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder586");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("", (float) (byte) 100);
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
    public void ReflectionToStringBuilder587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder587");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 100, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(doubleArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder588");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder7.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder589");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append('#');
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder590");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((short) -1);
        java.lang.String str8 = toStringBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder591");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        java.lang.Class<?> wildcardClass6 = stringBuffer5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ReflectionToStringBuilder592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder592");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) (byte) 10);
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
    public void ReflectionToStringBuilder593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder6.toString();
        java.lang.String str8 = reflectionToStringBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder594");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        java.lang.String str9 = reflectionToStringBuilder2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder595");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = reflectionToStringBuilder1.setExcludeFieldNames(strArray5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append("<null>", (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder596");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder597");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append(' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append((long) '#');
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder4.getStringBuffer();
        boolean boolean9 = reflectionToStringBuilder4.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((float) 10L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder600");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder6.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder601");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        boolean[] booleanArray6 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", booleanArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.appendSuper("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder602");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append("hi!", (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder603");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
    }

    @Test
    public void ReflectionToStringBuilder604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder604");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) (byte) 0);
        java.lang.String str6 = toStringBuilder5.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder605");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        boolean boolean6 = reflectionToStringBuilder5.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder5.isAppendTransients();
        boolean boolean8 = reflectionToStringBuilder5.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((byte) 0);
        java.lang.Object obj8 = reflectionToStringBuilder2.getObject();
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder607");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder608");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder609");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder610");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder611");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.Object obj8 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder612");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append("hi!", (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder613");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.String str7 = reflectionToStringBuilder6.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder614");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ReflectionToStringBuilder615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder615");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '#', toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringStyle3, toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder616");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((short) 1);
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ReflectionToStringBuilder617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder617");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) 1);
        short[] shortArray7 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append("hi!", shortArray7, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder618");
        java.lang.Object obj0 = null;
        java.lang.Object obj2 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj2, toStringStyle3);
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle3, stringBuffer5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(obj0, toStringStyle3, true);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder619");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder620");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder621");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        reflectionToStringBuilder4.setAppendStatics(true);
        java.lang.Class<?> wildcardClass7 = reflectionToStringBuilder4.getUpToClass();
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder622");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj1, (java.util.Collection<java.lang.String>) strList6);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(obj0, (java.util.Collection<java.lang.String>) strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<null>" + "'", str9.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder623");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(false);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        java.lang.String str7 = reflectionToStringBuilder2.build();
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder625");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append(' ');
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append(booleanArray8);
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
    public void ReflectionToStringBuilder627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.String str4 = reflectionToStringBuilder2.toString();
        reflectionToStringBuilder2.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
    }

    @Test
    public void ReflectionToStringBuilder628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder628");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.String str5 = reflectionToStringBuilder1.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("", (int) (short) 100);
        java.lang.String str9 = reflectionToStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder629");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((float) 1L);
        java.lang.String str6 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder3);
        java.lang.String str7 = toStringBuilder3.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder631");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((byte) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = toStringBuilder6.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("", (int) 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder633");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", (double) 0L);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ReflectionToStringBuilder634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder634");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = null;
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle4, toStringStyle5, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
    }

    @Test
    public void ReflectionToStringBuilder635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder635");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder3 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle2);
        java.lang.Object obj4 = reflectionToStringBuilder3.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder3);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = reflectionToStringBuilder3.getStyle();
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle6, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0 + "'", obj4.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder636");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String str5 = reflectionToStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("<null>", (short) (byte) -1);
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 0 + "'", obj9.equals((short) 0));
    }

    @Test
    public void ReflectionToStringBuilder637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder637");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder638");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        boolean[] booleanArray6 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", booleanArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder639");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append((byte) 100);
        boolean boolean8 = reflectionToStringBuilder4.isAppendStatics();
        java.lang.String str9 = reflectionToStringBuilder4.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder640");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.appendSuper("");
        boolean boolean7 = reflectionToStringBuilder1.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder641");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) (short) -1);
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendToString("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder643");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        java.lang.String str6 = reflectionToStringBuilder2.toString();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        java.lang.String str6 = reflectionToStringBuilder4.build();
        java.lang.String str7 = reflectionToStringBuilder4.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder645");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) (short) -1);
        boolean boolean7 = reflectionToStringBuilder1.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder646");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", (double) 0L);
        boolean boolean8 = reflectionToStringBuilder4.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
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
    }

    @Test
    public void ReflectionToStringBuilder648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder648");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append(0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder5.append((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder650");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) '4');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((short) 1);
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
    public void ReflectionToStringBuilder651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder651");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder5.append((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder652");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder653");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append("", (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder654");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.String str5 = reflectionToStringBuilder1.build();
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder655");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("", (byte) 10);
        java.lang.Object obj8 = toStringBuilder7.getObject();
        java.lang.StringBuffer stringBuffer9 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 0 + "'", obj8.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder656");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        byte[] byteArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", byteArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder657");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder1.getStyle();
        java.lang.Object obj5 = reflectionToStringBuilder1.getObject();
        reflectionToStringBuilder1.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + ' ' + "'", obj5.equals(' '));
    }

    @Test
    public void ReflectionToStringBuilder658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder658");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("<null>", (float) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder659");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean9 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder661");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("", '#');
        java.lang.Object obj7 = toStringBuilder6.getObject();
        java.lang.StringBuffer stringBuffer8 = toStringBuilder6.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ' ' + "'", obj7.equals(' '));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder662");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder2);
        float[] floatArray6 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", floatArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder663");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder1.getStyle();
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder664");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", true);
        java.lang.Class<?> wildcardClass7 = toStringBuilder6.getClass();
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void ReflectionToStringBuilder665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder665");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        long[] longArray6 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append(longArray6);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder7);
        boolean boolean9 = reflectionToStringBuilder8.isAppendTransients();
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
    public void ReflectionToStringBuilder666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder666");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder6.append("hi!", false);
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
    public void ReflectionToStringBuilder667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder667");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", (short) (byte) 1);
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("<null>", (int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str7 = reflectionToStringBuilder2.build();
        reflectionToStringBuilder2.setAppendStatics(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String str8 = reflectionToStringBuilder2.toString();
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder671");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", false);
        java.lang.String str7 = reflectionToStringBuilder2.toString();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
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
    public void ReflectionToStringBuilder672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder672");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.String str5 = reflectionToStringBuilder2.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((byte) -1);
        reflectionToStringBuilder2.setAppendTransients(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder673");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle5);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void ReflectionToStringBuilder674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder674");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        java.lang.String[] strArray6 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = reflectionToStringBuilder1.setExcludeFieldNames(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder675");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        int[] intArray5 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(intArray5);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        java.lang.String str9 = reflectionToStringBuilder2.toString();
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
    public void ReflectionToStringBuilder676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder676");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(' ');
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        reflectionToStringBuilder2.setAppendTransients(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder677");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder678");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((short) -1);
        java.lang.Object[] objArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder679");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('#');
        java.lang.Class<?> wildcardClass9 = toStringBuilder6.getClass();
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
    public void ReflectionToStringBuilder680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder680");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", 0L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder681");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean4 = reflectionToStringBuilder1.isAppendStatics();
        java.lang.String str5 = reflectionToStringBuilder1.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("", (int) (short) 100);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = reflectionToStringBuilder1.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder682");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((long) (byte) -1);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("");
        char[] charArray8 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder684");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append('4');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder685");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder686");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        boolean boolean8 = reflectionToStringBuilder4.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder687");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder4.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.appendSuper("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder688");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((long) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder689");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle1);
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) str2, (java.util.Collection<java.lang.String>) strList5);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) strList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void ReflectionToStringBuilder690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder690");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        reflectionToStringBuilder5.setAppendStatics(false);
        java.lang.Object obj8 = reflectionToStringBuilder5.getObject();
        java.lang.String str9 = reflectionToStringBuilder5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0d + "'", obj8.equals(1.0d));
    }

    @Test
    public void ReflectionToStringBuilder691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder691");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (-1));
    }

    @Test
    public void ReflectionToStringBuilder692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder692");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((float) 100L);
        boolean boolean8 = reflectionToStringBuilder5.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder693");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (short) 0);
        java.lang.String str8 = reflectionToStringBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendSuper("hi!");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.Object obj9 = reflectionToStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void ReflectionToStringBuilder695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder695");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendToString("");
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
    public void ReflectionToStringBuilder696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder696");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((float) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder697");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        java.lang.String str7 = reflectionToStringBuilder6.build();
        boolean boolean8 = reflectionToStringBuilder6.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void ReflectionToStringBuilder698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder698");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder699");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        java.lang.StringBuffer stringBuffer9 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append('a');
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder701");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendTransients();
        boolean[] booleanArray7 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder4.append("", booleanArray7, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder702");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = reflectionToStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.appendSuper("");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("", (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder703");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append("<null>", (byte) 0);
        boolean boolean8 = reflectionToStringBuilder1.isAppendStatics();
        boolean boolean9 = reflectionToStringBuilder1.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder704");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("", ' ');
        java.lang.Class<?> wildcardClass9 = toStringBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        short[] shortArray6 = new short[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", shortArray6);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        java.lang.String str9 = toStringBuilder7.build();
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
    public void ReflectionToStringBuilder706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder706");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.String str5 = reflectionToStringBuilder1.build();
        boolean boolean6 = reflectionToStringBuilder1.isAppendStatics();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void ReflectionToStringBuilder707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder707");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = reflectionToStringBuilder2.setExcludeFieldNames(strArray7);
        java.lang.Class<?> wildcardClass9 = reflectionToStringBuilder8.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder708");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
    }

    @Test
    public void ReflectionToStringBuilder709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(' ');
        boolean boolean7 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = reflectionToStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ReflectionToStringBuilder710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (double) 'a');
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle7 = reflectionToStringBuilder2.getStyle();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder711");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        java.lang.String str4 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringBuilder3);
        java.lang.Class<?> wildcardClass5 = toStringBuilder3.getClass();
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ReflectionToStringBuilder712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder712");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        reflectionToStringBuilder2.setAppendTransients(true);
        reflectionToStringBuilder2.setAppendStatics(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder713");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (long) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((double) 1L);
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
    public void ReflectionToStringBuilder714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder714");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append((double) '4');
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder715");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) false, toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder716");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append((byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        java.lang.Class<?> wildcardClass8 = toStringBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ReflectionToStringBuilder718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder718");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("<null>", (byte) 0);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder4);
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray9 = reflectionToStringBuilder4.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder719");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void ReflectionToStringBuilder720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder720");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder721");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append("hi!", (long) (byte) 100);
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
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder722");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((long) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>", (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder723");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", (long) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder3.append((byte) 0);
        java.lang.StringBuffer stringBuffer9 = toStringBuilder3.getStringBuffer();
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
    public void ReflectionToStringBuilder724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder724");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("hi!", (int) '4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append("hi!", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder725");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = reflectionToStringBuilder2.getStyle();
        java.lang.Class<?> wildcardClass5 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.append((float) 10L);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) reflectionToStringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str5 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringStyle3, toStringStyle4);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle4);
    }

    @Test
    public void ReflectionToStringBuilder727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder727");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(false);
        java.lang.String str7 = toStringBuilder6.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder728");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        float[] floatArray7 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder729");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append((-1.0d));
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder730");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        reflectionToStringBuilder1.setAppendStatics(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((double) 1);
        java.lang.Class<?> wildcardClass6 = reflectionToStringBuilder1.getUpToClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void ReflectionToStringBuilder731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder731");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append(false);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        boolean boolean8 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.StringBuffer stringBuffer9 = reflectionToStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
    }

    @Test
    public void ReflectionToStringBuilder732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder732");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
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
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder733");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("hi!", (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.append("hi!", (java.lang.Object) 100, true);
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        java.lang.Class<?> wildcardClass8 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean9 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void ReflectionToStringBuilder735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder5);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder736");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ReflectionToStringBuilder737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder737");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        boolean[] booleanArray4 = new boolean[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("<null>", booleanArray4);
        reflectionToStringBuilder2.setAppendTransients(false);
        java.lang.String str8 = reflectionToStringBuilder2.toString();
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
    }

    @Test
    public void ReflectionToStringBuilder738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder738");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder2.appendSuper("");
        boolean[] booleanArray8 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.append(booleanArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder739");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        short[] shortArray7 = new short[] { (short) 0, (byte) 10, (short) 100, (short) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.append("", shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder740");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder2.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendSuper("hi!");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        // The following exception was thrown during execution in ReflectionToStringBuilder generation
        try {
            java.lang.String[] strArray8 = reflectionToStringBuilder2.getExcludeFieldNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
    }

    @Test
    public void ReflectionToStringBuilder741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder741");
        java.lang.Object obj0 = new java.lang.Object();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder742");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = reflectionToStringBuilder2.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append((long) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.appendToString("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder743");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        reflectionToStringBuilder1.setAppendTransients(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = reflectionToStringBuilder1.setExcludeFieldNames(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reflectionToStringBuilder5);
    }

    @Test
    public void ReflectionToStringBuilder744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder744");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append("", (double) 0L);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder7.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ReflectionToStringBuilder745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder745");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        float[] floatArray3 = new float[] { 1L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
    }

    @Test
    public void ReflectionToStringBuilder746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder746");
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 1.0d, toStringStyle2, stringBuffer4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder5.append('4');
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder747");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder2.appendToString("<null>");
        java.lang.StringBuffer stringBuffer7 = reflectionToStringBuilder2.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder2.appendSuper("<null>");
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
    public void ReflectionToStringBuilder748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder748");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append((long) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("<null>", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder749");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        boolean boolean6 = reflectionToStringBuilder2.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append('4');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder9 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle3 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str4 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle3);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle3);
        java.lang.String str6 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (-1.0d), toStringStyle3);
        java.lang.String str7 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) toStringStyle3);
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle3);
    }

    @Test
    public void ReflectionToStringBuilder751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder751");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        byte[] byteArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("<null>", byteArray5, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder3.append((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ReflectionToStringBuilder752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder752");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = reflectionToStringBuilder1.append("", '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder1.appendSuper("hi!");
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ReflectionToStringBuilder753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder753");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        java.lang.Class<?> wildcardClass4 = reflectionToStringBuilder2.getUpToClass();
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = reflectionToStringBuilder2.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder8.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardClass4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ReflectionToStringBuilder754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder754");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder2.append("hi!", (byte) 1);
        java.lang.String str6 = reflectionToStringBuilder2.build();
        boolean boolean7 = reflectionToStringBuilder2.isAppendStatics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void ReflectionToStringBuilder755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder755");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("<null>", (float) (byte) -1);
        java.lang.StringBuffer stringBuffer5 = reflectionToStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append((short) -1);
        java.lang.String str8 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder756");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder(obj0, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendTransients();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder6 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ReflectionToStringBuilder757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder757");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((int) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append('a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder1.append(' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder1);
        java.lang.String str9 = reflectionToStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ReflectionToStringBuilder758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) (byte) 1, toStringStyle2);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100L, toStringStyle2);
        boolean boolean5 = reflectionToStringBuilder4.isAppendStatics();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = reflectionToStringBuilder4.append((long) '#');
        java.lang.StringBuffer stringBuffer8 = reflectionToStringBuilder4.getStringBuffer();
        java.lang.Class<?> wildcardClass9 = stringBuffer8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void ReflectionToStringBuilder759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder759");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder2 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 0, toStringStyle1);
        java.lang.Object obj3 = reflectionToStringBuilder2.getObject();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) reflectionToStringBuilder2);
        boolean boolean5 = reflectionToStringBuilder2.isAppendTransients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0 + "'", obj3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void ReflectionToStringBuilder760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReflectionToStringBuilder1.ReflectionToStringBuilder760");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) ' ');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append((float) 1L);
        boolean[] booleanArray5 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.append("", booleanArray5, true);
        java.lang.String str8 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }
}

