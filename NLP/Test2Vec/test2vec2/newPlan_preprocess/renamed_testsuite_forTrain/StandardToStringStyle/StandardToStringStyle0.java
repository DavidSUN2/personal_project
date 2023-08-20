
package StandardToStringStyle;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StandardToStringStyle0 {

    public static boolean debug = false;

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray5 = new double[] { (byte) 10, 0.0d };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        boolean[] booleanArray3 = new boolean[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test003");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test005");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test006");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test007");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test008");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test009");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test010");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test011");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray6 = new float[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test012");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test013");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test014");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test015");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test017");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test019");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test020");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test021");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test022");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test023");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test024");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test025");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test026");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test027");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test029");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test030");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test031");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test032");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test033");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test034");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test035");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test036");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        short[] shortArray3 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test038");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test039");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test040");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test041");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        char[] charArray7 = new char[] { '#', '#', '4' };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test042");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test043");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test044");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test045");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test046");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test047");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test049");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test050");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test051");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test052");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test053");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test054");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test055");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test056");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test057");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test058");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test059");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test060");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test061");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test062");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test063");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test064");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test065");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test066");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test067");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test068");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test069");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer3, "<null>", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test070");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test071");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test073");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test074");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test075");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test076");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test077");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        byte[] byteArray3 = new byte[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test079");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test080");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100L };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test081");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test082");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test083");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test084");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test085");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test086");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test087");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setFieldSeparator("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test088");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test089");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test090");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test091");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test092");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test093");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.StringBuffer stringBuffer3 = null;
        double[] doubleArray6 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test094");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test095");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test096");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test097");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test098");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test099");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test100");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test101");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test102");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test103");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test104");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test105");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test106");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test107");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test108");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test109");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test110");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test111");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test112");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test113");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test114");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test115");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test116");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test118");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test119");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test120");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test121");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.Class<?> wildcardClass1 = toStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test124");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test125");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test126");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test127");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test128");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test129");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test130");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test131");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test132");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test133");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test134");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test135");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test136");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test137");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test138");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test139");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test140");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test141");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test142");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test143");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test144");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test145");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test146");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test147");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test148");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test149");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test150");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test151");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test152");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test153");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test154");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test155");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test156");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test157");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test158");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test159");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test160");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test161");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test162");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test163");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test164");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test165");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test166");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test167");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test168");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test169");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean2 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setContentEnd(",");
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test170");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test171");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test172");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test173");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test174");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test175");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test176");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test177");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test178");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test179");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test180");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test181");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test182");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test183");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test184");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test185");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test186");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test187");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setNullText("=");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray7 = new long[] { 0 };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test188");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test189");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test190");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test191");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test192");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test193");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test194");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test195");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test196");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test197");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test198");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test199");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test200");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test201");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test202");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test203");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test204");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test205");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test206");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test207");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test208");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test209");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test210");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test211");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test212");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test213");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test214");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test215");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test216");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test217");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test218");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test219");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test220");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test221");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test222");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test223");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test224");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test225");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test226");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test227");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test228");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test229");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer5, "]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test230");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test231");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test232");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test233");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test234");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test235");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test236");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArraySeparator("[");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test237");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test238");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test239");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test240");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test241");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test242");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test243");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setContentStart("<");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer5, "]", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test244");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test245");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test246");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test247");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test248");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test249");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test250");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test251");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test252");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test253");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test254");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test255");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test256");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test257");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test258");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test259");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setUseShortClassName(false);
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test260");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test261");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test262");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test263");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test264");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test265");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test266");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test267");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test268");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test269");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test270");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test271");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test272");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<" + "'", str1.equals("<"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test273");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test274");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test275");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test276");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test277");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test278");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test279");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test280");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSizeStartText("<null>");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test281");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test282");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test283");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test284");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test285");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test286");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test287");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test288");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        boolean boolean3 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray7 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test289");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        java.lang.StringBuffer stringBuffer5 = null;
        char[] charArray7 = new char[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test290");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test291");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test292");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test293");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test294");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test295");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test296");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test297");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test298");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test299");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test300");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test301");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test302");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test303");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test304");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test305");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test306");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test307");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test308");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test309");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test310");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test311");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test312");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test313");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test314");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test315");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test316");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test317");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test318");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test319");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test320");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test321");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test322");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test323");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test324");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test325");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test326");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test327");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test328");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test329");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test330");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test331");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test332");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test333");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle5 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str6 = standardToStringStyle5.getArrayStart();
        java.lang.String str7 = standardToStringStyle5.getContentStart();
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test334");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test335");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test336");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test337");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setArrayStart("=");
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "");
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test338");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test339");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test340");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setContentStart("<");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer5, ",", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test341");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test342");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test343");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test344");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test345");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test346");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test347");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test348");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test349");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test350");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test351");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test352");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test353");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test354");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test355");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test356");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test357");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test358");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test359");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test360");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test361");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test362");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test363");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test364");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test365");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test366");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test367");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test368");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test369");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test370");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test371");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test372");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test373");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test374");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test375");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test376");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test377");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test378");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test379");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test380");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setFieldNameValueSeparator("=");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test381");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test382");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test383");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparator("<size=");
        standardToStringStyle0.setNullText("]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test384");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test385");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test386");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test387");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test388");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test389");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test390");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test391");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test392");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test393");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test394");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test395");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test396");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test397");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test398");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test399");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test400");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test401");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test402");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test403");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test404");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test405");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test406");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray5 = new short[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test407");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test408");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test409");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test410");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test411");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test412");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test413");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test414");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test415");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test416");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test417");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test418");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test419");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test420");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean5 = standardToStringStyle0.isUseFieldNames();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test421");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test422");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test423");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test424");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test425");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test426");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test427");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test428");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test429");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test430");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test431");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test432");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test433");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test434");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test435");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test436");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test437");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test438");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test439");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setSummaryObjectStartText("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test440");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test441");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test442");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test443");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test444");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test445");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test446");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test447");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "");
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test448");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test449");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test450");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test451");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test452");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test453");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test454");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test455");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test456");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test457");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test458");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test459");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test460");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test461");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        standardToStringStyle0.setContentStart("<null>");
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test462");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test463");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test464");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test465");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test466");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test467");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test468");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test469");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test470");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test471");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test472");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test473");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        standardToStringStyle0.setDefaultFullDetail(false);
        java.lang.StringBuffer stringBuffer5 = null;
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test474");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test475");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test476");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test477");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test478");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test479");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test480");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test481");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        boolean boolean4 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test482");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test483");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendToString(stringBuffer2, "<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test484");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test485");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test486");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test487");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test488");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test489");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test490");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test491");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test492");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test493");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test494");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSummaryObjectEndText(",");
        java.lang.StringBuffer stringBuffer5 = null;
        boolean[] booleanArray7 = new boolean[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test495");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test496");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test497");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        standardToStringStyle0.setSizeStartText("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test498");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test499");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test500");
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

