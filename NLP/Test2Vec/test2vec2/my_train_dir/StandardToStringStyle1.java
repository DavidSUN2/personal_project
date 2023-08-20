
package StandardToStringStyle;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StandardToStringStyle1 {

    public static boolean debug = false;

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test501");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test502");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseClassName();
        java.lang.String str2 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ">" + "'", str2.equals(">"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test503");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseIdentityHashCode(false);
        boolean boolean3 = standardToStringStyle0.isUseIdentityHashCode();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test504");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test505");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test506");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test507");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test508");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test509");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test510");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test511");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test512");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test513");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test514");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test515");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test516");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test517");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test518");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test519");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test520");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseClassName();
        java.lang.StringBuffer stringBuffer2 = null;
        short[] shortArray4 = new short[] {};
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test521");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test522");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test523");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test524");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test525");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test526");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test527");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test528");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        standardToStringStyle0.setArrayStart("{");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test529");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test530");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test531");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test532");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test533");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setUseFieldNames(true);
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test534");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test535");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test536");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test537");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test538");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test539");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setUseIdentityHashCode(true);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer5, "=", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test540");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test541");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test542");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        boolean boolean2 = standardToStringStyle0.isArrayContentDetail();
        boolean boolean3 = standardToStringStyle0.isDefaultFullDetail();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test543");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test544");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test545");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test546");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test547");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test548");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test549");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test550");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test551");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test552");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test553");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test554");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test555");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test556");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test557");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test558");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test559");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test560");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test561");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test562");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test563");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test564");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test565");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test566");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str2 = standardToStringStyle0.getSizeEndText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ">" + "'", str2.equals(">"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test567");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test568");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test569");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test570");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test571");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test572");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getSizeStartText();
        java.lang.String str4 = standardToStringStyle0.getArrayEnd();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test573");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test574");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test575");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test576");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test577");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test578");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test579");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test580");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        boolean boolean1 = standardToStringStyle0.isUseShortClassName();
        boolean boolean2 = standardToStringStyle0.isUseShortClassName();
        java.lang.String str3 = standardToStringStyle0.getArrayStart();
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray7 = new short[] { (short) 100 };
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test581");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setSizeStartText("[");
        standardToStringStyle0.setNullText("");
        standardToStringStyle0.setArraySeparator(",");
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test582");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test583");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test584");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test585");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test586");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test587");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test588");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test589");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test590");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test591");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        standardToStringStyle0.setFieldNameValueSeparator("");
        standardToStringStyle0.setSizeStartText("}");
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            standardToStringStyle0.append(stringBuffer5, "}", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test592");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test593");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        java.lang.String str3 = standardToStringStyle0.getNullText();
        boolean boolean4 = standardToStringStyle0.isUseFieldNames();
        java.lang.String str5 = standardToStringStyle0.getSummaryObjectEndText();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test594");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test595");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test596");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test597");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test598");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test599");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test600");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test601");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test602");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setDefaultFullDetail(true);
        standardToStringStyle0.setArrayContentDetail(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test603");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        java.lang.String str2 = standardToStringStyle0.getContentStart();
        boolean boolean3 = standardToStringStyle0.isFieldSeparatorAtEnd();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test604");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayStart();
        standardToStringStyle0.setArrayEnd("[");
        standardToStringStyle0.setArrayContentDetail(false);
        standardToStringStyle0.setSizeStartText("=");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{" + "'", str1.equals("{"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test606");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test607");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test608");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test609");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test610");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test611");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test612");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test613");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test614");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test615");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test616");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test617");
        org.apache.commons.lang3.builder.StandardToStringStyle standardToStringStyle0 = new org.apache.commons.lang3.builder.StandardToStringStyle();
        java.lang.String str1 = standardToStringStyle0.getArrayEnd();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "}" + "'", str1.equals("}"));
    }

    @Test
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test618");
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
    public void StandardToStringStyle() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StandardToStringStyle1.test619");
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

