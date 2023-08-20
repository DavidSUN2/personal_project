
package StringUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtils1 {

    public static boolean debug = false;

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", ".0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.04a a4" + "'", str2.equals("\n32.0a10.0a100.032.0a10.04a a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".0aa aaaaa#" + "'", str1.equals(".0aa aaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0504");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.0" + "'", str1.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\n", "aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaa" + "'", str2.equals("aaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("32.0a10.0a100.032.0a10.0", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0507");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10#1#-1#0#-1" + "'", str7.equals("10#1#-1#0#-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10#1#-1#0#-1" + "'", str9.equals("10#1#-1#0#-1"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0509");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissing("hi!", (java.lang.CharSequence) "a a4aaa#a", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "a a4aaa#ahi!" + "'", str7.equals("a a4aaa#ahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence) "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("100.0", "32.010.0100.0", " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100.0" + "'", str3.equals("100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#################################################hi!#4a a4aaa#aa", "32.0a10.0a100.032.0a10.0aaaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str2.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4a a4aaa#aa" + "'", str1.equals("#################################################hi!#4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0517");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0518");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "          \n" + "'", charSequence2.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".0aa aaaaa#" + "'", str1.equals(".0aa aaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#################################################hi!#", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#################################################hi!#" + "'", str2.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("4", "#a a10.0a100.032.0a10.0a\n32.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("          \n", "          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n" + "'", str2.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0525");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "32.0 10.0 100.04A A4AAA#AA" + "'", charSequence2.equals("32.0 10.0 100.04A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", "32.0a10.0a100.032.0a10.0aaaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0527");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!", "100.0a10.0", 100, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!100.0a10.0" + "'", str4.equals("hi!100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0528");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("          \n32.0410.04100.032.0410.04a a4aaa#aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("32.0410.04100.0", (int) (short) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2.0410.04100." + "'", str3.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2.0410.04100." + "'", str1.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4a a4aaa#aa4a a4aaa#aa", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0534");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###a a10.0a100.032.0a10.0a\n32.0##", "4A A4AAA#AA", 104);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.010.0100.0", "#################################################hi!#", 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                 hi!", strArray4, strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "                                                 hi!" + "'", str9.equals("                                                 hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("\n32.0a10.0a100.032.0a10.04a a4", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\n32.0a10.0a100.032.0a10.04a a4" + "'", str2.equals("\n32.0a10.0a100.032.0a10.04a a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4#44", "          \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0537");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str3.equals("32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0539");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          \n32.0410.04100.032.0410.04a a4aaa#aa", "          \n32.0a10.0a100.032.0a10.0", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4.equals("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0540");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", "hi!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0541");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0544");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.010.0100.0" + "'", str1.equals("32.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("32.0a10.0a100.032.0a10.0aa aaaaa#aa", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "100.0a10.0", "hi!100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "444444444444444444432.010.0100.04444444444444444444", "32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a a4aaa#ahi!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) ".0aa aaaaa#a", (java.lang.CharSequence[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#################################################hi!#4a a4aaa#aa");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("###a a10.0a100.032.0a10.0a\n32.0##", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str2.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-1.0a0.0a1.0a10.0a1.0                                                                               ", 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                  " + "'", str2.equals("                                                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0553");
        long[] longArray3 = new long[] { 11, (-1), 33 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 19, (int) (short) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "11a-1a33" + "'", str9.equals("11a-1a33"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0554");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ", "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0555");
        double[] doubleArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str1.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4a a4aaa#a", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "32.0410.04100.0", 11, (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4a a4aaa#a" + "'", str8.equals("4a a4aaa#a"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str1.equals("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0559");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "100.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0560");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "10#1#-1#0#-1", (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                  ", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0562");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4#44", (java.lang.CharSequence) "                                                4#44                                                ", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0563");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "2.0410.04100.", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", (int) (short) 10, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  " + "'", str3.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                  ", 104, 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0a10.0a100.0", (java.lang.CharSequence) "4a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str1.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("32.0 10.0 100.0", 46, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                               32.0 10.0 100.0" + "'", str3.equals("                               32.0 10.0 100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0572");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("100.0", "aaaaa", "4A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0573");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                 hi! ", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#a" + "'", str2.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32.0410.04100.0" + "'", str6.equals("32.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("32.0a10.0a100.032.0a10.0aaaaaaa#aa", 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str2.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0577");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" ", "-1.0a0.0a1.0a10.0a1.0", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0579");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "          \n", (int) '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0580");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#a a10.0a100.032.0a10.0a\n32.0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0581");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0" + "'", str5.equals("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 46, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str3.equals("a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0585");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                  ", (java.lang.CharSequence) "\n", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0587");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0588");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0589");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) ".0aa aaaaa#", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0590");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0591");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "", "11 -1 33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##", (java.lang.CharSequence) "10#1#-1#0#-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4a a4aaa#a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#a" + "'", str2.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0595");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "10#1#-1#0#-1", 104, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0596");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0597");
        char[] charArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(charArray0, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0598");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\r");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.prependIfMissing("!ih", (java.lang.CharSequence) "                               32.0 10.0 100.0", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "                               32.0 10.0 100.0!ih" + "'", str9.equals("                               32.0 10.0 100.0!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0599");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                  ", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                             ..." + "'", str2.equals("                             ..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                4#44                                                ", (java.lang.CharSequence) "                               32.0 10.0 100.0!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "44444444444444444440.0010.010.234444444444444444444" + "'", str1.equals("44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0608");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
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
            System.out.format("%n%s%n", "StringUtils1.test0609");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA", (java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0 10.0 100.0" + "'", str2.equals("32.0 10.0 100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0611");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                4#44                                                ", 0, 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0612");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4a a4aaa#a", charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0613");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaaa#a", charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0614");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#a a10.0a100.032.0a10.0a\n32.0", " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0615");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "100.0a10.0", "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str1.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0617");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\r");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("", (java.lang.CharSequence) "#################################################hi!#", (java.lang.CharSequence[]) strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#################################################hi!#" + "'", str9.equals("#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0618");
        float[] floatArray3 = new float[] { ' ', 10.0f, (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0410.04100.0" + "'", str5.equals("32.0410.04100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32.0a10.0a100.0" + "'", str7.equals("32.0a10.0a100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32.0a10.0a100.0" + "'", str9.equals("32.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", "a a4aaa#ahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#a a10.0a100.032.0a10.0a\n32.0", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a a10.0a100.032.0a10.0a\n32.0" + "'", str2.equals("#a a10.0a100.032.0a10.0a\n32.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0621");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) ".0aa aaaaa#a", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", 11, 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a" + "'", str3.equals("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0624");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4a a4aaa#aa4a a4aaa#aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0625");
        long[] longArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, '#', 33, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(".0aa aaaaa#", "-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".0aa aaaaa#" + "'", str2.equals(".0aa aaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0627");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          " + "'", str1.equals("          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0629");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("32.0a10.0a100.032.0a10.0aaaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0630");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray0, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray0, '#', 51, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0631");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray0, 'a', 46, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "11a-1a33", (java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("11a-1a33", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11a-1a33" + "'", str2.equals("11a-1a33"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0635");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                  ", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "#################################################hi!#4aa4aaa#aa" + "'", str1.equals("#################################################hi!#4aa4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "32.0a10.0a100.0", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                 hi! ", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0639");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0640");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray0, '#', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "StringUtils1.test0641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                           \n32.0a10.0a100.032.0a10.0", 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0643");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          \n32.0410.04100.032.0410.04a a4aaa#aa", "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (int) (short) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissing("          ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          " + "'", str6.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0644");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                             ...", (java.lang.CharSequence) "                               32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) '4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  " + "'", str3.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0646");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "4a a4aaa#aa", "4a a4aaa#aa" };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.prependIfMissing("!ih                                                 ", (java.lang.CharSequence) "!ih                                                 ", charSequenceArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4a a4aaa#aa", charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "!ih                                                 " + "'", str8.equals("!ih                                                 "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "100.0", (java.lang.CharSequence) "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0648");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("32.0410.04100.032.0410.04a a4aaa#aa", 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) ".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0653");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0654");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.010.0100.0", (java.lang.CharSequence) "                                                4#44                                                ", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str1.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444440.0010.010.234444444444444444444", (int) (byte) 0, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "44444444444444444440.0010.010.234444444444444444444" + "'", str3.equals("44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4A A4AAA#AA", "a          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4A A4AAA#AA" + "'", str2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0660");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0663");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4", (java.lang.CharSequence) "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#################################################hi!#", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0666");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################hi!#4a a4aaa#aa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#4a32.010.0100.0a4aaa#aa" + "'", str3.equals("#################################################hi!#4a32.010.0100.0a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("32.0a10.0a100.032.0a10.0aaaaaaaa#a", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", "32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0670");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a#a4" + "'", str1.equals("a#a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0672");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 hi! ", charArray6);
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
            System.out.format("%n%s%n", "StringUtils1.test0673");
        int[] intArray1 = new int[] { 34 };
        int[] intArray3 = new int[] { 34 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0674");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("          \n32.0a10.0a100.032.0a10.0", "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", "", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str4.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", "-1.0a0.0a1.0a10.0a1.0", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#" + "'", str3.equals("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0677");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0678");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-1.0a0.0a1.0a10.0a1.0                                                                               ", (-1), "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1.0a0.0a1.0a10.0a1.0                                                                               " + "'", str3.equals("-1.0a0.0a1.0a10.0a1.0                                                                               "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0681");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "4A A4AAA#AA");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) ".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0683");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".0aa aaaaa#", "410.04");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0685");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "11a-1a33", (java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#################################################hi!#4a32.010.0100.0a4aaa#aa", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0687");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "\n                                                 hi", (java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0689");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("32.010.0100.0", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0690");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " 32.0410.04100.0", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa4aaaaa#aa", 33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0691");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\n32.0a10.0a100.032.0a10.04a a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0692");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "\n                                                 hi");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0693");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0694");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", (java.lang.CharSequence) "#a a10.0a100.032.0a10.0a\n32.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0695");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                               32.0 10.0 100.0!ih", (java.lang.CharSequence) "4#44", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0697");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "11 -1 33", charSequence1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################hi!#");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "10#1#-1#0#-1");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4#44", (java.lang.CharSequence[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#################################################hi!#" + "'", str4.equals("#################################################hi!#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0700");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih" + "'", str1.equals("!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 32.0410.04100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0704");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "32.0a10.0a100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "-1.0#0.0#1.0#10.0#1.0" + "'", charSequence2.equals("-1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0705");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " ", (java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", "                                                                  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0707");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0708");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444", (java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444440.0010.010.234444444444444444444", 5, "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "44444444444444444440.0010.010.234444444444444444444" + "'", str3.equals("44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                               32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a a4aaa#a" + "'", str1.equals("a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.04aa4aaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.04aa4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "a#a4", (java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", "32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n                                                 hi!  " + "'", str2.equals("          \n                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("32.0a10.0a100.032.0a10.04aa4aaa#aa", 51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.04aa4aaa#aa                 " + "'", str2.equals("32.0a10.0a100.032.0a10.04aa4aaa#aa                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0 10.0 100.0" + "'", str1.equals("32.0 10.0 100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0721");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4", (java.lang.CharSequence[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4#44", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#44" + "'", str2.equals("4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 15, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4", "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4" + "'", str2.equals("4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444444444444444444432.010.0100.04444444444444444444", "32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444444444444444444432.010.0100.04444444444444444444" + "'", str2.equals("444444444444444444432.010.0100.04444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str1.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "410.04" + "'", str5.equals("410.04"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.010.0100." + "'", str1.equals("32.010.0100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0731");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("32.0A10.0A100.032.0A10.0AA AAAAA#AA", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AA AAAAA#AA" + "'", str2.equals("AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0733");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(charSequence0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(".0aa aaaaa#a", (int) 'a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3.equals(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0735");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(".0aa aaaaa#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removePattern("\r", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\r" + "'", str2.equals("\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0737");
        int[] intArray4 = new int[] { 15, (short) -1, 30, 46 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray4, ' ', 19, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0738");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###a a10.0a100.032.0a10.0a\n32.0##", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#################################################hi!#4a32.010.0100.0a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", (java.lang.CharSequence) "2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0743");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "a#a4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("32.0 10.0 100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.001 0.01 0.23" + "'", str1.equals("0.001 0.01 0.23"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("32.0a10.0a100.032.0a10.0aaaaaaaa#a", "!ih", "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaaa#a" + "'", str3.equals("32.0a10.0a100.032.0a10.0aaaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0746");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " ", (java.lang.CharSequence) "a a4aaa#ahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\r");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0748");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", 51);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100.0a10.0", strArray4, strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "                                                 hi!" + "'", str8.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100.0a10.0" + "'", str9.equals("100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0749");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          \n32.0a10.0a100.032.0a10.0", (int) (short) -1, "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4#44", 'a', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4#44" + "'", str3.equals("4#44"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AA AAAAA#A" + "'", str1.equals("AA AAAAA#A"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-1.0a0.0a1.0a10.0a1.0", "#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str2.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0755");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray0, ' ', 29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0756");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################hi!#", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0757");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", "", 11);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("hi!100.0a10.0", (java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0" + "'", str6.equals("44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '#', "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410" + "'", str3.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0759");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                               32.0 10.0 100.0", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("32.0a10.0a100.0", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.04a a4aaa#aa" + "'", str1.equals("32.0a10.0a100.032.0a10.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0765");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("          \n                                                 hi!  ", "32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n                                                 hi!  " + "'", str2.equals("          \n                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n                                                 hi", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0768");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "", "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str3.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4444" + "'", str2.equals("4444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0773");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444432.010.0100.04444444444444444444", '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                   32.010.0100.0                   " + "'", str3.equals("                   32.010.0100.0                   "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0774");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaa#a", (java.lang.CharSequence) "AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#a" + "'", charSequence2.equals("32.0a10.0a100.032.0a10.0aaaaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str1.equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0776");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AA AAAAA#A", (java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          \n32.0a10.0a100.032.0a10.0", (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4A A4AAA#AA", "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4A A4AAA#AA" + "'", str2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1.equals("4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0780");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("32.0a10.0a100.032.0a10.0aa aaaaa#aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0781");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4");
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
            System.out.format("%n%s%n", "StringUtils1.test0782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0783");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###a a10.0a100.032.0a10.0a\n32.0##", "4A A4AAA#AA", 104);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("32.0a10.0a100.0", (java.lang.CharSequence) "                               32.0 10.0 100.0", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str6.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "                               32.0 10.0 100.032.0a10.0a100.0" + "'", str7.equals("                               32.0 10.0 100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("11 -1 33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11 -1 33" + "'", str1.equals("11 -1 33"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0785");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', (int) (byte) -1, (int) '#');
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
            System.out.format("%n%s%n", "StringUtils1.test0786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0788");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0789");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "-1.0#0.0#1.0#10.0#1.0", "a#a4", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str4.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0790");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          \n");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n", (java.lang.CharSequence) " 4#44", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n" + "'", str4.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0791");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4a a4aaa#a", "44444444444444444440.0010.010.234444444444444444444", 3, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a" + "'", str4.equals("4a 44444444444444444440.0010.010.234444444444444444444a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                               32.0 10.0 100.0!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444", "AA AAAAA#A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0794");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a a4aaa#ahi!", "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1.0#0.0#1.0#10.0#1.", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str2.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0796");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) ".0aa aaaaa#a", (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("32.0a10.0a100.032.0a10.0aaaaaaaa#a", "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0798");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("32.0410.04100.0", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                           \n32.0a10.0a100.032.0a10.0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.0a10.0a100.032.0a10.0aa4aaaaa#aa", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", (java.lang.CharSequence[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str7.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0799");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 4#44", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a#a4", charArray6);
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
            System.out.format("%n%s%n", "StringUtils1.test0800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0801");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("2.0410.04100.", "aaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("          ", (java.lang.CharSequence) "4A A4AAA#AA", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "          " + "'", str4.equals("          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" ", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " " + "'", str2.equals(" "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r", "32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4a a4aaa#aa", (java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0807");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence) "          \n                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "\n32.0a10.0a100.032.0a10.0aa aaaaa#aa" + "'", charSequence2.equals("\n32.0a10.0a100.032.0a10.0aa aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 " + "'", str1.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0", 46, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0#0.0#1.0#10.0#1.0" + "'", str3.equals("1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4a a4aaa#aa", 33, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0a10.0a100.032.0a10.04aa4aaa#aa                 ", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1.0#0.0#1.0#10.0#1.0", 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0#0.0#1.0#10.0#1.0" + "'", str2.equals("1.0#0.0#1.0#10.0#1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          \n", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("          \n                                                 hi!  ", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n                                                 hi!  " + "'", str2.equals("          \n                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("11a-1a33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "11a-1a33" + "'", str1.equals("11a-1a33"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0817");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, (java.lang.CharSequence) "32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0818");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("410.04", "44444444444444444440.0010.010.234444444444444444444", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0819");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", charSequence2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!#", "a a4aaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "10#1#-1#0#-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih" + "'", str1.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0823");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", (java.lang.CharSequence) "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0824");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###a a10.0a100.032.0a10.0a\n32.0##", (java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aaaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0825");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "11 -1 33", (java.lang.CharSequence) "\n                                                 hi", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444432.010.0100.04444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0827");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0828");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("32.0410.04100.032.0410.04a a4aaa#aa", "32.0a10.0a100.032.0a10.0aaaaaaaa#a", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0830");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.prependIfMissing("4A A4AAA#AA", (java.lang.CharSequence) "32.0 10.0 100.0", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32.0 10.0 100.04A A4AAA#AA" + "'", str5.equals("32.0 10.0 100.04A A4AAA#AA"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                           \n32.0a10.0a100.032.0a10.0", 34, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0" + "'", str3.equals("                                         \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                         \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0" + "'", str1.equals("32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0833");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "AA AAAAA#AA", (java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0834");
        int[] intArray0 = new int[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(intArray0, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray0, ' ', (int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0835");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0836");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0837");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "          \n", (java.lang.CharSequence) "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aa aaaaa#a" + "'", str1.equals("32.0a10.0a100.032.0a10.0aa aaaaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!          ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("32.0a10.0a100.032.0a10.0aaaaaaa#aa", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str2.equals("32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################hi!#");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.prependIfMissing("32.0a10.0a100.032.0a10.0aaaaaaa#aa", (java.lang.CharSequence) "aaaaa", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#################################################hi!#" + "'", str5.equals("#################################################hi!#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "aaaaa32.0a10.0a100.032.0a10.0aaaaaaa#aa" + "'", str6.equals("aaaaa32.0a10.0a100.032.0a10.0aaaaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "114-1433");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0843");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".0aa aaaaa#a", "-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                         \n32.0a10.0a100.032.0a10.0", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0                                  " + "'", str2.equals("                                         \n32.0a10.0a100.032.0a10.0                                  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0845");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0846");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("100.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0849");
        char[] charArray3 = new char[] { '#', 'a' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 32.0410.04100.0", charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "11 -1 33");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0851");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "100", (java.lang.CharSequence) "#################################################hi!#4a a4aaa#aa", 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0852");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.0aa aaaaa#aa", (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0853");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                 hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               ", (java.lang.CharSequence[]) strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!" + "'", str8.equals("-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA" + "'", str1.equals("32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("          \n32.0a10.0a100.032.0a10.0", "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("-1.0#0.0#1.0#10.0#1.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str2.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", 34, "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 " + "'", str3.equals("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4a a4aaa#aa32.0414a a4aaa#aa32.0410", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaaaa32.0414a a4aaaaa32.0410" + "'", str2.equals("4a a4aaaaa32.0414a a4aaaaa32.0410"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0860");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) " a#a4", (java.lang.CharSequence) "                               32.0 10.0 100.032.0a10.0a100.0", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0861");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0862");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4a a4aaa#aa32.0414a a4aaa#aa32.0410", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.04a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(".0aa aaaaa#", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaa# .0aa" + "'", str2.equals("aaaaa# .0aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 4#44", "!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0865");
        java.lang.CharSequence[] charSequenceArray2 = null;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase("aaaaa", (java.lang.CharSequence) "\r", charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aaaaa\r" + "'", str3.equals("aaaaa\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0866");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                           \n32.0a10.0a100.032.0a10.0", (int) ' ', (int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.appendIfMissing("100", (java.lang.CharSequence) ".0aa aaaaa#", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100.0aa aaaaa#" + "'", str9.equals("100.0aa aaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                           \n32.0a10.0a100.032.0a10.0", 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                        \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                                        \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4" + "'", str2.equals("#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0869");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.04a a4aaa#aa", (int) (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0870");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0871");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410" + "'", str1.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0873");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "\n32.0a10.0a100.032.0a10.04a a4", (java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                   32.010.0100.0                   ", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                   32.010.0100.0                   " + "'", str2.equals("                   32.010.0100.0                   "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0875");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                   32.010.0100.0                   ", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 hi! ", '4', ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "                                                 hi! " + "'", str3.equals("                                                 hi! "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0877");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", (java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 " + "'", charSequence2.equals("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0878");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "100", charSequence1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0879");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih", "                                                 hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.appendIfMissing("                                         \n32.0a10.0a100.032.0a10.0", (java.lang.CharSequence) "100", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "!ih" + "'", str6.equals("!ih"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "                                         \n32.0a10.0a100.032.0a10.0100" + "'", str7.equals("                                         \n32.0a10.0a100.032.0a10.0100"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("###a a10.0a100.032.0a10.0a\n32.0##", "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###a a10.0a100.032.0a10.0a\n32.0##" + "'", str2.equals("###a a10.0a100.032.0a10.0a\n32.0##"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaa# .0aa", "32.010.0100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0882");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                   32.010.0100.0                   ", (java.lang.CharSequence) "AA AAAAA#A", 61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4A A4AAA#AA", "-1.0#0.0#1.0#10.0#1.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1.0#0.0#1.0#10.0#1." + "'", str2.equals("-1.0#0.0#1.0#10.0#1."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0884");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaa\r", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                               32.0 10.0 100.032.0a10.0a100.0", "                                         \n32.0a10.0a100.032.0a10.0100", 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("          \n                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n                                                 hi!  " + "'", str1.equals("          \n                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#################################################hi!#4a32.010.0100.0a4aaa#aa", (int) (byte) -1, "AA AAAAA#A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#################################################hi!#4a32.010.0100.0a4aaa#aa" + "'", str3.equals("#################################################hi!#4a32.010.0100.0a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".0aa aaaaa#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                 hi! ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("#################################################hi!#4aa4aaa#aa", ".0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#################################################hi!#4aa4aaa#aa" + "'", str2.equals("#################################################hi!#4aa4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0891");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("32.0410.04100.0");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("32.0a10.0a100.032.0a10.0aa4aaaaa#aa", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("4a a4aaa#aa32.0414a a4aaa#aa32.0410", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4a a4aaa#aa32.0414a a4aaa#aa32.0410" + "'", str3.equals("4a a4aaa#aa32.0414a a4aaa#aa32.0410"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2.0410.04100." + "'", str1.equals("2.0410.04100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "100.0", (java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0896");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ", (java.lang.CharSequence) "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0898");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "100.0aa aaaaa#", "32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(".0aa aaaaa#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".0aa aaaaa#" + "'", str1.equals(".0aa aaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                           \n32.0a10.0a100.032.0a10.0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str2.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0901");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("100.0", "AA AAAAA#A", "32.0410.04100.032.0410.04a a4aaa#aa", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0" + "'", str4.equals("100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0902");
        long[] longArray4 = new long[] { 51, '#', 3, 10L };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 1, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray4);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("32.0A10.0A100.032.0A10.0AA AAAAA#AA", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0A10.0A100.032.0A10.0AA AAAAA#AA" + "'", str2.equals("32.0A10.0A100.032.0A10.0AA AAAAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replacePattern("", "10#1#-1#0#-1", " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0906");
        short[][] shortArray0 = new short[][] {};
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4a a4aaa#aa4a a4aaa#aa", "a#aaaaa aa0.01a0.230.001a0.01a0.23\n          -1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#aa4a a4aaa#aa" + "'", str2.equals("4a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "32.0a10.0a100.032.0a10.04a a4aaa#aa", (java.lang.CharSequence) ".0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0909");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#a a10.0a100.032.0a10.0a\n32.0", 21, 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0910");
        double[] doubleArray2 = new double[] { 100.0d, (short) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0a10.0" + "'", str4.equals("100.0a10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100.0a10.0" + "'", str6.equals("100.0a10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100.0410.0" + "'", str8.equals("100.0410.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0911");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("32.0 10.0 100.04A A4AAA#AA", "#################################################hi!#4a a4aaa#aa", "                                         \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0912");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(byteArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray0, '4', 3, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "StringUtils1.test0913");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0914");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#################################################hi!#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0915");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA4          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0916");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", "                                                        \n32.0a10.0a100.032.0a10.0", "          ", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str4.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0917");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                4#44                                                ", "###a a10.0a100.032.0a10.0a\n32.0##", 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "100.0a10.0", (java.lang.CharSequence[]) strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0918");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\r", "          \n", (int) (short) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "          \n32.0410.04100.032.0410.04a a4aaa#aa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a a4aaa#ahi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          \n32.0410.04100.032.0410.04a a4aaa#aa", strArray6, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", "44444444444444444440.0010.010.234444444444444444444hi!100.0a10.0", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("11 -1 33", "#################################################hi!#4a32.010.0100.0a4aaa#aa", "2.0410.04100.");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("32.0a10.0a100.0", "-14100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0922");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "#a a10.0a100.032.0a10.0a\n32.0", (java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("#################################################hi!#4aa4aaa#aa", "\n                                                 hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#################################################hi!#4aa4aaa#aa" + "'", str2.equals("#################################################hi!#4aa4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("          \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n" + "'", str1.equals("          \n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("32.0410.04100.032.0410.04a a4aaa#aa", "                                                4#44                                                ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0410.04100.032.0410.04a a4aaa#aa" + "'", str2.equals("32.0410.04100.032.0410.04a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11 -1 33", "4A A4AAA#AA");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "100.0410.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0928");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4a#a4a a32.0410.04100.032.0410.04a#a4a a4", (java.lang.CharSequence) "!ih                                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 348 + "'", int2 == 348);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0929");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0931");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                4#44                                                ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\n" + "'", str9.equals("\n"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "1.0#0.0#1.0#10.0#1.0", (java.lang.CharSequence) "44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                             ...");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "..." + "'", str1.equals("..."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "-14100", (java.lang.CharSequence) "4aa4aaa#aaaaaaaaaaaaaaaaaaaaaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.032.0a10.0aa aaaaa#a", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0937");
        short[] shortArray3 = new short[] { (short) 10, (short) 10, (short) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) -1, (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10a10a-1" + "'", str9.equals("10a10a-1"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0938");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "32.0 10.0 100.04A A4AAA#AA");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("-1.0a0.0a1.0a10.0a1.0                                                                               ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0a0.0a1.0a10.0a1.0" + "'", str1.equals("-1.0a0.0a1.0a10.0a1.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "          \n");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "AA AAAAA#A", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "                                                 hi!" + "'", str4.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "                                                 hi!" + "'", str6.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 ", (java.lang.CharSequence[]) strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0942");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase(" ", (java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa", (java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.prependIfMissing("          ", (java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "                                                 hi!" + "'", str7.equals("                                                 hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa " + "'", str8.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa "));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "!ih          " + "'", str9.equals("!ih          "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0943");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          \n32.0A10.0A100.032.0A10.0AA AAAAA#AA", (java.lang.CharSequence) "4a a4aaa#aa4a a4aaa#aa", 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0944");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "\n                                                 hi", 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "32.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA432.0A10.0A100.032.0A10.0AAAAAAA#AA", (java.lang.CharSequence) "4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0947");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          \n", "hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih                                                 ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4#44", (java.lang.CharSequence[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0948");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa#################################################hi!", (java.lang.CharSequence) " 4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0950");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0", 30, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "0.001 0.01 0.23", (java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0952");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                         \n32.0a10.0a100.032.0a10.0                                  ", (java.lang.CharSequence) "                               32.0 10.0 100.0!ih");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("4a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4a a4aaa#aa4a a4aaa#aa" + "'", str1.equals("4a a4aaa#aa4a a4aaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0955");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#################################################hi!#4aa4aaa#aa", (java.lang.CharSequence) "4#44");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("410.04", "32.0a10.0a100.032.0a10.0aaaaaaa#aa", "aaaaa# .0aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "410.04" + "'", str3.equals("410.04"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0957");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a a4aaa#ahi!", "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4aaa#ahi!" + "'", str2.equals("a a4aaa#ahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0959");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '4', (int) (short) 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0960");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray0, ' ', (int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa32.0410.04100.032.0410.04a a4aaa#aa4a a4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4#44", 348, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4#44                                                                                                                                                                                                                                                                                                                                                        " + "'", str3.equals("4#44                                                                                                                                                                                                                                                                                                                                                        "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a a4aaa#ahi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a a4aaa#ahi!" + "'", str1.equals("a a4aaa#ahi!"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaa", "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  " + "'", str1.equals("          \n32.0410.04100.032.0410.04a a4aaa#aa                                                 hi!  "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa", " ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa" + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a32.0a10.0a100.032.0a10.0aa4aaaaa#aa"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0967");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("-14100", "10a10a-1", "4a a4aaa#aa32.0414a a4aaa#aa32.0410");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444 32.0410.04100.0444444444444444444444444444444444444444444", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 32.010.0100.0" + "'", str2.equals(" 32.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0969");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                             ...", "100.0410.0", "44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaa\r", "1.0#0.0#1.0#10.0#1.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaa\r" + "'", str2.equals("aaaaa\r"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0971");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("32.010.0100.", 32, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "##########32.010.0100.##########" + "'", str3.equals("##########32.010.0100.##########"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444", "100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0974");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("          ", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                  ", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a", (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    " + "'", str2.equals("          \n32.0a10.0a100.032.0a10.0aa aaaaa#a                                                    "));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "          ", (java.lang.CharSequence) "32.010.0100.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                           \n32.0a10.0a100.032.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                                                                           \n32.0a10.0a100.032.0a10.0" + "'", str1.equals("                                                                           \n32.0a10.0a100.032.0a10.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0978");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("32.0A10.0A100.032.0A10.0AA AAAAA#AA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0979");
        float[] floatArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0980");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                 hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (byte) -1, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4a a4aaa#aa", (java.lang.CharSequence) "100.0a10.0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("32.0a10.0a100.032.0a10.0aaaaaaa#a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0a10.0a100.032.0a10.0aaaaaaa#" + "'", str1.equals("32.0a10.0a100.032.0a10.0aaaaaaa#"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("32.0410.04100.0", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0410.04100.0" + "'", str2.equals("2.0410.04100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0", ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0" + "'", str2.equals("32.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.032.0a10.0a100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444432.010.0100.04444444444444444444", '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32.010.0100.0" + "'", str2.equals("32.010.0100.0"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4a a4aaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih                                                 \n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0987");
        double[] doubleArray4 = new double[] { 61, 49, 34, 1.0f };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) 'a', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0988");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "4A A4AAA#AA", (java.lang.CharSequence) "-1.0a0.0a1.0a10.0a1.0                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + charSequence2 + "' != '" + "4A A4AAA#AA" + "'", charSequence2.equals("4A A4AAA#AA"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4a a4aaa#a", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4aaa#a" + "'", str2.equals("4a a4aaa#a"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0990");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray0, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray0, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray0);
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
            System.out.format("%n%s%n", "StringUtils1.test0991");
        char[] charArray6 = new char[] { ' ', '#', '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AA AAAAA#AA", charArray6);
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
            System.out.format("%n%s%n", "StringUtils1.test0992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444440.0010.010.234444444444444444444");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "44444444444444444440.0010.010.234444444444444444444" + "'", str1.equals("44444444444444444440.0010.010.234444444444444444444"));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "10#10#34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("2.0410.04100.", 46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "                                 2.0410.04100." + "'", str2.equals("                                 2.0410.04100."));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0995");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray0, '#', (int) 'a', 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "32.0a10.0a100.032.0a10.04aa4aaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0997");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("32.0a10.0a100.0", "\n                                                 hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################hi!#4a32.010.0100.0a4aaa#aa", (java.lang.CharSequence[]) strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 55 + "'", int7 == 55);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("##########32.010.0100.##########", "32.0 10.0 100.0", "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test0999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          \n32.0a10.0a100.032.0a10.0aa aaaaa#aa ", "                                 32.0a10.0a100.032.0a10.0aaaaaaa#a                                 ");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void StringUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtils1.test1000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444440.0010.010.234444444444444444444", '4', '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "###################0.0010.010.23###################" + "'", str3.equals("###################0.0010.010.23###################"));
    }
}

