
package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils2 {

    public static boolean debug = false;

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4#44                                                                                                                                                                                                                                                                                                                                                        ", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#44" + "'", str2.equals("4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1003");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih" + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1005");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("4a a4aaa#aa32.0414a a4aaa#aa32.0410", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str3.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1008");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1009");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", "2.0410.04100.", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", (java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1012");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "a#a4", "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "-1.0a0.0a1.0a10.0a1.0");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (int) (byte) 10, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1016");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                        \n32.0a10.0a100.032.0a10.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1017");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", "32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1019");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0a10.0a100.032.0a10.04a a4aaa#aa", "32.0 10.0 100.0", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                              " + "'", str2.equals("                              "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("-1.0a0.0a1.0a10.0a1.0", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1022");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "100.0410.0", (java.lang.CharSequence) "4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("#a a10.0a100.032.0a10.0a\n32.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#a a10.0a100.032.0a10.0a\n32.0" + "'", str1.equals("#a a10.0a100.032.0a10.0a\n32.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (java.lang.CharSequence) "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          ", 49, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1026");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1027");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", charSequence2.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "###aa10.0a100.032.0a10.0a32.0##" + "'", str1.equals("###aa10.0a100.032.0a10.0a32.0##"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1030");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", charSequence2.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                4#44                                                ", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                4#44                                                " + "'", str2.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str2.equals("\n32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1034");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1035");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("100.0", "0.001 0.01 0.23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                              ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1040");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("32.0a10.0a100.0", "                                                                           \n32.0a10.0a100.032.0a10.0", 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.0" + "'", str3.equals("32.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1044");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                               32.0 10.0 100.032.0a10.0a100.0", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0 10.0 100.032.0a10.0a100.0" + "'", str2.equals(".0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "100", (java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1047");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1048");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("11a-1a33", "AA AAAAA#A", "444444444444444444432.010.0100.04444444444444444444", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "11a-1a33" + "'", str4.equals("11a-1a33"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                               32.0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0 10.0 100.032.0a10.0a100.0" + "'", str1.equals("32.0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1052");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4a a4aaa#aa", (java.lang.CharSequence) "###aa10.0a100.032.0a10.0a32.0##", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1053");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1054");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "\r", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 4#44", (int) (short) 1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " 4#44" + "'", str3.equals(" 4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("32.0a10.0a100.032.0a10.0aa4aaaaa#aa", 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1057");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, 'a');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1059");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###aa10.0a100.032.0a10.0a32.0##", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("32.0a10.0a100.032.0a10.0aaaaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                4#44                                                " + "'", str1.equals("                                                4#44                                                "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1063");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) ".0 10.0 100.032.0a10.0a100.0", (java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                         \n32.0a10.0a100.032.0a10.0", "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1065");
        char[][][] charArray0 = new char[][][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1066");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "hi!100.0a10.0", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str2.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", (int) '4');
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("410.04", "#################################################hi!#4a32.010.0100.0a4aaa#aa", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "410.04" + "'", str3.equals("410.04"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1073");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                4#44                                                ", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1074");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", 51, "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1." + "'", str3.equals("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4", "32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1078");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                               32.0 10.0 100.032.0a10.0a100.0", "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                               32.0 10.0 100.032.0a10.0a100.0" + "'", str2.equals("                               32.0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(".0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".0 10.0 100.032.0a10.0a100.0" + "'", str1.equals(".0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str1.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                               32.0 10.0 100.0!ih", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                               32.0 10.0 100.0!ih" + "'", str2.equals("                               32.0 10.0 100.0!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1086");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".0 10.0 100.032.0a10.0a100.0", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1087");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", (java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", charSequence2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                             ...", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                             ..." + "'", str2.equals("                             ..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32429", (java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1092");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", (int) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!ih                                                 ", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 " + "'", str2.equals("!ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 !ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1096");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".0aa aaaaa#");
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("32.0a10.0a100.032.0a10.0aaaaaaa#a", "11 -1 33", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1098");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1099");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("444444444444444444432.010.0100.04444444444444444444", "32.0 10.0 100.04A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1102");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray0, ' ');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "0", (java.lang.CharSequence) "##########32.010.0100.##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ", "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          " + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", "", "                               32.0 10.0 100.0!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str3.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".0 10.0 100.032.0a10.0a100.0", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          \n                                                 hi!  ", " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n                                                 hi!  " + "'", str2.equals("          \n                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1109");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4", (java.lang.CharSequence) "4444", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1110");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\n", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n" + "'", str2.equals("\n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str1.equals("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1113");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###aa10.0a100.032.0a10.0a32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "114-1433", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaaa#a", (java.lang.CharSequence) "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10#1#-1#0#-1", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1118");
        short[] shortArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1120");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("2.0410.04100.", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0410.04100." + "'", str2.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1123");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                         \n32.0a10.0a100.032.0a10.0                                  ", "", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0                                  " + "'", str3.equals("                                         \n32.0a10.0a100.032.0a10.0                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1126");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hi!100.0a10.0", charSequence1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("32.0 10.0 100.04A A4AAA#AA", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AA#32.0 10.0 100.04A A4AAA" + "'", str2.equals("AA#32.0 10.0 100.04A A4AAA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1128");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AA4AAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AA4AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1130");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1131");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa", charSequence1, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1132");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", (java.lang.CharSequence) "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1133");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "          \n                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1134");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                               32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1136");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1137");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a a4aaa#a", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!", 10, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!       " + "'", str3.equals("hi!       "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("32.0A10.0A100.032.0A10.0AA4AAAAA#AA", "4a a4aaa#a", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str1.equals("4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1141");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.032.0a10.0aa aaaaa#a", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1142");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "hi!       ", 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1143");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("4aa4aaa#aa32.0414aa4aaa#aa32.041032.0a10.0a100.032.0a10.0aaaaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AA AAAAA#A", "!ih", "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AA AAAAA#A" + "'", str3.equals("AA AAAAA#A"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.0 10.0 100.04A A4AAA#AA", 34, "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "    32.0 10.0 100.04A A4AAA#AA    " + "'", str3.equals("    32.0 10.0 100.04A A4AAA#AA    "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1148");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1149");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", '#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1152");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "          \n32.0a10.0a100.032.0a10.0", (int) 'a', 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n" + "'", str4.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("114-1433", 10, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "114-1433  " + "'", str3.equals("114-1433  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1155");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32#29");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str1.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("32#29");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32#29" + "'", str1.equals("32#29"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1159");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1160");
        long[] longArray5 = new long[] { 19, (-1L), (short) -1, (short) 100, 4 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "19a-1a-1a100a4" + "'", str7.equals("19a-1a-1a100a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1161");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "32.010.0100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", charSequence2.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1162");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ..." + "'", str2.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4", (java.lang.CharSequence) "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "..." + "'", str1.equals("..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10a10a-1", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                         10a10a-1" + "'", str2.equals("                                         10a10a-1"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1167");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "AA AAAAA#A", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4#44" + "'", str1.equals("4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("11 -1 33", "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          \n32.0410.04100.032.0410.04a a4aaa#aa", "                                                        \n32.0a10.0a100.032.0a10.0", "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa" + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1174");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1176");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0100", "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1177");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1178");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                               32.0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1179");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#a", 0, 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n                                                 hi", "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi" + "'", str2.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) 'a', ".0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0" + "'", str3.equals(".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1182");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("32.010.0100.0");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "AA AAAAA#A", (java.lang.CharSequence) "hi!100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0 10.0 100.04A A4AAA#AA", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1186");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                 hi!", "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi" + "'", str2.equals("hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4444" + "'", str2.equals("4444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1189");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "1041410041041");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1041410041041" + "'", str2.equals("1041410041041"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1193");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", 32, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str2.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1196");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "100.0a10.0", 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                 hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1200");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#################################################hi!#", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "############################hi!#" + "'", str2.equals("############################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1203");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaa", ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "114-1433  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("\n                                                 hi", ".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi" + "'", str2.equals("\n                                                 hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", 2, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str3.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1208");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("100.0aa aaaaa#", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1209");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) 'a', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "10#10#-1", 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\n                                                 hi!", "32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n                                                 hi!" + "'", str2.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1215");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                  ", (java.lang.CharSequence) "32.0 10.0 100.032.0a10.0a100.0", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1216");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) ".0aa aaaaa#a", (java.lang.CharSequence) "2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#################################################hi!#4a32.010.0100.0a4aaa#aa", (int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################..." + "'", str3.equals("#################################################..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("32.0a10.0a100.032.0a10.0aaaaaaa#aa", (int) (byte) -1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1220");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "-1.0#0.0#1.0#10.0#1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1221");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a#a4", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1223");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "10#10#-1", (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1224");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###a a10.0a100.032.0a10.0a\n32.0##", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1228");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "          ", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1.0#0.0#1.0#10.0#1.0", "1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!       ", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1232");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n                                                 hi!  ", 30, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str1.equals("           32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1234");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0a10.0a100.032.0a10.0aaaaaaa#", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1235");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("          ", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", (java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#################################################hi!#4aa4aaa#aa32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str6.equals("#################################################hi!#4aa4aaa#aa32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                 ", "4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                4#44                                                ", "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###aa10.0a100.032.0a10.0a32.0##", "4a a4aaa#aa", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########" + "'", str2.equals("##########"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1241");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                 hi! ", "\n                                                 hi");
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1242");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "32.0A10.0A100.032.0A10.0AA4AAAAA#AA", "32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1244");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str1.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4A A4AAA#AA", "############################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4A A4AAA#AA" + "'", str2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4A A4AAA#AA", "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4A A4AAA#AA" + "'", str2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("2.0410.04100.", "AA#32.0 10.0 100.04A A4AAA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0410.04100." + "'", str2.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1249");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih", "                                                 hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a" + "'", str2.equals("a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1." + "'", str1.equals("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1252");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "4444", 45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1253");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1255");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0 10.0 100.04A A4AAA#AA", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4", 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1257");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1259");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AA AAAAA#A", (java.lang.CharSequence) "-1 100", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#aa", (int) (byte) 10, "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa" + "'", str3.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1261");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", (int) (byte) 1, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4444444444444444440.0010.010." + "'", str3.equals("4444444444444444440.0010.010."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1263");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".0 10.0 100.032.0a10.0a100.0", 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".0 10.0..." + "'", str3.equals(".0 10.0..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1265");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0", (java.lang.CharSequence) "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("100.0410.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0410.0" + "'", str1.equals("100.0410.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 100, 27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1270");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "10#10#34", (java.lang.CharSequence) "32.010.0100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.04AA4AAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.04AA4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi", (java.lang.CharSequence) "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!", 34);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1274");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1276");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2.equals(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1277");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                         \n32.0a10.0a100.032.0a10.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1279");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.032.0a10.0aaaaaaa#a", "100", (int) (byte) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.appendIfMissing("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    ", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str6.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("          ", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1282");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (java.lang.CharSequence) "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1283");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.0a10.0a100.032.0a10.0aaaaaaa#", 27, "!ih          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ", "2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "!ih" + "'", str3.equals("!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#a", (java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1287");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1288");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", (java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1289");
        char[] charArray5 = new char[] { '4', '4', 'a', ' ', ' ' };
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#################################################hi!#4a32.010.0100.0a4aaa#aa", (int) ' ', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#4a32.010.0100.0a4aaa#aa" + "'", str3.equals("#################################################hi!#4a32.010.0100.0a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1291");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1292");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "a a4aaa#a", (java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "a a4aaa#a" + "'", charSequence2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("1.0#0.0#1.0#10.0#1.0", "100.0410.0", " 32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1294");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", charSequence2.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1295");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                        \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                                 2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "32.0a10.0a100.032.0a10.04a a4aaa#aa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\n32.0a10.0a100.032.0a10.04a a4", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##########32.010.0100.##########", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########32.010.0100.##########" + "'", str2.equals("##########32.010.0100.##########"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1.0#0.0#1.0#10.0#1.0", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                          " + "'", str2.equals("                                          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "##########32.010.0100.##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1306");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                4#44                                                ", "###a a10.0a100.032.0a10.0a\n32.0##", 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.010.0100.0", (java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0" + "'", str6.equals("                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1307");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "          \n                                                 hi!  ", (java.lang.CharSequence) "#################################################...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#################################################hi!#", (int) (short) 0, "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#" + "'", str3.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1309");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444432.010.0100.04444444444444444444");
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("-14100", "32.0a10.0a100.032.0a10.0", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1311");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.appendIfMissing(" 32.0410.04100.0", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str5.equals(" 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!       ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1313");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4a a4aaa#aa", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1314");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4", "          \n32.0a10.0a100.032.0a10.0", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4" + "'", str3.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0.001 0.01 0.23", '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.001 0.01 0.23" + "'", str3.equals("0.001 0.01 0.23"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                               32.0 10.0 100.0!ih", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1320");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.", 34, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1." + "'", str3.equals("-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1323");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1324");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("100.0410.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0410.0" + "'", str2.equals("100.0410.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1326");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "19a-1a-1a100a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("32.0410.04100.032.0410.04a a4aaa#aa", 27, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a4aaa#a" + "'", str3.equals("a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1330");
        char[] charArray4 = new char[] { 'a', '4', ' ' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AA#32.0 10.0 100.04A A4AAA", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "                                 2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4a a4aaa#a", "4a a4aaa#aa32.0414a a4aaa#aa32.0410", 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a" + "'", str3.equals("4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1334");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2.equals(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!       ", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "###################0.0010.010.23###################", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1340");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                   32.010.0100.0                   ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", charSequence2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1341");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1342");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0#0.0#1.0#10.0#1.0", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AA AAAAA#A", "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AA AAAAA#A" + "'", str2.equals("AA AAAAA#A"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a", 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1345");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "", 29, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a.0a10.0aa aaaaa#a" + "'", str4.equals("a.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1346");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ", 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          \n", "    32.0 10.0 100.04A A4AAA#AA    ", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n" + "'", str3.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1350");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, ' ');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1353");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.prependIfMissing("-1.0#0.0#1.0#10.0#1.", (java.lang.CharSequence) "11 -1 33", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11 -1 33-1.0#0.0#1.0#10.0#1." + "'", str3.equals("11 -1 33-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1354");
        int[] intArray1 = new int[] { 29 };
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaa\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAA\r" + "'", str1.equals("AAAAA\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" a#a4", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.010.0100.0", "#################################################hi!#", 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-1.0a0.0a1.0a10.0a1.0                                                                               ", 5, 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0a1.0a10.0a1.0                                       " + "'", str3.equals("0.0a1.0a10.0a1.0                                       "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("32.0A10.0A100.032.0A10.04AA4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.04AA4AAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.04AA4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a", "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a" + "'", str2.equals("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1361");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4A A4AAA#AA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AA#AAA4A A4" + "'", str1.equals("AA#AAA4A A4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1363");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa#aaa4a a4", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1364");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0100", (java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1365");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AA AAAAA#A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1366");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0", (java.lang.CharSequence) "114-1433", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1367");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", "114-1433", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa" + "'", str4.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1368");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", (java.lang.CharSequence) "AAAAA\r", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1369");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1372");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1373");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", ".0 10.0...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a32.010.0100.0a4aaa#aa" + "'", str1.equals("#################################################hi!#4a32.010.0100.0a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("32429");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32429" + "'", str1.equals("32429"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" a#a4", "          \n");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "100.0aa aaaaa#", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1378");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "4");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "aaaaa32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1382");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1383");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#################################################hi!#4aa4aaa#aa", 45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###############################hi!#4aa4aaa#aa" + "'", str2.equals("###############################hi!#4aa4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1385");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".0 10.0...", charArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("100.0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0" + "'", str3.equals("100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "           32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4#44", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4#44" + "'", str3.equals("4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str2.equals("                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                         10a10a-1", "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                               10a10a-1" + "'", str2.equals("                               10a10a-1"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", "##########32.010.0100.##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1394");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\r", "          \n", (int) (short) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.appendIfMissing("32.0a10.0a100.032.0a10.0aaaaaaaa#a", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a\n32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str6.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a\n32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1395");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1397");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" 4#44", "32.0a10.0a100.032.0a10.0aaaaaaaa#a", (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a4#44" + "'", str4.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa", "          \n", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str3.equals("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str2.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1403");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################hi!#", (java.lang.CharSequence) " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a#a4", "###################0.0010.010.23###################");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a4" + "'", str2.equals("a#a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1405");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1406");
        short[] shortArray2 = new short[] { (short) -1, (short) 100 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        // The following exception was thrown during execution in test generation
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("32.0a10.0a100.032.0a10.04aa4aaa#aa                 ", "##########");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.04aa4aaa#aa                 " + "'", str2.equals("32.0a10.0a100.032.0a10.04aa4aaa#aa                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "4444444444444444440.0010.010.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1410");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".0aa aaaaa#");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("1.0#0.0#1.0#10.0#1.0", "\n32.0a10.0a100.032.0a10.04a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0#0.0#1.0#10.0#" + "'", str2.equals("1.0#0.0#1.0#10.0#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444432.010.0100.04444444444444444444", '#', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str3.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str1.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                        \n32.0a10.0a100.032.0a10.0", 27, "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                        \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("                                                        \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1416");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str2.equals("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1418");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("11 -1 33-1.0#0.0#1.0#10.0#1.", 2, "4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11 -1 33-1.0#0.0#1.0#10.0#1." + "'", str3.equals("11 -1 33-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih          ", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih          " + "'", str2.equals("!ih          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#################################################...", (java.lang.CharSequence) "1041410041041");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1423");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("##########32.010.0100.##########", (java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444" + "'", str3.equals("##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("-1.0#0.0#1.0#10.0#1.0", "10#10#34", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#aaaaa aa0." + "'", str1.equals("#aaaaa aa0."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0", "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                 hi! ", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi!" + "'", str2.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "114-1433", (java.lang.CharSequence) "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1429");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a4a a4aaa#aa32.0414a a4aaa#aa32.04104a a4aaa#a", "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1431");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", " 32.0410.04100.0");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("          \n", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0          \n" + "'", str5.equals("                                         \n32.0a10.0a100.032.0a10.0          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!100.0a10.0", " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!aaaaa aaaa" + "'", str3.equals("hi!aaaaa aaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1433");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-1          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA-1.", (java.lang.CharSequence) ".0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AA#32.0 10.0 100.04A A4AAAaaaaa\r", "                                                4#44                                                ", "          \n32.0410.04100.032.0410.04a a4aaa aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "100.0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1436");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0 10.0 100.0", "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                         \n32.0a10.0a100.032.0a10.0                                  ", (int) '#', 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0                                  " + "'", str3.equals("                                         \n32.0a10.0a100.032.0a10.0                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (int) (byte) 0, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str3.equals("                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "410.04");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", 29, 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "....234444444444444444444h..." + "'", str3.equals("....234444444444444444444h..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("a.0a10.0aa aaaaa#a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a.0a10.0aa aaaaa#a" + "'", str2.equals("a.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1442");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a.0a10.0aa aaaaa#a", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1444");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "4444444444444444440.0010.010.", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "a.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 hi! ", "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                 hi! " + "'", str2.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("AA#32.0 10.0 100.04A A4AAAaaaaa\r", "1041410041041", "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AA#32.0 10.0 100.04A A4AAAaaaaa\r" + "'", str3.equals("AA#32.0 10.0 100.04A A4AAAaaaaa\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                 2.0410.04100.", (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("32.0 10.0 100.04A A4AAA#AA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444" + "'", str2.equals("##########32.010.0100.##########44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0a10.0" + "'", str1.equals("100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1452");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4a a4aaa#aa", "aaaaa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("-1.0a0.0a1.0a10.0a1.0", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1454");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AA#32.0 10.0 100.04A A4AAA", (java.lang.CharSequence) "0", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a a4aaa#a", (int) (byte) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\n32.0a10.0a100.032.0a10.04a a4", "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str2.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a", "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a " + "'", str2.equals("4a "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "!ih", "11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi", 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi" + "'", str3.equals("hi"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1461");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "11 -1 33", (java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "AA#AAA4A A4", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1463");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1464");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!       ", 0, 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaa" + "'", str1.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#a4" + "'", str1.equals("a#a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("11a-1a33", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1471");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) ".0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.032.0a10.0a100.0.0 10.0 100.0", (java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1473");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.appendIfMissing("32.0a10.0a100.032.0a10.0aaaaaaaa#a", (java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#aa#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str5.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#aa#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n                                                 hi!" + "'", str1.equals("\n                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1475");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "32.0410.04100.032.0410.04a a4aaa#aa", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0", 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                             \n32.0a10.0a100.032.0a10.032.010.0100.0" + "'", str2.equals("                                             \n32.0a10.0a100.032.0a10.032.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("32.010.0100.", "                                 2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1478");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", (java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih", 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0.001 0.01 0.23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.001 0.01 0.23" + "'", str1.equals("0.001 0.01 0.23"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a a4aaa#a", "2.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("100.0a10.0", 49, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1483");
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
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1484");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", "32#29");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 " + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.04aa4aaa#aa                 ", (java.lang.CharSequence) "AA#AAA4A A4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1488");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444440.0010.010.234444444444444444444", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1490");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4#44                                                                                                                                                                                                                                                                                                                                                        ", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1491");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) ".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                 hi!", 42, ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi!" + "'", str3.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1493");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################hi!#", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4a a4aaa#aa", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa#aa4a a" + "'", str2.equals("aaa#aa4a a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444440.0010.010.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4444444444444444440.0010.010." + "'", str1.equals("4444444444444444440.0010.010."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          \n                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                4#44                                                ", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", 104);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.032.010.0100.0", 51, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                         \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", str1.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils2.test1500");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

