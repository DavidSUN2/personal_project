
package CharSetUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSetUtils2 {

    public static boolean debug = false;

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1001");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1002");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1003");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1004");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1005");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1006");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1007");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1008");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1009");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1010");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1011");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1012");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1013");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1014");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1015");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1016");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1017");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1018");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1019");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1020");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1021");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1022");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1023");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1024");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1025");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1026");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1027");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1028");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1029");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1030");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1031");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1032");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1033");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1034");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1035");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1036");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1037");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1038");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1039");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1040");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1041");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1042");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1043");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1044");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1045");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1046");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1047");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1048");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1049");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1050");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1051");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1052");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1053");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1054");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1055");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1056");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1057");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1058");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1059");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1060");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1061");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1062");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1063");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1064");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1065");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1066");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1067");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1068");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1069");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1070");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1071");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1072");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1073");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1074");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1075");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1076");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1077");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1078");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1079");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1080");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1081");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1082");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1083");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1084");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1085");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1086");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1087");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1088");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1089");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1090");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1091");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1092");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1093");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1094");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1095");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1096");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1097");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1098");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1099");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1100");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1101");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1102");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1103");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1104");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1105");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1106");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1107");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1108");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1109");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1110");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1111");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1112");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1113");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1114");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1115");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1116");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1117");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1118");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1119");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1120");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1121");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1122");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1123");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1124");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1125");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1126");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1127");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1128");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1129");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1130");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1131");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1132");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1133");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1134");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1135");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1136");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1137");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1138");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1139");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1140");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1141");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1142");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1143");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1144");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1145");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1146");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1147");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1148");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1149");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1150");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1151");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils2.test1152");
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

