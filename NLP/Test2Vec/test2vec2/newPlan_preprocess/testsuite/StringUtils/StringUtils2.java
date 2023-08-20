package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils2 {

    public static boolean debug = false;

    @Test
    public void StringUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4#44                                                                                                                                                                                                                                                                                                                                                        ", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#44" + "'", str2.equals("4#44"));
    }

    @Test
    public void StringUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1003");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih" + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih"));
    }

    @Test
    public void StringUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1005");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("4a a4aaa#aa32.0414a a4aaa#aa32.0410", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str3.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1008");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 19, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void StringUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1009");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", "2.0410.04100.", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", (java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1012");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "a#a4", "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "-1.0a0.0a1.0a10.0a1.0");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StringUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (int) (byte) 10, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!"));
    }

    @Test
    public void StringUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1016");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                        \n32.0a10.0a100.032.0a10.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1017");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", "32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void StringUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1019");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0a10.0a100.032.0a10.04a a4aaa#aa", "32.0 10.0 100.0", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                              " + "'", str2.equals("                              "));
    }

    @Test
    public void StringUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1.0a0.0a1.0a10.0a1.0", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1022");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "100.0410.0", (java.lang.CharSequence) "4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("#a a10.0a100.032.0a10.0a\n32.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#a a10.0a100.032.0a10.0a\n32.0" + "'", str1.equals("#a a10.0a100.032.0a10.0a\n32.0"));
    }

    @Test
    public void StringUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (java.lang.CharSequence) "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1025");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          ", 49, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1026");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void StringUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1027");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", charSequence2.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "###aa10.0a100.032.0a10.0a32.0##" + "'", str1.equals("###aa10.0a100.032.0a10.0a32.0##"));
    }

    @Test
    public void StringUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1030");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", charSequence2.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                4#44                                                ", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                4#44                                                " + "'", str2.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str2.equals("\n32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1034");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "4a a4aaa#aa", "4a a4aaa#aa" };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissing("#################################################hi!#", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", charSequenceArray5);
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#" + "'", str7.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StringUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1035");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.0", "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StringUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("100.0", "0.001 0.01 0.23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
    }

    @Test
    public void StringUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                              ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1040");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void StringUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("32.0a10.0a100.0", "                                                                           \n32.0a10.0a100.032.0a10.0", 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.0" + "'", str3.equals("32.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                               32.0 10.0 100.032.0a10.0a100.0", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0 10.0 100.032.0a10.0a100.0" + "'", str2.equals(".0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "100", (java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1047");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1048");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("11a-1a33", "AA AAAAA#A", "444444444444444444432.010.0100.04444444444444444444", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "11a-1a33" + "'", str4.equals("11a-1a33"));
    }

    @Test
    public void StringUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                               32.0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0 10.0 100.032.0a10.0a100.0" + "'", str1.equals("32.0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1052");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4a a4aaa#aa", (java.lang.CharSequence) "###aa10.0a100.032.0a10.0a32.0##", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void StringUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1053");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1054");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "\r", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 4#44", (int) (short) 1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " 4#44" + "'", str3.equals(" 4#44"));
    }

    @Test
    public void StringUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("32.0a10.0a100.032.0a10.0aa4aaaaa#aa", 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1057");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, 'a');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray0, ' ', 4, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4A A4AAA#AA", "                                                 hi!", (int) (byte) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                  ", 19, 5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4A A4AAA#AA" + "'", str8.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###aa10.0a100.032.0a10.0a32.0##", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("32.0a10.0a100.032.0a10.0aaaaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#"));
    }

    @Test
    public void StringUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                4#44                                                " + "'", str1.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1063");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) ".0 10.0 100.032.0a10.0a100.0", (java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                         \n32.0a10.0a100.032.0a10.0", "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1065");
        char[][][] charArray0 = new char[][][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1066");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "hi!100.0a10.0", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str2.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", (int) '4');
    }

    @Test
    public void StringUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("410.04", "#################################################hi!#4a32.010.0100.0a4aaa#aa", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "410.04" + "'", str3.equals("410.04"));
    }

    @Test
    public void StringUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1073");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                4#44                                                ", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1074");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", 51, "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1." + "'", str3.equals("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1."));
    }

    @Test
    public void StringUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4", "32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1078");
        short[] shortArray3 = new short[] { (short) 10, (short) 10, (short) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) -1, (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10#10#-1" + "'", str9.equals("10#10#-1"));
    }

    @Test
    public void StringUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                               32.0 10.0 100.032.0a10.0a100.0", "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                               32.0 10.0 100.032.0a10.0a100.0" + "'", str2.equals("                               32.0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(".0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".0 10.0 100.032.0a10.0a100.0" + "'", str1.equals(".0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str1.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                               32.0 10.0 100.0!ih", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                               32.0 10.0 100.0!ih" + "'", str2.equals("                               32.0 10.0 100.0!ih"));
    }

    @Test
    public void StringUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1086");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".0 10.0 100.032.0a10.0a100.0", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1087");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", (java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", charSequence2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                             ...", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                             ..." + "'", str2.equals("                             ..."));
    }

    @Test
    public void StringUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32429", (java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1092");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", (int) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void StringUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4"));
    }

    @Test
    public void StringUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!ih                                                 ", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 " + "'", str2.equals("!ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 "));
    }

    @Test
    public void StringUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1096");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".0aa aaaaa#");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', (int) (byte) 10, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("32.0a10.0a100.032.0a10.0aaaaaaa#a", "11 -1 33", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1098");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1099");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("444444444444444444432.010.0100.04444444444444444444", "32.0 10.0 100.04A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1102");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray0, ' ');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4', (int) (byte) -1, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "0", (java.lang.CharSequence) "##########32.010.0100.##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ", "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          " + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          "));
    }

    @Test
    public void StringUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", "", "                               32.0 10.0 100.0!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str3.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".0 10.0 100.032.0a10.0a100.0", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          \n                                                 hi!  ", " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n                                                 hi!  " + "'", str2.equals("          \n                                                 hi!  "));
    }

    @Test
    public void StringUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1109");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4", (java.lang.CharSequence) "4444", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1110");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, (int) '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100" + "'", str9.equals("100"));
    }

    @Test
    public void StringUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\n", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n" + "'", str2.equals("\n"));
    }

    @Test
    public void StringUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str1.equals("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1113");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###aa10.0a100.032.0a10.0a32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "114-1433", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void StringUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaaa#a", (java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10#1#-1#0#-1", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void StringUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1118");
        short[] shortArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1120");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, (int) '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("2.0410.04100.", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0410.04100." + "'", str2.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1123");
        int[] intArray2 = new int[] { ' ', 29 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32429" + "'", str4.equals("32429"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32#29" + "'", str6.equals("32#29"));
    }

    @Test
    public void StringUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                         \n32.0a10.0a100.032.0a10.0                                  ", "", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0                                  " + "'", str3.equals("                                         \n32.0a10.0a100.032.0a10.0                                  "));
    }

    @Test
    public void StringUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1126");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hi!100.0a10.0", charSequence1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("32.0 10.0 100.04A A4AAA#AA", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AA#32.0 10.0 100.04A A4AAA" + "'", str2.equals("AA#32.0 10.0 100.04A A4AAA"));
    }

    @Test
    public void StringUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("AA AAAAA#AA", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4a a4aaa#aa4a a4aaa#aaAA AAAAA#AA" + "'", str5.equals("4a a4aaa#aa4a a4aaa#aaAA AAAAA#AA"));
    }

    @Test
    public void StringUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AA4AAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AA4AAAAA#AA"));
    }

    @Test
    public void StringUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1130");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1131");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa", charSequence1, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1132");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", (java.lang.CharSequence) "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1133");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "          \n                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1134");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                               32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1136");
        short[] shortArray1 = new short[] { (short) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, (int) '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 32, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1137");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a a4aaa#a", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!", 10, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!       " + "'", str3.equals("hi!       "));
    }

    @Test
    public void StringUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("32.0A10.0A100.032.0A10.0AA4AAAAA#AA", "4a a4aaa#a", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str1.equals("4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1141");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.032.0a10.0aa aaaaa#a", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1142");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "hi!       ", 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1143");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "          \n" + "'", str9.equals("          \n"));
    }

    @Test
    public void StringUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AA AAAAA#A", "!ih", "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AA AAAAA#A" + "'", str3.equals("AA AAAAA#A"));
    }

    @Test
    public void StringUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.0 10.0 100.04A A4AAA#AA", 34, "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "    32.0 10.0 100.04A A4AAA#AA    " + "'", str3.equals("    32.0 10.0 100.04A A4AAA#AA    "));
    }

    @Test
    public void StringUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1148");
        short[] shortArray2 = new short[] { (short) -1, (short) 100 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-14100" + "'", str4.equals("-14100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1 100" + "'", str6.equals("-1 100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1 100" + "'", str8.equals("-1 100"));
    }

    @Test
    public void StringUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1149");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void StringUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", '#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  "));
    }

    @Test
    public void StringUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1152");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "          \n32.0a10.0a100.032.0a10.0", (int) 'a', 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n" + "'", str4.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n"));
    }

    @Test
    public void StringUtils1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("114-1433", 10, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "114-1433  " + "'", str3.equals("114-1433  "));
    }

    @Test
    public void StringUtils1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1155");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32#29");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str1.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("32#29");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32#29" + "'", str1.equals("32#29"));
    }

    @Test
    public void StringUtils1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1159");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1160");
        long[] longArray5 = new long[] { 19, (-1L), (short) -1, (short) 100, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "19a-1a-1a100a4" + "'", str7.equals("19a-1a-1a100a4"));
    }

    @Test
    public void StringUtils1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1161");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "32.010.0100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", charSequence2.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1162");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ..." + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ..."));
    }

    @Test
    public void StringUtils1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4", (java.lang.CharSequence) "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "..." + "'", str1.equals("..."));
    }

    @Test
    public void StringUtils1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10a10a-1", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                         10a10a-1" + "'", str2.equals("                                         10a10a-1"));
    }

    @Test
    public void StringUtils1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1167");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "AA AAAAA#A", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4#44" + "'", str1.equals("4#44"));
    }

    @Test
    public void StringUtils1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("11 -1 33", "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          \n32.0410.04100.032.0410.04a a4aaa#aa", "                                                        \n32.0a10.0a100.032.0a10.0", "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1174");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1176");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0100", "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1177");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1178");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                               32.0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1179");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#a", 0, 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n                                                 hi", "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi" + "'", str2.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) 'a', ".0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0" + "'", str3.equals(".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0"));
    }

    @Test
    public void StringUtils1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1182");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("32.010.0100.0");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "AA AAAAA#A", (java.lang.CharSequence) "hi!100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0 10.0 100.04A A4AAA#AA", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1186");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                 hi!", "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi" + "'", str2.equals("hi"));
    }

    @Test
    public void StringUtils1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4444" + "'", str2.equals("4444"));
    }

    @Test
    public void StringUtils1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1189");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "1041410041041");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1041410041041" + "'", str2.equals("1041410041041"));
    }

    @Test
    public void StringUtils1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1193");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", 32, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str2.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1196");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "100.0a10.0", 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                 hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1200");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#################################################hi!#", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "############################hi!#" + "'", str2.equals("############################hi!#"));
    }

    @Test
    public void StringUtils1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1203");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaa", ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "114-1433  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("\n                                                 hi", ".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi" + "'", str2.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", 2, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str3.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1208");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("100.0aa aaaaa#", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StringUtils1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) 'a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "10#10#-1", 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n                                                 hi!", "32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1215");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                  ", (java.lang.CharSequence) "32.0 10.0 100.032.0a10.0a100.0", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1216");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) ".0aa aaaaa#a", (java.lang.CharSequence) "2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#################################################hi!#4a32.010.0100.0a4aaa#aa", (int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################..." + "'", str3.equals("#################################################..."));
    }

    @Test
    public void StringUtils1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("32.0a10.0a100.032.0a10.0aaaaaaa#aa", (int) (byte) -1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1220");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "-1.0#0.0#1.0#10.0#1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1221");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("-1.0#0.0#1.0#10.0#1.", "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa", 32);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                4#44                                                ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach(".0 10.0 100.032.0a10.0a100.0", strArray4, strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".0 10.0 100.032.0a10.0a100.0" + "'", str7.equals(".0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a#a4", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1223");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "10#10#-1", (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1224");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray0, '4', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###a a10.0a100.032.0a10.0a\n32.0##", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1228");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "          ", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void StringUtils1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1.0#0.0#1.0#10.0#1.0", "1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!       ", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1232");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n                                                 hi!  ", 30, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str1.equals("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1234");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0a10.0a100.032.0a10.0aaaaaaa#", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1235");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("          ", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", (java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#################################################hi!#4aa4aaa#aa32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str6.equals("#################################################hi!#4aa4aaa#aa32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                 ", "4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                4#44                                                ", "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###aa10.0a100.032.0a10.0a32.0##", "4a a4aaa#aa", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########" + "'", str2.equals("##########"));
    }

    @Test
    public void StringUtils1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1241");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                 hi! ", "\n                                                 hi");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "-14100", 46, 348);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1242");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "32.0A10.0A100.032.0A10.0AA4AAAAA#AA", "32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1244");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str1.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4A A4AAA#AA", "############################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4A A4AAA#AA" + "'", str2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4A A4AAA#AA", "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4A A4AAA#AA" + "'", str2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("2.0410.04100.", "AA#32.0 10.0 100.04A A4AAA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0410.04100." + "'", str2.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1249");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih", "                                                 hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
    }

    @Test
    public void StringUtils1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a" + "'", str2.equals("a"));
    }

    @Test
    public void StringUtils1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1." + "'", str1.equals("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1."));
    }

    @Test
    public void StringUtils1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1252");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "4444", 45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1253");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2.0410.04100.", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StringUtils1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1255");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0 10.0 100.04A A4AAA#AA", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1257");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1259");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AA AAAAA#A", (java.lang.CharSequence) "-1 100", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#aa", (int) (byte) 10, "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa" + "'", str3.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1261");
        char[] charArray5 = new char[] { 'a', ' ', '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaa", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StringUtils1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", (int) (byte) 1, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4444444444444444440.0010.010." + "'", str3.equals("4444444444444444440.0010.010."));
    }

    @Test
    public void StringUtils1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1263");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".0 10.0 100.032.0a10.0a100.0", 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".0 10.0..." + "'", str3.equals(".0 10.0..."));
    }

    @Test
    public void StringUtils1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1265");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 4#44", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StringUtils1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0", (java.lang.CharSequence) "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("100.0410.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0410.0" + "'", str1.equals("100.0410.0"));
    }

    @Test
    public void StringUtils1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 100, 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1270");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "10#10#34", (java.lang.CharSequence) "32.010.0100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.04AA4AAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.04AA4AAA#AA"));
    }

    @Test
    public void StringUtils1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi", (java.lang.CharSequence) "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!", 34);
    }

    @Test
    public void StringUtils1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1274");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "          \n", (int) '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StringUtils1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1276");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2.equals(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1277");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                         \n32.0a10.0a100.032.0a10.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1279");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.032.0a10.0aaaaaaa#a", "100", (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.appendIfMissing("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    ", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str6.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("          ", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1282");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (java.lang.CharSequence) "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1283");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1041410041041" + "'", str7.equals("1041410041041"));
    }

    @Test
    public void StringUtils1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.0a10.0a100.032.0a10.0aaaaaaa#", 27, "!ih          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaa#"));
    }

    @Test
    public void StringUtils1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ", "2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih" + "'", str3.equals("!ih"));
    }

    @Test
    public void StringUtils1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#a", (java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1287");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1288");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", (java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1289");
        char[] charArray5 = new char[] { '4', '4', 'a', ' ', ' ' };
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(charArray5, 'a', 19, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StringUtils1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#################################################hi!#4a32.010.0100.0a4aaa#aa", (int) ' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#4a32.010.0100.0a4aaa#aa" + "'", str3.equals("#################################################hi!#4a32.010.0100.0a4aaa#aa"));
    }

    @Test
    public void StringUtils1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1291");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "          \n");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "#################################################hi!#4aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                                 hi!" + "'", str5.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "                                                 hi!" + "'", str7.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void StringUtils1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1292");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "a a4aaa#a", (java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "a a4aaa#a" + "'", charSequence2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("1.0#0.0#1.0#10.0#1.0", "100.0410.0", " 32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1294");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", charSequence2.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1295");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                        \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                                 2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "32.0a10.0a100.032.0a10.04a a4aaa#aa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\n32.0a10.0a100.032.0a10.04a a4", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##########32.010.0100.##########", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########32.010.0100.##########" + "'", str2.equals("##########32.010.0100.##########"));
    }

    @Test
    public void StringUtils1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1.0#0.0#1.0#10.0#1.0", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                          " + "'", str2.equals("                                          "));
    }

    @Test
    public void StringUtils1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "##########32.010.0100.##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1306");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                4#44                                                ", "###a a10.0a100.032.0a10.0a\n32.0##", 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.010.0100.0", (java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0" + "'", str6.equals("                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0"));
    }

    @Test
    public void StringUtils1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1307");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "          \n                                                 hi!  ", (java.lang.CharSequence) "#################################################...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void StringUtils1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#################################################hi!#", (int) (short) 0, "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#" + "'", str3.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1309");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444432.010.0100.04444444444444444444");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                 hi!", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-14100", "32.0a10.0a100.032.0a10.0", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1311");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.appendIfMissing(" 32.0410.04100.0", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str5.equals(" 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1313");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4a a4aaa#aa", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1314");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###################0.0010.010.23###################", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "114-1433", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StringUtils1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4", "          \n32.0a10.0a100.032.0a10.0", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
    }

    @Test
    public void StringUtils1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void StringUtils1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0.001 0.01 0.23", '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.001 0.01 0.23" + "'", str3.equals("0.001 0.01 0.23"));
    }

    @Test
    public void StringUtils1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                               32.0 10.0 100.0!ih", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1320");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.", 34, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1." + "'", str3.equals("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1."));
    }

    @Test
    public void StringUtils1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1323");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10#1#-1#0#-1" + "'", str7.equals("10#1#-1#0#-1"));
    }

    @Test
    public void StringUtils1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1324");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("100.0410.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0410.0" + "'", str2.equals("100.0410.0"));
    }

    @Test
    public void StringUtils1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1326");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 4#44", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StringUtils1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "19a-1a-1a100a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("32.0410.04100.032.0410.04a a4aaa#aa", 27, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a4aaa#a" + "'", str3.equals("a4aaa#a"));
    }

    @Test
    public void StringUtils1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1330");
        char[] charArray4 = new char[] { 'a', '4', ' ' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void StringUtils1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AA#32.0 10.0 100.04A A4AAA", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "                                 2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4a a4aaa#a", "4a a4aaa#aa32.0414a a4aaa#aa32.0410", 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a" + "'", str3.equals("4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a"));
    }

    @Test
    public void StringUtils1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1334");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2.equals(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!       ", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "###################0.0010.010.23###################", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1340");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                   32.010.0100.0                   ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", charSequence2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1341");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1342");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0#0.0#1.0#10.0#1.0", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AA AAAAA#A", "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AA AAAAA#A" + "'", str2.equals("AA AAAAA#A"));
    }

    @Test
    public void StringUtils1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a", 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1345");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "", 29, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a.0a10.0aa aaaaa#a" + "'", str4.equals("a.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1346");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ", 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n", "    32.0 10.0 100.04A A4AAA#AA    ", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n" + "'", str3.equals("          \n"));
    }

    @Test
    public void StringUtils1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1350");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, ' ');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "                             ...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                              ...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1353");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.prependIfMissing("-1.0#0.0#1.0#10.0#1.", (java.lang.CharSequence) "11 -1 33", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11 -1 33-1.0#0.0#1.0#10.0#1." + "'", str3.equals("11 -1 33-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1354");
        int[] intArray1 = new int[] { 29 };
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 49, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void StringUtils1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAA\r" + "'", str1.equals("AAAAA\r"));
    }

    @Test
    public void StringUtils1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" a#a4", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.010.0100.0", "#################################################hi!#", 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StringUtils1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1.0a0.0a1.0a10.0a1.0                                                                               ", 5, 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0a1.0a10.0a1.0                                       " + "'", str3.equals("0.0a1.0a10.0a1.0                                       "));
    }

    @Test
    public void StringUtils1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("32.0A10.0A100.032.0A10.04AA4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.04AA4AAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.04AA4AAA#AA"));
    }

    @Test
    public void StringUtils1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a", "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a" + "'", str2.equals("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a"));
    }

    @Test
    public void StringUtils1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1361");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4A A4AAA#AA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AA#AAA4A A4" + "'", str1.equals("AA#AAA4A A4"));
    }

    @Test
    public void StringUtils1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1363");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1364");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0100", (java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1365");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AA AAAAA#A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void StringUtils1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1366");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0", (java.lang.CharSequence) "114-1433", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1367");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", "114-1433", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str4.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1368");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", (java.lang.CharSequence) "AAAAA\r", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1369");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1372");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "############################hi!#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ############################hi!#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10#1#-1#0#-1" + "'", str7.equals("10#1#-1#0#-1"));
    }

    @Test
    public void StringUtils1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1373");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", ".0 10.0...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a32.010.0100.0a4aaa#aa" + "'", str1.equals("#################################################hi!#4a32.010.0100.0a4aaa#aa"));
    }

    @Test
    public void StringUtils1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("32429");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32429" + "'", str1.equals("32429"));
    }

    @Test
    public void StringUtils1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" a#a4", "          \n");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "100.0aa aaaaa#", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StringUtils1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1378");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "4");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StringUtils1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "aaaaa32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1382");
        long[] longArray3 = new long[] { 10L, (byte) 10, 34 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10#10#34" + "'", str5.equals("10#10#34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10#10#34" + "'", str7.equals("10#10#34"));
    }

    @Test
    public void StringUtils1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1383");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#################################################hi!#4aa4aaa#aa", 45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###############################hi!#4aa4aaa#aa" + "'", str2.equals("###############################hi!#4aa4aaa#aa"));
    }

    @Test
    public void StringUtils1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1385");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".0 10.0...", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("100.0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0" + "'", str3.equals("100.0"));
    }

    @Test
    public void StringUtils1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4#44", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4#44" + "'", str3.equals("4#44"));
    }

    @Test
    public void StringUtils1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str2.equals("                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                         10a10a-1", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                               10a10a-1" + "'", str2.equals("                               10a10a-1"));
    }

    @Test
    public void StringUtils1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "##########32.010.0100.##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1394");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\r", "          \n", (int) (short) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.appendIfMissing("32.0a10.0a100.032.0a10.0aaaaaaaa#a", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a\n32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str6.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a\n32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1395");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "4a a4aaa#aa", "4a a4aaa#aa" };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.appendIfMissing("", (java.lang.CharSequence) "100.0a10.0", charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0a10.0" + "'", str7.equals("100.0a10.0"));
    }

    @Test
    public void StringUtils1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1397");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" 4#44", "32.0a10.0a100.032.0a10.0aaaaaaaa#a", (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a4#44" + "'", str4.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a4#44"));
    }

    @Test
    public void StringUtils1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa", "          \n", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
    }

    @Test
    public void StringUtils1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str2.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1403");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################hi!#", (java.lang.CharSequence) " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a#a4", "###################0.0010.010.23###################");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a4" + "'", str2.equals("a#a4"));
    }

    @Test
    public void StringUtils1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1405");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1406");
        short[] shortArray2 = new short[] { (short) -1, (short) 100 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-14100" + "'", str4.equals("-14100"));
    }

    @Test
    public void StringUtils1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("32.0a10.0a100.032.0a10.04aa4aaa#aa                 ", "##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.04aa4aaa#aa                 " + "'", str2.equals("32.0a10.0a100.032.0a10.04aa4aaa#aa                 "));
    }

    @Test
    public void StringUtils1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "4444444444444444440.0010.010.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1410");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".0aa aaaaa#");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("1.0#0.0#1.0#10.0#1.0", "\n32.0a10.0a100.032.0a10.04a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0#0.0#1.0#10.0#" + "'", str2.equals("1.0#0.0#1.0#10.0#"));
    }

    @Test
    public void StringUtils1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444432.010.0100.04444444444444444444", '#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str3.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str1.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                        \n32.0a10.0a100.032.0a10.0", 27, "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                        \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("                                                        \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1416");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                               32.0 10.0 100.0!ih", (java.lang.CharSequence[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissing("aaaaa\r", (java.lang.CharSequence) "AA#32.0 10.0 100.04A A4AAA", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "AA#32.0 10.0 100.04A A4AAAaaaaa\r" + "'", str7.equals("AA#32.0 10.0 100.04A A4AAAaaaaa\r"));
    }

    @Test
    public void StringUtils1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str2.equals("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1418");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StringUtils1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("11 -1 33-1.0#0.0#1.0#10.0#1.", 2, "4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11 -1 33-1.0#0.0#1.0#10.0#1." + "'", str3.equals("11 -1 33-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih          ", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih          " + "'", str2.equals("!ih          "));
    }

    @Test
    public void StringUtils1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#################################################...", (java.lang.CharSequence) "1041410041041");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1423");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("##########32.010.0100.##########", (java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444" + "'", str3.equals("##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0#0.0#1.0#10.0#1.0", "10#10#34", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#aaaaa aa0." + "'", str1.equals("#aaaaa aa0."));
    }

    @Test
    public void StringUtils1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0", "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                 hi! ", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "114-1433", (java.lang.CharSequence) "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1429");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###################0.0010.010.23###################", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1.0#0.0#1.0#10.0#", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StringUtils1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a", "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1431");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", " 32.0410.04100.0");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("          \n", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0          \n" + "'", str5.equals("                                         \n32.0a10.0a100.032.0a10.0          \n"));
    }

    @Test
    public void StringUtils1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!100.0a10.0", " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!aaaaa aaaa" + "'", str3.equals("hi!aaaaa aaaa"));
    }

    @Test
    public void StringUtils1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1433");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.", (java.lang.CharSequence) ".0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AA#32.0 10.0 100.04A A4AAAaaaaa\r", "                                                4#44                                                ", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "100.0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1436");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0 10.0 100.0", "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                         \n32.0a10.0a100.032.0a10.0                                  ", (int) '#', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0                                  " + "'", str3.equals("                                         \n32.0a10.0a100.032.0a10.0                                  "));
    }

    @Test
    public void StringUtils1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (int) (byte) 0, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str3.equals("                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "410.04");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", 29, 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "....234444444444444444444h..." + "'", str3.equals("....234444444444444444444h..."));
    }

    @Test
    public void StringUtils1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("a.0a10.0aa aaaaa#a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a.0a10.0aa aaaaa#a" + "'", str2.equals("a.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1442");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a.0a10.0aa aaaaa#a", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1444");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "4444444444444444440.0010.010.", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "a.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 hi! ", "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi! " + "'", str2.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("AA#32.0 10.0 100.04A A4AAAaaaaa\r", "1041410041041", "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AA#32.0 10.0 100.04A A4AAAaaaaa\r" + "'", str3.equals("AA#32.0 10.0 100.04A A4AAAaaaaa\r"));
    }

    @Test
    public void StringUtils1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1448");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                 2.0410.04100.", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("32.0 10.0 100.04A A4AAA#AA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444" + "'", str2.equals("##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0a10.0" + "'", str1.equals("100.0a10.0"));
    }

    @Test
    public void StringUtils1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1452");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4a a4aaa#aa", "aaaaa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("-1.0a0.0a1.0a10.0a1.0", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1454");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AA#32.0 10.0 100.04A A4AAA", (java.lang.CharSequence) "0", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void StringUtils1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a a4aaa#a", (int) (byte) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\n32.0a10.0a100.032.0a10.04a a4", "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a " + "'", str2.equals("4a "));
    }

    @Test
    public void StringUtils1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "!ih", "11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi", 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi" + "'", str3.equals("hi"));
    }

    @Test
    public void StringUtils1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1461");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "11 -1 33", (java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "AA#AAA4A A4", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1463");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1464");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!       ", 0, 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#a4" + "'", str1.equals("a#a4"));
    }

    @Test
    public void StringUtils1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("11a-1a33", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1471");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) ".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0", (java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1473");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.appendIfMissing("32.0a10.0a100.032.0a10.0aaaaaaaa#a", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#aa#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str5.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#aa#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n                                                 hi!" + "'", str1.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1475");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "32.0410.04100.032.0410.04a a4aaa#aa", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0", 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                             \n32.0a10.0a100.032.0a10.032.010.0100.0" + "'", str2.equals("                                             \n32.0a10.0a100.032.0a10.032.010.0100.0"));
    }

    @Test
    public void StringUtils1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("32.010.0100.", "                                 2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1478");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", (java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0.001 0.01 0.23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.001 0.01 0.23" + "'", str1.equals("0.001 0.01 0.23"));
    }

    @Test
    public void StringUtils1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a a4aaa#a", "2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("100.0a10.0", 49, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1483");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4A A4AAA#AA", "                                                 hi!", (int) (byte) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                  ", 19, 5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "4A A4AAA#AA" + "'", str9.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1484");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void StringUtils1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", "32#29");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 " + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 "));
    }

    @Test
    public void StringUtils1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.04aa4aaa#aa                 ", (java.lang.CharSequence) "AA#AAA4A A4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1488");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1489");
        // The following exception was thrown during execution in StringUtils generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444440.0010.010.234444444444444444444", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1490");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) ".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                 hi!", 42, ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1493");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################hi!#", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4a a4aaa#aa", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa#aa4a a" + "'", str2.equals("aaa#aa4a a"));
    }

    @Test
    public void StringUtils1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444440.0010.010.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4444444444444444440.0010.010." + "'", str1.equals("4444444444444444440.0010.010."));
    }

    @Test
    public void StringUtils1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          \n                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                4#44                                                ", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0", 51, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void StringUtils1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                         \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", str1.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.StringUtils1500");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

