package CharSetUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSetUtils2 {

    public static boolean debug = false;

    @Test
    public void CharSetUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1001");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1002");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1003");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1004");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1005");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void CharSetUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1006");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1007");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1008");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1009");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1010");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1011");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1012");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        boolean boolean4 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1013");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1014");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1015");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1016");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1017");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1018");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1019");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1020");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1021");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1022");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1023");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1024");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1025");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1026");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1027");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1028");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1029");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1030");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1031");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1032");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1033");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1034");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSetUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1035");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray2);
        boolean boolean4 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1036");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1037");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1038");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1039");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1040");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1041");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1042");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1043");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1044");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1045");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1046");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.delete("", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1047");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1048");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1049");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1050");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1051");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1052");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1053");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1054");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1055");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1056");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1057");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void CharSetUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1058");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1059");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1060");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1061");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1062");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1063");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        int int5 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1064");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1065");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1066");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1067");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1068");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1069");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1070");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1071");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1072");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1073");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1074");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1075");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1076");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1077");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1078");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1079");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1080");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1081");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1082");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1083");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1084");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1085");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1086");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1087");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        int int5 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1088");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1089");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1090");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1091");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void CharSetUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1092");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1093");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1094");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1095");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1096");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1097");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1098");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1099");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1100");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1101");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1102");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1103");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1104");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void CharSetUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1105");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1106");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1107");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void CharSetUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1108");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1109");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1110");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1111");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1112");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1113");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1114");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1115");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1116");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1117");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1118");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1119");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1120");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1121");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1122");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1123");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1124");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1125");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void CharSetUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1126");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1127");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1128");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1129");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1130");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void CharSetUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1131");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1132");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1133");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1134");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1135");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1136");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1137");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1138");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1139");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSetUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1140");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1141");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1142");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1143");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1144");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1145");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1146");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1147");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1148");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSetUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1149");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1150");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1151");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.CharSetUtils1152");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }
}

