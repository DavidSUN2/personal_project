package StandardToStringStyle;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StandardToStringStyle0 {

    public static boolean debug = false;

    @Test
    public void StandardToStringStyle001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray5 = new double[] { (byte) 10, 0.0d };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "", doubleArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void StandardToStringStyle002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        boolean[] booleanArray3 = new boolean[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "", booleanArray3, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
    }

    @Test
    public void StandardToStringStyle003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle003");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "hi!", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle005");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        standardToStringStyle0.setSummaryObjectStartText("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle006");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "}", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle007");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "", (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle008");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "}", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle009");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer2, "", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle010");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
    }

    @Test
    public void StandardToStringStyle011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle011");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray6 = new float[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, ",", floatArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void StandardToStringStyle012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle012");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle013");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.appendEnd(stringBuffer5, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle014");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.Class<?> wildcardClass4 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StandardToStringStyle015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle015");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        java.lang.String str8 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "}" + "'", str8.equals("}"));
    }

    @Test
    public void StandardToStringStyle016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle017");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setSizeStartText("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle019");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        standardToStringStyle0.setFieldSeparator(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle020");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setArrayContentDetail(false);
        java.lang.String str9 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "}" + "'", str9.equals("}"));
    }

    @Test
    public void StandardToStringStyle021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle021");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.Class<?> wildcardClass8 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StandardToStringStyle022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle022");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setContentStart(">");
        java.lang.String str9 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle023");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendSuper(stringBuffer6, ",");
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle024");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle025");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, ">", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle026");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<null>", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle027");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setNullText("<null>");
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle029");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, ",", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle030");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StandardToStringStyle031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle031");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        boolean boolean6 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle032");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setUseClassName(false);
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle033");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, ">", (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
    }

    @Test
    public void StandardToStringStyle034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle034");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, ",", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle035");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "{", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
    }

    @Test
    public void StandardToStringStyle036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle036");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, ",", objArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void StandardToStringStyle037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        short[] shortArray3 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "]", shortArray3, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle038");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        standardToStringStyle0.setUseFieldNames(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle039");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseClassName(true);
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle040");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle041");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        char[] charArray7 = new char[] { '#', '#', '4' };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer2, "<null>", charArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void StandardToStringStyle042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle042");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle043");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setContentStart(">");
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle044");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle045");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setSummaryObjectEndText("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle046");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        java.lang.String str9 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "}" + "'", str9.equals("}"));
    }

    @Test
    public void StandardToStringStyle047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle047");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, ",", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "<size=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle049");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setSizeEndText(">");
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle050");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "{", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle051");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        standardToStringStyle0.setUseClassName(false);
        boolean boolean9 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle052");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle053");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle054");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        boolean boolean8 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle055");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        standardToStringStyle0.appendStart(stringBuffer5, obj6);
        standardToStringStyle0.setArrayEnd("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StandardToStringStyle056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle056");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.appendStart(stringBuffer7, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
    }

    @Test
    public void StandardToStringStyle057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle057");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer2, "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StandardToStringStyle058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle058");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle059");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        java.lang.String str6 = standardToStringStyle0.getNullText();
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
    }

    @Test
    public void StandardToStringStyle060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle060");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setUseShortClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle061");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        java.lang.String str8 = standardToStringStyle0.getSizeEndText();
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle062");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setUseShortClassName(true);
        java.lang.String str9 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[" + "'", str9.equals("["));
    }

    @Test
    public void StandardToStringStyle063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle063");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendSuper(stringBuffer6, ",");
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle064");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, ",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle065");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle066");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setArrayStart("hi!");
        standardToStringStyle0.setSizeStartText("hi!");
        standardToStringStyle0.setArrayEnd("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
    }

    @Test
    public void StandardToStringStyle067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle067");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setArrayStart("<null>");
        java.lang.String str9 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle068");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle069");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "<null>", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle070");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "<null>", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle071");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setContentEnd("{");
        standardToStringStyle0.setArraySeparator("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.appendSuper(stringBuffer1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle073");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setArrayContentDetail(false);
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle074");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean8 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle075");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        standardToStringStyle0.setContentStart("<null>");
        standardToStringStyle0.setUseShortClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle076");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setNullText("<null>");
        boolean boolean9 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle077");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setUseFieldNames(false);
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        byte[] byteArray3 = new byte[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "", byteArray3, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void StandardToStringStyle079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle079");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setContentStart("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle080");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "<", objArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void StandardToStringStyle081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle081");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        java.lang.String str9 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "=" + "'", str9.equals("="));
    }

    @Test
    public void StandardToStringStyle082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle082");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle083");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
    }

    @Test
    public void StandardToStringStyle084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle084");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle085");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseShortClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "=" + "'", str7.equals("="));
    }

    @Test
    public void StandardToStringStyle086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle086");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle087");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setFieldSeparator("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
    }

    @Test
    public void StandardToStringStyle088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle088");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle089");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle090");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setSummaryObjectStartText("");
        boolean boolean9 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle091");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle092");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        boolean boolean9 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle093");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer3 = null;
        double[] doubleArray6 = new double[] { 10 };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "]", doubleArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void StandardToStringStyle094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle094");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setArrayEnd("{");
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle095");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        standardToStringStyle0.setSizeEndText("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle096");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setSizeStartText("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle097");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArraySeparator("{");
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle098");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "", (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle099");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{" + "'", str7.equals("{"));
    }

    @Test
    public void StandardToStringStyle100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle100");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setContentEnd("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle101");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        standardToStringStyle0.appendStart(stringBuffer5, obj6);
        standardToStringStyle0.setSizeEndText("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StandardToStringStyle102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle102");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle103");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle104");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle105");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        standardToStringStyle0.setArraySeparator("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle106");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setNullText("<null>");
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle107");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setUseIdentityHashCode(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle108");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        java.lang.String str8 = standardToStringStyle0.getArrayStart();
        boolean boolean9 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{" + "'", str8.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle109");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setArrayEnd("{");
        standardToStringStyle0.setContentStart("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle110");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setContentEnd("{");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{" + "'", str9.equals("{"));
    }

    @Test
    public void StandardToStringStyle111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle111");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle112");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setSizeEndText(">");
        java.lang.String str8 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "}" + "'", str8.equals("}"));
    }

    @Test
    public void StandardToStringStyle113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle113");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        standardToStringStyle0.setContentStart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle114");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseIdentityHashCode(true);
        standardToStringStyle0.setSummaryObjectStartText("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle115");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setContentEnd("hi!");
        standardToStringStyle0.setUseClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle116");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setContentStart("<null>");
        java.lang.Class<?> wildcardClass7 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StandardToStringStyle117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle118");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "<size=", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle119");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        boolean boolean8 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle120");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle121");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setSummaryObjectStartText("");
        standardToStringStyle0.setArrayContentDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.Class<?> wildcardClass1 = toStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StandardToStringStyle123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "[", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle124");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setArrayStart("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendSuper(stringBuffer6, "{");
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle125");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle126");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StandardToStringStyle127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle127");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setContentEnd(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
    }

    @Test
    public void StandardToStringStyle128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle128");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setFieldSeparator("=");
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle129");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        standardToStringStyle0.setContentStart("}");
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle130");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle131");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayStart("[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle132");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeStartText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
    }

    @Test
    public void StandardToStringStyle133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle133");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setUseFieldNames(false);
        java.lang.String str9 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "}" + "'", str9.equals("}"));
    }

    @Test
    public void StandardToStringStyle134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle134");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setArraySeparator("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle135");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, ">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle136");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseIdentityHashCode(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "=" + "'", str7.equals("="));
    }

    @Test
    public void StandardToStringStyle137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle137");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle138");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle139");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<size=", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle140");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle141");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean9 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle142");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setArrayEnd("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle143");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArraySeparator("{");
        java.lang.String str9 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<null>" + "'", str9.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle144");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setFieldSeparator("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
    }

    @Test
    public void StandardToStringStyle145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle145");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setFieldSeparator("<");
        standardToStringStyle0.setDefaultFullDetail(false);
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle146");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        boolean boolean7 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle147");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setUseClassName(false);
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle148");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle149");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setUseIdentityHashCode(true);
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle150");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle151");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{" + "'", str8.equals("{"));
    }

    @Test
    public void StandardToStringStyle152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle152");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        standardToStringStyle0.appendStart(stringBuffer5, obj6);
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle153");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.String str7 = standardToStringStyle0.getArrayStart();
        java.lang.String str8 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{" + "'", str7.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
    }

    @Test
    public void StandardToStringStyle154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle154");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getFieldSeparator();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, "{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
    }

    @Test
    public void StandardToStringStyle155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle155");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setArrayEnd("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle156");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<null>", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle157");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        java.lang.String str8 = standardToStringStyle0.getSizeEndText();
        java.lang.String str9 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[" + "'", str9.equals("["));
    }

    @Test
    public void StandardToStringStyle158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle158");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setArrayStart("<null>");
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle159");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setDefaultFullDetail(true);
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle160");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        standardToStringStyle0.setSummaryObjectStartText("[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
    }

    @Test
    public void StandardToStringStyle161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle161");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "[", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StandardToStringStyle162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle162");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle163");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setFieldNameValueSeparator(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle164");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setNullText("<size=");
        standardToStringStyle0.setFieldSeparator("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle165");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle166");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void StandardToStringStyle167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle167");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle168");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle169");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "<", objArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void StandardToStringStyle170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle170");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setSummaryObjectStartText("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle171");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldNameValueSeparator("[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle172");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setUseFieldNames(false);
        standardToStringStyle0.setUseFieldNames(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle173");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle174");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle175");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setFieldNameValueSeparator("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle176");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        standardToStringStyle0.setSizeStartText("{");
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle177");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.String str6 = standardToStringStyle0.getNullText();
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle178");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("{");
        standardToStringStyle0.setNullText("}");
        standardToStringStyle0.setArrayContentDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle179");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
    }

    @Test
    public void StandardToStringStyle180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle180");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle181");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle182");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArraySeparator("hi!");
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle183");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setArrayStart("hi!");
        standardToStringStyle0.setSizeStartText("hi!");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
    }

    @Test
    public void StandardToStringStyle184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle184");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setArrayStart("hi!");
        java.lang.Class<?> wildcardClass6 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StandardToStringStyle185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle185");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle186");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle187");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setNullText("=");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray7 = new long[] { 0 };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "{", longArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray7);
    }

    @Test
    public void StandardToStringStyle188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle188");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle189");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getFieldSeparator();
        java.lang.String str8 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
    }

    @Test
    public void StandardToStringStyle190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle190");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle191");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        java.lang.String str8 = standardToStringStyle0.getSizeEndText();
        java.lang.String str9 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle192");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle193");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setArrayContentDetail(false);
        java.lang.String str9 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle194");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayEnd("[");
        boolean boolean9 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle195");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
    }

    @Test
    public void StandardToStringStyle196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle196");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setArrayEnd("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
    }

    @Test
    public void StandardToStringStyle197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle197");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSizeEndText("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
    }

    @Test
    public void StandardToStringStyle198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle198");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setArrayEnd("{");
        standardToStringStyle0.setContentEnd("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle199");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle200");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle201");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle202");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle203");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.String str7 = standardToStringStyle0.getArrayStart();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{" + "'", str7.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle204");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle205");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setUseFieldNames(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle206");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setFieldSeparator("[");
        java.lang.String str9 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{" + "'", str9.equals("{"));
    }

    @Test
    public void StandardToStringStyle207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle207");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
    }

    @Test
    public void StandardToStringStyle208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle208");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setContentEnd("{");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle209");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle210");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setUseIdentityHashCode(true);
        standardToStringStyle0.setArrayStart(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle211");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.String str8 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<size=" + "'", str8.equals("<size="));
    }

    @Test
    public void StandardToStringStyle212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle212");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
    }

    @Test
    public void StandardToStringStyle213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle213");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayStart("<size=");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
    }

    @Test
    public void StandardToStringStyle214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle214");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArraySeparator("hi!");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle215");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle216");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        java.lang.Class<?> wildcardClass7 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StandardToStringStyle217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle217");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        java.lang.String str8 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<size=" + "'", str7.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "}" + "'", str8.equals("}"));
    }

    @Test
    public void StandardToStringStyle218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle218");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle219");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setArraySeparator("}");
        standardToStringStyle0.setArrayContentDetail(false);
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle220");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str9 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<null>" + "'", str9.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle221");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, ",", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle222");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle223");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        boolean boolean4 = standardToStringStyle0.isUseIdentityHashCode();
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle224");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        standardToStringStyle0.setContentStart("}");
        boolean boolean9 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle225");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setNullText(">");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void StandardToStringStyle226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle226");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        boolean boolean6 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle227");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle228");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle229");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle230");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "<null>", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle231");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
    }

    @Test
    public void StandardToStringStyle232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle232");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendSuper(stringBuffer6, ",");
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle233");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
    }

    @Test
    public void StandardToStringStyle234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle234");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setFieldNameValueSeparator("{");
        standardToStringStyle0.setFieldNameValueSeparator("[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle235");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        standardToStringStyle0.setSizeEndText("");
        standardToStringStyle0.setUseShortClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle236");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "hi!", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
    }

    @Test
    public void StandardToStringStyle237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle237");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        boolean boolean8 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle238");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
    }

    @Test
    public void StandardToStringStyle239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle239");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldNameValueSeparator(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle240");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str8 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle241");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        java.lang.String str9 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle242");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.appendEnd(stringBuffer7, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle243");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setContentStart("<");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "]", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle244");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setFieldSeparator("<");
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        java.lang.Class<?> wildcardClass8 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StandardToStringStyle245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle245");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.Class<?> wildcardClass7 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StandardToStringStyle246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle246");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setContentEnd("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle247");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getContentEnd();
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "]" + "'", str5.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle248");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setArrayStart("hi!");
        standardToStringStyle0.setSizeStartText("hi!");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle249");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setContentEnd("{");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        boolean boolean9 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle250");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.String str5 = standardToStringStyle0.getArrayStart();
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{" + "'", str5.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
    }

    @Test
    public void StandardToStringStyle251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle251");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setSizeStartText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle252");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setSizeStartText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle253");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setUseFieldNames(false);
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle254");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setSizeStartText("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "=" + "'", str7.equals("="));
    }

    @Test
    public void StandardToStringStyle255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle255");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
    }

    @Test
    public void StandardToStringStyle256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle256");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "=");
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle257");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "=");
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        boolean boolean9 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle258");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]" + "'", str6.equals("]"));
    }

    @Test
    public void StandardToStringStyle259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle259");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "<size=", byteArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle260");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setSizeEndText("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle261");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        boolean boolean5 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArraySeparator("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle262");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        standardToStringStyle0.appendStart(stringBuffer5, obj6);
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle263");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle264");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setUseFieldNames(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle265");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle266");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getFieldSeparator();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle267");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean8 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle268");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "[", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]" + "'", str4.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle269");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        java.lang.String str4 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{" + "'", str4.equals("{"));
    }

    @Test
    public void StandardToStringStyle270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle270");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setFieldNameValueSeparator(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "=" + "'", str7.equals("="));
    }

    @Test
    public void StandardToStringStyle271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle271");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle272");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<" + "'", str1.equals("<"));
    }

    @Test
    public void StandardToStringStyle273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle273");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendToString(stringBuffer6, "}");
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle274");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]" + "'", str4.equals("]"));
    }

    @Test
    public void StandardToStringStyle275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle275");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getNullText();
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle276");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, "}");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle277");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getSizeStartText();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSummaryObjectStartText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
    }

    @Test
    public void StandardToStringStyle278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle278");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setUseClassName(true);
        standardToStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str8 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle279");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getSizeStartText();
        boolean boolean7 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle280");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSizeStartText("<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle281");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getArrayEnd();
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "}" + "'", str6.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
    }

    @Test
    public void StandardToStringStyle282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle282");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.String str6 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle283");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        java.lang.String str9 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "=" + "'", str9.equals("="));
    }

    @Test
    public void StandardToStringStyle284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle284");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setSummaryObjectStartText("");
        java.lang.String str9 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{" + "'", str9.equals("{"));
    }

    @Test
    public void StandardToStringStyle285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle285");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        standardToStringStyle0.setContentStart("<null>");
        standardToStringStyle0.setArrayStart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle286");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("{");
        standardToStringStyle0.setDefaultFullDetail(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle287");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getContentEnd();
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.Class<?> wildcardClass7 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "]" + "'", str5.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StandardToStringStyle288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle288");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        boolean boolean3 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray7 = new boolean[] { true };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "}", booleanArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void StandardToStringStyle289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle289");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = new char[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "<null>", charArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void StandardToStringStyle290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle290");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayStart("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
    }

    @Test
    public void StandardToStringStyle291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle291");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setNullText("");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendToString(stringBuffer6, "]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle292");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        standardToStringStyle0.setContentStart(">");
        boolean boolean9 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle293");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setSummaryObjectStartText(",");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendToString(stringBuffer6, ",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle294");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
    }

    @Test
    public void StandardToStringStyle295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle295");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setFieldSeparator("<size=");
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle296");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setDefaultFullDetail(false);
        standardToStringStyle0.setSizeEndText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
    }

    @Test
    public void StandardToStringStyle297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle297");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayStart("<");
        java.lang.String str9 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "=" + "'", str9.equals("="));
    }

    @Test
    public void StandardToStringStyle298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle298");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "<null>", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
    }

    @Test
    public void StandardToStringStyle299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle299");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setArrayEnd("{");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void StandardToStringStyle300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle300");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        boolean boolean2 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setContentEnd(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StandardToStringStyle301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle301");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setSummaryObjectStartText("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle302");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ">" + "'", str2.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle303");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.String str5 = standardToStringStyle0.getArrayStart();
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{" + "'", str5.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
    }

    @Test
    public void StandardToStringStyle304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle304");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setArraySeparator("}");
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle305");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        java.lang.String str8 = standardToStringStyle0.getSizeEndText();
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle306");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setSummaryObjectStartText("");
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle307");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "}", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
    }

    @Test
    public void StandardToStringStyle308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle308");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setSummaryObjectEndText("]");
        standardToStringStyle0.setUseFieldNames(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle309");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle310");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setContentStart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle311");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.String str5 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setContentEnd(",");
        standardToStringStyle0.setArrayEnd("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{" + "'", str5.equals("{"));
    }

    @Test
    public void StandardToStringStyle312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle312");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
    }

    @Test
    public void StandardToStringStyle313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle313");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayStart("<size=");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        java.lang.String str7 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setSizeStartText("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<size=" + "'", str7.equals("<size="));
    }

    @Test
    public void StandardToStringStyle314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle314");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str9 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle315");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ">" + "'", str2.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StandardToStringStyle316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle316");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseClassName(true);
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void StandardToStringStyle317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle317");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StandardToStringStyle318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle318");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.String str5 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setContentEnd(",");
        boolean boolean8 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{" + "'", str5.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle319");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        boolean boolean8 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle320");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]" + "'", str4.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle321");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setUseFieldNames(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle322");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setUseShortClassName(false);
        java.lang.String str8 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<size=" + "'", str8.equals("<size="));
    }

    @Test
    public void StandardToStringStyle323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle323");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        boolean boolean5 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle324");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setUseShortClassName(true);
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle325");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle326");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendSuper(stringBuffer6, "<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle327");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        standardToStringStyle0.setFieldSeparator("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
    }

    @Test
    public void StandardToStringStyle328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle328");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArraySeparator("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle329");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setNullText(">");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
    }

    @Test
    public void StandardToStringStyle330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle330");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setFieldSeparator("");
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle331");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getContentStart();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, ">");
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[" + "'", str3.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle332");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setUseFieldNames(true);
        java.lang.String str9 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle333");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle5 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str6 = standardToStringStyle5.getArrayStart();
        java.lang.String str7 = standardToStringStyle5.getContentStart();
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.appendStart(stringBuffer4, (java.lang.Object) standardToStringStyle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
    }

    @Test
    public void StandardToStringStyle334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle334");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "}");
        standardToStringStyle0.setFieldSeparator(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle335");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        java.lang.String str3 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<" + "'", str3.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
    }

    @Test
    public void StandardToStringStyle336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle336");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle337");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setArrayStart("=");
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "");
    }

    @Test
    public void StandardToStringStyle338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle338");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        java.lang.Class<?> wildcardClass8 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<size=" + "'", str7.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StandardToStringStyle339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle339");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayStart("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle340");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setContentStart("<");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, ",", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle341");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "=", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle342");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setSummaryObjectStartText("");
        java.lang.String str9 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "=" + "'", str9.equals("="));
    }

    @Test
    public void StandardToStringStyle343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle343");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
    }

    @Test
    public void StandardToStringStyle344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle344");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendToString(stringBuffer6, "}");
        boolean boolean9 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle345");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setFieldNameValueSeparator("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle346");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setFieldSeparator("=");
        standardToStringStyle0.setSummaryObjectStartText("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle347");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean8 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean9 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle348");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        boolean boolean6 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle349");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getSizeStartText();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        boolean boolean8 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle350");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        standardToStringStyle0.setSizeEndText("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle351");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        standardToStringStyle0.setContentStart("<null>");
        java.lang.Class<?> wildcardClass8 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StandardToStringStyle352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle352");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setUseClassName(false);
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle353");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle354");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setSummaryObjectEndText("=");
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle355");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setFieldSeparator(">");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void StandardToStringStyle356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle356");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]" + "'", str6.equals("]"));
    }

    @Test
    public void StandardToStringStyle357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle357");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle358");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setUseShortClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle359");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle360");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.String str5 = standardToStringStyle0.getArrayStart();
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{" + "'", str5.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle361");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setUseClassName(false);
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle362");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setNullText("<size=");
        java.lang.String str6 = standardToStringStyle0.getSizeStartText();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setSummaryObjectEndText("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle363");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setDefaultFullDetail(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
    }

    @Test
    public void StandardToStringStyle364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle364");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.String str3 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayEnd("");
        java.lang.String str6 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "," + "'", str3.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]" + "'", str6.equals("]"));
    }

    @Test
    public void StandardToStringStyle365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle365");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        standardToStringStyle0.appendStart(stringBuffer5, obj6);
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle366");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        standardToStringStyle0.setUseFieldNames(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
    }

    @Test
    public void StandardToStringStyle367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle367");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.String str3 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{" + "'", str3.equals("{"));
    }

    @Test
    public void StandardToStringStyle368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle368");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle369");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, ",", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]" + "'", str4.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle370");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setFieldNameValueSeparator("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<size=" + "'", str7.equals("<size="));
    }

    @Test
    public void StandardToStringStyle371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle371");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle372");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, "[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]" + "'", str4.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle373");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getNullText();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle374");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setDefaultFullDetail(false);
        java.lang.String str6 = standardToStringStyle0.getFieldSeparator();
        java.lang.String str7 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle375");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setContentStart("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
    }

    @Test
    public void StandardToStringStyle376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle376");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        standardToStringStyle0.setSizeEndText("<null>");
        standardToStringStyle0.setArrayStart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle377");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean9 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle378");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayStart("<size=");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setArraySeparator("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle379");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
    }

    @Test
    public void StandardToStringStyle380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle380");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setFieldNameValueSeparator("=");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle381");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setContentStart("<null>");
        standardToStringStyle0.setArrayStart(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
    }

    @Test
    public void StandardToStringStyle382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle382");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setFieldSeparator("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle383");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("<size=");
        standardToStringStyle0.setNullText("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle384");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
    }

    @Test
    public void StandardToStringStyle385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle385");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle386");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        boolean boolean4 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str5 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "," + "'", str5.equals(","));
    }

    @Test
    public void StandardToStringStyle387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle387");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArraySeparator("{");
        java.lang.String str9 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "}" + "'", str9.equals("}"));
    }

    @Test
    public void StandardToStringStyle388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle388");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str5 = standardToStringStyle0.getArraySeparator();
        java.lang.String str6 = standardToStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "," + "'", str5.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle389");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle390");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle391");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setFieldSeparator(">");
        standardToStringStyle0.setContentStart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle392");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "=", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle393");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "}", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle394");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
    }

    @Test
    public void StandardToStringStyle395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle395");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseFieldNames(false);
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle396");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayStart("<size=");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle397");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setNullText("<size=");
        java.lang.String str6 = standardToStringStyle0.getSizeStartText();
        boolean boolean7 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean8 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle398");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        java.lang.String str8 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{" + "'", str8.equals("{"));
    }

    @Test
    public void StandardToStringStyle399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle399");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        standardToStringStyle0.appendSuper(stringBuffer6, "[");
        boolean boolean9 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle400");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle401");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        boolean boolean6 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setUseIdentityHashCode(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle402");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle403");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseShortClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle404");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setContentStart(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
    }

    @Test
    public void StandardToStringStyle405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle405");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StandardToStringStyle406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle406");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray5 = new short[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer3, "=", shortArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void StandardToStringStyle407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle407");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseIdentityHashCode(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
    }

    @Test
    public void StandardToStringStyle408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle408");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        java.lang.String str5 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<null>" + "'", str5.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle409");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setSizeEndText("<");
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle410");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentStart(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
    }

    @Test
    public void StandardToStringStyle411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle411");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str6 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "}" + "'", str6.equals("}"));
    }

    @Test
    public void StandardToStringStyle412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle412");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{" + "'", str6.equals("{"));
    }

    @Test
    public void StandardToStringStyle413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle413");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setArrayContentDetail(false);
        standardToStringStyle0.setUseClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle414");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        boolean boolean5 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setUseClassName(true);
        standardToStringStyle0.setFieldSeparator("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle415");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object obj6 = null;
        standardToStringStyle0.appendStart(stringBuffer5, obj6);
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StandardToStringStyle416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle416");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle417");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
    }

    @Test
    public void StandardToStringStyle418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle418");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseClassName(true);
        standardToStringStyle0.setFieldNameValueSeparator("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StandardToStringStyle419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle419");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        boolean boolean5 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setSummaryObjectStartText("=");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
    }

    @Test
    public void StandardToStringStyle420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle420");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "", (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle421");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseClassName(true);
        java.lang.String str8 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle422");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setNullText("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
    }

    @Test
    public void StandardToStringStyle423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle423");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setUseShortClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle424");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "{");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle425");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getContentStart();
        java.lang.String str8 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
    }

    @Test
    public void StandardToStringStyle426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle426");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setArrayContentDetail(false);
        standardToStringStyle0.setFieldSeparator("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle427");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setSummaryObjectEndText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle428");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        standardToStringStyle0.setContentStart("[");
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle429");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, "hi!");
        standardToStringStyle0.setSummaryObjectEndText("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle430");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        boolean boolean3 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle431");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.String str6 = standardToStringStyle0.getNullText();
        java.lang.Class<?> wildcardClass7 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StandardToStringStyle432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle432");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setArraySeparator("}");
        boolean boolean7 = standardToStringStyle0.isUseShortClassName();
        java.lang.Class<?> wildcardClass8 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StandardToStringStyle433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle433");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setFieldSeparator("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StandardToStringStyle434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle434");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSummaryObjectStartText("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle435");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        standardToStringStyle0.setFieldNameValueSeparator("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle436");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
    }

    @Test
    public void StandardToStringStyle437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle437");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getNullText();
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle438");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "[", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle439");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setSummaryObjectStartText("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle440");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        standardToStringStyle0.setContentEnd("}");
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        boolean boolean9 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle441");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setContentStart(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle442");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setDefaultFullDetail(false);
        standardToStringStyle0.setUseShortClassName(true);
        java.lang.String str8 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<size=" + "'", str8.equals("<size="));
    }

    @Test
    public void StandardToStringStyle443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle443");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[" + "'", str5.equals("["));
    }

    @Test
    public void StandardToStringStyle444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle444");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setContentStart("]");
        boolean boolean9 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle445");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        standardToStringStyle0.setFieldNameValueSeparator("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
    }

    @Test
    public void StandardToStringStyle446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle446");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setFieldSeparator("=");
        standardToStringStyle0.setContentStart("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle447");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "");
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle448");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSizeStartText("{");
        java.lang.String str8 = standardToStringStyle0.getSizeEndText();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle449");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle450");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.String str6 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "}" + "'", str6.equals("}"));
    }

    @Test
    public void StandardToStringStyle451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle451");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StandardToStringStyle452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle452");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setArraySeparator("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle453");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle454");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        standardToStringStyle0.setSummaryObjectStartText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle455");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle456");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseClassName(true);
        standardToStringStyle0.setContentEnd("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle457");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle458");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setDefaultFullDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle459");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
    }

    @Test
    public void StandardToStringStyle460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle460");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "[");
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle461");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setContentStart("<null>");
    }

    @Test
    public void StandardToStringStyle462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle462");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle463");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        standardToStringStyle0.setSizeStartText("<null>");
        java.lang.String str8 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{" + "'", str8.equals("{"));
    }

    @Test
    public void StandardToStringStyle464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle464");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle465");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        boolean boolean6 = standardToStringStyle0.isUseClassName();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle466");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayStart("<");
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ">" + "'", str9.equals(">"));
    }

    @Test
    public void StandardToStringStyle467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle467");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setContentStart("<null>");
        java.lang.String str7 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle468");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setArrayStart("hi!");
        standardToStringStyle0.setSizeStartText("hi!");
        standardToStringStyle0.setSummaryObjectEndText("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
    }

    @Test
    public void StandardToStringStyle469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle469");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        standardToStringStyle0.setSummaryObjectEndText("}");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setSizeEndText("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle470");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, "[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle471");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("{");
        boolean boolean8 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{" + "'", str9.equals("{"));
    }

    @Test
    public void StandardToStringStyle472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle472");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle473");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        standardToStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "<size=", byteArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void StandardToStringStyle474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle474");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSizeStartText("<null>");
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle475");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<size=" + "'", str7.equals("<size="));
    }

    @Test
    public void StandardToStringStyle476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle476");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSummaryObjectStartText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
    }

    @Test
    public void StandardToStringStyle477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle477");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer2, ">", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StandardToStringStyle478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle478");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setContentEnd("{");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean9 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle479");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        java.lang.Class<?> wildcardClass9 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StandardToStringStyle480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle480");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setUseFieldNames(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
    }

    @Test
    public void StandardToStringStyle481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle481");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        boolean boolean4 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "[", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StandardToStringStyle482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle482");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setArraySeparator("}");
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle483");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendToString(stringBuffer2, "<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StandardToStringStyle484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle484");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setSizeEndText(">");
        java.lang.String str8 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle485");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        java.lang.String str8 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<size=" + "'", str8.equals("<size="));
    }

    @Test
    public void StandardToStringStyle486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle486");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle487");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<null>" + "'", str8.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle488");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setContentEnd("hi!");
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
        boolean boolean9 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle489");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSizeStartText("<null>");
        standardToStringStyle0.setContentEnd("}");
        java.lang.Class<?> wildcardClass8 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StandardToStringStyle490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle490");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        standardToStringStyle0.setSizeEndText("");
        standardToStringStyle0.setUseFieldNames(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle491");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setContentEnd(",");
        standardToStringStyle0.setDefaultFullDetail(false);
        boolean boolean7 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setNullText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle492");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "}");
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        boolean boolean9 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle493");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle494");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSummaryObjectEndText(",");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray7 = new boolean[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, ",", booleanArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void StandardToStringStyle495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle495");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "{");
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str8 = standardToStringStyle0.getArrayEnd();
        java.lang.String str9 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "=" + "'", str7.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle496");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("<size=");
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
    }

    @Test
    public void StandardToStringStyle497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle497");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setSizeStartText("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle498");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
    }

    @Test
    public void StandardToStringStyle499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle499");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        boolean boolean6 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.StandardToStringStyle500");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setContentStart("]");
        java.lang.String str9 = standardToStringStyle0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<null>" + "'", str9.equals("<null>"));
    }
}

