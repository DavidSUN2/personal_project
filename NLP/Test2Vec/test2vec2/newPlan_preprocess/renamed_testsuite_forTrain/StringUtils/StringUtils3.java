
package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils3 {

    public static boolean debug = false;

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1501");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                        \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1502");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                 hi! ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("32.0A10.0A100.032.0A10.0AA AAAAA#AA", "32.0A10.0A100.032.0A10.0AA4AAAAA#AA", (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              ", strArray3, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "                              " + "'", str8.equals("                              "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                 2.0410.04100.", (java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("32.0a10.0a100.032.0a10.0aaaaaaa#aa", "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "##########", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4a a4aaaaa32.0414a a4aaaaa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0410.04100.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0");
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str5.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa", "32.0A10.0A100.032.0A10.0AA4AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("32.0a10.0a100.032.0a10.0aaaaaaa#aa", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a10.0aaaaaaa#aa" + "'", str2.equals("a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1509");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "100.0a10.0", 0, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1510");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#aaaaa aa0.", "#aaaaa aa0.", 49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1511");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          \n32.0a10.0a100.032.0a10.0  \n", (java.lang.CharSequence) "AA#32.0 10.0 100.04A A4AAAaaaaa\r", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1513");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\r");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "100.0410.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("32.0a10.0a100.032.0a10.0aa4aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AA4AAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AA4AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1515");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                   32.010.0100.0                   ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "                   32.010.0100.0                   " + "'", charSequence2.equals("                   32.010.0100.0                   "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                               32.0 10.0 100.0!ih", 'a', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                               32.0 10.0 100.0!ih" + "'", str3.equals("                               32.0 10.0 100.0!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aaAA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.0" + "'", str1.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa          ...", "aaaaa", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "10#10#-1", (java.lang.CharSequence) " 32.0410.04100.0          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1522");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray0, ' ');
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
            System.out.format("%n%s%n", "StringUtils3.test1523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str1.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444440.0010.010.234444444444444444444", "AA#32.0 10.0 100.04A A4AAA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r", "          \n", (int) (short) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4a a4aaaaa32.0414a a4aaaaa32.0410");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 33, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str3.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1528");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("32.0a10.0a100.032.0a10.04aa4aaa#aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1529");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "\n                                                 hi!", (java.lang.CharSequence) "##########", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils3.test1530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("....234444444444444444444h...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "....234444444444444444444h..." + "'", str1.equals("....234444444444444444444h..."));
    }
}

