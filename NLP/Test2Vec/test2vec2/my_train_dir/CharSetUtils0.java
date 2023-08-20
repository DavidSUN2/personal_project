
package CharSetUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSetUtils0 {

    public static boolean debug = false;

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0001");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.CharSetUtils.containsAny("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0002");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0003");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.keep("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0004");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0005");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0006");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.delete("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0007");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0008");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0009");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.CharSetUtils.containsAny("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0010");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0011");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0012");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0013");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0014");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0015");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0016");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0017");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0018");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0019");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0020");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.CharSetUtils.count("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0021");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0022");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0023");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0024");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0025");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0026");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0027");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0028");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0029");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0030");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0031");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0032");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0033");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0034");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.keep("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0035");
        org.apache.commons.lang3.CharSetUtils charSetUtils0 = new org.apache.commons.lang3.CharSetUtils();
        java.lang.Class<?> wildcardClass1 = charSetUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0036");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0037");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.delete("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0038");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0039");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0040");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0041");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0042");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0043");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0044");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0045");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0046");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.squeeze("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0047");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0048");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0049");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0050");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0051");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.CharSetUtils.count("hi!", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0052");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0053");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0054");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0055");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0056");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0057");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0058");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0059");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0060");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0061");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0062");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0063");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0064");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0065");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0066");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0067");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0068");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0069");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0070");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0071");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0072");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0073");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0074");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0075");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0076");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0077");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0078");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0079");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0080");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0081");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0082");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0083");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0084");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0085");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0086");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0087");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0088");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.CharSetUtils.squeeze("", strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0089");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0090");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0091");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0092");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0093");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0094");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0095");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0096");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0097");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0098");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0099");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0100");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0101");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0102");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0103");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0104");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0105");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0106");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0107");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0108");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0109");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0110");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0111");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0112");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0113");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0114");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0115");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0116");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0117");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0118");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0119");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0120");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0121");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0122");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0123");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0124");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0125");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0126");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0127");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0128");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0129");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0130");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0131");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0132");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0133");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0134");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0135");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0136");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0137");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0138");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0139");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0140");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0141");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0142");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0143");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0144");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0145");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0146");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0147");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0148");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0149");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0150");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0151");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0152");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0153");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0154");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0155");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0156");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0157");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0158");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0159");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0160");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0161");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0162");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0163");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0164");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0165");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0166");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0167");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0168");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0169");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0170");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0171");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0172");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0173");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0174");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0175");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0176");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0177");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0178");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0179");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0180");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0181");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0182");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0183");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0184");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0185");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0186");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0187");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0188");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0189");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0190");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0191");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0192");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0193");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0194");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0195");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0196");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0197");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0198");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0199");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0200");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0201");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0202");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0203");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0204");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0205");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0206");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0207");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0208");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0209");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0210");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0211");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0212");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0213");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0214");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0215");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0216");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0217");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0218");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0219");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0220");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0221");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0222");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0223");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0224");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0225");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0226");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0227");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0228");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0229");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0230");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0231");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0232");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0233");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0234");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0235");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0236");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0237");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0238");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0239");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0240");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0241");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0242");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0243");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0244");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0245");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0246");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0247");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0248");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0249");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0250");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0251");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0252");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0253");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0254");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0255");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0256");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0257");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0258");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0259");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0260");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0261");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0262");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0263");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0264");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0265");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0266");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0267");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0268");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0269");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0270");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0271");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0272");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0273");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0274");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0275");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0276");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0277");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0278");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0279");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0280");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0281");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0282");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0283");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0284");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0285");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0286");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0287");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0288");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0289");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0290");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0291");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0292");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0293");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0294");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0295");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0296");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0297");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0298");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0299");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0300");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0301");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0302");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0303");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0304");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0305");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0306");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0307");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0308");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0309");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0310");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0311");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0312");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0313");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0314");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0315");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0316");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0317");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0318");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0319");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0320");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0321");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0322");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0323");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0324");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0325");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0326");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0327");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0328");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0329");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0330");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0331");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0332");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0333");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0334");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0335");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0336");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0337");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0338");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0339");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0340");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0341");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0342");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0343");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0344");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0345");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0346");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0347");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0348");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0349");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0350");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0351");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0352");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0353");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0354");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0355");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0356");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0357");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0358");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0359");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0360");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0361");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0362");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0363");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0364");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0365");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0366");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0367");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0368");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0369");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0370");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0371");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0372");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0373");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0374");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0375");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0376");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0377");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0378");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0379");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0380");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0381");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0382");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0383");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0384");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0385");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0386");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0387");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0388");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0389");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0390");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0391");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0392");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0393");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0394");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0395");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0396");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0397");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0398");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0399");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0400");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0401");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0402");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0403");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0404");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0405");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0406");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0407");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0408");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0409");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0410");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0411");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0412");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0413");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0414");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0415");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0416");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0417");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0418");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0419");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0420");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0421");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0422");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0423");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0424");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0425");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0426");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0427");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0428");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0429");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0430");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0431");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0432");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0433");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0434");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0435");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0436");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0437");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0438");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0439");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0440");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0441");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0442");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0443");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0444");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0445");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0446");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0447");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0448");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0449");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0450");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0451");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0452");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0453");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0454");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0455");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0456");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0457");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0458");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0459");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0460");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0461");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0462");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0463");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0464");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0465");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0466");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0467");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0468");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0469");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0470");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0471");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0472");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0473");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0474");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0475");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0476");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0477");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0478");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0479");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0480");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0481");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0482");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0483");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0484");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0485");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0486");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0487");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0488");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0489");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0490");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0491");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0492");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0493");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0494");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0495");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0496");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0497");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0498");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0499");
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
    public void CharSetUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSetUtils0.test0500");
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

