package StandardToStringStyle;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StandardToStringStyle0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test01");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test02");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.StringBuffer stringBuffer1 = null;
        float[] floatArray5 = new float[] { 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer1, "hi!", floatArray5, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test03");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        char[] charArray6 = new char[] { 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "<null>", charArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test04");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer3, "", floatArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test05");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.appendStart(stringBuffer3, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test06");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test07");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray6 = new float[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer3, "<", floatArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test08");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "<");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test09");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test10");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test11");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str6 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSizeEndText("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test12");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.StringBuffer stringBuffer1 = null;
        standardToStringStyle0.appendToString(stringBuffer1, "hi!");
        java.lang.String str4 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setContentStart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ">" + "'", str4.equals(">"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test13");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.Class<?> wildcardClass6 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test14");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("<null>");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test15");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayEnd();
        java.lang.String str2 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "}" + "'", str1.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<" + "'", str2.equals("<"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test16");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test17");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.StringBuffer stringBuffer1 = null;
        standardToStringStyle0.appendToString(stringBuffer1, "hi!");
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArrayStart(">");
        java.lang.Class<?> wildcardClass7 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test18");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseFieldNames(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test19");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseIdentityHashCode(true);
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setContentEnd(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test20");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("<null>");
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test21");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseShortClassName(true);
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test22");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseShortClassName(true);
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        boolean boolean9 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test23");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setFieldSeparator("}");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test24");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test25");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setSummaryObjectEndText("[");
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test26");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("<null>");
        java.lang.String str7 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test27");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setArrayStart("[");
        java.lang.String str3 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[" + "'", str3.equals("["));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test28");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test29");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setSummaryObjectStartText(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test30");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer1, "<null>", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test31");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.StringBuffer stringBuffer1 = null;
        standardToStringStyle0.appendToString(stringBuffer1, "hi!");
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setUseClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test32");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test33");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer3, ">", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test34");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setFieldSeparator("}");
        standardToStringStyle0.setArrayEnd("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test35");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getNullText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean7 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<null>" + "'", str5.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test36");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str6 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test37");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayEnd();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        java.lang.String str3 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setDefaultFullDetail(false);
        standardToStringStyle0.setNullText("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "}" + "'", str1.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "," + "'", str3.equals(","));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test38");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("<null>");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setArrayStart("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test39");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSizeEndText(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "}" + "'", str1.equals("}"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test40");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setUseIdentityHashCode(true);
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test41");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test42");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setFieldNameValueSeparator("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test43");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArraySeparator("[");
        java.lang.String str4 = standardToStringStyle0.getNullText();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<null>" + "'", str4.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test44");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("<null>");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test45");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectStartText();
        standardToStringStyle0.setUseShortClassName(true);
        boolean boolean8 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<" + "'", str5.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test46");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.StringBuffer stringBuffer1 = null;
        standardToStringStyle0.appendToString(stringBuffer1, "hi!");
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setContentStart("]");
        standardToStringStyle0.setSizeStartText("<");
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test47");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        boolean boolean2 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer6, ",", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test48");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setFieldSeparator("}");
        java.lang.String str6 = standardToStringStyle0.getNullText();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<null>" + "'", str6.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test49");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArraySeparator(",");
        standardToStringStyle0.setArrayEnd("<size=");
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setFieldNameValueSeparator(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test50");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArrayEnd("<");
        java.lang.String str4 = standardToStringStyle0.getFieldSeparator();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test51");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getNullText();
        java.lang.String str2 = standardToStringStyle0.getArrayStart();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setArraySeparator("<null>");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setContentEnd(">");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "<null>" + "'", str1.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{" + "'", str2.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test52");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getContentStart();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        java.lang.String str3 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setContentStart("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[" + "'", str1.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "," + "'", str3.equals(","));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle0.test53");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setArrayStart("[");
        standardToStringStyle0.setArrayStart("[");
        standardToStringStyle0.setUseShortClassName(false);
    }
}

