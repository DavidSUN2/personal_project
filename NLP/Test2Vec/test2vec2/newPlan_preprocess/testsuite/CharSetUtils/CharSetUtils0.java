package CharSetUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSetUtils0 {

    public static boolean debug = false;

    @Test
    public void CharSetUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0001");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void CharSetUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0002");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0003");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0004");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0005");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        boolean boolean4 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0006");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void CharSetUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0007");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0008");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0009");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void CharSetUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0010");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0011");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0012");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0013");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0014");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0015");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0016");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0017");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0018");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0019");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0020");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.CharSetUtils.count("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharSetUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0021");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0022");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0023");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0024");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0025");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0026");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0027");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0028");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0029");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0030");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0031");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0032");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0033");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0034");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.keep("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0035");
        org.apache.commons.lang3.CharSetUtils charSetUtils0 = new org.apache.commons.lang3.CharSetUtils();
        java.lang.Class<?> wildcardClass1 = charSetUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSetUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0036");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0037");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.delete("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0038");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0039");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0040");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0041");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0042");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0043");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0044");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0045");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0046");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void CharSetUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0047");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0048");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0049");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0050");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0051");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharSetUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0052");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0053");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0054");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0055");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0056");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0057");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0058");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0059");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0060");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0061");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0062");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0063");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0064");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0065");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0066");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0067");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0068");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0069");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0070");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0071");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0072");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0073");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0074");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0075");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0076");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0077");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0078");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0079");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0080");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0081");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0082");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0083");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0084");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0085");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0086");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSetUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0087");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0088");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0089");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0090");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0091");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0092");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0093");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSetUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0094");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0095");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0096");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0097");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0098");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSetUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0099");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0100");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0101");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0102");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0103");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0104");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0105");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0106");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0107");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0108");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0109");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("", strArray2);
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
    public void CharSetUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0110");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0111");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0112");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0113");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0114");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0115");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0116");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0117");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0118");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0119");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0120");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0121");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0122");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0123");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0124");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0125");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0126");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0127");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0128");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0129");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0130");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0131");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSetUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0132");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0133");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0134");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0135");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0136");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0137");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0138");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0139");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0140");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0141");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0142");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void CharSetUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0143");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0144");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0145");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
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
    public void CharSetUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0146");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0147");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0148");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0149");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0150");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0151");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0152");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0153");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0154");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0155");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0156");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0157");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void CharSetUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0158");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0159");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0160");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray3);
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
    public void CharSetUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0161");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0162");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0163");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0165");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0166");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
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
    public void CharSetUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0167");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0168");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0169");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0170");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0171");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0172");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0173");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0174");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
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
    public void CharSetUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0175");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0176");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0177");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0178");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0179");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
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
    public void CharSetUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0180");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0181");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void CharSetUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0182");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0183");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0184");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0185");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0186");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0187");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0188");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0189");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0190");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0191");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0192");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0193");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0194");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0195");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0196");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
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
    public void CharSetUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0197");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0198");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0199");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0200");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0201");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0202");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0203");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0204");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0205");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray3);
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
    public void CharSetUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0206");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0207");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        boolean boolean4 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray2);
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
    public void CharSetUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0208");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    public void CharSetUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0209");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0210");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0211");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0212");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0213");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0214");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0215");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0216");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0217");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0218");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0219");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0220");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0221");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0222");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0223");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0224");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSetUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0225");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0226");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0227");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0228");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0229");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0230");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0231");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0232");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0233");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0234");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0235");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0236");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0237");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0238");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0239");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0240");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0241");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0242");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0243");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0244");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0245");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0246");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void CharSetUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0247");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0248");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0249");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
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
    public void CharSetUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0250");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    public void CharSetUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0251");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0252");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0253");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0254");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0255");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0256");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0257");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0258");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0259");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0260");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0261");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0262");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0263");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0264");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0265");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0266");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
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
    public void CharSetUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0267");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0268");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0269");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0270");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0271");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    public void CharSetUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0272");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    public void CharSetUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0273");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0274");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0275");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0276");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0277");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0278");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0279");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0280");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0281");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0282");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
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
    public void CharSetUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0283");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0284");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0285");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    public void CharSetUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0286");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "" };
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
    public void CharSetUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0287");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0288");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0289");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
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
    public void CharSetUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0290");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0291");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
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
    public void CharSetUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0292");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0293");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0294");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0295");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0296");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0297");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0298");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0299");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0300");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0301");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0302");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0303");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0304");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0305");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0306");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0307");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0308");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0309");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0310");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0311");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0312");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0313");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0314");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
    public void CharSetUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0315");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0316");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSetUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0317");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void CharSetUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0318");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0319");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0320");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0321");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0322");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0323");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSetUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0324");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0325");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0326");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0327");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0328");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0329");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
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
    public void CharSetUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0330");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0331");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0332");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    public void CharSetUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0333");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0334");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0335");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0336");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0337");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0338");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0339");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0340");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0341");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0342");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0343");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0344");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    public void CharSetUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0345");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void CharSetUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0346");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0347");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0348");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0349");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
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
    public void CharSetUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0350");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
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
    public void CharSetUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0351");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0352");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0353");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0354");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0355");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0356");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0357");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0358");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0359");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0360");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0361");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0362");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0363");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray3);
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
    public void CharSetUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0364");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
        boolean boolean4 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray2);
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
    public void CharSetUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0365");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0366");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0367");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0368");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0369");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void CharSetUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0370");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0371");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0372");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0373");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray3);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0374");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0375");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0376");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0377");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0378");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    public void CharSetUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0379");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0380");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0381");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0382");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0383");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0384");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    public void CharSetUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0385");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0386");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0387");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0388");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0389");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    public void CharSetUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0390");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0391");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0392");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0393");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0394");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0395");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray3);
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
    public void CharSetUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0396");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0397");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0398");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void CharSetUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0399");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
    public void CharSetUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0400");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0401");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0402");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0403");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
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
    public void CharSetUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0404");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0405");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0406");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void CharSetUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0407");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    public void CharSetUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0408");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0409");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0410");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0411");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0412");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0413");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0414");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0415");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    public void CharSetUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0416");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0417");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0418");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
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
    public void CharSetUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0419");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0420");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0421");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0422");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0423");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0424");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0425");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0426");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
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
    public void CharSetUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0427");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0428");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0429");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0430");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0431");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0432");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
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
    public void CharSetUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0433");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0434");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0435");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray3);
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
    public void CharSetUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0436");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
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
    public void CharSetUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0437");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
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
    public void CharSetUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0438");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0439");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0440");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0441");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0442");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0443");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0444");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void CharSetUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0445");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0446");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int6 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0447");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0448");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0449");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    public void CharSetUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0450");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0451");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0452");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0453");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
    public void CharSetUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0454");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
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
    public void CharSetUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0455");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0456");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0457");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0458");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
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
    }

    @Test
    public void CharSetUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0459");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0460");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0461");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    public void CharSetUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0462");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray5);
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
    public void CharSetUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0463");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
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
    public void CharSetUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0464");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void CharSetUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0465");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0466");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
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
    public void CharSetUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0467");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0468");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0469");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0470");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0471");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray7);
        int int9 = org.apache.commons.lang3.CharSetUtils.count("", strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void CharSetUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0472");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0473");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0474");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void CharSetUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0475");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
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
    public void CharSetUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0476");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("", strArray4);
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
    public void CharSetUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0477");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0478");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
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
    public void CharSetUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0479");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
        boolean boolean7 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSetUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0480");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        boolean boolean8 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0481");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
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
    public void CharSetUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0482");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray6);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("", strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSetUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0483");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0484");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("", strArray6);
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
    public void CharSetUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0485");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray6);
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
    public void CharSetUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0486");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void CharSetUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0487");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0488");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0489");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray3);
        boolean boolean5 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray3);
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
    public void CharSetUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0490");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0491");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
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
    public void CharSetUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0492");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0493");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray4);
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
    public void CharSetUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0494");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
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
    public void CharSetUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0495");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.delete("", strArray5);
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
    public void CharSetUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0496");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.keep("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray4);
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
    public void CharSetUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0497");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray6);
        boolean boolean9 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSetUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0498");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.CharSetUtils.keep("", strArray2);
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
    public void CharSetUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0499");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray4);
        int int7 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
        int int8 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray4);
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
    public void CharSetUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.CharSetUtils0500");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray5);
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
}

