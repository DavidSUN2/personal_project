
package CharSetUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSetUtils1 {

    public static boolean debug = false;

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0501");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0502");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0503");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0504");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0505");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0506");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0507");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0508");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0509");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0510");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0511");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0512");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0513");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0514");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0515");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0516");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0517");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0518");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0519");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0520");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0521");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0522");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0523");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0524");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0525");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0526");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0527");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0528");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0529");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0530");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0531");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0532");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0533");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0534");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0535");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0536");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0537");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0538");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0539");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0540");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0541");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0542");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0543");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0544");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0545");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0546");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0547");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0548");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0549");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0550");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0551");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0552");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0553");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0554");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0555");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0556");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0557");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0558");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0559");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0560");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0561");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0562");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0563");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0564");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0565");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0566");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0567");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray7);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0568");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0569");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0570");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0571");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0572");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0573");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0574");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0575");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0576");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0577");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0578");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0579");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0580");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0581");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0582");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0583");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0584");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0585");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0586");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0587");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0588");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0589");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0590");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0591");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0592");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0593");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0594");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0595");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0596");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0597");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0598");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0599");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0600");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0601");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0602");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0603");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0604");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0605");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0606");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0607");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0608");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0609");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0610");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0611");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0612");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0613");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0614");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0615");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0616");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0617");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0618");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0619");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0620");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0621");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0622");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0623");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0624");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0625");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0626");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0627");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0628");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0629");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0630");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0631");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0632");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0633");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0634");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0635");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0636");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0637");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0638");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0639");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0640");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0641");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0642");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0643");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0644");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0645");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0646");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0647");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0648");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0649");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0650");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0651");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0652");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0653");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0654");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0655");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0656");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0657");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0658");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0659");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0660");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0661");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0662");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0663");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0664");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0665");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0666");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0667");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0668");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0669");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0670");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0671");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0672");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0673");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0674");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0675");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0676");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0677");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0678");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0679");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0680");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0681");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0682");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0683");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0684");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0685");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0686");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0687");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0688");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0689");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0690");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0691");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0692");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0693");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0694");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0695");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0696");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0697");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0698");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0699");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0700");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0701");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0702");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0703");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0704");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0705");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0706");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0707");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0708");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0709");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0710");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0711");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0712");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
        int int4 = org.apache.commons.lang3.CharSetUtils.count("", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0713");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0714");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0715");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0716");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0717");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0718");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0719");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0720");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0721");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0722");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0723");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0724");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0725");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0726");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0727");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0728");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0729");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0730");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0731");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0732");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0733");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0734");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0735");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0736");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0737");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0738");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0739");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0740");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0741");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0742");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0743");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0744");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0745");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0746");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0747");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0748");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0749");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0750");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0751");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0752");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0753");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0754");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0755");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0756");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0757");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0758");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0759");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0760");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0761");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0762");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0763");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0764");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0765");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0766");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0767");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0768");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0769");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0770");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0771");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0772");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0773");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        int int4 = org.apache.commons.lang3.CharSetUtils.count("", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0774");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0775");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0776");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0777");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0778");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0779");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0780");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0781");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0782");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0783");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0784");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0785");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0786");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0787");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0788");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0789");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0790");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0791");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0792");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0793");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0794");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0795");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0796");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0797");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0798");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0799");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0800");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0801");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0802");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0803");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0804");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0805");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0806");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0807");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0808");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0809");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0810");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0811");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0812");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0813");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0814");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        int int5 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0815");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0816");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0817");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0818");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0819");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0820");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0821");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0822");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0823");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0824");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0825");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0826");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0827");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0828");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0829");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0830");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0831");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0832");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0833");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0834");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0835");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0836");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0837");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0838");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0839");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0840");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0841");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0842");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0843");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0844");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0845");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0846");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0847");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0848");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0849");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0850");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0851");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0852");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0853");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0854");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0855");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0856");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0857");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0858");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0859");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0860");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0861");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0862");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0863");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0864");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0865");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0866");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0867");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0868");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0869");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0870");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0871");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0872");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0873");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0874");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0875");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0876");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0877");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0878");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0879");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0880");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0881");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0882");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0883");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0884");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0885");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0886");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0887");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0888");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0889");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0890");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0891");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0892");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0893");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0894");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0895");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0896");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0897");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0898");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0899");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0900");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0901");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0902");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0903");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0904");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0905");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0906");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
        int int4 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0907");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0908");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0909");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0910");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0911");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0912");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0913");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0914");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0915");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0916");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0917");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0918");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0919");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0920");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0921");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0922");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0923");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0924");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0925");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0926");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0927");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0928");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0929");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int5 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0930");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0931");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0932");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0933");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0934");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0935");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0936");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0937");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0938");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0939");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0940");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0941");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0942");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0943");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0944");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0945");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0946");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0947");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0948");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0949");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0950");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0951");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0952");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0953");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0954");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0955");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0956");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0957");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0958");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0959");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0960");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0961");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0962");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0963");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0964");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0965");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0966");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0967");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0968");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0969");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0970");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0971");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0972");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0973");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0974");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0975");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0976");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0977");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0978");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0979");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0980");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0981");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray2);
        int int4 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0982");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0983");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0984");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0985");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.delete("", strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0986");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0987");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
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
            System.out.format("%n%s%n", "CharSetUtils1.test0988");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0989");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0990");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0991");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0992");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0993");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0994");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0995");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0996");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test0997");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0998");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils1.test0999");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
            System.out.format("%n%s%n", "CharSetUtils1.test1000");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
}

