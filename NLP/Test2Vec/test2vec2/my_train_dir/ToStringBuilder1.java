
package ToStringBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ToStringBuilder1 {

    public static boolean debug = false;

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test501");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((long) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append("10,<null>", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((double) 100);
        java.lang.String str7 = toStringBuilder4.build();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test503");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = null;
        java.lang.String str2 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString(obj0, toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<null>" + "'", str2.equals("<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test504");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (java.lang.Object) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test505");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((byte) 0);
        java.lang.Object obj4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = new org.apache.commons.lang3.builder.ToStringBuilder(obj4, toStringStyle6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 0, toStringStyle6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test506");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append((int) (byte) 10);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test507");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((short) 1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((int) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder3.appendSuper("10,<null>");
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
            System.out.format("%n%s%n", "ToStringBuilder1.test508");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder3.append((short) (byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        boolean[] booleanArray4 = new boolean[] { true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("<null>", booleanArray4, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        char[] charArray6 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("hi!", charArray6);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append((long) (short) 100);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringStyle0);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        java.lang.Object obj5 = toStringBuilder1.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append(true);
        java.lang.Object obj8 = toStringBuilder7.getObject();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test513");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((double) (short) 10);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test514");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("hi!", charArray3, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder5.append((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test515");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((float) (-1L));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder6.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder1.append((java.lang.Object) toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test516");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        float[] floatArray2 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append(floatArray2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append("hi!", false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append(true);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test517");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append((byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("<null>", objArray6);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder7.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = toStringBuilder2.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test520");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.append('#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder3.append("", true);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test521");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append((short) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append("=0,<null>", false);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test522");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = toStringBuilder1.appendToString("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append((short) (byte) -1);
        java.lang.Class<?> wildcardClass6 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder2 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 100, toStringStyle1);
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder2.appendSuper("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder2.append('4');
        java.lang.StringBuffer stringBuffer8 = toStringBuilder2.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        byte[] byteArray7 = new byte[] { (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append(byteArray7);
        java.lang.String str9 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test525");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 10.0d, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder4.append("", (long) (byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder4.append(false);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle1 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        org.apache.commons.lang3.builder.ToStringBuilder.setDefaultStyle(toStringStyle1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#', toStringStyle1, stringBuffer3);
        java.lang.Object obj5 = toStringBuilder4.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) toStringBuilder4);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.append((long) (short) -1);
        java.lang.Object obj9 = toStringBuilder8.getObject();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '#' + "'", obj9.equals('#'));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test527");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append(100.0d);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test528");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        java.lang.String str3 = toStringBuilder1.toString();
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test529");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        java.lang.String str3 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) "<null>", toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0, toStringStyle2);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.appendSuper("<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder4.appendToString("<null>,<null>");
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
            System.out.format("%n%s%n", "ToStringBuilder1.test530");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.appendAsObjectToString((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder4.append(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder6.append("hi!", (int) (byte) 100);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test531");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (double) (-1));
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = null;
        java.lang.String str7 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) toStringBuilder1, toStringStyle6);
        java.lang.StringBuffer stringBuffer8 = toStringBuilder1.getStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test532");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = toStringBuilder1.getStyle();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (double) (-1));
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder5.append("=0,<null>", (short) 1);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = toStringBuilder5.getStyle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle9);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test533");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("<null>", 0.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.append("<null>", 10.0f);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = toStringBuilder1.getStyle();
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
            System.out.format("%n%s%n", "ToStringBuilder1.test534");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) '#');
        java.lang.StringBuffer stringBuffer2 = toStringBuilder1.getStringBuffer();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = toStringBuilder1.append("", (float) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder7 = toStringBuilder1.appendToString("hi!");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = toStringBuilder7.append((byte) 10);
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
            System.out.format("%n%s%n", "ToStringBuilder1.test535");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder(obj0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append("", (long) (short) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.appendToString("<null>,<null>");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder8 = toStringBuilder1.append((short) 0);
        java.lang.String str9 = toStringBuilder8.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "=0,0,<null>" + "'", str9.equals("=0,0,<null>"));
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test536");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) 1.0d);
        java.lang.String str2 = toStringBuilder1.toString();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = toStringBuilder1.append((byte) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder6 = toStringBuilder1.append((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringBuilder6);
    }

    @Test
    public void ToStringBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ToStringBuilder1.test537");
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder1 = new org.apache.commons.lang3.builder.ToStringBuilder((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass2 = toStringBuilder1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

