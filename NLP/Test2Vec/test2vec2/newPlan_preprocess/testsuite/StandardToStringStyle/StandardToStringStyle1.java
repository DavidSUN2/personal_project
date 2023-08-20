package StandardToStringStyle;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StandardToStringStyle1 {

    public static boolean debug = false;

    @Test
    public void StandardToStringStyle501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle501");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("hi!");
        boolean boolean7 = standardToStringStyle0.isUseClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle502");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseClassName();
        java.lang.String str2 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ">" + "'", str2.equals(">"));
    }

    @Test
    public void StandardToStringStyle503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle503");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean3 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StandardToStringStyle504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle504");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
    }

    @Test
    public void StandardToStringStyle505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle505");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "}" + "'", str7.equals("}"));
    }

    @Test
    public void StandardToStringStyle506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle506");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ">" + "'", str6.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle507");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        standardToStringStyle0.setContentStart(">");
        java.lang.String str9 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "=" + "'", str9.equals("="));
    }

    @Test
    public void StandardToStringStyle508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle508");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        boolean boolean9 = standardToStringStyle0.isUseClassName();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle509");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendSuper(stringBuffer3, ">");
        standardToStringStyle0.setSizeStartText("=");
        java.lang.String str8 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
    }

    @Test
    public void StandardToStringStyle510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle510");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setFieldNameValueSeparator(",");
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle511");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
    }

    @Test
    public void StandardToStringStyle512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle512");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle513");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getContentStart();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, ">");
        standardToStringStyle0.setUseFieldNames(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[" + "'", str3.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
    }

    @Test
    public void StandardToStringStyle514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle514");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        java.lang.String str9 = standardToStringStyle0.getSizeStartText();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<size=" + "'", str9.equals("<size="));
    }

    @Test
    public void StandardToStringStyle515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle515");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<size=" + "'", str8.equals("<size="));
    }

    @Test
    public void StandardToStringStyle516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle516");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "");
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle517");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
    }

    @Test
    public void StandardToStringStyle518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle518");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setContentStart("<null>");
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setContentEnd(",");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle519");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.Class<?> wildcardClass3 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StandardToStringStyle520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle520");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        short[] shortArray4 = new short[] {};
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer2, "<null>", shortArray4, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
    }

    @Test
    public void StandardToStringStyle521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle521");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str4 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<size=" + "'", str4.equals("<size="));
    }

    @Test
    public void StandardToStringStyle522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle522");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        boolean boolean5 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle523");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparator("{");
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendToString(stringBuffer5, "]");
        standardToStringStyle0.setArrayStart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StandardToStringStyle524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle524");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle525");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setSummaryObjectEndText("");
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
        java.lang.String str9 = standardToStringStyle0.getArrayStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{" + "'", str9.equals("{"));
    }

    @Test
    public void StandardToStringStyle526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle526");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseShortClassName(false);
        standardToStringStyle0.setFieldSeparator("[");
        boolean boolean9 = standardToStringStyle0.isArrayContentDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle527");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSummaryObjectEndText("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
    }

    @Test
    public void StandardToStringStyle528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle528");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, ">", 0.0d);
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
    public void StandardToStringStyle529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle529");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, "]");
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
    }

    @Test
    public void StandardToStringStyle530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle530");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setUseShortClassName(true);
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle531");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
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
    public void StandardToStringStyle532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle532");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getContentStart();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, ">");
        standardToStringStyle0.setArrayContentDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[" + "'", str3.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
    }

    @Test
    public void StandardToStringStyle533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle533");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseFieldNames(true);
    }

    @Test
    public void StandardToStringStyle534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle534");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        boolean boolean6 = standardToStringStyle0.isUseClassName();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
    }

    @Test
    public void StandardToStringStyle535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle535");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.String str7 = standardToStringStyle0.getContentEnd();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "]" + "'", str7.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle536");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = standardToStringStyle0.getArrayStart();
        java.lang.String str9 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{" + "'", str8.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[" + "'", str9.equals("["));
    }

    @Test
    public void StandardToStringStyle537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle537");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSummaryObjectEndText(",");
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setUseClassName(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle538");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setArrayContentDetail(false);
        standardToStringStyle0.setUseClassName(true);
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
    public void StandardToStringStyle539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle539");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "=", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle540");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArraySeparator("hi!");
        boolean boolean8 = standardToStringStyle0.isUseFieldNames();
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle541");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        standardToStringStyle0.setContentEnd("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
    }

    @Test
    public void StandardToStringStyle542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle542");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "", (double) 100L);
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
    public void StandardToStringStyle543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle543");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        standardToStringStyle0.setSizeEndText(">");
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
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
    public void StandardToStringStyle544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle544");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArrayContentDetail(false);
        java.lang.String str6 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
    }

    @Test
    public void StandardToStringStyle545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle545");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
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
    }

    @Test
    public void StandardToStringStyle546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle546");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.String str7 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle547");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setDefaultFullDetail(false);
        standardToStringStyle0.setDefaultFullDetail(true);
        boolean boolean9 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StandardToStringStyle548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle548");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
        java.lang.String str9 = standardToStringStyle0.getArrayStart();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{" + "'", str9.equals("{"));
    }

    @Test
    public void StandardToStringStyle549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle549");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setArrayStart("[");
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
    public void StandardToStringStyle550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle550");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.String str3 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setUseIdentityHashCode(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "," + "'", str3.equals(","));
    }

    @Test
    public void StandardToStringStyle551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle551");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        java.lang.String str9 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "," + "'", str9.equals(","));
    }

    @Test
    public void StandardToStringStyle552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle552");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle553");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendToString(stringBuffer7, "=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle554");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        standardToStringStyle0.setUseFieldNames(false);
        java.lang.String str8 = standardToStringStyle0.getArraySeparator();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle555");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "hi!", 0.0d);
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
    public void StandardToStringStyle556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle556");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayStart("<size=");
        java.lang.String str6 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setUseShortClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "," + "'", str6.equals(","));
    }

    @Test
    public void StandardToStringStyle557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle557");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        java.lang.String str3 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayStart("<size=");
        java.lang.String str6 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "}" + "'", str3.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
    }

    @Test
    public void StandardToStringStyle558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle558");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendToString(stringBuffer4, ">");
        java.lang.String str7 = standardToStringStyle0.getArrayEnd();
        java.lang.String str8 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[" + "'", str7.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "," + "'", str8.equals(","));
    }

    @Test
    public void StandardToStringStyle559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle559");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.String str3 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayEnd("");
        standardToStringStyle0.setFieldNameValueSeparator("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "," + "'", str3.equals(","));
    }

    @Test
    public void StandardToStringStyle560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle560");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str8 = standardToStringStyle0.getFieldNameValueSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "=" + "'", str8.equals("="));
    }

    @Test
    public void StandardToStringStyle561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle561");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        java.lang.String str6 = standardToStringStyle0.getSizeEndText();
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        standardToStringStyle0.setContentEnd("<size=");
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
    public void StandardToStringStyle562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle562");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setSizeEndText("}");
        boolean boolean5 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setSummaryObjectStartText("<size=");
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void StandardToStringStyle563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle563");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setFieldSeparatorAtEnd(false);
        java.lang.String str5 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArraySeparator("<size=");
        standardToStringStyle0.setSummaryObjectStartText("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "," + "'", str5.equals(","));
    }

    @Test
    public void StandardToStringStyle564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle564");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getContentStart();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        java.lang.String str5 = standardToStringStyle0.getNullText();
        java.lang.String str6 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[" + "'", str3.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[" + "'", str4.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "<null>" + "'", str5.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]" + "'", str6.equals("]"));
    }

    @Test
    public void StandardToStringStyle565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle565");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseFieldNames(false);
        standardToStringStyle0.setArraySeparator("<size=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StandardToStringStyle566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle566");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ">" + "'", str2.equals(">"));
    }

    @Test
    public void StandardToStringStyle567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle567");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setSummaryObjectEndText(",");
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setArraySeparator("<null>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
    }

    @Test
    public void StandardToStringStyle568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle568");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        boolean boolean3 = standardToStringStyle0.isFieldSeparatorAtEnd();
        standardToStringStyle0.setSizeEndText("<null>");
        standardToStringStyle0.setArrayStart("");
        standardToStringStyle0.setFieldSeparatorAtEnd(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StandardToStringStyle569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle569");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getContentEnd();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "]" + "'", str4.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StandardToStringStyle570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle570");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getFieldSeparator();
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<null>" + "'", str3.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "," + "'", str4.equals(","));
    }

    @Test
    public void StandardToStringStyle571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle571");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        boolean boolean4 = standardToStringStyle0.isUseIdentityHashCode();
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        java.lang.String str6 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "}" + "'", str6.equals("}"));
    }

    @Test
    public void StandardToStringStyle572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle572");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "]", '#');
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
    }

    @Test
    public void StandardToStringStyle573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle573");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle574");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setNullText(",");
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setArrayEnd("{");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle575");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.Class<?> wildcardClass5 = standardToStringStyle0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StandardToStringStyle576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle576");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        standardToStringStyle0.setUseShortClassName(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
    }

    @Test
    public void StandardToStringStyle577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle577");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setUseFieldNames(false);
        boolean boolean8 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle578");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setFieldNameValueSeparator("{");
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StandardToStringStyle579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle579");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.String str4 = standardToStringStyle0.getSizeStartText();
        java.lang.String str5 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "<size=" + "'", str3.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "<size=" + "'", str4.equals("<size="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "]" + "'", str5.equals("]"));
    }

    @Test
    public void StandardToStringStyle580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle580");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        boolean boolean2 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str3 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray7 = new short[] { (short) 100 };
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "<", shortArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{" + "'", str3.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray7);
    }

    @Test
    public void StandardToStringStyle581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle581");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setNullText("");
        standardToStringStyle0.setArraySeparator(",");
    }

    @Test
    public void StandardToStringStyle582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle582");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str2 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayStart("<");
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setFieldNameValueSeparator("}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "," + "'", str2.equals(","));
    }

    @Test
    public void StandardToStringStyle583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle583");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        java.lang.String str4 = standardToStringStyle0.getArrayStart();
        java.lang.String str5 = standardToStringStyle0.getArraySeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{" + "'", str4.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "," + "'", str5.equals(","));
    }

    @Test
    public void StandardToStringStyle584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle584");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getContentEnd();
        standardToStringStyle0.setSizeEndText("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]" + "'", str6.equals("]"));
    }

    @Test
    public void StandardToStringStyle585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle585");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        boolean boolean4 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setNullText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ">" + "'", str3.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StandardToStringStyle586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle586");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        standardToStringStyle0.setArrayEnd("");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str9 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "<" + "'", str8.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "]" + "'", str9.equals("]"));
    }

    @Test
    public void StandardToStringStyle587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle587");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        java.lang.StringBuffer stringBuffer4 = null;
        standardToStringStyle0.appendSuper(stringBuffer4, "[");
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        standardToStringStyle0.setArrayContentDetail(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle588");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer3 = null;
        standardToStringStyle0.appendToString(stringBuffer3, "<null>");
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.String str8 = standardToStringStyle0.getContentEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "]" + "'", str8.equals("]"));
    }

    @Test
    public void StandardToStringStyle589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle589");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setUseClassName(true);
        standardToStringStyle0.setFieldNameValueSeparator(">");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }

    @Test
    public void StandardToStringStyle590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle590");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        java.lang.String str6 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str7 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean8 = standardToStringStyle0.isFieldSeparatorAtEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "=" + "'", str6.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "=" + "'", str7.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StandardToStringStyle591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle591");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setSizeStartText("}");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer5, "}", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle592");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str7 = standardToStringStyle0.getNullText();
        standardToStringStyle0.setSummaryObjectEndText("{");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
    }

    @Test
    public void StandardToStringStyle593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle593");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer6, "{", '#');
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
    public void StandardToStringStyle594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle594");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getFieldSeparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[" + "'", str6.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
    }

    @Test
    public void StandardToStringStyle595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle595");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setUseFieldNames(false);
        boolean boolean9 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle596");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectStartText();
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<" + "'", str7.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
    }

    @Test
    public void StandardToStringStyle597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle597");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean4 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str5 = standardToStringStyle0.getArrayEnd();
        boolean boolean6 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setUseFieldNames(false);
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "}" + "'", str5.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle598");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str3 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setNullText("hi!");
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        standardToStringStyle0.setArraySeparator("]");
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
    public void StandardToStringStyle599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle599");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setContentStart("[");
        standardToStringStyle0.setSizeEndText("<null>");
        boolean boolean8 = standardToStringStyle0.isUseShortClassName();
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle600");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        boolean boolean6 = standardToStringStyle0.isUseClassName();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        standardToStringStyle0.setDefaultFullDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void StandardToStringStyle601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle601");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArraySeparator(">");
        java.lang.String str6 = standardToStringStyle0.getSummaryObjectStartText();
        boolean boolean7 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str8 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<" + "'", str6.equals("<"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
    }

    @Test
    public void StandardToStringStyle602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle602");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle603");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        boolean boolean3 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            standardToStringStyle0.append(stringBuffer4, "<size=", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[" + "'", str2.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StandardToStringStyle604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle604");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArrayContentDetail(false);
        standardToStringStyle0.setSizeStartText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in StandardToStringStyle generation
        try {
            toStringStyle0.append(stringBuffer1, "[", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void StandardToStringStyle606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle606");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        boolean boolean6 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.String str7 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<size=" + "'", str7.equals("<size="));
    }

    @Test
    public void StandardToStringStyle607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle607");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        standardToStringStyle0.setFieldSeparatorAtStart(true);
        boolean boolean5 = standardToStringStyle0.isUseClassName();
        boolean boolean6 = standardToStringStyle0.isFieldSeparatorAtStart();
        java.lang.StringBuffer stringBuffer7 = null;
        standardToStringStyle0.appendSuper(stringBuffer7, "[");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void StandardToStringStyle608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle608");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        boolean boolean7 = standardToStringStyle0.isArrayContentDetail();
        java.lang.String str8 = standardToStringStyle0.getNullText();
        java.lang.String str9 = standardToStringStyle0.getSummaryObjectStartText();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "<" + "'", str9.equals("<"));
    }

    @Test
    public void StandardToStringStyle609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle609");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getArrayEnd();
        standardToStringStyle0.setArrayContentDetail(true);
        java.lang.String str5 = standardToStringStyle0.getFieldNameValueSeparator();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
        boolean boolean7 = standardToStringStyle0.isFieldSeparatorAtEnd();
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "}" + "'", str2.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "=" + "'", str5.equals("="));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle610");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        standardToStringStyle0.setUseShortClassName(true);
        java.lang.String str7 = standardToStringStyle0.getArraySeparator();
        boolean boolean8 = standardToStringStyle0.isDefaultFullDetail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "," + "'", str7.equals(","));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StandardToStringStyle611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle611");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        boolean boolean6 = standardToStringStyle0.isUseFieldNames();
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
    public void StandardToStringStyle612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle612");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.String str5 = standardToStringStyle0.getSizeEndText();
        standardToStringStyle0.setArrayStart("hi!");
        standardToStringStyle0.setSummaryObjectStartText("<");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ">" + "'", str5.equals(">"));
    }

    @Test
    public void StandardToStringStyle613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle613");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        standardToStringStyle0.setFieldSeparatorAtStart(false);
        java.lang.StringBuffer stringBuffer5 = null;
        standardToStringStyle0.appendSuper(stringBuffer5, "");
        java.lang.String str8 = standardToStringStyle0.getContentStart();
        boolean boolean9 = standardToStringStyle0.isUseFieldNames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[" + "'", str8.equals("["));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StandardToStringStyle614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle614");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer2 = null;
        standardToStringStyle0.appendSuper(stringBuffer2, "{");
        boolean boolean5 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str6 = standardToStringStyle0.getContentEnd();
        java.lang.String str7 = standardToStringStyle0.getSummaryObjectEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "]" + "'", str6.equals("]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ">" + "'", str7.equals(">"));
    }

    @Test
    public void StandardToStringStyle615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle615");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setUseIdentityHashCode(false);
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        java.lang.String str6 = standardToStringStyle0.getSizeStartText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "}" + "'", str4.equals("}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "<size=" + "'", str6.equals("<size="));
    }

    @Test
    public void StandardToStringStyle616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle616");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        boolean boolean3 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setArrayStart("");
        boolean boolean6 = standardToStringStyle0.isUseShortClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StandardToStringStyle617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle617");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "}" + "'", str1.equals("}"));
    }

    @Test
    public void StandardToStringStyle618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle618");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.String str6 = standardToStringStyle0.getContentStart();
        java.lang.String str7 = standardToStringStyle0.getNullText();
        boolean boolean8 = standardToStringStyle0.isUseIdentityHashCode();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "<null>" + "'", str7.equals("<null>"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "}" + "'", str9.equals("}"));
    }

    @Test
    public void StandardToStringStyle619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.StandardToStringStyle619");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.String str4 = standardToStringStyle0.getContentStart();
        boolean boolean5 = standardToStringStyle0.isUseIdentityHashCode();
        standardToStringStyle0.setSummaryObjectStartText("<size=");
        java.lang.String str8 = standardToStringStyle0.getSummaryObjectEndText();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ">" + "'", str8.equals(">"));
    }
}

